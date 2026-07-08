package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPaymentNeedFinishPaymentDeeplinkConfigModel {

    @C09CT("back_schema")
    public final String backSchema;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("need_poll")
    public final boolean needPoll;

    @C09CT("poll_max_time")
    public final int pollMaxTime;

    @C09CT("schema")
    public final String schema;

    @C09CT("should_use_simple_redirect_url")
    public final List<String> shouldUseSimpleRedirectUrl;

    @C09CT("simple_redirect_url")
    public final String simpleRedirectUrl;

    @C09CT("supported_methods")
    public final List<String> supportedMethods;

    public EcPaymentNeedFinishPaymentDeeplinkConfigModel() {
        this(null, false, false, 0, null, null, null, null, 255, null);
    }

    public EcPaymentNeedFinishPaymentDeeplinkConfigModel(List<String> list, boolean z, boolean z2, int i, String str, String str2, List<String> list2, String str3) {
        this.supportedMethods = list;
        this.needPoll = z;
        this.enable = z2;
        this.pollMaxTime = i;
        this.schema = str;
        this.backSchema = str2;
        this.shouldUseSimpleRedirectUrl = list2;
        this.simpleRedirectUrl = str3;
    }

    public EcPaymentNeedFinishPaymentDeeplinkConfigModel(List list, boolean z, boolean z2, int i, String str, String str2, List list2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? false : z, (i2 & 4) == 0 ? z2 : false, (i2 & 8) != 0 ? 5 : i, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : list2, (i2 & 128) == 0 ? str3 : null);
    }
}
