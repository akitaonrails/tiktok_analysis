package com.ss.android.ugc.aweme.tako.botpage.components.video.videogeneration;

import X.C01GW;
import X.C05UQ;
import X.C07MR;
import X.C07QI;
import X.C09R3;
import X.C0DSB;
import X.C0QSJ;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C1385040m98;
import X.C13LE;
import X.C13LP;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1683130ttv;
import X.C1697810uHb;
import X.C1845250y7P;
import X.C1856690yPr;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C423410Gix;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1587906Jp;
import X.InterfaceC1783650wW3;
import X.InterfaceC1856570yPf;
import X.InterfaceC1856590yPh;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.ViewOnLongClickListenerC1864690ycl;
import Y.ACListenerS129S0200000_27;
import Y.ACListenerS161S0100000_27;
import Y.ATListenerS459S0100000_27;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoCardCellScope;
import com.ss.android.ugc.aweme.tako.botpage.components.autoplay.TakoCardAutoPlayAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.share.TakoSharePreviewAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewCellProtocol;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS141S1100000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoVideoGenerationCoverAssem extends ReusedUISlotAssem<TakoVideoGenerationCoverAssem> implements InterfaceC712990Rxx<InterfaceC1856590yPh>, TakoContentPreviewCellProtocol, InterfaceC1783650wW3, TakoCardAutoPlayAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZ;
    public static final float LLLILZJ;
    public SmartImageView LLJJLIIIJLLLLLLLZ;
    public C1845250y7P LLJL;
    public TuxIconView LLJLIL;
    public View LLJLILLLLZIIL;
    public InterfaceC1856590yPh LLJLL;
    public float LLJLLIL;
    public float LLJLLL;
    public String LLJZ;
    public Size LLJZIJLIL;
    public FrameLayout LLL;
    public TuxIconView LLLF;
    public boolean LLLFF;
    public FrameLayout LLLFFI;
    public boolean LLLFZ;
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 810));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 812));
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 811));
    public final AwS606S0100000_27 LLLIIIIL = new AwS606S0100000_27(this, 249);
    public volatile InterfaceC1856570yPf LLLIIIL;
    public volatile TakoSharePreviewAbility LLLIIL;
    public InterfaceC665370Q7z LLLIILIL;
    public C0QSJ LLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoVideoGenerationCoverAssem.class, "contentPreviewAbility", "getContentPreviewAbility()Lcom/ss/android/ugc/aweme/tako/otherpage/image/detail/assem/TakoContentPreviewAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoVideoGenerationCoverAssem.class, "sharePreviewAbility", "getSharePreviewAbility()Lcom/ss/android/ugc/aweme/tako/botpage/components/share/TakoSharePreviewAbility;", 0);
        c09r3.getClass();
        LLLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLLILZJ = C418440Gaw.LIZIZ(16);
    }

    @Override // X.InterfaceC1783650wW3
    public final void C0() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fm7;
    }

    @Override // X.InterfaceC1361305Ul
    public final void W7(String str) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.components.autoplay.TakoCardAutoPlayAbility
    public final InterfaceC1783650wW3 af() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoCardCellScope.class, TakoFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoCardCellScope.class);
        arrayList.add(TakoFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1128091102) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C0QSJ op() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLIILIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLIILIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{TakoFragmentScope.class});
        this.LLLIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    @Override // X.InterfaceC1783650wW3
    public final void pause() {
        C1845250y7P c1845250y7P = this.LLJL;
        if (c1845250y7P != null) {
            c1845250y7P.LJ();
        }
        TuxIconView tuxIconView = this.LLJLIL;
        if (tuxIconView != null) {
            C0DSB.LIZJ(tuxIconView);
        }
    }

    @Override // X.InterfaceC1783650wW3
    public final void play() {
        C1845250y7P c1845250y7P = this.LLJL;
        if (c1845250y7P != null) {
            c1845250y7P.LJII();
        }
        TuxIconView tuxIconView = this.LLJLIL;
        if (tuxIconView != null) {
            C0DSB.LIZIZ(tuxIconView);
        }
    }

    @Override // X.InterfaceC1783650wW3
    public final void release() {
        C1845250y7P c1845250y7P = this.LLJL;
        if (c1845250y7P != null) {
            c1845250y7P.LJI();
        }
    }

    public final InterfaceC1856570yPf sp() {
        InterfaceC1856570yPf interfaceC1856570yPf = this.LLLIIIL;
        if (interfaceC1856570yPf == null) {
            synchronized (this) {
                interfaceC1856570yPf = this.LLLIIIL;
                if (interfaceC1856570yPf == null) {
                    C0QSJ c0qsjOp = op();
                    InterfaceC1856570yPf interfaceC1856570yPf2 = c0qsjOp != null ? (InterfaceC1856570yPf) c0qsjOp.getAbility(InterfaceC1856570yPf.class) : null;
                    this.LLLIIIL = interfaceC1856570yPf2;
                    return interfaceC1856570yPf2;
                }
            }
        }
        return interfaceC1856570yPf;
    }

    public final ITakoContextAbility tp() {
        return (ITakoContextAbility) this.LLLII.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), TakoContentPreviewCellProtocol.class, this);
        release();
        this.LLJZ = null;
    }

    @Override // X.InterfaceC1783650wW3
    public final View getDetectView() {
        return getContentView();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC1783650wW3
    public final void LJIILJJIL(boolean z) {
        C1845250y7P c1845250y7P = this.LLJL;
        if (c1845250y7P != null) {
            c1845250y7P.setMuteState(z);
        }
    }

    @Override // X.InterfaceC1361305Ul
    public final C05UQ Y8(String str) {
        return new C05UQ(16.0f, 16.0f, 16.0f, 16.0f);
    }

    @Override // X.InterfaceC1361305Ul
    public final C1683130ttv aa(String str) {
        String str2;
        List<BaseVideo> videoList;
        BaseVideo baseVideo;
        View view = this.LLJLILLLLZIIL;
        if (view == null) {
            return null;
        }
        InterfaceC1856590yPh interfaceC1856590yPh = this.LLJLL;
        if (interfaceC1856590yPh != null && (videoList = interfaceC1856590yPh.getVideoList()) != null && (baseVideo = (BaseVideo) C13LP.LJJJLL(videoList)) != null) {
            str2 = baseVideo.vid;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str, str2)) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new C1683130ttv(iArr[0], iArr[1], r2 + view.getWidth(), iArr[1] + view.getHeight());
    }

    @Override // X.InterfaceC1783650wW3
    public final void l7(AwS141S1100000_27 awS141S1100000_27) {
        C1845250y7P c1845250y7P = this.LLJL;
        if (c1845250y7P != null) {
            c1845250y7P.setMuteClickCallback(new AwS606S0100000_27(awS141S1100000_27, 592));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        int iLIZJ;
        this.LLJJLIIIJLLLLLLLZ = (SmartImageView) view.findViewById(R.id.video_cover);
        if (C07MR.LIZ()) {
            this.LLJL = (C1845250y7P) view.findViewById(R.id.video_autoplay_view);
        }
        this.LLJLIL = (TuxIconView) view.findViewById(R.id.video_play_icon);
        View viewFindViewById = view.findViewById(R.id.tsc);
        this.LLJLILLLLZIIL = viewFindViewById;
        if (viewFindViewById != null) {
            if (C07MR.LIZ()) {
                float f = LLLILZJ;
                viewFindViewById.setOutlineProvider(new C423410Gix(Float.valueOf(f)));
                viewFindViewById.setClipToOutline(true);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
                Context context = viewFindViewById.getContext();
                if (context == null || (iLIZJ = C1308910kAL.LIZJ(R.attr.a02, context)) == null) {
                    iLIZJ = 0;
                }
                c384050F3z.LJ = iLIZJ;
                c384050F3z.LIZJ = Float.valueOf(f);
                viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
            }
            C786410Ut5.I7(new ACListenerS129S0200000_27(viewFindViewById, this, 17), viewFindViewById);
            viewFindViewById.setOnTouchListener(new ATListenerS459S0100000_27(this, 4));
            viewFindViewById.setOnLongClickListener(new ViewOnLongClickListenerC1864690ycl(this, 9));
        }
        C07QI.LIZ.getClass();
        if (C07QI.LIZ()) {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.x4v);
            FrameLayout frameLayout2 = null;
            if (frameLayout != null) {
                C786410Ut5.O7(frameLayout, new ACListenerS161S0100000_27(this, 83));
            } else {
                frameLayout = null;
            }
            this.LLL = frameLayout;
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.x4u);
            if (tuxIconView != null) {
                C1361400lX0 c1361400lX0LIZ = C1385040m98.LIZ(tuxIconView.getContext(), false);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_arrow_down_to_line;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.zi, c1361400lX0LIZ);
                tuxIconView.setTuxIcon(c419910GdJ);
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                int iLIZJ2 = C1308910kAL.LIZJ(R.attr.zg, c1361400lX0LIZ);
                if (iLIZJ2 == null) {
                    iLIZJ2 = 0;
                }
                c384050F3z2.LIZ = iLIZJ2;
                tuxIconView.setBackground(c384050F3z2.LIZ(c1361400lX0LIZ));
            } else {
                tuxIconView = null;
            }
            this.LLLF = tuxIconView;
            FrameLayout frameLayout3 = (FrameLayout) view.findViewById(R.id.x4x);
            if (frameLayout3 != null) {
                C786410Ut5.O7(frameLayout3, new ACListenerS161S0100000_27(this, 84));
                frameLayout2 = frameLayout3;
            }
            this.LLLFFI = frameLayout2;
            View viewFindViewById2 = view.findViewById(R.id.x4w);
            if (viewFindViewById2 != null) {
                C1361400lX0 c1361400lX0LIZ2 = C1385040m98.LIZ(viewFindViewById2.getContext(), false);
                C384050F3z c384050F3z3 = new C384050F3z();
                c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                int iLIZJ3 = C1308910kAL.LIZJ(R.attr.zg, c1361400lX0LIZ2);
                if (iLIZJ3 == null) {
                    iLIZJ3 = 0;
                }
                c384050F3z3.LIZ = iLIZJ3;
                viewFindViewById2.setBackground(c384050F3z3.LIZ(c1361400lX0LIZ2));
                C2211631BhB.LJ(viewFindViewById2, new AwS606S0100000_27(this, 250));
            }
            TextView textView = (TextView) view.findViewById(R.id.x4z);
            if (textView != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, C1385040m98.LIZ(textView.getContext(), false));
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                textView.setTextColor(iIntValue);
            }
            TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.x4y);
            if (tuxIconView2 != null) {
                C1361400lX0 c1361400lX0LIZ3 = C1385040m98.LIZ(tuxIconView2.getContext(), false);
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_plus;
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ2.LIZLLL = C1308910kAL.LIZJ(R.attr.zi, c1361400lX0LIZ3);
                tuxIconView2.setTuxIcon(c419910GdJ2);
            }
        }
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), TakoContentPreviewCellProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0211 A[PHI: r1
      0x0211: PHI (r1v9 int) = (r1v8 int), (r1v11 int) binds: [B:77:0x020d, B:30:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.InterfaceC1856590yPh r32) {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.video.videogeneration.TakoVideoGenerationCoverAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1856590yPh interfaceC1856590yPh) {
        return true;
    }

    public final void yp(boolean z) {
        Integer numLIZJ;
        this.LLLFF = z;
        C07QI.LIZ.getClass();
        if (C07QI.LIZ()) {
            if (z) {
                TuxIconView tuxIconView = this.LLLF;
                if (tuxIconView != null) {
                    tuxIconView.setImageDrawable((Drawable) this.LLLI.getValue());
                }
                C1856690yPr c1856690yPr = (C1856690yPr) this.LLLI.getValue();
                if (c1856690yPr != null) {
                    c1856690yPr.LJIIIZ();
                    return;
                }
                return;
            }
            TuxIconView tuxIconView2 = this.LLLF;
            if (tuxIconView2 != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_arrow_down_to_line;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                Context context = getContext();
                if (context != null) {
                    numLIZJ = C1308910kAL.LIZJ(R.attr.zi, context);
                } else {
                    numLIZJ = null;
                }
                c419910GdJ.LIZLLL = numLIZJ;
                tuxIconView2.setTuxIcon(c419910GdJ);
            }
            C1856690yPr c1856690yPr2 = (C1856690yPr) this.LLLI.getValue();
            if (c1856690yPr2 == null) {
                return;
            }
            c1856690yPr2.LJIIJ();
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1856590yPh interfaceC1856590yPh) {
    }

    @Override // X.InterfaceC1361305Ul
    public final void Of(String str, boolean z) {
        String str2;
        View view;
        int i;
        List<BaseVideo> videoList;
        BaseVideo baseVideo;
        InterfaceC1856590yPh interfaceC1856590yPh = this.LLJLL;
        if (interfaceC1856590yPh != null && (videoList = interfaceC1856590yPh.getVideoList()) != null && (baseVideo = (BaseVideo) C13LP.LJJJLL(videoList)) != null) {
            str2 = baseVideo.vid;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str, str2) && (view = this.LLJLILLLLZIIL) != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public final Map<String, String> up(String str, Message message) {
        Map<String, String> commonParams;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ITakoContextAbility iTakoContextAbilityTp = tp();
        if (iTakoContextAbilityTp != null && (commonParams = iTakoContextAbilityTp.getCommonParams()) != null) {
            linkedHashMap.putAll(commonParams);
        }
        linkedHashMap.put("source", "session_page");
        linkedHashMap.put("message_id", str);
        if (message != null && (!a0.LJJJIL(message.ext.imageTemplateId))) {
            linkedHashMap.put("image_template_id", message.ext.imageTemplateId);
            linkedHashMap.put("is_unchanged_tako_template", String.valueOf(message.ext.isUnchangedTakoTemplate));
        }
        return linkedHashMap;
    }
}
