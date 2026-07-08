package com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.ui;

import X.AbstractC360710ECf;
import X.C01GW;
import X.C098200Yq;
import X.C0E17;
import X.C0E47;
import X.C0E48;
import X.C0E5S;
import X.C0EBQ;
import X.C0EBW;
import X.C0ECS;
import X.C0ECW;
import X.C0ECX;
import X.C0ECY;
import X.C0ECZ;
import X.C0ED1;
import X.C0EDF;
import X.C0EJZ;
import X.C0FXL;
import X.C1308910kAL;
import X.C1533950q1J;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C201955140j;
import X.C350440DoY;
import X.C350870DpF;
import X.C351220Dpo;
import X.C351510DqH;
import X.C354340Duq;
import X.C357180DzQ;
import X.C357590E0f;
import X.C357780E0y;
import X.C358740E4q;
import X.C360660ECa;
import X.C360680ECc;
import X.C362490EJb;
import X.C364210EPr;
import X.C366890EZz;
import X.C368610Ecl;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC357140DzM;
import X.EnumC360750ECj;
import X.EnumC362260EIe;
import X.InterfaceC350420DoW;
import X.InterfaceC357170DzP;
import X.InterfaceC358840E5a;
import X.InterfaceC360570EBr;
import X.InterfaceC361710EGb;
import X.InterfaceC362230EIb;
import X.InterfaceC364230EPt;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS105S0100000_5;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.ui.VideoAnimFragment;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS441S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoAnimFragment extends TTResourcePanelFragment<CutViewModel> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9KyQ8KC06JCHELIOSw4ICogZiAqLyowPDZiPyY3LSotJyY+ZjAlZxk6LCAjCCE6JQM+KCg+LSs4";
    public final boolean LLLFFI;
    public C0ED1 LLLFZ;
    public ConstraintLayout LLLI;
    public TuxIconView LLLII;
    public C366890EZz LLLIIII;
    public final C01GW LLLIIIIL;
    public View LLLIIIL;
    public final C01GW LLLIIL;
    public View LLLIILIL;
    public final C01GW LLLIL;
    public C360680ECc LLLILZ;
    public final long LLLILZJ;
    public boolean LLLILZLLLI;
    public String LLLIZZ;
    public InterfaceC362230EIb LLLJ;
    public C0E5S LLLJIL;
    public InterfaceC361710EGb LLLJL;
    public InterfaceC360570EBr LLLL;
    public EnumC362260EIe LLLLII;
    public boolean LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final C01GW LLLLIILL;
    public final C0ECY LLLLIILLL;
    public final C0ECZ LLLLIL;
    public final C357180DzQ LLLLILI;

    public VideoAnimFragment() {
        this(null, 3);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final String qS() {
        return "video_anim_panel";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final boolean yS() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void HS() {
        /*
            r8 = this;
            X.0E48 r7 = r8.LL
            if (r7 == 0) goto L95
            X.0ECc r0 = r8.LLLILZ
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L99
            X.0ECW r0 = r0.getPageAdapter()
            if (r0 == 0) goto L99
            android.util.SparseArray<X.0EBW> r1 = r0.LLILZ
            if (r1 == 0) goto L99
            X.0FX4 r2 = new X.0FX4
            r0 = 0
            r2.<init>(r1, r0)
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r1 = r2.next()
            X.0EBW r1 = (X.C0EBW) r1
            boolean r0 = r1 instanceof X.C0EBQ
            if (r0 == 0) goto L1a
            X.0EBQ r1 = (X.C0EBQ) r1
            if (r1 == 0) goto L1a
            boolean r0 = r1.LJIILIIL
            if (r0 != r4) goto L1a
            r1 = 1
        L33:
            boolean r0 = r8.LLLILZLLLI
            if (r0 != 0) goto L3d
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r7.LLLLLLIL()
            if (r0 != 0) goto L4a
        L3d:
            if (r1 == 0) goto L4a
            kotlin.Unit r2 = kotlin.Unit.LIZ
            X.0DpP r1 = r7.S7()
            java.lang.String r0 = "force_update_effect_func_event"
            r1.LIZIZ(r2, r0, r3)
        L4a:
            X.19EG r1 = r8.getActivity()
            if (r1 == 0) goto L5c
            r0 = 2131395471(0x7f0a838f, float:1.8411655E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L5c
            r0.setScrollY(r3)
        L5c:
            X.0E5S r0 = r8.LLLJIL
            if (r0 == 0) goto L63
            r0.ZP0(r3)
        L63:
            X.0EIb r0 = r8.LLLJ
            if (r0 == 0) goto L6a
            r0.RH1(r3)
        L6a:
            X.0E55 r0 = r7.getPlayer()
            r0.LJIJJLI()
            r0.pause(r3)
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r7.LLLLLLIL()
            if (r0 == 0) goto L95
            X.C350870DpF.LJI(r7)
            java.lang.String r6 = "add_animation_duration"
            long r4 = X.C361680EFy.LJIJI(r6)
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r8.LLLILZJ
            long r2 = r2 - r0
            X.C350870DpF.LJI(r7)
            long r4 = r4 + r2
            java.lang.String r0 = java.lang.String.valueOf(r4)
            X.C361680EFy.LJLJI(r6, r0)
        L95:
            r8.NR()
            return
        L99:
            r1 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.ui.VideoAnimFragment.HS():void");
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final ViewModel QS() {
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        return C364210EPr.LIZIZ(CutViewModel.class);
    }

    public final View lT() {
        return (View) this.LLLIIL.getValue();
    }

    public final View mT() {
        return (View) this.LLLIL.getValue();
    }

    public final int nT() {
        C360680ECc c360680ECc = this.LLLILZ;
        int i = 0;
        if (c360680ECc != null) {
            String str = this.LLLIZZ;
            if (str == null || a0.LJJJIL(str)) {
                return 0;
            }
            Iterator<C357590E0f> it2 = c360680ECc.getCategoryList().iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.LJFF(it2.next().LIZIZ, this.LLLIZZ)) {
                    i++;
                }
            }
            return -1;
        }
        return i;
    }

    public final TuxIconView oT() {
        View viewFindViewById = this.LLLII;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.video_anim_close) : null;
            this.LLLII = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC361710EGb interfaceC361710EGb;
        C360680ECc c360680ECc = this.LLLILZ;
        if (c360680ECc != null) {
            c360680ECc.LLJI = null;
            c360680ECc.LLJIJIL = null;
        }
        super.onDestroyView();
        clearFromXmlViewCache();
        if (!C0E47.LIZ() || (interfaceC361710EGb = this.LLLJL) == null) {
            return;
        }
        interfaceC361710EGb.LR1(true);
    }

    public final ConstraintLayout pT() {
        View viewFindViewById = this.LLLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.video_anim_close_opt) : null;
            this.LLLI = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C0ED1 qT() {
        View viewFindViewById = this.LLLFZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.video_anim_loading) : null;
            this.LLLFZ = (C0ED1) viewFindViewById;
        }
        return (C0ED1) viewFindViewById;
    }

    public final C366890EZz rT() {
        return (C366890EZz) this.LLLIIIIL.getValue();
    }

    public final boolean vT() {
        return ((Boolean) this.LLLLIILL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final void NR() {
        InterfaceC362230EIb interfaceC362230EIb;
        InterfaceC362230EIb interfaceC362230EIb2;
        NLETrack nLETrackPt;
        super.NR();
        C0E48 c0e48 = this.LL;
        if (c0e48 == null || (nLETrackPt = c0e48.Pt()) == null || !nLETrackPt.getMainTrack()) {
            EnumC362260EIe enumC362260EIe = this.LLLLII;
            if (enumC362260EIe != null && (interfaceC362230EIb2 = this.LLLJ) != null) {
                interfaceC362230EIb2.td1(enumC362260EIe);
            }
            if (!this.LLLLIIIILLL || (interfaceC362230EIb = this.LLLJ) == null) {
                return;
            }
            interfaceC362230EIb.RH1(false);
        }
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final int RR() {
        return C357780E0y.LIZ() ? R.layout.c2w : R.layout.c2u;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLFZ = null;
        this.LLLI = null;
        this.LLLII = null;
        this.LLLIIII = null;
        this.LLLIIIL = null;
        this.LLLIILIL = null;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        InterfaceC358840E5a interfaceC358840E5aBo;
        super.onDetach();
        if (C0E47.LIZ() && vT()) {
            C0E48 c0e48 = this.LL;
            if (c0e48 != null && (interfaceC358840E5aBo = c0e48.Bo()) != null) {
                interfaceC358840E5aBo.LIZJ(this.LLLLILI);
            }
            C350440DoY.LIZIZ(this.LLLLIL);
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final boolean uS() {
        return vT();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void GS() {
        HS();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0ECY] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.0ECZ] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0DzQ] */
    public VideoAnimFragment(boolean z) {
        this.LLLFFI = z;
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1227));
        this.LLLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1231));
        this.LLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1241));
        this.LLLILZJ = System.currentTimeMillis();
        this.LLLLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1243));
        this.LLLLIILL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1239));
        this.LLLLIILLL = new C360660ECa() { // from class: X.0ECY
            @Override // X.C360660ECa, X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
                VideoAnimFragment videoAnimFragment;
                C360680ECc c360680ECc;
                String strLIZIZ;
                C360680ECc c360680ECc2 = this.LL.LLLILZ;
                if (c360680ECc2 != null && c360680ECc2.LIZIZ(i) != null && (c360680ECc = (videoAnimFragment = this.LL).LLLILZ) != null && (strLIZIZ = c360680ECc.LIZIZ(i)) != null) {
                    C366890EZz c366890EZzRT = videoAnimFragment.rT();
                    if (c366890EZzRT != null) {
                        c366890EZzRT.setSelectedAnimType(strLIZIZ);
                    }
                    videoAnimFragment.AT(strLIZIZ);
                }
            }
        };
        this.LLLLIL = new InterfaceC350420DoW() { // from class: X.0ECZ
            @Override // X.InterfaceC350420DoW
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC350420DoW
            public final void LIZ() {
                C366890EZz c366890EZzRT = this.LIZ.rT();
                VideoAnimFragment.DT(this.LIZ, null, (c366890EZzRT != null ? c366890EZzRT.getSelectedAnimType() : null) == null, 1);
            }
        };
        this.LLLLILI = new InterfaceC357170DzP() { // from class: X.0DzQ
            @Override // X.InterfaceC357170DzP
            public final void LIZJ(EnumC357140DzM enumC357140DzM) {
            }

            @Override // X.InterfaceC357170DzP
            public final void LIZIZ(EnumC357140DzM enumC357140DzM, boolean z2) {
                NLETrackSlot nLETrackSlotLLLLLLIL;
                String extra;
                String str;
                NLEResourceNode effectSDKVideoAnimation = null;
                VideoAnimFragment.DT(this.LIZ, null, false, 3);
                VideoAnimFragment videoAnimFragment = this.LIZ;
                C0E48 c0e48 = videoAnimFragment.LL;
                if (c0e48 != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null && nLETrackSlotLLLLLLIL.hasExtra("anim_type") && (extra = nLETrackSlotLLLLLLIL.getExtra("anim_type")) != null && !a0.LJJJIL(extra) && nLETrackSlotLLLLLLIL != null) {
                    if (extra == null) {
                        str = "";
                    } else {
                        str = extra;
                    }
                    NLEVideoAnimation nLEVideoAnimationLJIILL = C351220Dpo.LJIILL(nLETrackSlotLLLLLLIL, str);
                    if (nLEVideoAnimationLJIILL != null) {
                        NLESegmentVideoAnimation segment = nLEVideoAnimationLJIILL.getSegment();
                        if (segment != null) {
                            effectSDKVideoAnimation = segment.getEffectSDKVideoAnimation();
                        }
                        videoAnimFragment.CT(extra, C0E37.LIZIZ(effectSDKVideoAnimation));
                    }
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AT(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.ui.VideoAnimFragment.AT(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void PS(EnumC357140DzM enumC357140DzM) {
        VecNLETrackSPtr tracks;
        NLETrack next;
        NLETrackSlot next2;
        C0E48 c0e48 = this.LL;
        if (c0e48 != null && (tracks = C350870DpF.LJI(c0e48).getTracks()) != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (C351220Dpo.LLLLILI(next)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrack nLETrack = next;
            if (nLETrack != null && nLETrack.hasExtra("last_selected_anim_proxy_uuid")) {
                String extra = nLETrack.getExtra("last_selected_anim_proxy_uuid");
                Iterator<NLETrackSlot> it3 = nLETrack.getSlots().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (Intrinsics.LJFF(next2.getUUID(), extra)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                NLETrackSlot nLETrackSlot = next2;
                if (nLETrackSlot != null) {
                    C0E48 c0e482 = this.LL;
                    if (c0e482 != null) {
                        c0e482.S7().LIZIZ(new C358740E4q(nLETrackSlot, 0, null, false, 0, 254), "select_slot_event", false);
                    }
                    sT(nLETrackSlot);
                    return;
                }
            }
        }
        sT(null);
    }

    public final boolean jT(EnumC360750ECj enumC360750ECj) {
        NLEVideoAnimation next;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        VecNLEVideoAnimationSPtr videoAnims;
        NLETrackSlot nLETrackSlotLLLLLLIL2;
        VecNLEVideoAnimationSPtr videoAnims2;
        if (Intrinsics.LJFF(this.LLLIZZ, "combo_video_anim")) {
            return false;
        }
        C0E48 c0e48 = this.LL;
        NLEVideoAnimation nLEVideoAnimation = null;
        if (c0e48 != null && (nLETrackSlotLLLLLLIL2 = c0e48.LLLLLLIL()) != null && (videoAnims2 = nLETrackSlotLLLLLLIL2.getVideoAnims()) != null) {
            Iterator<NLEVideoAnimation> it2 = videoAnims2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (C351220Dpo.LLJJJJLIIL(next)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
        } else {
            next = null;
        }
        C0E48 c0e482 = this.LL;
        if (c0e482 != null && (nLETrackSlotLLLLLLIL = c0e482.LLLLLLIL()) != null && (videoAnims = nLETrackSlotLLLLLLIL.getVideoAnims()) != null) {
            Iterator<NLEVideoAnimation> it3 = videoAnims.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                NLEVideoAnimation next2 = it3.next();
                if (C351220Dpo.LLLIIII(next2)) {
                    nLEVideoAnimation = next2;
                    break;
                }
            }
        }
        if (enumC360750ECj == EnumC360750ECj.ENTER) {
            if (Intrinsics.LJFF(this.LLLIZZ, "out_video_anim")) {
                if (next == null || nLEVideoAnimation == null) {
                    return false;
                }
            } else if (next == null) {
                return false;
            }
        } else if (Intrinsics.LJFF(this.LLLIZZ, "in_video_anim")) {
            if (next == null || nLEVideoAnimation == null) {
                return false;
            }
        } else if (nLEVideoAnimation == null) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        InterfaceC358840E5a interfaceC358840E5aBo;
        ViewPager viewPager;
        int iIntValue;
        int iIntValue2;
        int i;
        Integer num;
        super.onActivityCreated(bundle);
        if (C0E47.LIZ()) {
            C360680ECc c360680ECc = this.LLLILZ;
            if (c360680ECc != null) {
                c360680ECc.setOnStartFetchCategory(new AwS549S0100000_5(this, 1233));
                c360680ECc.setOnInitFinishListener(new AwS441S0200000_5(this, c360680ECc, 10));
                c360680ECc.setMultiPageViewProvider(new C0ECS(this, c360680ECc));
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eg, c360680ECc.getContext());
                int iIntValue3 = -1;
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -1;
                }
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, c360680ECc.getContext());
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                } else {
                    iIntValue2 = -1;
                }
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ee, c360680ECc.getContext());
                if (numLIZJ3 != null) {
                    iIntValue3 = numLIZJ3.intValue();
                }
                if (vT()) {
                    i = 52;
                } else {
                    i = 54;
                }
                if (C357780E0y.LIZ()) {
                    num = 42;
                } else {
                    num = null;
                }
                c360680ECc.LJ(new C362490EJb("editor_pro_video_anim", false, 0, null, 0, 0, i, Integer.valueOf(iIntValue3), iIntValue, num, iIntValue2, true, false, false, null, false, false, true, false, new AwS619S0100000_5(c360680ECc, 58), 469721532));
                C0EJZ resourceMultiTab = c360680ECc.getResourceMultiTab();
                if (resourceMultiTab != null) {
                    resourceMultiTab.setOnTabSelected(new AwS371S0200000_5(this, c360680ECc, 239));
                }
            }
            if (vT()) {
                C360680ECc c360680ECc2 = this.LLLILZ;
                if (c360680ECc2 != null && (viewPager = c360680ECc2.getViewPager()) != null) {
                    viewPager.addOnPageChangeListener(this.LLLLIILLL);
                }
                C366890EZz c366890EZzRT = rT();
                if (c366890EZzRT != null) {
                    c366890EZzRT.setOnTimeChanged(new C0FXL(this, 4));
                }
                C366890EZz c366890EZzRT2 = rT();
                if (c366890EZzRT2 != null) {
                    c366890EZzRT2.setOnStartTouch(new AwS549S0100000_5(this, 1235));
                }
                C366890EZz c366890EZzRT3 = rT();
                if (c366890EZzRT3 != null) {
                    c366890EZzRT3.setOnEndTouch(new AwS584S0100000_5(this, 971));
                }
                C366890EZz c366890EZzRT4 = rT();
                if (c366890EZzRT4 != null) {
                    c366890EZzRT4.setOnDragingTypeChange(new AwS584S0100000_5(this, 972));
                }
                C366890EZz c366890EZzRT5 = rT();
                if (c366890EZzRT5 != null) {
                    c366890EZzRT5.setOnCheckDrawEnable(new C354340Duq(this));
                }
                C0E48 c0e48 = this.LL;
                if (c0e48 != null && (interfaceC358840E5aBo = c0e48.Bo()) != null) {
                    interfaceC358840E5aBo.LIZLLL(this.LLLLILI);
                }
                C350440DoY.LIZ(this.LLLLIL);
            }
        }
    }

    public final void sT(NLETrackSlot nLETrackSlot) {
        ViewPager viewPager;
        Unit unit;
        SparseArray<C0EBW> sparseArray;
        C0EDF c0edf;
        int currentItem = 0;
        if (nLETrackSlot != null) {
            if (C351220Dpo.LLLLIL(nLETrackSlot)) {
                String strLJIIZILJ = C351220Dpo.LJIIZILJ(nLETrackSlot);
                C360680ECc c360680ECc = this.LLLILZ;
                if (c360680ECc != null) {
                    int i = 0;
                    for (C357590E0f c357590E0f : c360680ECc.getCategoryList()) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            if (Intrinsics.LJFF(c357590E0f.LIZIZ, strLJIIZILJ)) {
                                AbstractC360710ECf.LJI(c360680ECc, i);
                                this.LLLIZZ = strLJIIZILJ;
                                C0ECW pageAdapter = c360680ECc.getPageAdapter();
                                if (pageAdapter != null && (sparseArray = pageAdapter.LLILZ) != null) {
                                    C0EBW c0ebw = sparseArray.get(i);
                                    if (c0ebw == null) {
                                        c0ebw = null;
                                    }
                                    C0EBW c0ebw2 = c0ebw;
                                    if (c0ebw2 != null && (c0ebw2 instanceof C0EBQ)) {
                                        C0EBQ c0ebq = (C0EBQ) c0ebw2;
                                        if (Intrinsics.LJFF(c0ebq.LJ, strLJIIZILJ)) {
                                            c0ebq.LJIIJJI = true;
                                            String strLJIILLIIL = C351220Dpo.LJIILLIIL(nLETrackSlot);
                                            if (strLJIILLIIL != null && (c0edf = c0ebq.LJII) != null) {
                                                C0EDF.LJIIL(c0edf, strLJIILLIIL, C0E17.DIRECT_SCROLL, 8);
                                            }
                                        }
                                    }
                                }
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    unit = Unit.LIZ;
                }
            } else {
                uT(nLETrackSlot);
                unit = Unit.LIZ;
            }
            if (unit != null) {
                return;
            }
        }
        C360680ECc c360680ECc2 = this.LLLILZ;
        if (c360680ECc2 != null && (viewPager = c360680ECc2.getViewPager()) != null) {
            currentItem = viewPager.getCurrentItem();
        }
        xT(this.LLLILZ, currentItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uT(com.bytedance.ies.nle.editor_jni.NLETrackSlot r9) {
        /*
            r8 = this;
            boolean r0 = X.C351220Dpo.LLIIJI(r9)
            r4 = 2
            r3 = 0
            if (r0 == 0) goto L53
            com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr r2 = r9.getVideoAnims()
            r7 = 0
            if (r2 == 0) goto L4e
            Y.AComparatorS24S0000000_5 r1 = new Y.AComparatorS24S0000000_5
            r0 = 28
            r1.<init>(r0)
            java.util.List r0 = X.C13LP.LJLLLL(r1, r2)
            if (r0 == 0) goto L4e
            java.lang.Object r6 = X.C13LP.LJJJLL(r0)
            com.bytedance.ies.nle.editor_jni.NLEVideoAnimation r6 = (com.bytedance.ies.nle.editor_jni.NLEVideoAnimation) r6
            if (r6 == 0) goto L4f
            java.lang.String r5 = X.C351220Dpo.LJIJ(r6)
        L28:
            X.0ECc r0 = r8.LLLILZ
            if (r0 == 0) goto L51
            java.util.ArrayList r0 = r0.getCategoryList()
            if (r0 == 0) goto L51
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L37:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r2.next()
            X.0E0f r0 = (X.C357590E0f) r0
            java.lang.String r0 = r0.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 != 0) goto L67
            int r1 = r1 + 1
            goto L37
        L4e:
            r6 = r7
        L4f:
            r5 = r7
            goto L28
        L51:
            r2 = r7
            goto L6b
        L53:
            X.0ECc r1 = r8.LLLILZ
            if (r1 == 0) goto L9c
            int r0 = r8.nT()
            r8.xT(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            DT(r8, r0, r3, r4)
            return
        L66:
            r1 = -1
        L67:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L6b:
            if (r6 == 0) goto L7f
            com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation r0 = r6.getSegment()
            if (r0 == 0) goto L7f
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r1 = r0.getEffectSDKVideoAnimation()
            if (r1 == 0) goto L7f
            java.lang.String r0 = "biz_res_id"
            java.lang.String r7 = r1.getExtra(r0)
        L7f:
            boolean r0 = X.C2105908Mv.LIZ(r7)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9f
            r0 = r1
        L88:
            r8.CT(r5, r0)
            if (r5 == 0) goto L9d
            X.0EZz r0 = r8.rT()
            if (r0 == 0) goto L96
            r0.setSelectedAnimType(r5)
        L96:
            r8.AT(r5)
            DT(r8, r2, r3, r4)
        L9c:
            return
        L9d:
            r5 = r1
            goto L96
        L9f:
            java.lang.String r0 = X.C0E37.LIZ(r7)
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.ui.VideoAnimFragment.uT(com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }

    public /* synthetic */ VideoAnimFragment(String str, int i) {
        this((i & 1) != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CT(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            X.0ECc r5 = r8.LLLILZ
            if (r5 == 0) goto La4
            java.util.ArrayList r0 = r5.getCategoryList()
            java.util.Iterator r7 = r0.iterator()
            r4 = 0
        Ld:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r0 = r7.next()
            int r6 = r4 + 1
            r3 = 0
            if (r4 < 0) goto La0
            X.0E0f r0 = (X.C357590E0f) r0
            java.lang.String r0 = r0.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r9)
            if (r0 == 0) goto L9d
            X.AbstractC360710ECf.LJI(r5, r4)
            r8.LLLIZZ = r9
            X.0EJZ r2 = r5.getResourceMultiTab()
            r1 = 1
            if (r2 == 0) goto L39
            if (r9 != 0) goto L97
            java.lang.String r0 = "in_video_anim"
        L36:
            r2.LJ(r0, r1)
        L39:
            X.0ECW r0 = r5.getPageAdapter()
            if (r0 == 0) goto L9d
            android.util.SparseArray<X.0EBW> r0 = r0.LLILZ
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L4a
            r3 = r0
        L4a:
            X.0EBW r3 = (X.C0EBW) r3
            if (r3 == 0) goto L9d
            boolean r0 = r3 instanceof X.C0EBQ
            if (r0 == 0) goto L9d
            X.0EBQ r3 = (X.C0EBQ) r3
            java.lang.String r0 = r3.LJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r9)
            if (r0 == 0) goto L9d
            r3.LJIIJJI = r1
            if (r10 == 0) goto L71
            X.0EDF r2 = r3.LJII
            if (r2 == 0) goto L6b
            X.0E17 r1 = X.C0E17.DIRECT_SCROLL
            r0 = 8
            X.C0EDF.LJIIL(r2, r10, r1, r0)
        L6b:
            int r0 = r10.length()
            if (r0 != 0) goto L9d
        L71:
            X.0ECc r4 = r8.LLLILZ
            if (r4 == 0) goto L9d
            java.util.ArrayList r0 = r4.getCategoryList()
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L7e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r0 = r3.next()
            X.0E0f r0 = (X.C357590E0f) r0
            java.lang.String r1 = r0.LIZIZ
            java.lang.String r0 = r8.LLLIZZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L9a
            int r2 = r2 + 1
            goto L7e
        L97:
            r0 = r9
            goto L36
        L99:
            r2 = -1
        L9a:
            r8.xT(r4, r2)
        L9d:
            r4 = r6
            goto Ld
        La0:
            X.C1697810uHb.LJIJI()
            throw r3
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.ui.VideoAnimFragment.CT(java.lang.String, java.lang.String):void");
    }

    public final String kT(float f, boolean z) {
        Object objValueOf;
        double d = ((double) f) / 1000.0d;
        Float fValueOf = Float.valueOf(0.0f);
        if (d < 1.0E-4d) {
            objValueOf = fValueOf;
        } else if (d < 0.1d) {
            objValueOf = Double.valueOf(0.1d);
        } else {
            objValueOf = Double.valueOf(d);
        }
        if (Intrinsics.LJFF(objValueOf, fValueOf)) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        String strJ4 = C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{objValueOf}, 1));
        if (!z) {
            return strJ4;
        }
        return getString(2131834010, strJ4);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0301  */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, com.ss.ugc.android.editor.bottom.panel.BasePanelFragment, com.ss.ugc.android.editor.bottom.panel.EditorContextFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.ui.VideoAnimFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void xT(C360680ECc c360680ECc, int i) {
        C0ECW pageAdapter;
        SparseArray<C0EBW> sparseArray;
        C0EJZ resourceMultiTab;
        if (c360680ECc != null && (pageAdapter = c360680ECc.getPageAdapter()) != null && (sparseArray = pageAdapter.LLILZ) != null) {
            C0EBW c0ebw = sparseArray.get(i);
            if (c0ebw == null) {
                c0ebw = null;
            }
            C0EBW c0ebw2 = c0ebw;
            if (c0ebw2 != null && (c0ebw2 instanceof C0EBQ)) {
                C0EBQ c0ebq = (C0EBQ) c0ebw2;
                this.LLLIZZ = c0ebq.LJ;
                C360680ECc c360680ECc2 = this.LLLILZ;
                if (c360680ECc2 != null && (resourceMultiTab = c360680ECc2.getResourceMultiTab()) != null) {
                    String str = this.LLLIZZ;
                    if (str == null) {
                        str = "in_video_anim";
                    }
                    resourceMultiTab.LJ(str, true);
                }
                C0EDF c0edf = c0ebq.LJII;
                if (c0edf != null) {
                    C0EDF.LJIIJ(c0edf, "", C0E17.DIRECT_SCROLL, 2);
                }
            }
        }
    }

    public final void zT(final long j, final long j2) {
        long duration;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48 = this.LL;
        if (c0e48 != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null) {
            duration = nLETrackSlotLLLLLLIL.getDuration();
        } else {
            duration = 0;
        }
        float fLLLLLLL = C351220Dpo.LLLLLLL(duration);
        View viewLT = lT();
        if (viewLT != null) {
            textView = (TextView) viewLT.findViewById(R.id.b3v);
        } else {
            textView = null;
        }
        if (textView != null) {
            String strKT = kT(fLLLLLLL, true);
            final String string = getString(2131834010, "");
            TextPaint paint = textView.getPaint();
            final float fMeasureText = paint.measureText(strKT);
            final float fMeasureText2 = paint.measureText(string);
            View viewLT2 = lT();
            if (viewLT2 != null) {
                HandlerHook.viewPost(viewLT2, new Runnable(fMeasureText2, fMeasureText, string, j, j2) { // from class: X.0ECV
                    public final /* synthetic */ float LLILLJJLI;
                    public final /* synthetic */ float LLILLL;
                    public final /* synthetic */ String LLILZ;

                    public final void LIZ() {
                        View viewFindViewById;
                        ViewGroup.LayoutParams layoutParams;
                        View viewFindViewById2;
                        ViewGroup.LayoutParams layoutParams2;
                        View viewFindViewById3;
                        ViewGroup.LayoutParams layoutParams3;
                        View viewFindViewById4;
                        ViewGroup.LayoutParams layoutParams4;
                        TextView textView6;
                        TextView textView7;
                        TextView textView8;
                        TextView textView9;
                        TextView textView10;
                        TextView textView11;
                        TextPaint paint2;
                        TextView textView12;
                        TextView textView13;
                        float measuredWidth = (this.LL.lT() != null ? r0.getMeasuredWidth() : 0) * (1.0f - (this.LLILLJJLI / this.LLILLL));
                        float measuredWidth2 = (this.LL.lT() != null ? r0.getMeasuredWidth() : 0) * (this.LLILLJJLI / this.LLILLL);
                        View viewMT = this.LL.mT();
                        if (viewMT != null && (textView13 = (TextView) viewMT.findViewById(R.id.b3t)) != null) {
                            textView13.setText(this.LLILZ);
                        }
                        View viewLT3 = this.LL.lT();
                        if (viewLT3 != null && (textView12 = (TextView) viewLT3.findViewById(R.id.b3t)) != null) {
                            textView12.setText(this.LLILZ);
                        }
                        View viewMT2 = this.LL.mT();
                        if (viewMT2 != null && (textView6 = (TextView) viewMT2.findViewById(R.id.b3u)) != null) {
                            VideoAnimFragment videoAnimFragment = this.LL;
                            float textSize = textView6.getPaint().getTextSize();
                            View viewLT4 = videoAnimFragment.lT();
                            float fMin = Math.min(textSize, (viewLT4 == null || (textView11 = (TextView) viewLT4.findViewById(R.id.b3t)) == null || (paint2 = textView11.getPaint()) == null) ? textSize : paint2.getTextSize());
                            View viewLT5 = videoAnimFragment.lT();
                            if (viewLT5 != null && (textView10 = (TextView) viewLT5.findViewById(R.id.b3u)) != null) {
                                textView10.setTextSize(fMin);
                            }
                            View viewMT3 = videoAnimFragment.mT();
                            if (viewMT3 != null && (textView9 = (TextView) viewMT3.findViewById(R.id.b3u)) != null) {
                                textView9.setTextSize(fMin);
                            }
                            View viewLT6 = videoAnimFragment.lT();
                            if (viewLT6 != null && (textView8 = (TextView) viewLT6.findViewById(R.id.b3t)) != null) {
                                textView8.setTextSize(fMin);
                            }
                            View viewMT4 = videoAnimFragment.mT();
                            if (viewMT4 != null && (textView7 = (TextView) viewMT4.findViewById(R.id.b3t)) != null) {
                                textView7.setTextSize(fMin);
                            }
                        }
                        View viewLT7 = this.LL.lT();
                        if (viewLT7 != null && (viewFindViewById4 = viewLT7.findViewById(R.id.b3u)) != null && (layoutParams4 = viewFindViewById4.getLayoutParams()) != null) {
                            layoutParams4.width = (int) measuredWidth;
                        }
                        View viewMT5 = this.LL.mT();
                        if (viewMT5 != null && (viewFindViewById3 = viewMT5.findViewById(R.id.b3u)) != null && (layoutParams3 = viewFindViewById3.getLayoutParams()) != null) {
                            layoutParams3.width = (int) measuredWidth;
                        }
                        View viewLT8 = this.LL.lT();
                        if (viewLT8 != null && (viewFindViewById2 = viewLT8.findViewById(R.id.b3t)) != null && (layoutParams2 = viewFindViewById2.getLayoutParams()) != null) {
                            layoutParams2.width = (int) measuredWidth2;
                        }
                        View viewMT6 = this.LL.mT();
                        if (viewMT6 != null && (viewFindViewById = viewMT6.findViewById(R.id.b3t)) != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
                            layoutParams.width = (int) measuredWidth2;
                        }
                        VideoAnimFragment videoAnimFragment2 = this.LL;
                        View viewLT9 = videoAnimFragment2.lT();
                        if (viewLT9 != null) {
                            HandlerHook.viewPost(viewLT9, new ARunnableS105S0100000_5(videoAnimFragment2, 109));
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("VideoAnimFragment@c9a3.setAnimDuration$1$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("VideoAnimFragment@c9a3.setAnimDuration$1$1");
                    }
                });
            }
        }
        if (j >= 0) {
            View viewLT3 = lT();
            if (viewLT3 != null) {
                C368610Ecl.LIZJ(viewLT3);
            }
            float fLLLLLLL2 = C351220Dpo.LLLLLLL(j);
            View viewLT4 = lT();
            if (viewLT4 != null && (textView5 = (TextView) viewLT4.findViewById(R.id.b3u)) != null) {
                textView5.setText(kT(fLLLLLLL2, false));
            }
        } else {
            View viewLT5 = lT();
            if (viewLT5 != null) {
                C368610Ecl.LIZIZ(viewLT5);
            }
            View viewLT6 = lT();
            if (viewLT6 != null && (textView2 = (TextView) viewLT6.findViewById(R.id.b3u)) != null) {
                textView2.setText("");
            }
        }
        if (j2 >= 0) {
            View viewMT = mT();
            if (viewMT != null) {
                C368610Ecl.LIZJ(viewMT);
            }
            float fLLLLLLL3 = C351220Dpo.LLLLLLL(j2);
            View viewMT2 = mT();
            if (viewMT2 != null && (textView4 = (TextView) viewMT2.findViewById(R.id.b3u)) != null) {
                textView4.setText(kT(fLLLLLLL3, false));
                return;
            }
            return;
        }
        View viewMT3 = mT();
        if (viewMT3 != null) {
            C368610Ecl.LIZIZ(viewMT3);
        }
        View viewMT4 = mT();
        if (viewMT4 == null || (textView3 = (TextView) viewMT4.findViewById(R.id.b3u)) == null) {
            return;
        }
        textView3.setText("");
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.ugc.android.editor.bottom.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (viewOnCreateView != null) {
            ViewGroup viewGroup2 = (ViewGroup) viewOnCreateView.findViewById(R.id.gtx);
            this.LLLILZ = new C360680ECc(viewOnCreateView.getContext());
            C360680ECc c360680ECc = this.LLLILZ;
            if (c360680ECc != null) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c360680ECc);
                c360680ECc.setLayoutParams(layoutParams3);
            }
            if (!vT()) {
                C360680ECc c360680ECc2 = this.LLLILZ;
                if (c360680ECc2 != null && viewGroup2 != null) {
                    viewGroup2.addView(c360680ECc2, 0);
                }
            } else {
                C360680ECc c360680ECc3 = this.LLLILZ;
                if (c360680ECc3 != null) {
                    layoutParams = c360680ECc3.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                } else {
                    layoutParams2 = null;
                }
                if (layoutParams2 != null) {
                    layoutParams2.addRule(2, R.id.video_anim_res_container);
                }
                ViewGroup viewGroup3 = (ViewGroup) viewOnCreateView.findViewById(R.id.video_anim_res_container);
                if (viewGroup3 != null) {
                    C368610Ecl.LIZJ(viewGroup3);
                }
                C360680ECc c360680ECc4 = this.LLLILZ;
                if (c360680ECc4 != null && viewGroup3 != null) {
                    viewGroup3.addView(c360680ECc4, 0);
                }
            }
        }
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }

    public static void DT(VideoAnimFragment videoAnimFragment, Integer num, boolean z, int i) {
        TextView textView;
        TextView textView2;
        int iNT;
        C366890EZz c366890EZzRT;
        C366890EZz c366890EZzRT2;
        String strLIZIZ = null;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        C0E48 c0e48 = videoAnimFragment.LL;
        if (c0e48 != null) {
            NLETrack nLETrackPt = c0e48.Pt();
            C366890EZz c366890EZzRT3 = videoAnimFragment.rT();
            if (c366890EZzRT3 != null) {
                c366890EZzRT3.setEnterTime(null);
            }
            C366890EZz c366890EZzRT4 = videoAnimFragment.rT();
            if (c366890EZzRT4 != null) {
                c366890EZzRT4.setExitTime(null);
            }
            C366890EZz c366890EZzRT5 = videoAnimFragment.rT();
            if (c366890EZzRT5 != null) {
                c366890EZzRT5.setComboTime(null);
            }
            NLETrackSlot nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
            if (nLETrackSlotLLLLLLIL != null) {
                if (C351220Dpo.LLIIJI(nLETrackSlotLLLLLLIL)) {
                    C366890EZz c366890EZzRT6 = videoAnimFragment.rT();
                    if (c366890EZzRT6 != null) {
                        C368610Ecl.LIZJ(c366890EZzRT6);
                    }
                    VecNLEVideoAnimationSPtr videoAnims = nLETrackSlotLLLLLLIL.getVideoAnims();
                    if (videoAnims != null) {
                        for (NLEVideoAnimation nLEVideoAnimation : videoAnims) {
                            C351510DqH.LIZ.getClass();
                            float fLJJIIZI = C351510DqH.LJJIIZI(nLETrackSlotLLLLLLIL) - C351510DqH.LJJIJ(nLETrackPt, nLETrackSlotLLLLLLIL);
                            float startTime = ((nLEVideoAnimation.getStartTime() - r11) * 1.0f) / fLJJIIZI;
                            float endTime = ((nLEVideoAnimation.getEndTime() - r11) * 1.0f) / fLJJIIZI;
                            if (C351220Dpo.LLJJJJLIIL(nLEVideoAnimation)) {
                                C366890EZz c366890EZzRT7 = videoAnimFragment.rT();
                                if (c366890EZzRT7 != null) {
                                    c366890EZzRT7.setEnterTime(new C0ECX(startTime, endTime));
                                }
                            } else if (C351220Dpo.LLLIIII(nLEVideoAnimation)) {
                                C366890EZz c366890EZzRT8 = videoAnimFragment.rT();
                                if (c366890EZzRT8 != null) {
                                    c366890EZzRT8.setExitTime(new C0ECX(startTime, endTime));
                                }
                            } else if (C351220Dpo.LLJIJIL(nLEVideoAnimation) && (c366890EZzRT2 = videoAnimFragment.rT()) != null) {
                                c366890EZzRT2.setComboTime(new C0ECX(startTime, endTime));
                            }
                        }
                    }
                    if (num != null && num.intValue() >= 0) {
                        iNT = num.intValue();
                    } else {
                        iNT = videoAnimFragment.nT();
                    }
                    C360680ECc c360680ECc = videoAnimFragment.LLLILZ;
                    if (c360680ECc != null) {
                        strLIZIZ = c360680ECc.LIZIZ(iNT);
                    }
                    if (C1533950q1J.LJ(strLIZIZ)) {
                        if (z && strLIZIZ != null && (c366890EZzRT = videoAnimFragment.rT()) != null) {
                            c366890EZzRT.setSelectedAnimType(strLIZIZ);
                        }
                        videoAnimFragment.AT(strLIZIZ);
                        return;
                    }
                    C201955140j.LIZIZ("updateSeekBar", "key is null");
                    return;
                }
                View viewLT = videoAnimFragment.lT();
                if (viewLT != null) {
                    C368610Ecl.LIZIZ(viewLT);
                }
                View viewMT = videoAnimFragment.mT();
                if (viewMT != null) {
                    C368610Ecl.LIZIZ(viewMT);
                }
                View viewLT2 = videoAnimFragment.lT();
                if (viewLT2 != null && (textView2 = (TextView) viewLT2.findViewById(R.id.b3u)) != null) {
                    textView2.setText("");
                }
                View viewMT2 = videoAnimFragment.mT();
                if (viewMT2 != null && (textView = (TextView) viewMT2.findViewById(R.id.b3u)) != null) {
                    textView.setText("");
                }
                C366890EZz c366890EZzRT9 = videoAnimFragment.rT();
                if (c366890EZzRT9 != null) {
                    C368610Ecl.LIZIZ(c366890EZzRT9);
                }
            }
        }
    }
}
