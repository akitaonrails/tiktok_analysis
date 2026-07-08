package com.ss.android.ugc.aweme.feed.assem.sharer;

import X.AbstractC1387200mCc;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C07PH;
import X.C0B8R;
import X.C0B8T;
import X.C0HHT;
import X.C0I0B;
import X.C0S1H;
import X.C0S2L;
import X.C0S2R;
import X.C0S2S;
import X.C0S2U;
import X.C0SY1;
import X.C0W8I;
import X.C0XQ7;
import X.C0ZH1;
import X.C1076010e6h;
import X.C1220000hqw;
import X.C1234220iDs;
import X.C127G;
import X.C1308910kAL;
import X.C1336205Ku;
import X.C1389890mGx;
import X.C13LE;
import X.C13LQ;
import X.C1599690rjL;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1848410yCV;
import X.C1865850yed;
import X.C1906580ziK;
import X.C197039127h;
import X.C19719912Dl;
import X.C1A1H;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C2276471E8n;
import X.C283930BAx;
import X.C289860BXs;
import X.C304730Bx1;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C424420Gka;
import X.C425800Gmo;
import X.C426750GoL;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C456330Hux;
import X.C717590SCv;
import X.C723700Sa8;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C729510SjV;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C893580Z3s;
import X.EnumC2172611A1b;
import X.EnumC700430Rdh;
import X.EnumC714710S1t;
import X.EnumC896890ZGl;
import X.EnumC913010Zrn;
import X.InterfaceC1365380ldQ;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC714600S1i;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS115S0200000_11;
import Y.ACListenerS146S0100000_11;
import Y.ACListenerS54S1200000_11;
import Y.AObjectS64S0000000_11;
import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import avg.f;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.quickchat.mob.IUnifyQuickReplyAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.service.reply.MessageDraftViewModel;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS287S0000000_4;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AFwS331S0000000_6;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoExposeSharerInformationAssem extends BaseCellSlotComponent<VideoExposeSharerInformationAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final InterfaceC1731706qJ LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C736950SvV LLJZIJLIL;
    public C127G LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoExposeSharerInformationAssem.class, "sharerInfoVM", "getSharerInfoVM()Lcom/ss/android/ugc/aweme/feed/assem/sharer/VideoExposeSharerInformationVM;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.d_c;
    }

    public VideoExposeSharerInformationAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoExposeSharerInformationVM.class);
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 244), null, AFwS243S0000000_11.get$arr$(83));
        this.LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(84));
        this.LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 243));
        this.LLJZIJLIL = new C736950SvV(C13LE.LIZ(MessageDraftViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS243S0000000_11.get$arr$(85), new AwS555S0100000_11((AbstractC738140SxQ) this, 245), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    public final C0S2R Bp() {
        String uid;
        String strLIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Fragment fragmentLIZLLL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        C0S2R c0s2r = null;
        User sharer = AwemeBizExtKt.getSharer(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
        if (sharer == null || (uid = sharer.getUid()) == null) {
            return C0S2R.UNKNOWN;
        }
        String strLJJIIZ = C1336205Ku.LIZ(false).getImChatService().LJJIIZ(uid);
        if (strLJJIIZ.length() == 0) {
            return C0S2R.UNKNOWN;
        }
        IIMAnalyticsUtil.LIZ.getClass();
        IIMAnalyticsUtil iIMAnalyticsUtilLIZ = C893580Z3s.LIZ();
        if (iIMAnalyticsUtilLIZ == null || (strLIZ = iIMAnalyticsUtilLIZ.LIZ(strLJJIIZ)) == null) {
            strLIZ = "";
        }
        C0S2R.Companion.getClass();
        Iterator<C0S2R> it2 = C0S2R.getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C0S2R next = it2.next();
            if (Intrinsics.LJFF(next.getEtString(), strLIZ)) {
                c0s2r = next;
                break;
            }
        }
        C0S2R c0s2r2 = c0s2r;
        if (c0s2r2 == null) {
            c0s2r2 = C0S2R.UNKNOWN;
        }
        if (c0s2r2 == C0S2R.UNKNOWN) {
            C0W8I.LIZ.getClass();
            if (C0W8I.LIZIZ() && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL()) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(fragmentLIZLLL);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(strLIZ);
                sbLIZ.append("] is not added to QuickReplyChatType. Please add it or contact @dongwoo.han!!!");
                c1389890mGx.LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return c0s2r2;
    }

    public final C0S2U Ep() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        User sharer = AwemeBizExtKt.getSharer(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
        return (sharer == null || C1234220iDs.LJI(sharer) == null) ? C0S2U.FIXED_ENTRANCE : C0S2U.SHARE_LINK;
    }

    public final VideoExposeSharerInformationVM Fp() {
        return (VideoExposeSharerInformationVM) this.LLJLLIL.getValue(this, LLLF[0]);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MessageDraftViewModel.class, new AObjectS64S0000000_11(this, 10)}, defaultViewModelProviderFactory);
                    this.LLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void wr() {
        C717590SCv c717590SCv = Fp().LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoExposeSharerInformationVM.LLILZIL;
        c717590SCv.LIZIZ(null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        yp();
    }

    public final void Ip(View view) {
        C786410Ut5.T4(view, 1.0f);
        view.setClickable(true);
        C786410Ut5.ed(view, 0.0f);
    }

    public final void Tp(EnumC714710S1t enumC714710S1t) {
        Object obj;
        C0ZH1 c0zh1;
        IUnifyQuickReplyAnalytics.LIZ.getClass();
        IUnifyQuickReplyAnalytics iUnifyQuickReplyAnalyticsLIZ = C0S1H.LIZ();
        if (iUnifyQuickReplyAnalyticsLIZ != null) {
            C0S2S c0s2s = EnumC2172611A1b.Companion;
            String str = Fp().eventType;
            if (str == null) {
                str = "";
            }
            c0s2s.getClass();
            EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(str);
            C0S2U c0s2uEp = Ep();
            EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.AUTO;
            C724270Sb3 c724270Sb3 = this.LLJI;
            Object obj2 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String aid = ((VideoItemParams) obj).getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            }
            if (C1A1H.LIZLLL(((VideoItemParams) obj2).getAweme())) {
                c0zh1 = C0ZH1.REPOST;
            } else {
                c0zh1 = C0ZH1.POST;
            }
            iUnifyQuickReplyAnalyticsLIZ.LIZIZ(enumC2172611A1bLIZ, c0s2uEp, enumC913010Zrn, aid, c0zh1, Bp(), enumC714710S1t, C0I0B.LJFF.LIZIZ());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object obj;
        String uid;
        Object obj2;
        C0ZH1 c0zh1;
        String[] strArr;
        List<String> listLJJLL;
        int iIntValue;
        HandlerHook.viewPost(LJJIJL(), new ARunnableS111S0100000_11(this, 27));
        if (((Boolean) C0B8R.LIZ.getValue()).booleanValue()) {
            view.findViewById(R.id.hi5).setBackground(view.getContext().getDrawable(R.drawable.ba8));
            C426750GoL.LJIIIZ(view.findViewById(R.id.v3t), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), false, 20);
            View viewFindViewById = view.findViewById(R.id.v3t);
            ViewGroup.LayoutParams layoutParams = view.findViewById(R.id.v3t).getLayoutParams();
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById);
            viewFindViewById.setLayoutParams(layoutParams);
            C426750GoL.LJIIIZ(view.findViewById(R.id.tv_sharer_name), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 24);
            C426750GoL.LJIIIZ(view.findViewById(R.id.tv_sharing_text), null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), false, 23);
            ((TextView) view.findViewById(R.id.tv_sharing_text)).setMaxLines(1);
            C197039127h c197039127h = (C197039127h) view.findViewById(R.id.zmf);
            C426750GoL.LJIIIZ(c197039127h, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 27);
            ViewGroup.LayoutParams layoutParams2 = c197039127h.findViewById(R.id.zmf).getLayoutParams();
            layoutParams2.width = -2;
            C786410Ut5.J6(c197039127h, layoutParams2);
            c197039127h.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)));
            c197039127h.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84)));
            c197039127h.setTuxFont(62);
            C426750GoL.LJIIIZ(view.findViewById(R.id.ozi), null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, false, 27);
        }
        View viewFindViewById2 = view.findViewById(R.id.zmf);
        EnumC700430Rdh enumC700430Rdh = EnumC700430Rdh.POSITIVE;
        setComponentClickStatusExperimental(viewFindViewById2, enumC700430Rdh);
        C786410Ut5.U8((C197039127h) view.findViewById(R.id.zmf), new ACListenerS115S0200000_11(this, view, 5));
        setComponentClickStatusExperimental(getContentView().findViewById(R.id.hi5), enumC700430Rdh);
        C786410Ut5.S7((RelativeLayout) getContentView().findViewById(R.id.hi5), new ACListenerS146S0100000_11(this, 11));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0RP9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return ((C0RFV) obj3).LLJ;
            }
        }, null, AFwS294S0000000_11.get$arr$(57), 6);
        Object obj3 = null;
        if (C289860BXs.LIZ()) {
            if (((Boolean) C1865850yed.LIZJ.getValue()).booleanValue()) {
                View viewFindViewById3 = view.findViewById(R.id.snx);
                C426750GoL.LJIIIZ(viewFindViewById3, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, false, 29);
                Qp(viewFindViewById3, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))));
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
                c384050F3z.LIZIZ = null;
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                c384050F3z.LJFF = Integer.valueOf(R.attr.eh);
                viewFindViewById3.setBackground(c384050F3z.LIZ(view.getContext()));
                C786410Ut5.q((C425800Gmo) view.findViewById(R.id.so0), 8);
                C786410Ut5.LLLLLLZZ((TuxIconView) view.findViewById(R.id.so2), 0);
                TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.so1);
                tuxTextView.setTuxFont(51);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ef, tuxTextView.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                tuxTextView.setHintTextColor(iIntValue);
                ((AppCompatTextView) view.findViewById(R.id.gz5)).setTextSize(1, 25.0f);
                ((AppCompatTextView) view.findViewById(R.id.gz8)).setTextSize(1, 25.0f);
                C426750GoL.LJIIIZ(view.findViewById(R.id.gzl), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, false, 26);
            } else if (((Boolean) C304730Bx1.LIZIZ.getValue()).booleanValue()) {
                View viewFindViewById4 = view.findViewById(R.id.snx);
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
                c384050F3z2.LIZIZ = null;
                c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                c384050F3z2.LJFF = Integer.valueOf(R.attr.eh);
                viewFindViewById4.setBackground(c384050F3z2.LIZ(view.getContext()));
                C425800Gmo c425800Gmo = (C425800Gmo) view.findViewById(R.id.so0);
                Qp(c425800Gmo, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))));
                C426750GoL.LJIIIZ(c425800Gmo, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), false, 16);
                c425800Gmo.setIconRes(R.raw.icon_color_paperplane_circle);
                c425800Gmo.setIconBackgroundSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                c425800Gmo.setIconSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            } else if (((Boolean) C304730Bx1.LIZJ.getValue()).booleanValue()) {
                View viewFindViewById5 = view.findViewById(R.id.snx);
                C426750GoL.LJIIIZ(viewFindViewById5, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, false, 29);
                Qp(viewFindViewById5, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))));
                C384050F3z c384050F3z3 = new C384050F3z();
                c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(22));
                c384050F3z3.LIZIZ = null;
                c384050F3z3.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                c384050F3z3.LJFF = Integer.valueOf(R.attr.eh);
                viewFindViewById5.setBackground(c384050F3z3.LIZ(view.getContext()));
                C425800Gmo c425800Gmo2 = (C425800Gmo) view.findViewById(R.id.so0);
                Qp(c425800Gmo2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))));
                C426750GoL.LJIIIZ(c425800Gmo2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), false, 16);
                c425800Gmo2.setIconRes(R.raw.icon_color_paperplane_circle);
                c425800Gmo2.setIconBackgroundSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                c425800Gmo2.setIconSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            } else if (((Boolean) C0B8T.LIZ.getValue()).booleanValue()) {
                C426750GoL.LJIIIZ(view.findViewById(R.id.snx), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, false, 29);
                Qp(view.findViewById(R.id.snx), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))));
                View viewFindViewById6 = view.findViewById(R.id.snx);
                C384050F3z c384050F3z4 = new C384050F3z();
                c384050F3z4.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
                c384050F3z4.LJFF = Integer.valueOf(R.attr.eh);
                c384050F3z4.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                viewFindViewById6.setBackground(c384050F3z4.LIZ(view.getContext()));
                ((AppCompatTextView) view.findViewById(R.id.gz5)).setTextSize(1, 24.0f);
                ((AppCompatTextView) view.findViewById(R.id.gz8)).setTextSize(1, 24.0f);
                C426750GoL.LJIIIZ(view.findViewById(R.id.gzl), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, false, 26);
                C426750GoL.LJIIIZ(view.findViewById(R.id.so1), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, null, false, 30);
                C425800Gmo c425800Gmo3 = (C425800Gmo) view.findViewById(R.id.so0);
                Qp(c425800Gmo3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))));
                c425800Gmo3.setIconSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                C426750GoL.LJIIIZ(c425800Gmo3.findViewById(R.id.bh2), 0, 0, 0, 0, false, 16);
                c425800Gmo3.setHollow(false);
                C426750GoL.LJIIIZ(c425800Gmo3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), false, 16);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
                c419910GdJ.LIZ = R.raw.icon_paperplane_fill;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                c425800Gmo3.setTuxIcon(c419910GdJ);
                C786410Ut5.ed(c425800Gmo3.findViewById(R.id.jxe), C418440Gaw.LIZIZ(1));
                c425800Gmo3.setIconBackgroundSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                C384050F3z c384050F3z5 = new C384050F3z();
                c384050F3z5.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c384050F3z5.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c384050F3z5.LIZIZ = Integer.valueOf(R.attr.ee);
                c384050F3z5.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(7));
                c425800Gmo3.setIconBackground(c384050F3z5);
            } else {
                C426750GoL.LJIIIZ(view.findViewById(R.id.snx), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, false, 29);
                View viewFindViewById7 = view.findViewById(R.id.snx);
                C384050F3z c384050F3z6 = new C384050F3z();
                c384050F3z6.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
                c384050F3z6.LIZIZ = Integer.valueOf(R.attr.dy);
                viewFindViewById7.setBackground(c384050F3z6.LIZ(view.getContext()));
                C426750GoL.LJIIIZ(view.findViewById(R.id.so0), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), false, 16);
                ((C425800Gmo) view.findViewById(R.id.so0)).setIconRes(R.raw.icon_color_paperplane_circle);
            }
            setComponentClickStatusExperimental(view.findViewById(R.id.so0), enumC700430Rdh);
            View viewFindViewById8 = view.findViewById(R.id.so0);
            View.OnClickListener aCListenerS146S0100000_11 = new ACListenerS146S0100000_11(this, 93);
            if (C1848410yCV.LIZ) {
                aCListenerS146S0100000_11 = new f(aCListenerS146S0100000_11);
            }
            a aVar = new a(aCListenerS146S0100000_11);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(viewFindViewById8);
            }
            viewFindViewById8.setOnClickListener(aVar);
            setComponentClickStatusExperimental(view.findViewById(R.id.snx), enumC700430Rdh);
            C786410Ut5.S7((RelativeLayout) view.findViewById(R.id.snx), new ACListenerS146S0100000_11(this, 94));
            if (C1865850yed.LIZ()) {
                listLJJLL = C07PH.LIZ();
            } else {
                Object objLJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("messaging_quick_emoji_list", String[].class, C456330Hux.LIZIZ);
                if (!(objLJIIIIZZ instanceof String[]) || (strArr = (String[]) objLJIIIIZZ) == null || strArr.length == 0) {
                    strArr = C456330Hux.LIZ;
                }
                listLJJLL = C13LQ.LJJLL(strArr);
            }
            int i = 0;
            for (String str : listLJJLL) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str2 = str;
                    if (i != 0) {
                        if (i != 1) {
                            break;
                        }
                        ((TextView) view.findViewById(R.id.gz8)).setText(str2);
                        setComponentClickStatusExperimental(view.findViewById(R.id.gz8), EnumC700430Rdh.POSITIVE);
                        C786410Ut5.h9((TuxTextView) view.findViewById(R.id.gz8), new ACListenerS54S1200000_11(this, str2, view, 6));
                    } else {
                        ((TextView) view.findViewById(R.id.gz5)).setText(str2);
                        setComponentClickStatusExperimental(view.findViewById(R.id.gz5), EnumC700430Rdh.POSITIVE);
                        C786410Ut5.h9((TuxTextView) view.findViewById(R.id.gz5), new ACListenerS54S1200000_11(this, str2, view, 5));
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        User sharer = AwemeBizExtKt.getSharer(((VideoItemParams) obj).getAweme());
        String str3 = "";
        if (sharer == null || (uid = sharer.getUid()) == null) {
            uid = "";
        }
        IUnifyQuickReplyAnalytics.LIZ.getClass();
        IUnifyQuickReplyAnalytics iUnifyQuickReplyAnalyticsLIZ = C0S1H.LIZ();
        if (iUnifyQuickReplyAnalyticsLIZ != null) {
            C0S2S c0s2s = EnumC2172611A1b.Companion;
            String str4 = Fp().eventType;
            if (str4 == null) {
                str4 = "";
            }
            c0s2s.getClass();
            EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(str4);
            C0S2U c0s2uEp = Ep();
            EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.AUTO;
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            String aid = ((VideoItemParams) obj2).getAweme().getAid();
            if (aid != null) {
                str3 = aid;
            }
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            }
            if (C1A1H.LIZLLL(((VideoItemParams) obj3).getAweme())) {
                c0zh1 = C0ZH1.REPOST;
            } else {
                c0zh1 = C0ZH1.POST;
            }
            iUnifyQuickReplyAnalyticsLIZ.LIZ(enumC2172611A1bLIZ, c0s2uEp, enumC913010Zrn, str3, c0zh1, Bp(), uid, C0I0B.LJFF.LIZIZ());
        }
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0S2P
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj4) {
                return ((C0S2L) obj4).LL;
            }
        }, null, AFwS287S0000000_4.get$arr$(30), 6);
        C736680Sv4.LJIIIZ(this, Fp(), new C2217381BqS() { // from class: X.0S2N
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj4) {
                return ((C0S2L) obj4).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0S2J
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj4) {
                return ((C0S2L) obj4).LLILLL;
            }
        }, null, AFwS331S0000000_6.get$arr$(2), 12);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0S2H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj4) {
                return Integer.valueOf(((C0S2L) obj4).LLIZLLLIL);
            }
        }, null, AFwS294S0000000_11.get$arr$(285), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0S2O
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj4) {
                return ((C0S2L) obj4).LLILZLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(286), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0S2I
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj4) {
                return Integer.valueOf(((C0S2L) obj4).LLIZ);
            }
        }, null, AFwS294S0000000_11.get$arr$(287), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0S2K
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj4) {
                return ((C0S2L) obj4).LLILZ;
            }
        }, C736820SvI.LIZJ(), AFwS294S0000000_11.get$arr$(288), 4);
        VideoExposeSharerInformationAssem videoExposeSharerInformationAssem = this;
        C736680Sv4.LJIIIIZZ(videoExposeSharerInformationAssem, Fp(), new C2217381BqS() { // from class: X.0S2M
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj4) {
                return ((C0S2L) obj4).LLILZIL;
            }
        }, C736820SvI.LIZJ(), AFwS294S0000000_11.get$arr$(289), 4);
        if (C283930BAx.LIZ() != 3) {
            videoExposeSharerInformationAssem = videoExposeSharerInformationAssem;
            C736680Sv4.LJIIIIZZ(videoExposeSharerInformationAssem, videoExposeSharerInformationAssem.Fp(), new C2217381BqS() { // from class: X.0ROy
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj4) {
                    return ((C0S2L) obj4).LLJILJIL;
                }
            }, C736820SvI.LIZJ(), AFwS294S0000000_11.get$arr$(290), 4);
        }
        if (C289860BXs.LIZ()) {
            C736680Sv4.LJIIIIZZ(videoExposeSharerInformationAssem, videoExposeSharerInformationAssem.Fp(), new C2217381BqS() { // from class: X.0S2G
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj4) {
                    return Boolean.valueOf(((C0S2L) obj4).LLJI);
                }
            }, C736820SvI.LIZJ(), AFwS294S0000000_11.get$arr$(291), 4);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        boolean z;
        User sharer;
        String uid;
        String curUserId;
        VideoExposeSharerInformationVM.LLILZ.getClass();
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null && (sharer = AwemeBizExtKt.getSharer(aweme)) != null && (uid = sharer.getUid()) != null) {
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (iAccountUserServiceLJFF != null) {
                curUserId = iAccountUserServiceLJFF.getCurUserId();
            } else {
                curUserId = null;
            }
            z = !Intrinsics.LJFF(uid, curUserId);
        } else {
            z = false;
        }
        C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recycle view, is Active:");
        sbLIZ.append(z);
        c2276471E8n.LIZIZ("common_feed", "@LinkRelation_Video_Assem", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String aid;
        int i;
        boolean z = ((C0S2L) Fp().getState()).LLJ;
        C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind view visible:");
        sbLIZ.append(z);
        sbLIZ.append(", aid:");
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(" vm: ");
        sbLIZ.append(Fp().hashCode());
        c2276471E8n.LIZIZ("common_feed", "@LinkRelation_Video_Assem", C2188811AlT.LIZIZ(sbLIZ));
        View contentView = getContentView();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, contentView);
        Fp().FQ2(0, R.attr.bx, false);
        VideoExposeSharerInformationVM videoExposeSharerInformationVMFp = Fp();
        if (videoExposeSharerInformationVMFp.LLILLJJLI == null) {
            C0SY1 c0sy1LJIIIIZZ = C1076010e6h.LIZJ.LJIIIIZZ();
            videoExposeSharerInformationVMFp.LLILLJJLI = c0sy1LJIIIIZZ;
            if (c0sy1LJIIIIZZ != null) {
                c0sy1LJIIIIZZ.LJII(videoExposeSharerInformationVMFp);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
        vr((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: zp */
    public final void vr(VideoItemParams videoItemParams) {
        VideoExposeSharerInformationVM videoExposeSharerInformationVMFp = Fp();
        Context context = getContext();
        C717590SCv c717590SCv = videoExposeSharerInformationVMFp.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoExposeSharerInformationVM.LLILZIL;
        c717590SCv.LIZIZ(context);
    }

    public final void Gp(View view, String str) {
        Aweme aweme;
        User userYQ2;
        String str2;
        Map<String, String> linkedHashMap;
        String str3;
        C424420Gka.LIZ().LIZJ(str);
        VideoExposeSharerInformationVM videoExposeSharerInformationVMFp = Fp();
        VideoItemParams item = videoExposeSharerInformationVMFp.getItem();
        if (item != null && (aweme = item.getAweme()) != null && (userYQ2 = videoExposeSharerInformationVMFp.yQ2()) != null) {
            IMSharePanelApi.LIZ.getClass();
            InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
            VideoItemParams item2 = videoExposeSharerInformationVMFp.getItem();
            if (item2 == null || (str2 = item2.mEventType) == null) {
                str2 = "";
            }
            EnumC896890ZGl enumC896890ZGl = EnumC896890ZGl.TYPE_FEED_QUICK_ENTRANCE;
            if (Intrinsics.LJFF(userYQ2.getUid(), AwemeExtKt.getAuthorUid(aweme))) {
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("dm_reply_type", "emoji");
                if (C729510SjV.LJJIJIL(aweme)) {
                    str3 = "story";
                } else {
                    str3 = "post";
                }
                pairArr[1] = new Pair("story_type", str3);
                linkedHashMap = C2097608Jq.LJIIJ(pairArr);
            } else {
                linkedHashMap = new LinkedHashMap<>();
            }
            shareService.LJJJI(str, userYQ2, aweme, str2, enumC896890ZGl, null, null, null, false, linkedHashMap, AFwS243S0000000_11.get$arr$(803));
        }
        InterfaceC714600S1i quickReplyAnalytics = Fp().xQ2().getQuickReplyAnalytics();
        String str4 = Fp().eventType;
        if (str4 == null) {
            str4 = "";
        }
        quickReplyAnalytics.LJI(Fp().zQ2(), str4, "emoji", Fp().AQ2());
        Tp(EnumC714710S1t.CLICK_OUTER_EMOJI);
        C1336205Ku.LIZ(false).getQuickDmService().onQuickReplyEmojiSendAnimations(view, str, null, new AwS555S0100000_11(this, 242));
    }

    public final void Jp(int i, boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        View viewFindViewById = getContentView().findViewById(R.id.tv_sharer_name);
        ViewGroup.LayoutParams layoutParams2 = null;
        if (viewFindViewById != null) {
            layoutParams2 = viewFindViewById.getLayoutParams();
        }
        if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.setMarginEnd(i);
            if (z) {
                View viewFindViewById2 = getContentView().findViewById(R.id.ozi);
                if (viewFindViewById2 != null) {
                    layoutParams.addRule(16, viewFindViewById2.getId());
                }
            } else {
                View viewFindViewById3 = getContentView().findViewById(R.id.zmf);
                if (viewFindViewById3 != null) {
                    layoutParams.addRule(16, viewFindViewById3.getId());
                }
            }
            TuxTextView tuxTextView = (TuxTextView) getContentView().findViewById(R.id.tv_sharer_name);
            if (tuxTextView != null) {
                C786410Ut5.R6(tuxTextView, layoutParams);
            }
        }
    }

    public final void Qp(View view, Integer num, Integer num2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (num != null) {
            num.intValue();
            layoutParams.width = num.intValue();
        }
        if (num2 != null) {
            num2.intValue();
            layoutParams.height = num2.intValue();
        }
        C786410Ut5.W5(view, layoutParams);
    }
}
