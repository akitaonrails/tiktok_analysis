package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2;

import X.C051K;
import X.C098200Yq;
import X.C09CT;
import X.C0D6D;
import X.C13LQ;
import X.C189200o6;
import X.C2188811AlT;
import X.C297701Dj;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class ShopOrderDisplayModelV2 implements Serializable {
    public static final C0D6D Companion = new C0D6D();

    @C09CT("ad_log_extra")
    public String adLogExtra;

    @C09CT("adv_id")
    public long advId;

    @C09CT("aid")
    public long aid;

    @C09CT("app_id")
    public long appId;

    @C09CT("checkout_create_origin_data")
    public String checkoutCreateOriginDataRaw;

    @C09CT("cid")
    public long cid;

    @C09CT("country_code")
    public String countryCode;

    @C09CT("currency")
    public String currency;

    @C09CT("display_message")
    public String displayMessage;

    @C09CT("display_title")
    public String displayTitle;

    @C09CT("external_checkout_id")
    public String externalCheckoutId;

    @C09CT("external_order_checkout_time")
    public long externalOrderCheckoutTime;

    @C09CT("external_order_create_time")
    public long externalOrderCreateTime;

    @C09CT("external_order_id")
    public String externalOrderId;

    @C09CT("external_order_info")
    public String externalOrderInfo;

    @C09CT("external_shop_id")
    public String externalShopId;

    @C09CT("external_shop_name")
    public String externalShopName;

    @C09CT("extra")
    public String extra;

    @C09CT("feedback_link")
    public String feedbackLink;

    @C09CT("order_items")
    public List<ShopOrderItemModelV2> orderItems;

    @C09CT("checkout_status")
    public int status;

    @C09CT("tenant")
    public String tenant;

    @C09CT("tiktok_device_id")
    public long tiktokDeviceId;

    @C09CT("tiktok_order_id")
    public long tiktokOrderId;

    @C09CT("tiktok_shop_id")
    public String tiktokShopId;

    @C09CT("tiktok_user_id")
    public long tiktokUserId;

    @C09CT("webhook_origin_data")
    public String webhookOriginData;

    public final CheckoutOrderDetails getCheckoutCreateOriginData() {
        Object c098200Yq;
        C0D6D c0d6d = Companion;
        String str = this.checkoutCreateOriginDataRaw;
        if (str == null) {
            str = "";
        }
        c0d6d.getClass();
        if (!(str.length() == 0)) {
            CheckoutOrderDetails checkoutOrderDetailsLIZ = C0D6D.LIZ(str);
            if (checkoutOrderDetailsLIZ == null) {
                Iterator it2 = ((ArrayList) C13LQ.LJIJI(new String[]{str, C297701Dj.LIZIZ(str)})).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String string = a0.LJLIIIL((String) it2.next()).toString();
                    if (string.length() != 0) {
                        if (!a0.LJJIIZI(string, "?", false)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("https://placeholder.local?");
                            sbLIZ.append(string);
                            string = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        try {
                            c098200Yq = new URI(string).getQuery();
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        String str2 = (String) c098200Yq;
                        if (str2 != null) {
                            Iterator it3 = a0.LJJLIIIJILLIZJL(str2, new String[]{"&"}, 0, 6).iterator();
                            while (it3.hasNext()) {
                                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it3.next(), new String[]{"="}, 2, 2);
                                if (listLJJLIIIJILLIZJL.size() == 2 && Intrinsics.LJFF(ListProtector.get(listLJJLIIIJILLIZJL, 0), "order_details") && ((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 1)).length() > 0) {
                                    String str3 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
                                    if (str3 != null) {
                                        Companion.getClass();
                                        return C0D6D.LIZ(str3);
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } else {
                return checkoutOrderDetailsLIZ;
            }
        }
        return null;
    }

    public final n getExternalOrderInfoJson() {
        Object c098200Yq;
        C0D6D c0d6d = Companion;
        String str = this.externalOrderInfo;
        if (str == null) {
            str = "";
        }
        c0d6d.getClass();
        if (str.length() == 0) {
            return null;
        }
        try {
            c098200Yq = (n) C051K.LIZIZ(str, n.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (n) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public final String getOpenLoopUcpParams() {
        Object c098200Yq;
        k kVarLJJIIZ;
        String str = this.extra;
        if (str == null) {
            return null;
        }
        try {
            c098200Yq = (n) C051K.LIZIZ(str, n.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        n nVar = (n) c098200Yq;
        if (nVar == null || (kVarLJJIIZ = nVar.LJJIIZ("open_loop_ucp_params")) == null) {
            return null;
        }
        if (!(!(kVarLJJIIZ instanceof m))) {
            kVarLJJIIZ = null;
        }
        if (kVarLJJIIZ != null) {
            return kVarLJJIIZ.LJIL();
        }
        return null;
    }

    public final String getExternalOrderIdFromInfo() {
        k kVarLJJIIZ;
        n externalOrderInfoJson = getExternalOrderInfoJson();
        if (externalOrderInfoJson == null || (kVarLJJIIZ = externalOrderInfoJson.LJJIIZ(FollowStatusChangeMethod.PARAM_UID)) == null || !(!(kVarLJJIIZ instanceof m))) {
            return null;
        }
        return kVarLJJIIZ.LJIL();
    }

    public final String getExternalOrderName() {
        k kVarLJJIIZ;
        n externalOrderInfoJson = getExternalOrderInfoJson();
        if (externalOrderInfoJson == null || (kVarLJJIIZ = externalOrderInfoJson.LJJIIZ("name")) == null || !(!(kVarLJJIIZ instanceof m))) {
            return null;
        }
        return kVarLJJIIZ.LJIL();
    }

    public final String getExternalOrderWebUrl() {
        k kVarLJJIIZ;
        n externalOrderInfoJson = getExternalOrderInfoJson();
        if (externalOrderInfoJson == null || (kVarLJJIIZ = externalOrderInfoJson.LJJIIZ("permalink_url")) == null || !(!(kVarLJJIIZ instanceof m))) {
            return null;
        }
        return kVarLJJIIZ.LJIL();
    }

    public final String getAdLogExtra() {
        return this.adLogExtra;
    }

    public final long getAdvId() {
        return this.advId;
    }

    public final long getAid() {
        return this.aid;
    }

    public final long getAppId() {
        return this.appId;
    }

    public final String getCheckoutCreateOriginDataRaw() {
        return this.checkoutCreateOriginDataRaw;
    }

    public final long getCid() {
        return this.cid;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final long getCreatedTime() {
        return this.externalOrderCreateTime;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDisplayMessage() {
        return this.displayMessage;
    }

    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    public final String getExternalCheckoutId() {
        return this.externalCheckoutId;
    }

    public final long getExternalOrderCheckoutTime() {
        return this.externalOrderCheckoutTime;
    }

    public final long getExternalOrderCreateTime() {
        return this.externalOrderCreateTime;
    }

    public final String getExternalOrderId() {
        return this.externalOrderId;
    }

    public final String getExternalOrderInfo() {
        return this.externalOrderInfo;
    }

    public final String getExternalShopId() {
        return this.externalShopId;
    }

    public final String getExternalShopName() {
        return this.externalShopName;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getFeedbackLink() {
        return this.feedbackLink;
    }

    public final List<ShopOrderItemModelV2> getOrderItems() {
        return this.orderItems;
    }

    public final String getOuterOrderId() {
        return this.externalOrderId;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getTenant() {
        return this.tenant;
    }

    public final long getTiktokDeviceId() {
        return this.tiktokDeviceId;
    }

    public final long getTiktokOrderId() {
        return this.tiktokOrderId;
    }

    public final String getTiktokShopId() {
        return this.tiktokShopId;
    }

    public final long getTiktokUserId() {
        return this.tiktokUserId;
    }

    public final long getUpdatedTime() {
        return this.externalOrderCheckoutTime;
    }

    public final String getWebhookOriginData() {
        return this.webhookOriginData;
    }

    public final void setAdLogExtra(String str) {
        this.adLogExtra = str;
    }

    public final void setAdvId(long j) {
        this.advId = j;
    }

    public final void setAid(long j) {
        this.aid = j;
    }

    public final void setAppId(long j) {
        this.appId = j;
    }

    public final void setCheckoutCreateOriginDataRaw(String str) {
        this.checkoutCreateOriginDataRaw = str;
    }

    public final void setCid(long j) {
        this.cid = j;
    }

    public final void setCountryCode(String str) {
        this.countryCode = str;
    }

    public final void setCreatedTime(long j) {
        this.externalOrderCreateTime = j;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setDisplayMessage(String str) {
        this.displayMessage = str;
    }

    public final void setDisplayTitle(String str) {
        this.displayTitle = str;
    }

    public final void setExternalCheckoutId(String str) {
        this.externalCheckoutId = str;
    }

    public final void setExternalOrderCheckoutTime(long j) {
        this.externalOrderCheckoutTime = j;
    }

    public final void setExternalOrderCreateTime(long j) {
        this.externalOrderCreateTime = j;
    }

    public final void setExternalOrderId(String str) {
        this.externalOrderId = str;
    }

    public final void setExternalOrderInfo(String str) {
        this.externalOrderInfo = str;
    }

    public final void setExternalShopId(String str) {
        this.externalShopId = str;
    }

    public final void setExternalShopName(String str) {
        this.externalShopName = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setFeedbackLink(String str) {
        this.feedbackLink = str;
    }

    public final void setOrderItems(List<ShopOrderItemModelV2> list) {
        this.orderItems = list;
    }

    public final void setOuterOrderId(String str) {
        this.externalOrderId = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTenant(String str) {
        this.tenant = str;
    }

    public final void setTiktokDeviceId(long j) {
        this.tiktokDeviceId = j;
    }

    public final void setTiktokOrderId(long j) {
        this.tiktokOrderId = j;
    }

    public final void setTiktokShopId(String str) {
        this.tiktokShopId = str;
    }

    public final void setTiktokUserId(long j) {
        this.tiktokUserId = j;
    }

    public final void setUpdatedTime(long j) {
        this.externalOrderCheckoutTime = j;
    }

    public final void setWebhookOriginData(String str) {
        this.webhookOriginData = str;
    }
}
