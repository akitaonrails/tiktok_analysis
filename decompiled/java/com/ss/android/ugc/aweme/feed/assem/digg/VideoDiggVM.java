package com.ss.android.ugc.aweme.feed.assem.digg;

import X.AbstractC1386130mAt;
import X.AbstractC1604130rqV;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C07HI;
import X.C09JN;
import X.C0JBR;
import X.C0O9G;
import X.C0OAD;
import X.C0PEM;
import X.C0R7N;
import X.C0SUC;
import X.C0SXF;
import X.C0SYJ;
import X.C0SYN;
import X.C0XPD;
import X.C0XQ7;
import X.C1017070cZd;
import X.C1029590ctp;
import X.C11NJ;
import X.C11S5;
import X.C123100dR;
import X.C1233040iBy;
import X.C1354920lMY;
import X.C1359610lU7;
import X.C1360330lVH;
import X.C1360460lVU;
import X.C1366720lfa;
import X.C1366730lfb;
import X.C1370890lmJ;
import X.C1386360mBG;
import X.C1388190mED;
import X.C1389300mG0;
import X.C1389890mGx;
import X.C13LE;
import X.C1440005kM;
import X.C14TF;
import X.C1559260qg8;
import X.C1599640rjG;
import X.C15WT;
import X.C1609930rzr;
import X.C1612650s4F;
import X.C1618440sDa;
import X.C1701940uOG;
import X.C1843500y4a;
import X.C1DFH;
import X.C1EE2;
import X.C1ER1;
import X.C20096413kA;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217371BqR;
import X.C2276411E8h;
import X.C2276471E8n;
import X.C2277711EDh;
import X.C23250099c;
import X.C295620BiK;
import X.C303210BuZ;
import X.C325170Cot;
import X.C452501pT;
import X.C547860LeC;
import X.C584760Mwc;
import X.C618720OOo;
import X.C627150Oin;
import X.C666580QCq;
import X.C708600Rqs;
import X.C717590SCv;
import X.C723600SZy;
import X.C725570Sd9;
import X.C729980SkG;
import X.C730120SkU;
import X.C730420Sky;
import X.C730490Sl5;
import X.C731910SnN;
import X.C731930SnP;
import X.C733660SqC;
import X.C733790SqP;
import X.C733800SqQ;
import X.C733810SqR;
import X.C734440SrS;
import X.C734550Srd;
import X.C735280Sso;
import X.C735330Sst;
import X.C735360Ssw;
import X.C735370Ssx;
import X.C735610StL;
import X.C737370SwB;
import X.C737390SwD;
import X.C738960Syk;
import X.C740470T2v;
import X.C786410Ut5;
import X.C828040We2;
import X.C844470XAv;
import X.EnumC730430Skz;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import X.InterfaceC734510SrZ;
import Y.AfS147S0200000_11;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.ab.FeedDiggFakeWriteOptExp;
import com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel;
import com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService;
import com.ss.android.ugc.aweme.tako.mob.TakoAIVideoMobFiller;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS27S0200100_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS48S0100100_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoDiggVM extends FeedRightBtnBaseViewModel<C730490Sl5> implements InterfaceC734510SrZ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static long LLJJI;
    public long LL;
    public boolean LLILLJJLI;
    public long LLILZ;
    public int LLILZIL;
    public final C734550Srd LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public boolean LLJILJILJ;
    public final C20096413kA LLJILLL;
    public final ConcurrentHashMap<String, Boolean> LLILLL = new ConcurrentHashMap<>();
    public final C717590SCv LLILZLL = new C717590SCv(AFwS198S0000000_11.get$arr$(88));
    public final C1559260qg8 LLIZ = new C1559260qg8(new C723600SZy(this, C0SYJ.class, null), true);
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723600SZy(this, C0R7N.class, null), true);

    public interface AppDiffProtocol {
        public static final C733810SqR LIZ = C733810SqR.LIZ;

        public static final class DowngradeInstance implements AppDiffProtocol {
            @Override // com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.AppDiffProtocol
            public final void LIZ() {
            }
        }

        void LIZ();
    }

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(VideoDiggVM.class, "context", "getContext()Landroid/content/Context;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    public static boolean MQ2() {
        FeedDiggFakeWriteOptExp.FakeWriteConfig fakeWriteConfig = (FeedDiggFakeWriteOptExp.FakeWriteConfig) FeedDiggFakeWriteOptExp.LIZ.getValue();
        return (fakeWriteConfig != null && fakeWriteConfig.enable == 1 && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) ? false : true;
    }

    public final C0SYJ CQ2() {
        C0SYJ c0syj = (C0SYJ) this.LLIZ.getValue();
        return c0syj == null ? new C0SYJ((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127) : c0syj;
    }

    public final long DQ2() {
        C0R7N c0r7n = (C0R7N) this.LLIZLLLIL.getValue();
        if (c0r7n == null) {
            c0r7n = new C0R7N(null);
        }
        Function0<Long> function0 = c0r7n.LL;
        if (function0 != null) {
            return function0.invoke().longValue();
        }
        return 0L;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C730490Sl5(false, null, 63);
    }

    public final Context getContext() {
        C717590SCv c717590SCv = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (Context) c717590SCv.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel
    public final void onForceHideTextFlagChange() {
        setState(new C731930SnP(this));
    }

    public VideoDiggVM() {
        C734550Srd c734550Srd = new C734550Srd();
        this.LLJ = c734550Srd;
        this.LLJI = C452501pT.LIZIZ(new C733800SqQ());
        this.LLJIJIL = C452501pT.LIZIZ(new C733790SqP());
        this.LLJILJIL = C452501pT.LIZIZ(new C0O9G());
        c734550Srd.LJIIJ(new C737390SwD());
        c734550Srd.LLILLJJLI = this;
        this.LLJILLL = new C20096413kA();
    }

    public final DataCenter LJJIIZI() {
        VideoItemParams item = getItem();
        if (item != null) {
            return item.dataCenter;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel
    public final String getZeroNumReplaceString() {
        if (!C295620BiK.LIZ()) {
            return null;
        }
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ().getString(R.string.gpo);
    }

    public final JSONObject zj() {
        VideoItemParams item = getItem();
        Aweme aweme = item != null ? item.getAweme() : null;
        int i = this.pageType;
        String str = this.enterMethodValue;
        if (str == null) {
            str = "";
        }
        return C708600Rqs.LIZ(i, aweme, str, this.eventType);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean BQ2(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            java.lang.String r0 = r5.getAid()
            r4 = 0
            if (r0 != 0) goto L8
            return r4
        L8:
            X.0lVU r1 = X.C1360460lVU.LIZIZ
            java.lang.String r0 = r5.getAid()
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r0 = r1.LJIIIIZZ(r0)
            if (r0 == 0) goto L42
            java.util.List<com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct> r0 = r0.upvotes
            if (r0 == 0) goto L42
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L21:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = (com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            boolean r0 = X.C10EU.LJIILLIIL(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L21
            r3.add(r1)
            goto L21
        L3c:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L43
        L42:
            r4 = 1
        L43:
            r0 = r4 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.BQ2(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static String vQ2(Intent intent) {
        try {
            return intent.getStringExtra("push_label");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void Ar(Aweme aweme) {
        String aid;
        Aweme aweme2;
        Aweme aweme3;
        String aid2;
        Aweme aweme4;
        boolean zLJI = MethodIDManager.LJI(71798);
        C734440SrS c734440SrS = C734440SrS.LIZ;
        String str = this.eventType;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c734440SrS.getClass();
        C734440SrS.LJI(aweme, str, "click_double_like");
        if (getContext() != null && aweme != null) {
            if (C1017070cZd.LJII(aweme)) {
                runOnUIThread(new AwS590S0100000_11(this, 89));
                C734440SrS.LIZJ(aweme, new C325170Cot(3001, "disable ad like"));
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            if (C1017070cZd.LJLJLLL(aweme)) {
                C1233040iBy c1233040iBy = new C1233040iBy(getContext());
                c1233040iBy.LIZIZ(2131836471);
                c1233040iBy.LIZLLL();
                C734440SrS.LIZJ(aweme, new C325170Cot(3004, "is dynamic ad video"));
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            if (C2277711EDh.LIZIZ.LJIIIIZZ()) {
                C735330Sst c735330Sst = new C735330Sst();
                String str3 = this.eventType;
                if (str3 == null) {
                    str3 = "";
                }
                c735330Sst.LIZLLL = str3;
                c735330Sst.LJJLIIIJLLLLLLLZ = this.pageType;
                VideoItemParams item = getItem();
                if (item == null || (aweme4 = item.getAweme()) == null || (aid = aweme4.getAid()) == null) {
                    aid = "";
                }
                c735330Sst.LJJLIIIJ = aid;
                VideoItemParams item2 = getItem();
                if (item2 != null) {
                    aweme2 = item2.getAweme();
                } else {
                    aweme2 = null;
                }
                c735330Sst.LJIJI(aweme2);
                c735330Sst.LJJLIIIJJIZ = "click_like";
                c735330Sst.LJJLIIIJL = !C740470T2v.LIZIZ() ? 1 : 0;
                c735330Sst.LJJLIIIJLJLI = 1;
                c735330Sst.LJJLIIJ = C0SUC.LIZ(getContext()).getHomepageUid();
                c735330Sst.LJJLIL = C0SUC.LIZ(getContext()).getProfileEntranceId();
                c735330Sst.LJIILJJIL();
                if (!C740470T2v.LIZIZ()) {
                    C740470T2v.LIZJ();
                }
                VideoItemParams item3 = getItem();
                if (item3 != null && (aweme3 = item3.getAweme()) != null && (aid2 = aweme3.getAid()) != null) {
                    str2 = aid2;
                }
                InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C725570Sd9(this, "", str2, aweme, null), 2);
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            if (!this.LLILLJJLI && aweme.getUserDigg() == 0) {
                this.LL++;
                long jSQ2 = SQ2(aweme, true);
                withState(new AwS27S0200100_11(this, jSQ2, aweme, 1));
                C1440005kM.LIZ(new C730120SkU(aweme.getAid(), jSQ2, 1, EnumC730430Skz.ICON));
                C734440SrS.LJFF(1, 1, aweme.getAid());
                JQ2("click_double_like");
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C734440SrS.LIZJ(aweme, new C325170Cot(3016, "aweme is null"));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void FQ2(C0SYN c0syn) {
        Aweme aweme;
        if (c0syn != null) {
            String str = c0syn.LIZ;
            VideoItemParams item = getItem();
            if (item != null) {
                aweme = item.getAweme();
            } else {
                aweme = null;
            }
            if (TextUtils.equals(str, C735370Ssx.LIZJ(aweme))) {
                AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJIJIL.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleDiggUpdate: event: ");
                sbLIZ.append(c0syn);
                abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                if (c0syn.LIZJ) {
                    setState(new AwS590S0100000_11(this, 88));
                } else {
                    setState(new AwS48S0100100_11(this, this.LL, 0));
                }
            }
        }
    }

    public final void GQ2(C730120SkU c730120SkU) {
        VideoItemParams item;
        Aweme aweme;
        EnumC730430Skz enumC730430Skz;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && (item = getItem()) != null && (aweme = item.getAweme()) != null) {
            if (c730120SkU != null) {
                enumC730430Skz = c730120SkU.LIZLLL;
            } else {
                enumC730430Skz = null;
            }
            if (enumC730430Skz == EnumC730430Skz.LIST && Intrinsics.LJFF(c730120SkU.LIZ, C735370Ssx.LIZJ(aweme)) && c730120SkU.LIZIZ != this.LLILZ) {
                C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleSyncDiggState, receive event=");
                sbLIZ.append(c730120SkU);
                sbLIZ.append(", origin=");
                sbLIZ.append(this.LLILZ);
                c2276471E8n.LIZIZ("common_feed", "VideoDiggVM", C2188811AlT.LIZIZ(sbLIZ));
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    statistics.setDiggCount(c730120SkU.LIZIZ);
                }
                aweme.setUserDigg(c730120SkU.LIZJ);
                setState(new AwS377S0200000_11(this, aweme, 25));
            }
        }
    }

    public final void HQ2(Exception exc) {
        Aweme aweme;
        VideoItemParams item = getItem();
        if (item != null && (aweme = item.getAweme()) != null) {
            if (aweme.getUserDigg() == 1) {
                aweme.setUserDigg(0);
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    statistics.setDiggCount(Math.max(0L, this.LL - 1));
                }
            } else {
                aweme.setUserDigg(1);
                AwemeStatistics statistics2 = aweme.getStatistics();
                if (statistics2 != null) {
                    statistics2.setDiggCount(this.LL + 1);
                }
            }
        }
        yQ2(exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x035a A[PHI: r1
      0x035a: PHI (r1v98 java.lang.String) = (r1v73 java.lang.String), (r1v99 java.lang.String) binds: [B:91:0x0249, B:89:0x0246] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x062f A[PHI: r1
      0x062f: PHI (r1v57 java.lang.String) = (r1v19 java.lang.String), (r1v58 java.lang.String) binds: [B:237:0x062d, B:235:0x062a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0635 A[PHI: r1
      0x0635: PHI (r1v56 java.lang.String) = (r1v19 java.lang.String), (r1v57 java.lang.String) binds: [B:237:0x062d, B:239:0x0633] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x078b A[PHI: r1
      0x078b: PHI (r1v59 java.lang.String) = (r1v17 java.lang.String), (r1v60 java.lang.String) binds: [B:230:0x061e, B:228:0x061b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x07bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025a A[PHI: r0
      0x025a: PHI (r0v363 java.lang.String) = (r0v304 java.lang.String), (r0v364 java.lang.String) binds: [B:98:0x0258, B:96:0x0255] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void JQ2(java.lang.String r35) {
        /*
            Method dump skipped, instruction units count: 2536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.JQ2(java.lang.String):void");
    }

    @Override // X.InterfaceC734510SrZ
    public final void KE(Exception exc) {
        yQ2(exc);
    }

    public final boolean LQ2(String str) {
        Boolean bool;
        if (!MQ2() || str == null || (bool = this.LLILLL.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final C731910SnN NQ2(Aweme aweme) {
        long diggCount;
        int userDigg;
        String aid;
        AwemeStatistics statistics;
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            diggCount = statistics.getDiggCount();
        } else {
            diggCount = 0;
        }
        this.LL = diggCount;
        this.LLILZ = diggCount;
        boolean z = false;
        if (aweme != null) {
            userDigg = aweme.getUserDigg();
        } else {
            userDigg = 0;
        }
        this.LLILZIL = userDigg;
        if (aweme != null && aweme.getUserDigg() == 1) {
            z = true;
        }
        long jSQ2 = SQ2(aweme, z);
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateAweme aid: ");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", originalDiggStates: ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", originalDiggCount: ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selected: ");
        sbLIZ.append(z);
        sbLIZ.append(", displayCount: ");
        sbLIZ.append(jSQ2);
        c2276411E8h.LIZJ("common_feed", 6, "VideoDiggVM", C2188811AlT.LIZIZ(sbLIZ));
        return AQ2(jSQ2, aweme, z);
    }

    public final void QQ2(Context context) {
        C717590SCv c717590SCv = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        c717590SCv.LIZIZ(context);
    }

    public final void RQ2(Function2<? super Boolean, ? super Aweme, Unit> function2) {
        Aweme aweme;
        Activity activityLIZ;
        String aid;
        Aweme aweme2;
        String aid2;
        Activity activityLIZ2;
        Aweme aweme3;
        Aweme aweme4;
        Aweme aweme5;
        Activity activityLIZ3;
        Aweme aweme6;
        boolean zLJI = MethodIDManager.LJI(71927);
        VideoItemParams item = getItem();
        Aweme aweme7 = null;
        authorUid = null;
        String authorUid = null;
        if (item != null) {
            aweme = item.getAweme();
            if (aweme != null) {
                DataCenter dataCenterLJJIIZI = LJJIIZI();
                if (dataCenterLJJIIZI != null) {
                    dataCenterLJJIIZI.zQ2(aweme.getAid(), "VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR");
                }
                VideoItemParams item2 = getItem();
                boolean z = false;
                if (item2 != null && (aweme6 = item2.getAweme()) != null && C1017070cZd.LJII(aweme6)) {
                    C1233040iBy c1233040iBy = new C1233040iBy(getContext());
                    c1233040iBy.LIZIZ(2131824738);
                    c1233040iBy.LIZLLL();
                    C734440SrS c734440SrS = C734440SrS.LIZ;
                    C325170Cot c325170Cot = new C325170Cot(3001, "disable ad like");
                    c734440SrS.getClass();
                    C734440SrS.LIZJ(aweme, c325170Cot);
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                if (AwemeExtKt.isScheduleVideo(aweme)) {
                    Context context = getContext();
                    if (context != null && (activityLIZ3 = C1388190mED.LIZ(context)) != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ3);
                        c1389890mGx.LJIIIZ(2131846844);
                        c1389890mGx.LJIIJJI();
                    }
                    C734440SrS c734440SrS2 = C734440SrS.LIZ;
                    C325170Cot c325170Cot2 = new C325170Cot(3002, "is schedule video");
                    c734440SrS2.getClass();
                    C734440SrS.LIZJ(aweme, c325170Cot2);
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                int iLIZIZ = C303210BuZ.LIZIZ();
                if (iLIZIZ == 0) {
                    z = !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
                } else if (iLIZIZ > 0 && !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && !this.LLILLJJLI && aweme.getUserDigg() == 0 && C740470T2v.LIZ() >= iLIZIZ) {
                    z = true;
                }
                if (C2277711EDh.LIZIZ.LJJJJ(z)) {
                    C735330Sst c735330Sst = new C735330Sst();
                    String str = this.eventType;
                    if (str == null) {
                        str = "";
                    }
                    c735330Sst.LIZLLL = str;
                    c735330Sst.LJJLIIIJLLLLLLLZ = this.pageType;
                    VideoItemParams item3 = getItem();
                    if (item3 == null || (aweme5 = item3.getAweme()) == null || (aid = aweme5.getAid()) == null) {
                        aid = "";
                    }
                    c735330Sst.LJJLIIIJ = aid;
                    VideoItemParams item4 = getItem();
                    if (item4 != null) {
                        aweme2 = item4.getAweme();
                    } else {
                        aweme2 = null;
                    }
                    c735330Sst.LJIJI(aweme2);
                    c735330Sst.LJJLIIIJJIZ = "click_like";
                    c735330Sst.LJJLIIIJL = !C740470T2v.LIZIZ() ? 1 : 0;
                    c735330Sst.LJJLIIIJLJLI = 1;
                    c735330Sst.LJJLIIJ = C0SUC.LIZ(getContext()).getHomepageUid();
                    c735330Sst.LJJLIL = C0SUC.LIZ(getContext()).getProfileEntranceId();
                    c735330Sst.LJIILJJIL();
                    if (!C740470T2v.LIZIZ()) {
                        C740470T2v.LIZJ();
                    }
                    VideoItemParams item5 = getItem();
                    if (item5 == null || (aweme4 = item5.getAweme()) == null || (aid2 = aweme4.getAid()) == null) {
                        aid2 = "";
                    }
                    Context context2 = getContext();
                    if (context2 != null) {
                        activityLIZ2 = C1388190mED.LIZ(context2);
                    } else {
                        activityLIZ2 = null;
                    }
                    String str2 = this.eventType;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C627150Oin c627150Oin = new C627150Oin();
                    C786410Ut5.LJJJI("login_title", "", c627150Oin.LIZ);
                    C786410Ut5.LJJJI("group_id", aid2, c627150Oin.LIZ);
                    VideoItemParams item6 = getItem();
                    if (item6 != null && (aweme3 = item6.getAweme()) != null) {
                        authorUid = AwemeExtKt.getAuthorUid(aweme3);
                    }
                    C786410Ut5.LJJJI("author_id", authorUid, c627150Oin.LIZ);
                    C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(aid2), c627150Oin.LIZ);
                    C0XPD.LIZIZ(activityLIZ2, str2, "click_like", c627150Oin.LIZ, new C738960Syk(this, function2, 1));
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                if (C0OAD.LIZIZ(aweme) && aweme.getUserDigg() == 0) {
                    String strLIZ = C0OAD.LIZ(2131858174, aweme);
                    C1233040iBy c1233040iBy2 = new C1233040iBy(getContext());
                    c1233040iBy2.LIZJ(strLIZ);
                    c1233040iBy2.LIZLLL();
                    C734440SrS c734440SrS3 = C734440SrS.LIZ;
                    C325170Cot c325170Cot3 = new C325170Cot(3003, "is ftc mode");
                    c734440SrS3.getClass();
                    C734440SrS.LIZJ(aweme, c325170Cot3);
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                if (C1017070cZd.LJLJLLL(aweme)) {
                    C1233040iBy c1233040iBy3 = new C1233040iBy(getContext());
                    c1233040iBy3.LIZIZ(2131836471);
                    c1233040iBy3.LIZLLL();
                    C734440SrS c734440SrS4 = C734440SrS.LIZ;
                    C325170Cot c325170Cot4 = new C325170Cot(3004, "is dynamic ad video");
                    c734440SrS4.getClass();
                    C734440SrS.LIZJ(aweme, c325170Cot4);
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                if (!aweme.isCanPlay() && aweme.getUserDigg() == 0) {
                    if (AwemeExtKt.isImage(aweme)) {
                        C1233040iBy c1233040iBy4 = new C1233040iBy(getContext());
                        c1233040iBy4.LIZIZ(2131835839);
                        c1233040iBy4.LIZLLL();
                    } else {
                        C1233040iBy c1233040iBy5 = new C1233040iBy(getContext());
                        c1233040iBy5.LIZIZ(2131858174);
                        c1233040iBy5.LIZLLL();
                    }
                    C734440SrS c734440SrS5 = C734440SrS.LIZ;
                    C325170Cot c325170Cot5 = new C325170Cot(3005, "video can not play");
                    c734440SrS5.getClass();
                    C734440SrS.LIZJ(aweme, c325170Cot5);
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                if (AwemeExtKt.isDelete(aweme) && aweme.getUserDigg() == 0) {
                    C1233040iBy c1233040iBy6 = new C1233040iBy(getContext());
                    c1233040iBy6.LIZIZ(2131858174);
                    c1233040iBy6.LIZLLL();
                    C734440SrS c734440SrS6 = C734440SrS.LIZ;
                    C325170Cot c325170Cot6 = new C325170Cot(3006, "video is delete");
                    c734440SrS6.getClass();
                    C734440SrS.LIZJ(aweme, c325170Cot6);
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                if (aweme.getVideoControl() != null && aweme.getVideoControl().timerStatus == 0) {
                    C734440SrS c734440SrS7 = C734440SrS.LIZ;
                    C325170Cot c325170Cot7 = new C325170Cot(3007, "video is control");
                    c734440SrS7.getClass();
                    C734440SrS.LIZJ(aweme, c325170Cot7);
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                if (AwemeExtKt.isProhibited(aweme)) {
                    C1233040iBy c1233040iBy7 = new C1233040iBy(getContext());
                    c1233040iBy7.LIZIZ(2131836471);
                    c1233040iBy7.LIZLLL();
                    C734440SrS c734440SrS8 = C734440SrS.LIZ;
                    C325170Cot c325170Cot8 = new C325170Cot(3008, "video is prohibited");
                    c734440SrS8.getClass();
                    C734440SrS.LIZJ(aweme, c325170Cot8);
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                Context context3 = getContext();
                if (context3 != null) {
                    activityLIZ = C1388190mED.LIZ(context3);
                } else {
                    activityLIZ = null;
                }
                if (C729980SkG.LJIIIIZZ(aweme)) {
                    C735280Sso.LIZ.getClass();
                    if (C735280Sso.LJFF(aweme) && activityLIZ != null) {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ);
                        c1389890mGx2.LJIIIZ(2131845231);
                        c1389890mGx2.LJIIJJI();
                        C734440SrS c734440SrS9 = C734440SrS.LIZ;
                        C325170Cot c325170Cot9 = new C325170Cot(3009, "video is privated");
                        c734440SrS9.getClass();
                        C734440SrS.LIZJ(aweme, c325170Cot9);
                        if (zLJI) {
                            MethodIDManager.LJ();
                            return;
                        }
                        return;
                    }
                }
                C735280Sso.LIZ.getClass();
                if (C735280Sso.LJFF(aweme)) {
                    C547860LeC.LIZ.getClass();
                    if (C547860LeC.LIZLLL().LIZ(aweme) && activityLIZ != null) {
                        C1389890mGx c1389890mGx3 = new C1389890mGx(activityLIZ);
                        c1389890mGx3.LJIIIZ(2131845231);
                        c1389890mGx3.LJIIJJI();
                        C734440SrS c734440SrS10 = C734440SrS.LIZ;
                        C325170Cot c325170Cot10 = new C325170Cot(3009, "video is privated");
                        c734440SrS10.getClass();
                        C734440SrS.LIZJ(aweme, c325170Cot10);
                        if (zLJI) {
                            MethodIDManager.LJ();
                            return;
                        }
                        return;
                    }
                }
                if (!this.LLILLJJLI && C735280Sso.LIZJ(aweme) && C735280Sso.LJ(aweme)) {
                    function2.invoke(Boolean.FALSE, null);
                    C734440SrS c734440SrS11 = C734440SrS.LIZ;
                    C325170Cot c325170Cot11 = new C325170Cot(3010, "video is friend visible");
                    c734440SrS11.getClass();
                    C734440SrS.LIZJ(aweme, c325170Cot11);
                } else {
                    Boolean bool = Boolean.TRUE;
                    VideoItemParams item7 = getItem();
                    if (item7 != null) {
                        aweme7 = item7.getAweme();
                    }
                    function2.invoke(bool, aweme7);
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        } else {
            aweme = null;
        }
        C734440SrS c734440SrS12 = C734440SrS.LIZ;
        C325170Cot c325170Cot12 = new C325170Cot(3016, "aweme is null");
        c734440SrS12.getClass();
        C734440SrS.LIZJ(aweme, c325170Cot12);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0271  */
    @Override // X.InterfaceC734510SrZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void oP1(X.C0WIY<java.lang.String, java.lang.Integer> r22) {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.oP1(X.0WIY):void");
    }

    public final void yQ2(Exception exc) {
        Aweme aweme;
        int i;
        Aweme aweme2;
        String aid;
        if (MQ2()) {
            VideoItemParams item = getItem();
            if (item != null && (aweme2 = item.getAweme()) != null && (aid = aweme2.getAid()) != null && this.LLILLL.containsKey(aid)) {
                this.LLILLL.remove(aid);
            } else {
                this.LLILLL.clear();
                return;
            }
        }
        VideoItemParams item2 = getItem();
        if (item2 != null) {
            aweme = item2.getAweme();
        } else {
            aweme = null;
        }
        if (getContext() != null && aweme != null) {
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C730420Sky(this, aweme, null), 3);
        }
        Context context = getContext();
        T t = this.LLJ.LL;
        if (t != 0 && ((C737390SwD) t).LL == 1) {
            i = 2131830649;
        } else {
            i = 2131857729;
        }
        C1354920lMY.LIZLLL(context, exc, i);
    }

    public final void IQ2(Aweme aweme, boolean z) {
        Activity activityLIZ;
        if (aweme == null) {
            return;
        }
        C1360460lVU c1360460lVU = C1360460lVU.LIZIZ;
        if ((!c1360460lVU.LJJIJIIJIL().LIZIZ()) && z) {
            Context context = getContext();
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131830650);
                c1389890mGx.LJIIJJI();
            }
            c1360460lVU.LJJIJIIJIL().LIZ();
        }
    }

    public final long SQ2(Aweme aweme, boolean z) {
        if (aweme != null) {
            this.LLILLJJLI = z;
            if (z) {
                if (this.LLILZIL == 1) {
                    if (this.LLILZ < 1 && !AwemeExtKt.isDelete(aweme)) {
                        this.LLILZ = 1L;
                    }
                    return this.LLILZ;
                }
                return this.LLILZ + 1;
            }
            if (this.LLILZIL == 1 && !AwemeExtKt.isDelete(aweme)) {
                return this.LLILZ - 1;
            }
            return this.LLILZ;
        }
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDiggView when aweme is null:");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        c2276411E8h.LIZJ("common_feed", 6, "VideoDiggVM", C2188811AlT.LIZIZ(sbLIZ));
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        String aid;
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJIJIL.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("paramSync2StateAccept aid: ");
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILJILJ = false;
        return new C730490Sl5(C828040We2.LIZIZ(), NQ2(videoItemParams.getAweme()), 60);
    }

    public final void wQ2(C735360Ssw c735360Ssw, Aweme aweme) {
        C2189821An6 c2189821An6;
        if (C07HI.LIZIZ && (c2189821An6 = this.feedParams) != null) {
            Map<String, String> mapLJIL = C14TF.LIZIZ.LJIL(aweme, c2189821An6);
            String str = mapLJIL.get("tako_response_type");
            if (str != null) {
                c735360Ssw.LJ("tako_response_type", str);
            }
            String str2 = mapLJIL.get("tako_response_rank");
            if (str2 != null) {
                c735360Ssw.LJ("tako_response_rank", str2);
            }
            DetailNavArgModel navArgModel = c2189821An6.getNavArgModel();
            if (navArgModel != null) {
                String takoIndex = navArgModel.getTakoIndex();
                if (takoIndex != null && C123100dR.LIZ(takoIndex)) {
                    c735360Ssw.LJ("tako_index", takoIndex);
                }
                String takoStyle = navArgModel.getTakoStyle();
                if (takoStyle != null && C123100dR.LIZ(takoStyle)) {
                    c735360Ssw.LJ("tako_style", takoStyle);
                }
                String takoWordsPos = navArgModel.getTakoWordsPos();
                if (takoWordsPos != null && C123100dR.LIZ(takoWordsPos)) {
                    c735360Ssw.LJ("tako_words_pos", takoWordsPos);
                }
            }
            String messageId = c2189821An6.getMessageId();
            if (messageId != null && C123100dR.LIZ(messageId)) {
                c735360Ssw.LJ("message_id", messageId);
            }
            String processId = c2189821An6.getProcessId();
            if (processId != null && C123100dR.LIZ(processId)) {
                c735360Ssw.LJ("process_id", processId);
            }
        }
    }

    public final String zQ2(Aweme aweme, long j) {
        Context context;
        Fragment fragment = this.fragment;
        if (fragment != null && (context = fragment.getContext()) != null && C0SXF.LJIL(context)) {
            if (C0OAD.LIZIZ(aweme) || j <= 0) {
                return CardStruct.IStatusCode.DEFAULT;
            }
            return C1843500y4a.LIZIZ(j);
        }
        return C618720OOo.LIZ(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C731910SnN AQ2(long r7, com.ss.android.ugc.aweme.feed.model.Aweme r9, boolean r10) {
        /*
            r6 = this;
            r0 = 0
            if (r9 == 0) goto L5c
            java.lang.Object r2 = r6.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r2 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r2
            if (r2 == 0) goto L19
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r4 = r2.dataCenter
            if (r4 == 0) goto L19
            java.lang.String r3 = "update_diig_view"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            r4.zQ2(r2, r3)
        L19:
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L81
        L1d:
            r5 = 1
            r4 = 0
            if (r9 == 0) goto L5a
            com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct r2 = r9.getCommerceVideoAuthInfo()
            if (r2 == 0) goto L5a
            int r2 = r2.getDiggShowScene()
            if (r2 != r5) goto L5a
            r3 = 1
        L2e:
            boolean r2 = X.C729510SjV.LJJIJIL(r9)
            if (r2 == 0) goto L53
            boolean r2 = X.C281310B0v.LIZ()
            if (r2 != 0) goto L58
        L3a:
            X.0SnN r2 = new X.0SnN
            java.lang.String r0 = r6.zQ2(r9, r0)
            if (r0 == 0) goto L51
            java.lang.String r1 = r6.mapZeroNumToString(r0)
        L46:
            r6.updateOrigin(r4)
            boolean r0 = r6.getForceTextShow()
            r2.<init>(r1, r10, r0, r5)
            return r2
        L51:
            r1 = 0
            goto L46
        L53:
            if (r9 == 0) goto L58
            if (r3 != 0) goto L58
            goto L3a
        L58:
            r4 = 4
            goto L3a
        L5a:
            r3 = 0
            goto L2e
        L5c:
            X.1E8h r4 = X.C2276411E8h.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "updateDiggView when aweme is null:"
            r1.append(r0)
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r1.append(r0)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
            r2 = 6
            java.lang.String r1 = "VideoDiggVM"
            java.lang.String r0 = "common_feed"
            r4.LIZJ(r0, r2, r1, r3)
            r7 = 0
        L81:
            r0 = r7
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.AQ2(long, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):X.0SnN");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EQ2(com.ss.android.ugc.aweme.feed.model.Aweme r17, java.lang.String r18, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.EQ2(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, kotlin.jvm.functions.Function1):void");
    }

    public final void OQ2(final int i, final String str, boolean z) {
        boolean zLJI = MethodIDManager.LJI(202192);
        HashMap mapXQ2 = xQ2(i, str, z);
        this.LLILLL.put(str, Boolean.TRUE);
        final C11NJ c11nj = new C11NJ();
        c11nj.LIZ(((IUnLoginDiggService) this.LLJI.getValue()).LIZ(mapXQ2).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.0SqN
            /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r21) {
                /*
                    Method dump skipped, instruction units count: 464
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C733770SqN.accept(java.lang.Object):void");
            }
        }, new AfS147S0200000_11(c11nj, this, 13)));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final HashMap xQ2(int i, String str, boolean z) {
        HashMap map = new HashMap();
        map.put("aweme_id", str);
        map.put("type", String.valueOf(i));
        map.put("channel_id", String.valueOf(C737370SwB.LIZ(this.eventType)));
        map.put("friends_upvote", String.valueOf(z));
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void KQ2(VideoDiggVM videoDiggVM, Aweme aweme, boolean z, int i) {
        String str;
        String strLIZJ;
        String mixId;
        String strLIZ;
        String searchId;
        Aweme aweme2;
        Aweme aweme3;
        Aweme aweme4;
        int i2;
        if ((i & 2) != 0) {
            z = false;
        }
        Activity activityLIZ = null;
        if ((i & 4) != 0) {
            if (z) {
                str = "dislike";
            } else {
                str = "like";
            }
        } else {
            str = null;
        }
        videoDiggVM.getClass();
        C733660SqC.LIZ.getClass();
        if (!C733660SqC.LIZ()) {
            C1233040iBy c1233040iBy = new C1233040iBy(videoDiggVM.getContext());
            c1233040iBy.LIZIZ(2131837962);
            c1233040iBy.LIZLLL();
            C734440SrS c734440SrS = C734440SrS.LIZ;
            C325170Cot c325170Cot = new C325170Cot(3011, "net is not available");
            c734440SrS.getClass();
            C734440SrS.LIZJ(aweme, c325170Cot);
            return;
        }
        if (aweme == null) {
            C734440SrS c734440SrS2 = C734440SrS.LIZ;
            C325170Cot c325170Cot2 = new C325170Cot(3016, "aweme is null");
            c734440SrS2.getClass();
            C734440SrS.LIZJ(aweme, c325170Cot2);
            return;
        }
        Context context = videoDiggVM.getContext();
        String str2 = "";
        if (context == null || (strLIZJ = C0SUC.LIZ(context).getSearchResultId()) == null) {
            strLIZJ = "";
        }
        if (TextUtils.isEmpty(strLIZJ)) {
            strLIZJ = C735370Ssx.LIZJ(aweme);
        }
        PlayListInfo playListInfo = aweme.playlist_info;
        if (playListInfo == null || (mixId = playListInfo.getMixId()) == null) {
            mixId = "";
        }
        if (C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(videoDiggVM.fragment)) {
            strLIZ = videoDiggVM.eventType;
            if (strLIZ == null) {
                strLIZ = "";
            }
        } else if ((Intrinsics.LJFF(videoDiggVM.eventType, "relation_tab") || Intrinsics.LJFF(videoDiggVM.eventType, "find_friends_page")) && videoDiggVM.pageType == 0 && Intrinsics.LJFF(C0SUC.LIZ(videoDiggVM.getContext()).getTabName(), "friends_list")) {
            strLIZ = videoDiggVM.eventType;
            if (strLIZ == null) {
                strLIZ = C735610StL.LIZ(videoDiggVM.pageType, strLIZ, true);
            }
        } else {
            strLIZ = C735610StL.LIZ(videoDiggVM.pageType, videoDiggVM.eventType, true);
        }
        C735360Ssw c735360Ssw = new C735360Ssw("like_cancel");
        C1370890lmJ c1370890lmJ = C1370890lmJ.LIZ;
        C2277711EDh c2277711EDh = C2277711EDh.LIZIZ;
        c735360Ssw.LIZLLL = strLIZ;
        Context context2 = videoDiggVM.getContext();
        if (context2 == null || (searchId = C0SUC.LIZ(context2).getSearchId()) == null) {
            searchId = "";
        }
        c735360Ssw.LJJIJLIJ = searchId;
        c735360Ssw.LJJII = strLIZJ;
        c735360Ssw.LJJLIIJ = videoDiggVM.CQ2().LL;
        c735360Ssw.LJJLIIIJJIZ = videoDiggVM.pageType;
        c735360Ssw.LJIJI(aweme);
        c735360Ssw.LJII = videoDiggVM.CQ2().LLILZ;
        c735360Ssw.LJJZ = videoDiggVM.CQ2().LLILZIL;
        c735360Ssw.LJJZZI = videoDiggVM.CQ2().LLILZLL;
        c735360Ssw.LJLLLLLL = mixId;
        String str3 = videoDiggVM.eventType;
        if (str3 == null) {
            str3 = "";
        }
        if (C1386360mBG.LJI(str3)) {
            c735360Ssw.LJJJJJL = C1386360mBG.LJ();
        }
        c735360Ssw.LJJLIIIIJ = C584760Mwc.LIZ(videoDiggVM.CQ2().LL, videoDiggVM.CQ2().LLILLJJLI);
        Context context3 = videoDiggVM.getContext();
        VideoItemParams item = videoDiggVM.getItem();
        if (item != null) {
            aweme2 = item.getAweme();
        } else {
            aweme2 = null;
        }
        c735360Ssw.LLF = C0SXF.LJJIII(context3, aweme2);
        C1ER1 c1er1 = C1ER1.LIZIZ;
        c735360Ssw.LJJII(C0JBR.LIZ(aweme, c1er1.fetchSearchParams(strLIZ, videoDiggVM.CQ2().LL)));
        VideoItemParams item2 = videoDiggVM.getItem();
        if (item2 != null) {
            aweme3 = item2.getAweme();
        } else {
            aweme3 = null;
        }
        C735370Ssx.LIZJ(aweme3);
        VideoItemParams item3 = videoDiggVM.getItem();
        if (item3 != null) {
            aweme4 = item3.getAweme();
        } else {
            aweme4 = null;
        }
        c735360Ssw.LIZIZ(C666580QCq.LIZIZ(aweme4, "like_cancel", videoDiggVM.eventType, null));
        c735360Ssw.LIZLLL(aweme.aigcInfo.getAIGCLabelType(), "aigc_theme_status");
        C1609930rzr.LJIIZILJ(aweme, c735360Ssw);
        Object objAppendCreationParams = c1370890lmJ.appendCreationParams(c735360Ssw, aweme);
        C1366730lfb.LIZJ(videoDiggVM.feedParams, objAppendCreationParams, AwemeBizExtKt.getAttachedVibeFeedId(aweme));
        AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) objAppendCreationParams;
        C0SXF.LIZJ(abstractC1386130mAt, videoDiggVM.eventType, aweme, null);
        AbstractC1386130mAt abstractC1386130mAt2 = (AbstractC1386130mAt) c2277711EDh.LJJIIJ(c2277711EDh.LJJIZ(abstractC1386130mAt, videoDiggVM.feedParams));
        C0SXF.LJIIIIZZ(abstractC1386130mAt2, aweme, videoDiggVM.getContext(), false);
        AbstractC1386130mAt abstractC1386130mAt3 = (AbstractC1386130mAt) C1612650s4F.LIZIZ(abstractC1386130mAt2, aweme);
        C1359610lU7.LIZ(aweme, abstractC1386130mAt3);
        C1366720lfa.LIZ(aweme, abstractC1386130mAt3);
        C1366720lfa.LIZIZ(aweme, abstractC1386130mAt3, strLIZ, C0SUC.LIZ(videoDiggVM.getContext()).getAid());
        String str4 = videoDiggVM.eventType;
        MusicDetailCommonModel musicDetailCommonModel = MusicDetailCommonModel.INSTANCE;
        Context context4 = videoDiggVM.getContext();
        if (context4 != null) {
            activityLIZ = C1388190mED.LIZ(context4);
        }
        AbstractC1386130mAt<?> abstractC1386130mAt4 = (AbstractC1386130mAt) c1370890lmJ.appendDetailParams(abstractC1386130mAt3, str4, musicDetailCommonModel.getDetailMobMaps(aweme, activityLIZ));
        abstractC1386130mAt4.LIZLLL(aweme.getIsCommentPostVideo() ? 1 : 0, "is_comment_post_video");
        c1er1.j(aweme, abstractC1386130mAt4);
        Map<String, String> mapH0 = c1er1.h0(aweme);
        if (mapH0 != null) {
            abstractC1386130mAt4.LIZIZ(mapH0);
        }
        C15WT.LIZIZ.LJIJJLI(abstractC1386130mAt4, videoDiggVM.eventType, C0SUC.LIZ(videoDiggVM.getContext()).getAid(), aweme.getAid());
        abstractC1386130mAt4.LJ("enter_method", str);
        if (AwemeExtKt.isMDPSquareType(aweme)) {
            c735360Ssw.LLIIJLIL = true;
        }
        String strLIZIZ = C735610StL.LIZIZ(aweme);
        if (strLIZIZ != null && strLIZIZ.length() > 0 && strLIZIZ != null) {
            c735360Ssw.LJ("bsh_video_id", strLIZIZ);
        }
        C1599640rjG.LIZIZ.Ou(c735360Ssw, new C1360330lVH(C1389300mG0.LIZIZ(videoDiggVM.fragment), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        if (C1EE2.LIZIZ.LIZLLL()) {
            VideoItemParams item4 = videoDiggVM.getItem();
            if (item4 != null) {
                i2 = item4.isEnterGraphicDetail;
            } else {
                i2 = 0;
            }
            c735360Ssw.LIZLLL(i2, "is_enter_graphic_detail");
        }
        C2189821An6 c2189821An6 = videoDiggVM.feedParams;
        if (c2189821An6 != null) {
            for (Map.Entry<String, String> entry : TakoAIVideoMobFiller.toParams(c2189821An6).entrySet()) {
                c735360Ssw.LJ(entry.getKey(), entry.getValue());
            }
        }
        c735360Ssw.LJIILJJIL();
        if (TextUtils.equals("opus", videoDiggVM.eventType)) {
            if (videoDiggVM.isMyProfile) {
                videoDiggVM.getContext();
                C20684815ws.LJIIJ(0L, "like_cancel", "personal_homepage", aweme.getAid(), videoDiggVM.zj());
            } else {
                videoDiggVM.getContext();
                C20684815ws.LJIIJ(0L, "like_cancel", "others_homepage", aweme.getAid(), videoDiggVM.zj());
            }
        } else {
            videoDiggVM.getContext();
            C20684815ws.LJIIJ(0L, "like_cancel", videoDiggVM.eventType, aweme.getAid(), videoDiggVM.zj());
        }
        if (aweme.getAwemeType() != 34) {
            String aid = aweme.getAid();
            if (aid != null) {
                str2 = aid;
            }
            videoDiggVM.PQ2(aweme, false, 0, str2);
            return;
        }
        C1029590ctp.LIZLLL().LJFF(videoDiggVM.getContext(), aweme);
        C2184171Adz.LIZLLL("draw_ad", "like_cancel", aweme.getAwemeRawAd()).LJIIIIZZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PQ2(com.ss.android.ugc.aweme.feed.model.Aweme r19, boolean r20, int r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.PQ2(com.ss.android.ugc.aweme.feed.model.Aweme, boolean, int, java.lang.String):void");
    }
}
