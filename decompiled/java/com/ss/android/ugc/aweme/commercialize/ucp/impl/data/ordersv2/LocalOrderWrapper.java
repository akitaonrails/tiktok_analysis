package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2;

import X.C09CT;
import X.C0D6B;
import X.C0D6M;
import X.C0D6N;
import X.C0D6O;
import X.C0DHO;
import X.C1954807lC;
import X.C2188811AlT;
import X.C297701Dj;
import X.C332710D2n;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutOrder;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderState;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class LocalOrderWrapper implements Serializable {

    @C09CT("checkout_intent")
    public CheckoutIntent checkoutIntent;

    @C09CT("checkout_session")
    public CheckoutSession checkoutSession;

    @C09CT("entry_context")
    public C332710D2n entryContext;

    @C09CT("internal_tiktok_order_id")
    public Long internalTiktokOrderId;

    @C09CT("last_retry_at")
    public long lastRetryAt;

    @C09CT("order")
    public ShopOrderDisplayModelV2 order;

    @C09CT("pending_retry_count")
    public int pendingRetryCount;

    @C09CT("state")
    public OrderState state;

    public LocalOrderWrapper() {
        this(new ShopOrderDisplayModelV2(), null, null, null, new C332710D2n(C0DHO.STANDARD, null, null, null), new OrderState.Pending(OrderPendingState.SYNCING), 0, 0L);
    }

    public final LocalOrderWrapper copy(ShopOrderDisplayModelV2 shopOrderDisplayModelV2, Long l, CheckoutSession checkoutSession, CheckoutIntent checkoutIntent, C332710D2n c332710D2n, OrderState orderState, int i, long j) {
        return new LocalOrderWrapper(shopOrderDisplayModelV2, l, checkoutSession, checkoutIntent, c332710D2n, orderState, i, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalOrderWrapper)) {
            return false;
        }
        LocalOrderWrapper localOrderWrapper = (LocalOrderWrapper) obj;
        return Intrinsics.LJFF(this.order, localOrderWrapper.order) && Intrinsics.LJFF(this.internalTiktokOrderId, localOrderWrapper.internalTiktokOrderId) && Intrinsics.LJFF(this.checkoutSession, localOrderWrapper.checkoutSession) && Intrinsics.LJFF(this.checkoutIntent, localOrderWrapper.checkoutIntent) && Intrinsics.LJFF(this.entryContext, localOrderWrapper.entryContext) && Intrinsics.LJFF(this.state, localOrderWrapper.state) && this.pendingRetryCount == localOrderWrapper.pendingRetryCount && this.lastRetryAt == localOrderWrapper.lastRetryAt;
    }

    public int hashCode() {
        int iHashCode = this.order.hashCode() * 31;
        Long l = this.internalTiktokOrderId;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        CheckoutSession checkoutSession = this.checkoutSession;
        int iHashCode3 = (iHashCode2 + (checkoutSession == null ? 0 : checkoutSession.hashCode())) * 31;
        CheckoutIntent checkoutIntent = this.checkoutIntent;
        return ((((((((iHashCode3 + (checkoutIntent != null ? checkoutIntent.hashCode() : 0)) * 31) + this.entryContext.hashCode()) * 31) + this.state.hashCode()) * 31) + this.pendingRetryCount) * 31) + C786410Ut5.Y2(this.lastRetryAt);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalOrderWrapper(order=");
        sbLIZ.append(this.order);
        sbLIZ.append(", internalTiktokOrderId=");
        sbLIZ.append(this.internalTiktokOrderId);
        sbLIZ.append(", checkoutSession=");
        sbLIZ.append(this.checkoutSession);
        sbLIZ.append(", checkoutIntent=");
        sbLIZ.append(this.checkoutIntent);
        sbLIZ.append(", entryContext=");
        sbLIZ.append(this.entryContext);
        sbLIZ.append(", state=");
        sbLIZ.append(this.state);
        sbLIZ.append(", pendingRetryCount=");
        sbLIZ.append(this.pendingRetryCount);
        sbLIZ.append(", lastRetryAt=");
        sbLIZ.append(this.lastRetryAt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAdLogExtra() {
        CheckoutIntent checkoutIntent;
        Map<String, String> map;
        Map<String, String> map2;
        String str;
        CheckoutIntent checkoutIntent2 = this.checkoutIntent;
        if (checkoutIntent2 != null && (map2 = checkoutIntent2.passThrough) != null && (str = map2.get("log_extra")) != null) {
            return str;
        }
        CheckoutOrderDetails checkoutCreateOriginData = this.order.getCheckoutCreateOriginData();
        if (checkoutCreateOriginData == null || (checkoutIntent = checkoutCreateOriginData.checkoutIntent) == null || (map = checkoutIntent.passThrough) == null) {
            return null;
        }
        return map.get("log_extra");
    }

    public final long getCreateAtTime() {
        Long l;
        Long l2;
        OrderState orderState = this.state;
        if (Intrinsics.LJFF(orderState, C0D6M.INSTANCE)) {
            CheckoutSession checkoutSession = this.checkoutSession;
            if (checkoutSession == null || (l2 = checkoutSession.lastCreatAtTime) == null) {
                return 0L;
            }
            return l2.longValue();
        }
        if (!(orderState instanceof OrderState.Pending) && !Intrinsics.LJFF(orderState, C0D6O.INSTANCE)) {
            if (Intrinsics.LJFF(orderState, C0D6N.INSTANCE)) {
                return this.order.getExternalOrderCheckoutTime();
            }
            throw new C1954807lC();
        }
        CheckoutSession checkoutSession2 = this.checkoutSession;
        if (checkoutSession2 == null || (l = checkoutSession2.lastCreatAtTime) == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final String getCreativeID() {
        CheckoutIntent checkoutIntent;
        Map<String, String> map;
        Map<String, String> map2;
        String str;
        CheckoutIntent checkoutIntent2 = this.checkoutIntent;
        if (checkoutIntent2 != null && (map2 = checkoutIntent2.passThrough) != null && (str = map2.get("creative_id")) != null) {
            return str;
        }
        CheckoutOrderDetails checkoutCreateOriginData = this.order.getCheckoutCreateOriginData();
        if (checkoutCreateOriginData == null || (checkoutIntent = checkoutCreateOriginData.checkoutIntent) == null || (map = checkoutIntent.passThrough) == null) {
            return null;
        }
        return map.get("creative_id");
    }

    public final String getFeedbackLink() {
        String string;
        String feedbackLink = this.order.getFeedbackLink();
        if (feedbackLink == null || (string = a0.LJLIIIL(feedbackLink).toString()) == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    public final String getOrderId() {
        CheckoutOrder checkoutOrder;
        OrderState orderState = this.state;
        if (Intrinsics.LJFF(orderState, C0D6M.INSTANCE)) {
            return null;
        }
        if ((orderState instanceof OrderState.Pending) || Intrinsics.LJFF(orderState, C0D6O.INSTANCE)) {
            CheckoutSession checkoutSession = this.checkoutSession;
            if (checkoutSession == null || (checkoutOrder = checkoutSession.order) == null) {
                return null;
            }
            return checkoutOrder.id;
        }
        if (!Intrinsics.LJFF(orderState, C0D6N.INSTANCE)) {
            throw new C1954807lC();
        }
        String outerOrderId = this.order.getOuterOrderId();
        if (outerOrderId != null) {
            return outerOrderId;
        }
        Long lValueOf = Long.valueOf(this.order.getTiktokOrderId());
        if (lValueOf.longValue() > 0) {
            return lValueOf.toString();
        }
        return null;
    }

    public final boolean getPendingOrder() {
        return (Intrinsics.LJFF(this.state, C0D6M.INSTANCE) || Intrinsics.LJFF(this.state, C0D6N.INSTANCE)) ? false : true;
    }

    public final String getPermalinkUrl() {
        CheckoutOrder checkoutOrder;
        if (Intrinsics.LJFF(this.state, C0D6N.INSTANCE)) {
            return this.order.getExternalOrderWebUrl();
        }
        CheckoutSession checkoutSession = this.checkoutSession;
        if (checkoutSession == null || (checkoutOrder = checkoutSession.order) == null) {
            return null;
        }
        return checkoutOrder.permalinkUrl;
    }

    public final CheckoutIntent getResolvedCheckoutIntent() {
        CheckoutIntent checkoutIntent = this.checkoutIntent;
        if (checkoutIntent != null) {
            return checkoutIntent;
        }
        CheckoutOrderDetails checkoutCreateOriginData = this.order.getCheckoutCreateOriginData();
        if (checkoutCreateOriginData != null) {
            return checkoutCreateOriginData.checkoutIntent;
        }
        return null;
    }

    public final CheckoutSession getResolvedCheckoutSession() {
        Object obj;
        String string;
        String string2;
        String string3;
        Object obj2;
        String string4;
        CheckoutSession checkoutSession = this.checkoutSession;
        if (checkoutSession == null) {
            CheckoutOrderDetails checkoutCreateOriginData = this.order.getCheckoutCreateOriginData();
            checkoutSession = checkoutCreateOriginData != null ? checkoutCreateOriginData.checkoutSession : null;
        }
        CheckoutOrderDetails checkoutCreateOriginData2 = this.order.getCheckoutCreateOriginData();
        CheckoutSession checkoutSession2 = checkoutCreateOriginData2 != null ? checkoutCreateOriginData2.checkoutSession : null;
        CheckoutIntent resolvedCheckoutIntent = getResolvedCheckoutIntent();
        Long resolvedTiktokOrderId = getResolvedTiktokOrderId();
        if (checkoutSession == null || !C0D6B.LIZIZ(resolvedCheckoutIntent)) {
            return checkoutSession;
        }
        Map<String, Object> mapLIZ = C297701Dj.LIZ(checkoutSession.ucp);
        Map<String, Object> mapLIZ2 = C297701Dj.LIZ(checkoutSession2 != null ? checkoutSession2.ucp : null);
        Long lLIZJ = C297701Dj.LIZJ(mapLIZ);
        long jLongValue = (lLIZJ == null && (lLIZJ = C297701Dj.LIZJ(mapLIZ2)) == null) ? resolvedTiktokOrderId != null ? resolvedTiktokOrderId.longValue() : 0L : lLIZJ.longValue();
        Object obj3 = mapLIZ.get("jwt_token");
        if ((obj3 == null || (string = obj3.toString()) == null || !(!a0.LJJJIL(string))) && ((obj = mapLIZ2.get("jwt_token")) == null || (string = obj.toString()) == null || !(!a0.LJJJIL(string)))) {
            string = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapLIZ);
        if (jLongValue > 0 && C297701Dj.LIZJ(linkedHashMap) == null) {
            linkedHashMap.put("tiktok_order_id", Long.valueOf(jLongValue));
        }
        if (string != null && ((obj2 = linkedHashMap.get("jwt_token")) == null || (string4 = obj2.toString()) == null || a0.LJJJIL(string4))) {
            linkedHashMap.put("jwt_token", string);
        }
        Object obj4 = linkedHashMap.get(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (obj4 == null || (string3 = obj4.toString()) == null || a0.LJJJIL(string3)) {
            Object obj5 = mapLIZ2.get(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            if (obj5 == null || (string2 = obj5.toString()) == null || a0.LJJJIL(string2)) {
                string2 = "success";
            }
            linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, string2);
        }
        return !Intrinsics.LJFF(linkedHashMap, mapLIZ) ? checkoutSession.copy(linkedHashMap, checkoutSession.id, checkoutSession.currency, checkoutSession.buyer, checkoutSession.lineItems, checkoutSession.discounts, checkoutSession.totals, checkoutSession.fulfillment, checkoutSession.expiresAt, checkoutSession.links, checkoutSession.payment, checkoutSession.order, checkoutSession.messages, checkoutSession.status, checkoutSession.continueUrl, checkoutSession._checkoutState, checkoutSession.lastCreatAtTime) : checkoutSession;
    }

    public final Long getResolvedTiktokOrderId() {
        Long lValueOf = Long.valueOf(this.order.getTiktokOrderId());
        if (lValueOf.longValue() > 0 || 0 != 0 || ((lValueOf = this.internalTiktokOrderId) != null && lValueOf.longValue() > 0)) {
            return lValueOf;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getStableDisplayId() {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper.getStableDisplayId():java.lang.String");
    }

    public final String getTrackingCreativeID() {
        Map<String, String> map;
        String str;
        String string;
        CheckoutOrderDetails checkoutCreateOriginData;
        if (Intrinsics.LJFF(this.state, C0D6N.INSTANCE)) {
            Long lValueOf = Long.valueOf(this.order.getCid());
            if (lValueOf.longValue() > 0) {
                return lValueOf.toString();
            }
            return null;
        }
        CheckoutIntent checkoutIntent = this.checkoutIntent;
        if ((checkoutIntent == null && ((checkoutCreateOriginData = this.order.getCheckoutCreateOriginData()) == null || (checkoutIntent = checkoutCreateOriginData.checkoutIntent) == null)) || (map = checkoutIntent.passThrough) == null || (str = map.get("creative_id")) == null || (string = a0.LJLIIIL(str).toString()) == null || !(true ^ a0.LJJJIL(string))) {
            return null;
        }
        return string;
    }

    public final String getTrackingLogExtra() {
        Map<String, String> map;
        String str;
        String string;
        CheckoutOrderDetails checkoutCreateOriginData;
        String string2;
        if (Intrinsics.LJFF(this.state, C0D6N.INSTANCE)) {
            String adLogExtra = this.order.getAdLogExtra();
            if (adLogExtra != null && (string2 = a0.LJLIIIL(adLogExtra).toString()) != null && (!a0.LJJJIL(string2))) {
                return string2;
            }
        } else {
            CheckoutIntent checkoutIntent = this.checkoutIntent;
            if ((checkoutIntent != null || ((checkoutCreateOriginData = this.order.getCheckoutCreateOriginData()) != null && (checkoutIntent = checkoutCreateOriginData.checkoutIntent) != null)) && (map = checkoutIntent.passThrough) != null && (str = map.get("log_extra")) != null && (string = a0.LJLIIIL(str).toString()) != null && (!a0.LJJJIL(string))) {
                return string;
            }
        }
        return null;
    }

    public final boolean isPending() {
        return this.state instanceof OrderState.Pending;
    }

    public final String getTrackingCid() {
        String trackingCreativeID = getTrackingCreativeID();
        if (trackingCreativeID != null) {
            return trackingCreativeID;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("order:");
        sbLIZ.append(getStableDisplayId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getTrackingOrderId() {
        String orderId;
        String string;
        Long resolvedTiktokOrderId = getResolvedTiktokOrderId();
        if ((resolvedTiktokOrderId == null || (string = resolvedTiktokOrderId.toString()) == null) && ((orderId = getOrderId()) == null || (string = a0.LJLIIIL(orderId).toString()) == null || !(!a0.LJJJIL(string)))) {
            return null;
        }
        return string;
    }

    public final void setCheckoutIntent(CheckoutIntent checkoutIntent) {
        this.checkoutIntent = checkoutIntent;
    }

    public final void setCheckoutSession(CheckoutSession checkoutSession) {
        this.checkoutSession = checkoutSession;
    }

    public final void setEntryContext(C332710D2n c332710D2n) {
        this.entryContext = c332710D2n;
    }

    public final void setInternalTiktokOrderId(Long l) {
        this.internalTiktokOrderId = l;
    }

    public final void setLastRetryAt(long j) {
        this.lastRetryAt = j;
    }

    public final void setOrder(ShopOrderDisplayModelV2 shopOrderDisplayModelV2) {
        this.order = shopOrderDisplayModelV2;
    }

    public final void setPendingRetryCount(int i) {
        this.pendingRetryCount = i;
    }

    public final void setState(OrderState orderState) {
        this.state = orderState;
    }

    public LocalOrderWrapper(ShopOrderDisplayModelV2 shopOrderDisplayModelV2, Long l, CheckoutSession checkoutSession, CheckoutIntent checkoutIntent, C332710D2n c332710D2n, OrderState orderState, int i, long j) {
        this.order = shopOrderDisplayModelV2;
        this.internalTiktokOrderId = l;
        this.checkoutSession = checkoutSession;
        this.checkoutIntent = checkoutIntent;
        this.entryContext = c332710D2n;
        this.state = orderState;
        this.pendingRetryCount = i;
        this.lastRetryAt = j;
    }
}
