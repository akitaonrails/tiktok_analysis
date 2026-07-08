package com.ss.android.ugc.aweme.im.sdk.common.controller.block;

import X.C01GW;
import X.C0I0B;
import X.C0PEM;
import X.C1229100i5c;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1697810uHb;
import X.C1BG0;
import X.C1DFH;
import X.C2107308Nj;
import X.C2202101BGm;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C487280J9a;
import X.C592760NMs;
import X.C592770NMt;
import X.C592780NMu;
import X.C592810NMx;
import X.C985403tE;
import X.EnumC1219960hqs;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.res.Configuration;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics;
import com.ss.android.ugc.aweme.im.service.service.IBlockUserController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS400S0200000_34;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class BlockUserController implements InterfaceC487330J9f, IBlockUserController {
    public static final C01GW<C1BG0> LLJILLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(80));
    public final Activity LL;
    public final IMUser LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final Function0<Unit> LLILZIL;
    public final Function1<IMUser, Unit> LLILZLL;
    public final Function1<Boolean, Unit> LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public C1397510mTF LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.im.service.service.IBlockUserController
    public final void LIZIZ() {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C592780NMu(this, true, null), 3);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C592760NMs(this, null), 3);
    }

    public final void LIZLLL() {
        this.LLIZ.invoke(Boolean.FALSE);
        IImImproveBlockExperienceAnalytics.LIZ.getClass();
        IImImproveBlockExperienceAnalytics iImImproveBlockExperienceAnalyticsLIZ = C2202101BGm.LIZ();
        if (iImImproveBlockExperienceAnalyticsLIZ != null) {
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            String uid = this.LLILLJJLI.getUid();
            if (uid == null) {
                uid = "";
            }
            String str3 = this.LLIZLLLIL;
            String str4 = this.LLJ;
            String str5 = this.LLJI;
            iImImproveBlockExperienceAnalyticsLIZ.LJII(C0I0B.LJFF.LIZIZ(), Integer.valueOf(LJI(this.LLILLJJLI)), str, str2, uid, str3, str4, str5);
        }
    }

    public final void LJ() {
        this.LLIZ.invoke(Boolean.TRUE);
        IImImproveBlockExperienceAnalytics.LIZ.getClass();
        IImImproveBlockExperienceAnalytics iImImproveBlockExperienceAnalyticsLIZ = C2202101BGm.LIZ();
        if (iImImproveBlockExperienceAnalyticsLIZ != null) {
            iImImproveBlockExperienceAnalyticsLIZ.LJFF(C0I0B.LJFF.LIZIZ(), this.LLILLL, this.LLILZ, this.LLIZLLLIL, this.LLJ, false);
        }
    }

    public final String LJFF() {
        return (String) this.LLJILJIL.getValue();
    }

    public final boolean LJII() {
        return C1697810uHb.LJIIJJI("group_detail_page", "group_setting", "fan_group_setting").contains(this.LLILLL);
    }

    public static int LJI(IMUser iMUser) {
        if (iMUser.getFollowStatus() == 0 && iMUser.getFollowerStatus() == 1) {
            return iMUser.getFollowerStatus();
        }
        return iMUser.getFollowStatus();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C0NN0
            if (r0 == 0) goto L5f
            r6 = r8
            X.0NN0 r6 = (X.C0NN0) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto L3e
            if (r0 != r4) goto L65
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0NMv r1 = new X.0NMv
            r0 = 0
            r1.<init>(r7, r0)
            r6.LLILLL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r6, r2, r1)
            if (r0 != r5) goto L41
            return r5
        L3e:
            X.C155000ia.LIZIZ(r1)
        L41:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r7.LLILLJJLI
            java.lang.String r1 = r0.getUid()
            if (r1 == 0) goto L56
            java.lang.Class<com.ss.android.ugc.aweme.im.common.block.IBlockSystemMsgManager> r0 = com.ss.android.ugc.aweme.im.common.block.IBlockSystemMsgManager.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)
            com.ss.android.ugc.aweme.im.common.block.IBlockSystemMsgManager r0 = (com.ss.android.ugc.aweme.im.common.block.IBlockSystemMsgManager) r0
            if (r0 == 0) goto L56
            r0.LIZIZ(r1)
        L56:
            r6.LLILLL = r4
            java.lang.Object r0 = r7.LJIIJ(r3, r6)
            if (r0 != r5) goto L25
            return r5
        L5f:
            X.0NN0 r6 = new X.0NN0
            r6.<init>(r7, r8)
            goto L12
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController.LJIIIZ(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IBlockUserController
    public final void LIZ(Function0<Unit> function0, Function0<Unit> function02) {
        String string;
        int i;
        if (this.LLILLJJLI.isBlock()) {
            Activity activity = this.LL;
            C1397580mTM c1397580mTM = new C1397580mTM(activity);
            c1397580mTM.LJI(activity.getString(2131835959, LJFF(), this.LLJILJILJ.getValue()));
            c1397580mTM.LIZIZ(this.LL.getString(2131835957, LJFF()));
            C985403tE.LIZ(c1397580mTM, new AwS400S0200000_34(this, function02, 32));
            c1397580mTM.LJII = false;
            c1397580mTM.LIZLLL(new AwS613S0100000_34(this, 107));
            C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
            this.LLJIJIL = c1397510mTF;
            c1397510mTF.LIZLLL();
            IImImproveBlockExperienceAnalytics.LIZ.getClass();
            IImImproveBlockExperienceAnalytics iImImproveBlockExperienceAnalyticsLIZ = C2202101BGm.LIZ();
            if (iImImproveBlockExperienceAnalyticsLIZ != null) {
                iImImproveBlockExperienceAnalyticsLIZ.LIZLLL(this.LLILLL, this.LLILZ, this.LLIZLLLIL, this.LLJ, C0I0B.LJFF.LIZIZ());
                return;
            }
            return;
        }
        if (LJII()) {
            string = this.LL.getString(2131835398, LJFF());
        } else {
            string = this.LL.getString(2131835952, LJFF(), this.LLJILJILJ.getValue());
        }
        String str = this.LLILLL;
        int iHashCode = str.hashCode();
        if (iHashCode != -2097824668) {
            i = iHashCode != -774300675 ? 2131835399 : 2131835399;
        } else if (str.equals("fan_group_setting")) {
            if (C1229100i5c.LIZ(this.LLJ) == EnumC1219960hqs.SUBSCRIPTION) {
                i = 2131830139;
            } else {
                i = 2131830140;
            }
        } else {
            i = 2131835946;
        }
        C1397580mTM c1397580mTM2 = new C1397580mTM(this.LL);
        c1397580mTM2.LJI(string);
        c1397580mTM2.LIZ(i);
        C985403tE.LIZ(c1397580mTM2, new AwS400S0200000_34(this, function0, 29));
        c1397580mTM2.LJII = false;
        c1397580mTM2.LIZLLL(new AwS613S0100000_34(this, 105));
        C1397510mTF c1397510mTF2 = new C1397510mTF(c1397580mTM2);
        this.LLJIJIL = c1397510mTF2;
        c1397510mTF2.LIZLLL();
        IImImproveBlockExperienceAnalytics.LIZ.getClass();
        IImImproveBlockExperienceAnalytics iImImproveBlockExperienceAnalyticsLIZ2 = C2202101BGm.LIZ();
        if (iImImproveBlockExperienceAnalyticsLIZ2 == null) {
            return;
        }
        iImImproveBlockExperienceAnalyticsLIZ2.LJ(C0I0B.LJFF.LIZIZ(), Integer.valueOf(LJI(this.LLILLJJLI)), this.LLILLL, this.LLILZ, this.LLIZLLLIL, this.LLJ, this.LLJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(com.ss.android.ugc.aweme.im.common.model.BlockResponse r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C592830NMz
            if (r0 == 0) goto L63
            r6 = r9
            X.0NMz r6 = (X.C592830NMz) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r2 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 3
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 == r1) goto L71
            if (r0 == r3) goto L56
            if (r0 != r4) goto L69
            X.C155000ia.LIZIZ(r2)
        L28:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2b:
            X.C155000ia.LIZIZ(r2)
            int r0 = r8.getBlockStaus()
            if (r0 != r1) goto L3d
            r6.LLILLL = r1
            java.lang.Object r0 = r7.LJIIIZ(r6)
            if (r0 != r5) goto L74
            return r5
        L3d:
            int r0 = r8.getBlockStaus()
            if (r0 != 0) goto L77
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0NMw r1 = new X.0NMw
            r0 = 0
            r1.<init>(r7, r0)
            r6.LLILLL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r6, r2, r1)
            if (r0 != r5) goto L59
            return r5
        L56:
            X.C155000ia.LIZIZ(r2)
        L59:
            r6.LLILLL = r4
            r0 = 0
            java.lang.Object r0 = r7.LJIIJ(r0, r6)
            if (r0 != r5) goto L28
            return r5
        L63:
            X.0NMz r6 = new X.0NMz
            r6.<init>(r7, r9)
            goto L12
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L71:
            X.C155000ia.LIZIZ(r2)
        L74:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L77:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController.LJIIIIZZ(com.ss.android.ugc.aweme.im.common.model.BlockResponse, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(boolean r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C0NN1
            if (r0 == 0) goto L9c
            r5 = r11
            X.0NN1 r5 = (X.C0NN1) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9c
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r6 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 == r2) goto L85
            if (r0 != r3) goto La3
            X.C155000ia.LIZIZ(r1)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            if (r10 == 0) goto L39
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r9.LLILLJJLI
            r1 = 0
            r0.setFollowStatus(r1)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r9.LLILLJJLI
            r0.setFollowerStatus(r1)
        L39:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r9.LLILLJJLI
            r0.setBlock(r10)
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.06pF r1 = r0.LIZ()
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r9.LLILLJJLI
            java.lang.String r0 = r0.getUid()
            if (r0 == 0) goto L83
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
        L57:
            r1.LJIILLIIL(r0, r10)
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r8 = r0.LJ()
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r7 = r9.LLILLJJLI
            r5.LL = r10
            r5.LLILZ = r2
            java.lang.String r2 = r7.getUid()
            java.lang.String r1 = r7.getSecUid()
            java.lang.String r0 = "im_local_db"
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r2 = r8.LJIIL(r2, r1, r0)
            X.05rI r1 = new X.05rI
            r0 = 3
            r1.<init>(r0)
            java.lang.Object r0 = r8.LJIIIZ(r7, r2, r1, r5)
            if (r0 != r4) goto L8a
            return r4
        L83:
            r0 = r6
            goto L57
        L85:
            boolean r10 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L8a:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0Ytv r0 = new X.0Ytv
            r0.<init>(r9, r10, r6)
            r5.LLILZ = r3
            java.lang.Object r0 = X.C23250099c.LJI(r5, r1, r0)
            if (r0 != r4) goto L26
            return r4
        L9c:
            X.0NN1 r5 = new X.0NN1
            r5.<init>(r9, r11)
            goto L12
        La3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController.LJIIJ(boolean, X.05Vn):java.lang.Object");
    }

    public final void LJIIJJI(int i, Activity activity) {
        String string;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    string = this.LL.getString(2131835702);
                } else {
                    string = this.LL.getString(2131835960, LJFF());
                }
            } else {
                string = this.LL.getString(2131835954, LJFF());
            }
        } else {
            string = this.LL.getString(2131835702);
        }
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C1397510mTF c1397510mTF;
        C1397510mTF c1397510mTF2 = this.LLJIJIL;
        if (c1397510mTF2 != null && c1397510mTF2.LJIIIZ() && (c1397510mTF = this.LLJIJIL) != null) {
            c1397510mTF.LIZIZ(null);
        }
    }

    public final void LIZJ(int i, String str, String str2) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C592770NMt(this, null), 3);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C592810NMx(this, str, str2, i, null), 3);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Factory implements IBlockUserController.Factory {
        @Override // com.ss.android.ugc.aweme.im.service.service.IBlockUserController.Factory
        public final BlockUserController LIZ(Activity activity, IMUser iMUser, String str, String str2, Function0 function0, Function1 function1, Function1 function12, String str3, String str4) {
            return new BlockUserController(activity, iMUser, str, str2, function0, function1, function12, str3, str4, null, 512);
        }
    }

    public BlockUserController(Activity activity, IMUser iMUser, String str, String str2, Function0 function0, Function1 function1, Function1 function12, String str3, String str4, String str5, int i) {
        function0 = (i & 16) != 0 ? AFwS225S0000000_34.get$arr$(247) : function0;
        function1 = (i & 32) != 0 ? AFwS281S0000000_34.get$arr$(48) : function1;
        function12 = (i & 64) != 0 ? AFwS231S0000000_3.get$arr$(192) : function12;
        str3 = (i & 128) != 0 ? null : str3;
        str4 = (i & 256) != 0 ? null : str4;
        str5 = (i & 512) != 0 ? null : str5;
        this.LL = activity;
        this.LLILLJJLI = iMUser;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = function0;
        this.LLILZLL = function1;
        this.LLIZ = function12;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = str5;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1748));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 149));
        C487280J9a.LIZIZ(this.LL, this);
    }
}
