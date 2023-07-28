Implementation guide

Release Date: 23/09/2022

1. Use java Version
	Java Version = 17.0.2 
	If run with any lower version, It will get Error: Unable to initialize main class sampleMOFSLOPENAPI Caused by: java.lang.UnsupportedClassVersionError:

2. Packages Used
	1. gson-2.2.1
	2. java-json
	3. javax.xml.bind
	4. nv-websocket-client
	Included in SDK, No need to add any jar file other than MOFSLOPENAPI_Java.jar.

3. ApiKey
	ApiKey will be obtain from website 

4. userid, password, clientcode, Two_FA, Vendorinfo
	1. userid and password is your trading account username and password
	2. clientcode only needed in case of dealer, else always keep clientcode = ""
	3. Two_FA as per user defined DOB or PAN in str format
	4. Vendorinfo - clientcode
	5. totp - Google Authenticator otp, If not keep totp = ""

5. Set Url
	Enter Base Url for LIVE or UAT Testing 
	1. For live 
	   Base_Url = "https://openapi.motilaloswal.com"
	2. For UAT
	   Base_Url = "https://uatopenapi.motilaloswal.com"

6. Initialize MofslOpenApi
	Initialize CMOFSLOPENAPI using Apikey, Base_Url and SourceId
	- SourceId : WEB or DESKTOP

7. Uncomment System.out.println statement to get the outputs
	Login request will always be first request with each following request 

8. To verify otp received on your Mobile and Email Uncomment verifyotp(otp)
	- No need to call verifyotp if you are passing topt in Login.

9. To resend otp Uncomment resendotp(), will send otp on registered Mobile and Email.
		
	   
# -----------------------------------------------Trade WebSocket------------------------------------------------

1. Repeat all above Instructions 

2. Keep Login request Uncomment for Validation to use WebSocket

3. Initialize TradeWebsocket();

4. Call ObjTradeStatus.onTradeStatusConnected(new OnConnect()

5. Inside above function @override OnTradeWebsocketConnect() function

6. Inside OnTradeWebsocketConnect() function,

	1. To send Request for Authorization:
		ObjTradeStatus.Tradelogin();

	2. To send Request for TradeSubscription:
		ObjTradeStatus.TradeSubscribe();

	3. To send Request for TradeUnsubscription:
		ObjTradeStatus.TradeUnsubscribe();

	4. To send Request for OrderSubscription:
		ObjTradeStatus.OrderSubscribe();

	5. To send Request for OrderUnsubscription:
		ObjTradeStatus.OrderUnsubscribe();

	6. To send Request for Logout:
		ObjTradeStatus.Tradelogout();
		
7. Uncomment ObjTradeStatus.TradeStatus_on_connect(); to use OpenAPI Trade Websocket


# -----------------------------------------------Broadcast WebSocket------------------------------------------------

1. Initialize BroadcastConnect();

4. Call ObjTradeStatus.OnBroadcastConnected(new OnBroadcastConnect()

5. Inside above function @override onBroadcast_Connected() function

6. Inside onBroadcast_Connected() function,

	To Register or Unregister script:
		1. Register Script
			MofslBroadcast.ScripRegister("Exchange", "ExchangeType", ScripCode);

		2. Deregister Script
			MofslBroadcast.ScripDeregister("Exchange", "ExchangeType", ScripCode);

	To Register or Unregister Index:
		1. Register Index
			MofslBroadcast.IndexRegister("Exchange");

		2. Deregister Index
			MofslBroadcast.IndexDeregister("Exchange");
		
7. Uncomment MofslBroadcast.Broadcast_on_connect(); to use OpenAPI Broadcast
8. Uncomment MofslBroadcast.BroadcastLogout(); to Logout Broadcast


For more details refer sampleMOFSLOPENAPI.java