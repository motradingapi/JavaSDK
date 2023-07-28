
import java.util.Hashtable;

import org.json.JSONException;
import org.json.JSONObject;

import MOFSLOPENAPI.TradeWebsocket.*;
import MOFSLOPENAPI.CMOFSLOPENAPI;
import MOFSLOPENAPI.BroadcastConnect.*;
import MOFSLOPENAPI.Client.*;
import java.util.Scanner;

public class sampleMOFSLOPENAPI {

    public static void main(String[] args)
            throws Exception {

        // // Refer README for Info
        String userID = "";
        String password = "";
        String PANorDOB = "";
        String vendorId = "";
        String totp = ""; // Google Authenticator
        String BrowserName = "Chrome";
        String BrowserVersion = "104";
        String SourceId = "WEB"; // WEB, DESKTOP
        String Apikey = "";

        String clientcode = "";

        // // Set Url for LIVE or UAT Testing
        // // Enter Base Url
        String Base_Url = "https://uatopenapi.motilaloswal.com";

        // // Initialize CMOFSLOPENAPI using Apikey, Base_Url, SourceId, BrowserName and BrowserVersion
        CMOFSLOPENAPI Mofsl = new CMOFSLOPENAPI(Apikey, Base_Url, SourceId, BrowserName, BrowserVersion);

        // // Uncomment print statements to execute
        // // Login request will always be first request with each following request

        try {
            // // Login by userId, Password, vendorId, totp
            JSONObject response = Mofsl.Login(userID, password, PANorDOB, vendorId, totp);
            System.out.println("Login :: " + response);

            // Resend OTP
            // JSONObject resendotpRes = Mofsl.ressendotp();
            // System.out.println(resendotpRes);

            // After Login if totp = "" then enter otp received on registered Email and
            // Mobile for verification
            // if (totp == "" || response.getString("isAuthTokenVerified") == "FALSE") {
            //     String MobileEmailOTP = "";

            //     try (Scanner scan = new Scanner(System.in)) {

            //         // Enter 6 Digit OTP received on Mobile or Email
            //         System.out.print("Enter 6 Digit OTP: ");
            //         MobileEmailOTP = scan.next();

            //         // Verify OTP
            //         JSONObject verifyotpRes = Mofsl.verifyotp(MobileEmailOTP);
            //         System.out.println(verifyotpRes);

            //     } catch (Exception e) {

            //         System.out.println("Error: " + e.getMessage());

            //     }
            // }

            // // -------------- GetProfile response for dealer --------------
            // JSONObject responseget = (Mofsl.GetProfile(clientcode));
            // System.out.println("Profile :: " + responseget);

            // // // ---------------------- GetOrderBook ---------------
            // JSONObject OrderbookResponse = ((Mofsl.GetOrderBook(clientcode)));
            // System.out.println("Orderbook :: " + OrderbookResponse);

            // // // -------------------- GetTradeBook -----------------
            // JSONObject TradeBookResponse = Mofsl.GetTradeBook(clientcode);
            // System.out.println("Tradebook :: " + TradeBookResponse);

            // // // ------------------ GetPosition ---------------------
            // JSONObject GetPositionResponse = Mofsl.GetPosition(clientcode);
            // System.out.println("Get Position :: " + GetPositionResponse);

            // // // ---------------------- GetDPHolding --------------------
            // JSONObject DPHoldingResponse = Mofsl.GetDPHolding(clientcode);
            // System.out.println("DPHolding :: " + DPHoldingResponse);

            // // // -------------------------Place Order------------------
            // PlaceOrderinfo PlaceOrderInfo = new PlaceOrderinfo();
            // PlaceOrderInfo.clientcode = clientcode;
            // PlaceOrderInfo.exchange = "NSE";
            // PlaceOrderInfo.symboltoken = 1660;
            // PlaceOrderInfo.buyorsell = "BUY";
            // PlaceOrderInfo.ordertype = "LIMIT";
            // PlaceOrderInfo.producttype = "NORMAL";
            // PlaceOrderInfo.orderduration = "DAY";
            // PlaceOrderInfo.price = 330.5F;
            // PlaceOrderInfo.triggerPrice = 0;
            // PlaceOrderInfo.qtyinlot = 100;
            // PlaceOrderInfo.disclosedqty = 0;
            // PlaceOrderInfo.amoorder = "N";
            // PlaceOrderInfo.goodtilldate = "08-Nov-2022";
            // PlaceOrderInfo.tag = "";
            // JSONObject PlaceOrderResponse = Mofsl.PlaceOrder(PlaceOrderInfo);
            // System.out.println("Place Order :: " + PlaceOrderResponse);

            // // // ------------ Modify Order --------------
            // ModifyOrderInfo ModifyOrderInfo = new ModifyOrderInfo();
            // ModifyOrderInfo.clientcode = clientcode;
            // ModifyOrderInfo.uniqueorderid = "1101823KAL005";
            // ModifyOrderInfo.newordertype = "LIMIT";
            // ModifyOrderInfo.neworderduration = "DAY";
            // ModifyOrderInfo.newqtyinlot = 200;
            // ModifyOrderInfo.newdisclosedqty = 0;
            // ModifyOrderInfo.newprice = 235.5f;
            // ModifyOrderInfo.newtriggerprice = 0;
            // ModifyOrderInfo.newgoodtilldate = "";
            // ModifyOrderInfo.lastmodifiedtime = "08-Nov-2022 11:30:25";
            // ModifyOrderInfo.qtytradedtoday = 0;

            // JSONObject ModifyOrderResponse = (Mofsl.ModifyOrder(ModifyOrderInfo));
            // System.out.println("Modifyorder :: " + ModifyOrderResponse);

            // // // ------------ CancelOrder --------------
            // String uniqueorderid = "1101823KAL005";
            // JSONObject CancelorderResponse = ((Mofsl.CancelOrder(clientcode,
            // uniqueorderid)));
            // System.out.println("Cancel Order:: " + CancelorderResponse);

            // // // ------------ PositionConversion --------------
            // PositionConversionInfo PositionConversionInfo = new PositionConversionInfo();
            // PositionConversionInfo.clientcode = clientcode;
            // PositionConversionInfo.exchange = "NSE";
            // PositionConversionInfo.scripcode = 11536;
            // PositionConversionInfo.quantity = 1;
            // PositionConversionInfo.oldproduct = "NORMAL";
            // PositionConversionInfo.newproduct = "VALUEPLUS";
            // JSONObject PositionConversionResponse =
            // (Mofsl.PositionConversion(PositionConversionInfo));
            // System.out.println("Position Conversion :: " + PositionConversionResponse);

            // // // ----------------- GetMarginDetail ----------------------
            // JSONObject margindetail = (Mofsl.GetReportMarginDetail(clientcode));
            // System.out.println("Margin Detail :: " + margindetail);

            // // // ----------------- GetMarginSummary ----------------------
            // JSONObject marginsummary = (Mofsl.GetReportMarginSummary(clientcode));
            // System.out.println("Margin Summary :: " + marginsummary);

            // // ----------------- GetOrderDetailByUniqueorderID -----------------
            // JSONObject GetOrderbyUniqueOrderID =
            // (Mofsl.GetOrderDetailByUniqueorderID(clientcode, "1101823KAL005"));
            // System.out.println("Get Order Details By Unique OrderID :: " +
            // GetOrderbyUniqueOrderID);

            // // ------------ GetTradeDetailByUniqueorderID --------------
            // JSONObject GetTradebyUniqueOrderID =
            // (Mofsl.GetTradeDetailByUniqueorderID(clientcode,"1101823KAL005"));
            // System.out.println("Get Trade Details By Unique OrderID :: " +
            // GetTradebyUniqueOrderID);

            // ---------------- LTPData ------------------
            // LTPData LTPData = new LTPData();
            // LTPData.clientcode = clientcode;
            // LTPData.exchange = "BSE";
            // LTPData.scripcode = 500317;
            // JSONObject LTPResponse = (Mofsl.GetLtp(LTPData));
            // System.out.println("LTAData :: " + LTPResponse);

            // //------------------- GetInstrumentFile -----------------
            // JSONObject exchange = Mofsl.GetInstrumentFile(clientcode, "BSE");
            // System.out.println("Get Instrument file :: " + exchange);

            // // ------------------ Logout ------------------
            // JSONObject logout_response = (Mofsl.Logout(clientcode));
            // System.out.println("Logout :: " + logout_response);

        } catch (Exception e) {
            // While OpenApi Server down
            System.out.println("502 Bad Gateway Error");
        }

        // // -------------------------------------------------------------------
        // // --------------------------Trade WebSocket--------------------------
        // // -------------------------------------------------------------------
        try {
            TradeWebsocket ObjTradeStatus = new TradeWebsocket();

            ObjTradeStatus.onTradeStatusConnected(new OnConnect() {
                @Override
                public void OnTradeWebsocketConnect() throws JSONException {
                    ObjTradeStatus.Tradelogin();
                    ObjTradeStatus.TradeSubscribe();
                    // ObjTradeStatus.TradeUnsubscribe();

                    ObjTradeStatus.OrderSubscribe();
                    // ObjTradeStatus.OrderUnsubscribe();
                    // ObjTradeStatus.Tradelogout();
                }
            });

            ObjTradeStatus.GetTradeStatusResponse(new OnMessage() {

                @Override
                public void TradeStatusResponse(JSONObject TradeStatusResponse) {
                    System.out.println("Trade Status :: " + TradeStatusResponse);
                }
            });

            // ObjTradeStatus.TradeStatus_on_connect();
        } catch (Exception e) {
            System.out.println("Exception in TradeWebsocket" + e.getMessage());
        }
        // // -------------------------------------------------------------------
        // // --------------------------Broadcast WebSocket----------------------
        // // -------------------------------------------------------------------

        BroadcastConnect MofslBroadcast = new BroadcastConnect();
        MofslBroadcast.OnBroadcastConnected(new OnBroadcastConnect() {
            @Override
            public void onBroadcast_Connected() throws Exception {

                MofslBroadcast.ScripRegister("BSE", "CASH", 532543);
                // MofslBroadcast.ScripDeregister("BSE", "CASH", 532543);
                // MofslBroadcast.ScripRegister("BSE", "CASH", 532540);
                // MofslBroadcast.ScripRegister("NSE", "CASH", 11703);
                // MofslBroadcast.ScripRegister("NSEFO", "DERIVATIVES", 51479);
                // MofslBroadcast.ScripRegister("NSECD", "DERIVATIVES", 13578);
                MofslBroadcast.ScripRegister("MCXCOMDTY", "DERIVATIVES", 250058);

                // // Index BSE, NSE
                // MofslBroadcast.IndexRegister("NSE");
                // MofslBroadcast.IndexDeregister("NSE");

                // MofslBroadcast.IndexRegister("BSE");
                // MofslBroadcast.IndexDeregister("BSE");
            }
        });

        MofslBroadcast.GetBroadcastMessage(new OnBroadcastMessage() {

            @Override
            public void BroadcastResponse(JSONObject l_JSONResponse) throws JSONException {

                if (l_JSONResponse.getString("Type") == "Index") {
                    System.out.println("Index:: " + l_JSONResponse);
                }
                if (l_JSONResponse.getString("Type") == "LTP") {
                    System.out.println("LTP:: " + l_JSONResponse);
                }
                if (l_JSONResponse.getString("Type") == "DPR") {
                    System.out.println("DPR:: " + l_JSONResponse);
                }
                if (l_JSONResponse.getString("Type") == "MarketDepth") {
                    System.out.println("MarketDepth:: " + l_JSONResponse);
                }
                if (l_JSONResponse.getString("Type") == "DayOHLC") {
                    System.out.println("DayOHLC:: " + l_JSONResponse);
                }
                if (l_JSONResponse.getString("Type") == "OpenInterest") {
                    System.out.println("OpenInterest:: " + l_JSONResponse);
                }
            }
        });
        MofslBroadcast.Broadcast_on_connect();
        // MofslBroadcast.BroadcastLogout();
    }
}
