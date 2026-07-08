package com.ss.android.ugc.aweme.services.popsuite;

import X.AbstractC23140094w;
import X.C01GW;
import X.C09DV;
import X.C1C7U;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class PopupConfirmationApi {
    public static final PopupConfirmationApi INSTANCE = new PopupConfirmationApi();
    public static final C01GW api$delegate = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(81));
    public static final int $stable = 8;

    public interface Api {
        @InterfaceC1501170pAR("/passport/popup/confirmation/")
        Object getPopupConfirmation(@InterfaceC1501070pAH("popup_campaigns") String str, InterfaceC1364105Vn<? super PopupConfirmationApiResponse> interfaceC1364105Vn);
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.popsuite.PopupConfirmationApi$getPopupConfirmation$1, reason: invalid class name */
    @C09DV(c = "com.ss.android.ugc.aweme.services.popsuite.PopupConfirmationApi", f = "PopupConfirmationApi.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "getPopupConfirmation")
    public final class AnonymousClass1 extends AbstractC23140094w {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("PopupConfirmationApi@a344.getPopupConfirmation$1");
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object popupConfirmation = PopupConfirmationApi.this.getPopupConfirmation(null, this);
            C1C7U.LIZIZ("PopupConfirmationApi@a344.getPopupConfirmation$1");
            return popupConfirmation;
        }
    }

    private final Api getApi() {
        return (Api) api$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getPopupConfirmation(java.lang.String r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.services.popsuite.PopupConfirmationApiResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.ss.android.ugc.aweme.services.popsuite.PopupConfirmationApi.AnonymousClass1
            if (r0 == 0) goto L20
            r4 = r7
            com.ss.android.ugc.aweme.services.popsuite.PopupConfirmationApi$getPopupConfirmation$1 r4 = (com.ss.android.ugc.aweme.services.popsuite.PopupConfirmationApi.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3e
        L20:
            com.ss.android.ugc.aweme.services.popsuite.PopupConfirmationApi$getPopupConfirmation$1 r4 = new com.ss.android.ugc.aweme.services.popsuite.PopupConfirmationApi$getPopupConfirmation$1
            r4.<init>(r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.services.popsuite.PopupConfirmationApi$Api r0 = r5.getApi()     // Catch: java.lang.Exception -> L44
            r4.label = r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r3 = r0.getPopupConfirmation(r6, r4)     // Catch: java.lang.Exception -> L44
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L44
        L41:
            com.ss.android.ugc.aweme.services.popsuite.PopupConfirmationApiResponse r3 = (com.ss.android.ugc.aweme.services.popsuite.PopupConfirmationApiResponse) r3     // Catch: java.lang.Exception -> L44
            return r3
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.services.popsuite.PopupConfirmationApiResponse r3 = new com.ss.android.ugc.aweme.services.popsuite.PopupConfirmationApiResponse
            r0 = 0
            r3.<init>(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.popsuite.PopupConfirmationApi.getPopupConfirmation(java.lang.String, X.05Vn):java.lang.Object");
    }
}
