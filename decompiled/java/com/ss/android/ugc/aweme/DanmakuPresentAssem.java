package com.ss.android.ugc.aweme;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0CAU;
import X.C0P0T;
import X.C0RD6;
import X.C0RDX;
import X.C0XPD;
import X.C0XQ7;
import X.C1164270gP3;
import X.C1164280gP4;
import X.C12ES;
import X.C1361150lWb;
import X.C1383760m74;
import X.C1383870m7F;
import X.C1384100m7c;
import X.C1384300m7w;
import X.C1384340m80;
import X.C1384380m84;
import X.C1384410m87;
import X.C1384440m8A;
import X.C1384500m8G;
import X.C1384680m8Y;
import X.C1384750m8f;
import X.C1384830m8n;
import X.C1384840m8o;
import X.C1384860m8q;
import X.C1385060m9A;
import X.C13LE;
import X.C1402290max;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C274960Aq6;
import X.C293760BfK;
import X.C444960Hcc;
import X.C452501pT;
import X.C622680Oba;
import X.C692470REf;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C726580Sem;
import X.C737910Sx3;
import X.EnumC1361130lWZ;
import X.EnumC255700yp;
import X.InterfaceC1384330m7z;
import X.InterfaceC1385050m99;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import Y.ARunnableS121S0100000_21;
import Y.ARunnableS8S0102000_21;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.ss.android.ugc.aweme.abilities.IDanmakuLayoutAbility;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.IDanmakuData;
import com.ss.android.ugc.aweme.service.DanmakuProtocol;
import com.ss.android.ugc.aweme.service.IFollowFeedService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuPresentAssem extends BaseCellSlotComponent<DanmakuPresentAssem> implements DanmakuProtocol, IDanmakuLayoutAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLII;
    public static final IFollowFeedService LLLLIIIILLL;
    public C1385060m9A LLJZ;
    public View LLJZIJLIL;
    public InterfaceC1384330m7z LLLFF;
    public C0P0T LLLII;
    public final InterfaceC1731706qJ LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public View LLLIL;
    public ViewGroup LLLILZ;
    public final SafeHandler LLLILZJ;
    public final List<IDanmakuData> LLLILZLLLI;
    public IDanmakuData LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public final ARunnableS121S0100000_21 LLLJL;
    public final C1384100m7c LLLL;
    public boolean LLJLLIL = true;
    public boolean LLJLLL = true;
    public C1384340m80 LLL = C1384440m8A.LIZ(null, false, 3);
    public final C1384500m8G LLLF = new C1384500m8G();
    public final AwS565S0100000_21 LLLFFI = new AwS565S0100000_21(this, 89);
    public int LLLFZ = -1;
    public int LLLI = -1;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DanmakuPresentAssem.class, "danmakuVM", "getDanmakuVM()Lcom/ss/android/ugc/aweme/core/DanmakuViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLLII = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLLIIIILLL = FollowFeedServiceImpl.LJIL();
        C1384750m8f.LJIIJJI = ((Boolean) C274960Aq6.LIZ.getValue()).booleanValue();
        if (C1384840m8o.LIZ) {
            C1384750m8f.LJIILL = true;
        }
        if (C1384860m8q.LIZ) {
            C1384750m8f.LJIIL = false;
            C1384750m8f.LJIILIIL = false;
            C1384750m8f.LJIILJJIL = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.0m7c] */
    public DanmakuPresentAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DanmakuViewModel.class);
        this.LLLIIII = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS565S0100000_21(c19719912DlLIZ, 90), null, AFwS259S0000000_21.get$arr$(43));
        this.LLLIIIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS259S0000000_21.get$arr$(44));
        this.LLLIIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS259S0000000_21.get$arr$(46));
        this.LLLIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 86));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 85));
        this.LLLILZJ = new SafeHandler(this);
        this.LLLILZLLLI = new ArrayList();
        this.LLLJL = new ARunnableS121S0100000_21(this, 21);
        this.LLLL = new InterfaceC1385050m99() { // from class: X.0m7c
            @Override // X.InterfaceC1385050m99
            public void onEvent(C1385110m9F c1385110m9F) {
                IDanmakuData iDanmakuData;
                String str;
                DanmakuPresentAssem danmakuPresentAssem = this.LIZ;
                if (danmakuPresentAssem.LLJLLL && danmakuPresentAssem.Fp() != null && c1385110m9F.LIZ == 1000) {
                    Object obj = c1385110m9F.LIZIZ;
                    Aweme aweme = null;
                    if ((obj instanceof IDanmakuData) && (iDanmakuData = (IDanmakuData) obj) != null) {
                        DanmakuPresentAssem danmakuPresentAssem2 = this.LIZ;
                        int i = C1384110m7d.LIZ[iDanmakuData.getType().ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                C1361160lWc.LIZIZ().storeBoolean("has_show_education_danmaku", true);
                                C1361150lWb c1361150lWb = C1361150lWb.LIZ;
                                VideoItemParams item = danmakuPresentAssem2.Ip().getItem();
                                if (item != null) {
                                    aweme = item.getAweme();
                                }
                                VideoItemParams item2 = danmakuPresentAssem2.Ip().getItem();
                                if (item2 == null || (str = item2.mEventType) == null) {
                                    str = "";
                                }
                                EnumC1361140lWa enumC1361140lWa = EnumC1361140lWa.ADD;
                                EnumC1361130lWZ enumC1361130lWZ = EnumC1361130lWZ.IS_INTRO_SHOW;
                                EnumC255700yp enumC255700yp = EnumC255700yp.IS_NOT_LANDSCAPE;
                                c1361150lWb.getClass();
                                C1361150lWb.LJIIIIZZ(aweme, str, enumC1361140lWa, enumC1361130lWZ, enumC255700yp);
                                return;
                            }
                            throw new C1954807lC();
                        }
                        danmakuPresentAssem2.Ip().FQ2(iDanmakuData);
                    }
                }
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bj8;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1229862352) {
            return null;
        }
        return this;
    }

    public final DanmakuContinuallyPlayViewModel Gp() {
        return (DanmakuContinuallyPlayViewModel) this.LLLIIL.getValue();
    }

    public final DanmakuViewModel Ip() {
        return (DanmakuViewModel) this.LLLIIII.getValue(this, LLLLII[0]);
    }

    public final VideoPlayViewModel Jp() {
        return (VideoPlayViewModel) this.LLLIIIL.getValue();
    }

    public final VideoViewModel Qp() {
        return (VideoViewModel) this.LLLIIIIL.getValue();
    }

    public final void aq() {
        View view;
        ViewGroup viewGroup = this.LLLILZ;
        ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        View view2 = parent instanceof View ? (View) parent : null;
        int top = view2 != null ? view2.getTop() : 0;
        View view3 = this.LLLIL;
        int top2 = view3 != null ? view3.getTop() : 0;
        View view4 = this.LLLIL;
        int translationY = top2 + (view4 != null ? (int) view4.getTranslationY() : 0) + top;
        View view5 = this.LLLIL;
        int bottom = view5 != null ? view5.getBottom() : 0;
        View view6 = this.LLLIL;
        int translationY2 = bottom + (view6 != null ? (int) view6.getTranslationY() : 0) + top;
        if ((translationY == 0 && translationY2 == 0) || (view = this.LLLIL) == null) {
            return;
        }
        HandlerHook.viewPost(view, new ARunnableS8S0102000_21(this, translationY, translationY2, 0));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        boolean z = C1384830m8n.LIZ;
        if (C1384830m8n.LIZ) {
            C622680Oba.LIZLLL(this);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        C0CAU.LIZIZ(new ARunnableS121S0100000_21(this, 22));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        DanmakuCompatibleReportAndLoginViewModel danmakuCompatibleReportAndLoginViewModel = (DanmakuCompatibleReportAndLoginViewModel) this.LLLIILIL.getValue();
        if (danmakuCompatibleReportAndLoginViewModel == null || !danmakuCompatibleReportAndLoginViewModel.LLILLJJLI) {
            return;
        }
        String str = danmakuCompatibleReportAndLoginViewModel.LL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (Intrinsics.LJFF(str, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid())) {
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "one_liner").appendQueryParameter("object_id", danmakuCompatibleReportAndLoginViewModel.LLILZ);
            String str2 = danmakuCompatibleReportAndLoginViewModel.LLILZIL;
            if (str2 == null) {
                str2 = "";
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("owner_id", str2);
            IReportService iReportServiceLJJ = ComplianceServiceProvider.LJJ();
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            Bundle bundle = new Bundle();
            bundle.putInt("half_screen_height", (int) (C12ES.LJIIIIZZ(C724240Sb0.LIZ(this)) * 0.9f));
            iReportServiceLJJ.report(c19egLIZ, builderAppendQueryParameter2, bundle);
            danmakuCompatibleReportAndLoginViewModel.LL = null;
            danmakuCompatibleReportAndLoginViewModel.LLILLJJLI = false;
            danmakuCompatibleReportAndLoginViewModel.LLILLL = false;
            danmakuCompatibleReportAndLoginViewModel.LLILZ = null;
            danmakuCompatibleReportAndLoginViewModel.LLILZIL = null;
            danmakuCompatibleReportAndLoginViewModel.LLILZLL = null;
            danmakuCompatibleReportAndLoginViewModel.LLIZ = null;
            danmakuCompatibleReportAndLoginViewModel.LLIZLLLIL = null;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        InterfaceC1384330m7z interfaceC1384330m7z = this.LLLFF;
        if (interfaceC1384330m7z != null) {
            interfaceC1384330m7z.stop();
        }
        this.LLLILZJ.removeCallbacks(this.LLLJL);
        if (C1384830m8n.LIZ) {
            return;
        }
        C622680Oba.LIZLLL(this);
    }

    public final Aweme Fp() {
        VideoItemParams item = Ip().getItem();
        if (item != null) {
            return item.getAweme();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        boolean z = C1384830m8n.LIZ;
        if (C1384830m8n.LIZ) {
            C622680Oba.LIZJ(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), DanmakuProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1558520qew.LIZLLL(this);
    }

    public final void Bp(C1384300m7w c1384300m7w) {
        c1384300m7w.LJIILL = true;
        InterfaceC1384330m7z interfaceC1384330m7z = this.LLLFF;
        if (interfaceC1384330m7z != null && !interfaceC1384330m7z.isPlaying()) {
            ((ArrayList) this.LLLILZLLLI).add(c1384300m7w);
            return;
        }
        InterfaceC1384330m7z interfaceC1384330m7z2 = this.LLLFF;
        if (interfaceC1384330m7z2 != null) {
            interfaceC1384330m7z2.LJJIFFI(c1384300m7w);
        }
        InterfaceC1384330m7z interfaceC1384330m7z3 = this.LLLFF;
        if (interfaceC1384330m7z3 == null) {
            return;
        }
        interfaceC1384330m7z3.LJJIIZI();
    }

    public final void Tp(IDanmakuData iDanmakuData) {
        String str;
        if (!C0XQ7.LJFF().isLogin()) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            VideoItemParams item = Ip().getItem();
            if (item == null || (str = item.mEventType) == null) {
                str = "";
            }
            C0XPD.LIZIZ(c19egLIZ, str, "like_danmaku", null, new C1402290max(this, iDanmakuData, 1));
            return;
        }
        Ep(iDanmakuData, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Up(X.C1385060m9A r10) {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.DanmakuPresentAssem.Up(X.0m9A):void");
    }

    public final void Vp(C1384680m8Y c1384680m8Y) {
        if (c1384680m8Y.LIZIZ) {
            InterfaceC1384330m7z interfaceC1384330m7z = this.LLLFF;
            if (interfaceC1384330m7z != null) {
                interfaceC1384330m7z.LJJIJ(LSPassThroughRecordSizeConfig.DEFAULT, null);
            }
            InterfaceC1384330m7z interfaceC1384330m7z2 = this.LLLFF;
            if (interfaceC1384330m7z2 != null) {
                interfaceC1384330m7z2.LJIJI(LSPassThroughRecordSizeConfig.DEFAULT);
            }
            ((ArrayList) this.LLLILZLLLI).clear();
        }
        C1385060m9A c1385060m9A = this.LLJZ;
        if (c1385060m9A != null && c1385060m9A.getVisibility() != 0) {
        }
        switch (C1384380m84.LIZ[c1384680m8Y.LIZ.ordinal()]) {
            case 1:
                Ip().BQ2(c1384680m8Y.LIZJ, true);
                InterfaceC1384330m7z interfaceC1384330m7z3 = this.LLLFF;
                if (interfaceC1384330m7z3 != null && interfaceC1384330m7z3.isPlaying()) {
                    InterfaceC1384330m7z interfaceC1384330m7z4 = this.LLLFF;
                    if (interfaceC1384330m7z4 != null) {
                        interfaceC1384330m7z4.LJIIJ(c1384680m8Y.LIZJ);
                    }
                } else {
                    InterfaceC1384330m7z interfaceC1384330m7z5 = this.LLLFF;
                    if (interfaceC1384330m7z5 != null) {
                        interfaceC1384330m7z5.LJIIJJI(c1384680m8Y.LIZJ);
                    }
                }
                if (!((ArrayList) this.LLLILZLLLI).isEmpty()) {
                    for (IDanmakuData iDanmakuData : (ArrayList) this.LLLILZLLLI) {
                        InterfaceC1384330m7z interfaceC1384330m7z6 = this.LLLFF;
                        if (interfaceC1384330m7z6 != null) {
                            interfaceC1384330m7z6.LJJIFFI(iDanmakuData.getData());
                        }
                    }
                    ((ArrayList) this.LLLILZLLLI).clear();
                    InterfaceC1384330m7z interfaceC1384330m7z7 = this.LLLFF;
                    if (interfaceC1384330m7z7 != null) {
                        interfaceC1384330m7z7.LJJIIZI();
                    }
                }
                IDanmakuData iDanmakuData2 = this.LLLIZZ;
                if (iDanmakuData2 != null) {
                    InterfaceC1384330m7z interfaceC1384330m7z8 = this.LLLFF;
                    if (interfaceC1384330m7z8 != null) {
                        interfaceC1384330m7z8.LJIIIZ(iDanmakuData2.getData());
                    }
                    InterfaceC1384330m7z interfaceC1384330m7z9 = this.LLLFF;
                    if (interfaceC1384330m7z9 != null) {
                        interfaceC1384330m7z9.LJJIIZI();
                    }
                }
                break;
            case 2:
                if (!this.LLLJIL || !C293760BfK.LIZ()) {
                    Ip().BQ2(c1384680m8Y.LIZJ, false);
                    InterfaceC1384330m7z interfaceC1384330m7z10 = this.LLLFF;
                    if (interfaceC1384330m7z10 != null) {
                        interfaceC1384330m7z10.LJIIJJI(c1384680m8Y.LIZJ);
                    }
                    Ip().LQ2(c1384680m8Y.LIZJ);
                    IDanmakuData iDanmakuData3 = this.LLLIZZ;
                    if (iDanmakuData3 != null) {
                        InterfaceC1384330m7z interfaceC1384330m7z11 = this.LLLFF;
                        if (interfaceC1384330m7z11 != null) {
                            interfaceC1384330m7z11.LJIIIZ(iDanmakuData3.getData());
                        }
                        InterfaceC1384330m7z interfaceC1384330m7z12 = this.LLLFF;
                        if (interfaceC1384330m7z12 != null) {
                            interfaceC1384330m7z12.LJJIIZI();
                        }
                    }
                }
                break;
            case 3:
                InterfaceC1384330m7z interfaceC1384330m7z13 = this.LLLFF;
                if (interfaceC1384330m7z13 != null) {
                    interfaceC1384330m7z13.pause();
                }
                break;
            case 4:
                Ip().BQ2(c1384680m8Y.LIZJ, true);
                InterfaceC1384330m7z interfaceC1384330m7z14 = this.LLLFF;
                if (interfaceC1384330m7z14 != null) {
                    interfaceC1384330m7z14.LJIIJ(0L);
                }
                InterfaceC1384330m7z interfaceC1384330m7z15 = this.LLLFF;
                if (interfaceC1384330m7z15 != null) {
                    interfaceC1384330m7z15.LJJIIZI();
                }
                break;
            case 5:
                InterfaceC1384330m7z interfaceC1384330m7z16 = this.LLLFF;
                if (interfaceC1384330m7z16 != null) {
                    interfaceC1384330m7z16.pause();
                }
                this.LLLF.LJ.LIZ(1.0f);
                break;
            case 6:
                Ip().BQ2(c1384680m8Y.LIZJ, true);
                InterfaceC1384330m7z interfaceC1384330m7z17 = this.LLLFF;
                if (interfaceC1384330m7z17 != null) {
                    interfaceC1384330m7z17.LJIIJ(c1384680m8Y.LIZJ);
                }
                InterfaceC1384330m7z interfaceC1384330m7z18 = this.LLLFF;
                if (interfaceC1384330m7z18 != null) {
                    interfaceC1384330m7z18.LJJIIZI();
                }
                break;
            case 7:
                C1384410m87 c1384410m87 = this.LLLF.LJ;
                float f = c1384410m87.LIZJ;
                float f2 = c1384680m8Y.LIZLLL;
                if (f != f2 && f2 > 0.0f && f > 0.0f) {
                    c1384410m87.LIZ(f2);
                    break;
                }
                break;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        C0RDX.LIZJ(this, "event_on_page_pause", new AwS600S0100000_21(this, 32));
        C0RDX.LIZJ(this, "event_on_page_resume", new AwS600S0100000_21(this, 33));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDanmakuItemDelete(C1164270gP3 c1164270gP3) {
        IDanmakuData iDanmakuDataZQ2;
        String strX1 = c1164270gP3.LIZ.x1();
        if (strX1 != null && (iDanmakuDataZQ2 = Ip().zQ2(strX1)) != null) {
            InterfaceC1384330m7z interfaceC1384330m7z = this.LLLFF;
            if (interfaceC1384330m7z != null) {
                interfaceC1384330m7z.LJJIJIIJIL(1004, iDanmakuDataZQ2.getData(), null);
            }
            C1383870m7F c1383870m7F = Ip().LLILLJJLI;
            if (c1383870m7F != null) {
                c1383870m7F.LIZLLL(iDanmakuDataZQ2);
            }
            iDanmakuDataZQ2.LIZ(false);
            C1385060m9A c1385060m9A = this.LLJZ;
            if (c1385060m9A != null) {
                c1385060m9A.invalidate();
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDanmakuItemDigg(C1164280gP4 c1164280gP4) {
        IDanmakuData iDanmakuDataZQ2;
        String strX1 = c1164280gP4.LIZ.x1();
        if (strX1 != null && (iDanmakuDataZQ2 = Ip().zQ2(strX1)) != null) {
            Ep(iDanmakuDataZQ2, false);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLandscapeModeExit(C726580Sem c726580Sem) {
        String aid;
        InterfaceC1384330m7z interfaceC1384330m7z;
        Aweme aweme;
        VideoItemParams item = Ip().getItem();
        if (item != null && (aweme = item.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid, c726580Sem.LIZ) && !C692470REf.LIZ() && (interfaceC1384330m7z = this.LLLFF) != null) {
            interfaceC1384330m7z.LJJIJ(LSPassThroughRecordSizeConfig.DEFAULT, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[EDGE_INSN: B:53:0x00b9->B:37:0x00b9 BREAK  A[LOOP:1: B:27:0x0095->B:43:0x023d]] */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.DanmakuPresentAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        InterfaceC1384330m7z currentDanmakuController;
        VideoItemParams videoItemParams2 = videoItemParams;
        this.LLJZ = (C1385060m9A) LJJIJL().findViewById(R.id.ffe);
        View view = this.LLJZIJLIL;
        if (view == null) {
            view = null;
        }
        this.LLLILZ = (ViewGroup) view.findViewById(R.id.player_view);
        C1385060m9A c1385060m9A = this.LLJZ;
        if (c1385060m9A != null && (currentDanmakuController = c1385060m9A.getCurrentDanmakuController()) != null) {
            C1385060m9A c1385060m9A2 = this.LLJZ;
            if (c1385060m9A2 != null) {
                c1385060m9A2.LJ(currentDanmakuController);
            }
            this.LLLFF = currentDanmakuController;
            this.LLLF.LIZ(currentDanmakuController, false);
            this.LLLF.LIZJ.LIZJ(C444960Hcc.LIZIZ());
        }
        C1383760m74 c1383760m74 = C1383760m74.LIZIZ;
        this.LLJLLIL = c1383760m74.LJJIFFI(videoItemParams2.getAweme());
        this.LLJLLL = c1383760m74.LJJIIJZLJL(videoItemParams2.getAweme());
        if (!C1384830m8n.LIZ) {
            C622680Oba.LIZJ(this);
        }
        this.LLL = C1384440m8A.LIZ(C724240Sb0.LIZ(this), false, 2);
    }

    @Override // com.ss.android.ugc.aweme.service.DanmakuProtocol
    public final void xn1(boolean z) {
        int i;
        this.LLJLLL = z;
        C1385060m9A c1385060m9A = this.LLJZ;
        if (c1385060m9A != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            int visibility = c1385060m9A.getVisibility();
            c1385060m9A.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c1385060m9A);
        }
        if (!z) {
            if (!C1383760m74.LIZIZ.LJJII()) {
                InterfaceC1384330m7z interfaceC1384330m7z = this.LLLFF;
                if (interfaceC1384330m7z != null) {
                    interfaceC1384330m7z.stop();
                }
                Ip().reset();
            }
            ((ArrayList) this.LLLILZLLLI).clear();
        }
    }

    public static void Wp(DanmakuPresentAssem danmakuPresentAssem, IDanmakuData iDanmakuData) {
        danmakuPresentAssem.getClass();
        iDanmakuData.LIZ(true);
        InterfaceC1384330m7z interfaceC1384330m7z = danmakuPresentAssem.LLLFF;
        if (interfaceC1384330m7z != null) {
            interfaceC1384330m7z.LJJIJIIJIL(1001, iDanmakuData.getData(), null);
        }
        C1385060m9A c1385060m9A = danmakuPresentAssem.LLJZ;
        if (c1385060m9A != null) {
            c1385060m9A.invalidate();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.09AY, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public final void Ep(IDanmakuData iDanmakuData, boolean z) {
        String str;
        String str2;
        iDanmakuData.A1(!iDanmakuData.u1());
        Aweme aweme = null;
        String str3 = "";
        if (iDanmakuData.u1()) {
            iDanmakuData.s1(iDanmakuData.r1() + 1);
            WeakReference weakReference = new WeakReference(this);
            DanmakuViewModel danmakuViewModelIp = Ip();
            AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(weakReference, (WeakReference<DanmakuPresentAssem>) 87);
            danmakuViewModelIp.getClass();
            if (iDanmakuData instanceof C1384300m7w) {
                C1384300m7w c1384300m7w = (C1384300m7w) iDanmakuData;
                c1384300m7w.LJJIIJ = awS565S0100000_21;
                ?? r1 = c1384300m7w.LJJIIJZLJL;
                if (r1 != 0) {
                    r1.invoke(Boolean.TRUE);
                }
            }
            if (z) {
                C1361150lWb c1361150lWb = C1361150lWb.LIZ;
                VideoItemParams item = Ip().getItem();
                if (item != null) {
                    aweme = item.getAweme();
                }
                VideoItemParams item2 = Ip().getItem();
                if (item2 == null || (str2 = item2.mEventType) == null) {
                    str2 = "";
                }
                String strX1 = iDanmakuData.x1();
                if (strX1 != null) {
                    str3 = strX1;
                }
                boolean zLJFF = Intrinsics.LJFF(iDanmakuData.v1(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                String value = EnumC1361130lWZ.VIDEO_PLAYBACK.getValue();
                EnumC255700yp enumC255700yp = EnumC255700yp.IS_NOT_LANDSCAPE;
                c1361150lWb.getClass();
                C1361150lWb.LIZ(aweme, str2, str3, zLJFF, true, value, enumC255700yp);
                if (Ip().LLILLJJLI != null) {
                    C1383870m7F.LIZ(iDanmakuData);
                    return;
                }
                return;
            }
            return;
        }
        WeakReference weakReference2 = new WeakReference(this);
        if (iDanmakuData.r1() > 0) {
            iDanmakuData.s1(iDanmakuData.r1() - 1);
        }
        DanmakuViewModel danmakuViewModelIp2 = Ip();
        AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21(weakReference2, (WeakReference<DanmakuPresentAssem>) 88);
        danmakuViewModelIp2.getClass();
        if (iDanmakuData instanceof C1384300m7w) {
            C1384300m7w c1384300m7w2 = (C1384300m7w) iDanmakuData;
            c1384300m7w2.LJJIIJ = awS565S0100000_212;
            ?? r12 = c1384300m7w2.LJJIIJZLJL;
            if (r12 != 0) {
                r12.invoke(Boolean.FALSE);
            }
        }
        if (!z) {
            return;
        }
        C1361150lWb c1361150lWb2 = C1361150lWb.LIZ;
        VideoItemParams item3 = Ip().getItem();
        if (item3 != null) {
            aweme = item3.getAweme();
        }
        VideoItemParams item4 = Ip().getItem();
        if (item4 == null || (str = item4.mEventType) == null) {
            str = "";
        }
        String strX12 = iDanmakuData.x1();
        if (strX12 != null) {
            str3 = strX12;
        }
        boolean zLJFF2 = Intrinsics.LJFF(iDanmakuData.v1(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String value2 = EnumC1361130lWZ.VIDEO_PLAYBACK.getValue();
        EnumC255700yp enumC255700yp2 = EnumC255700yp.IS_NOT_LANDSCAPE;
        c1361150lWb2.getClass();
        C1361150lWb.LIZ(aweme, str, str3, zLJFF2, false, value2, enumC255700yp2);
        if (Ip().LLILLJJLI == null) {
            return;
        }
        C1383870m7F.LIZ(iDanmakuData);
    }

    public final void Xp(IDanmakuData iDanmakuData, boolean z) {
        iDanmakuData.LIZ(z);
        InterfaceC1384330m7z interfaceC1384330m7z = this.LLLFF;
        if (interfaceC1384330m7z != null) {
            interfaceC1384330m7z.LJJIJIIJIL(1002, iDanmakuData.getData(), null);
        }
        C1385060m9A c1385060m9A = this.LLJZ;
        if (c1385060m9A != null) {
            c1385060m9A.invalidate();
        }
    }
}
