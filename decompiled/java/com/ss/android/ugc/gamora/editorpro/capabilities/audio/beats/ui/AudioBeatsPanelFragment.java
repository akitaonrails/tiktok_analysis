package com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.ui;

import X.AnonymousClass0956;
import X.C01GW;
import X.C08XD;
import X.C0E47;
import X.C0E48;
import X.C0E55;
import X.C0E5S;
import X.C0EB4;
import X.C0EBE;
import X.C0EG9;
import X.C0ES3;
import X.C0FU0;
import X.C0LAB;
import X.C1383370m6R;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13BV;
import X.C13LP;
import X.C1402900mbw;
import X.C1664600tQ2;
import X.C1669670tYD;
import X.C1685760tyA;
import X.C197039127h;
import X.C19719212De;
import X.C19A3;
import X.C1DRG;
import X.C20684815ws;
import X.C21411818qq;
import X.C23250099c;
import X.C297750Bll;
import X.C350870DpF;
import X.C351220Dpo;
import X.C352310DrZ;
import X.C355890DxL;
import X.C357660E0m;
import X.C357780E0y;
import X.C358570E3z;
import X.C359160E6g;
import X.C361680EFy;
import X.C363750ENx;
import X.C364210EPr;
import X.C368140Ec0;
import X.C369610EeN;
import X.C371210Egx;
import X.C452501pT;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC1427810nG7;
import X.EnumC357140DzM;
import X.EnumC360830ECr;
import X.EnumC373450EkZ;
import X.InterfaceC1685750ty9;
import X.InterfaceC355180DwC;
import X.InterfaceC360800ECo;
import X.InterfaceC360810ECp;
import X.InterfaceC360860ECu;
import X.InterfaceC364230EPt;
import X.InterfaceC371250Eh1;
import X.InterfaceC373530Ekh;
import Y.ACListenerS140S0100000_5;
import Y.AComparatorS24S0000000_5;
import Y.ARunnableS16S0101000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.ui.AudioBeatsPanelFragment;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class AudioBeatsPanelFragment extends TTResourcePanelFragment<CutViewModel> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9KyQ8KC06JCHELIOSw4ICogZiQ5LSY8ZicpKDsgZjAlZw4mLCwjCyoyPDYcKCE2JAM+KCg+LSs4";
    public C371210Egx LLLFFI;
    public C21411818qq LLLFZ;
    public C197039127h LLLI;
    public C197039127h LLLII;
    public C197039127h LLLIIII;
    public C368140Ec0 LLLIIIIL;
    public FrameLayout LLLIIIL;
    public FrameLayout LLLIIL;
    public FrameLayout LLLIILIL;
    public InterfaceC360800ECo LLLILZ;
    public C0E5S LLLILZJ;
    public int LLLIZZ;
    public int LLLJ;
    public int LLLJIL;
    public NLETrackSlot LLLLII;
    public boolean LLLLIIIILLL;
    public boolean LLLLIIL;
    public boolean LLLLIILL;
    public boolean LLLLIILLL;
    public AnonymousClass0956 LLLLIL;
    public boolean LLLLILI;
    public boolean LLLLJ;
    public C358570E3z LLLLJI;
    public final C01GW LLLIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(118));
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 380));
    public final List<BeatInfo> LLLJL = new ArrayList();
    public List<BeatInfo> LLLL = new ArrayList();
    public final C01GW LLLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 381));
    public final C01GW LLLLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 382));

    public final void LJIIL() {
        this.LLLLIIL = false;
        cS().setEnabled(true);
        sT().setLoading(false);
        nT().setEnabled(true);
        FrameLayout frameLayoutQT = qT();
        if (frameLayoutQT != null) {
            frameLayoutQT.setEnabled(true);
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void PS(EnumC357140DzM enumC357140DzM) {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final String qS() {
        return "audio_beats";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void HS() {
        if (C357660E0m.LJFF(this.LLLLII, this.LLLJL)) {
            Context context = getContext();
            if (context != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJI(getString(2131827297));
                c1397580mTM.LIZIZ(getString(2131827294));
                C985403tE.LIZ(c1397580mTM, new AwS584S0100000_5(this, 339));
                c1397580mTM.LJII = false;
                new C1397510mTF(c1397580mTM).LIZLLL();
                return;
            }
            return;
        }
        lT();
        if (this.LLLLIIL) {
            InterfaceC355180DwC interfaceC355180DwC = (InterfaceC355180DwC) this.LLLLL.getValue();
            if (interfaceC355180DwC != null) {
                interfaceC355180DwC.hb();
            }
            LJIIL();
        }
        VideoPublishEditModel videoPublishEditModelZS = ZS();
        if (videoPublishEditModelZS != null) {
            C20684815ws.LJIILLIIL("click_cancel_beat", C1402900mbw.LIZIZ(videoPublishEditModelZS).LIZ);
        }
        super.HS();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final ViewModel QS() {
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        return C364210EPr.LIZIZ(CutViewModel.class);
    }

    public final InterfaceC360810ECp mT() {
        return (InterfaceC360810ECp) this.LLLILZLLLI.getValue();
    }

    public final C197039127h nT() {
        View viewFindViewById = this.LLLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cmp) : null;
            this.LLLI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h oT() {
        View viewFindViewById = this.LLLIIII;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cqn) : null;
            this.LLLIIII = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h pT() {
        View viewFindViewById = this.LLLII;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cqq) : null;
            this.LLLII = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final FrameLayout qT() {
        View viewFindViewById = this.LLLIILIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.pp_) : null;
            this.LLLIILIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final FrameLayout rT() {
        View viewFindViewById = this.LLLIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ppc) : null;
            this.LLLIIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C21411818qq sT() {
        View viewFindViewById = this.LLLFZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wtq) : null;
            this.LLLFZ = (C21411818qq) viewFindViewById;
        }
        return (C21411818qq) viewFindViewById;
    }

    public final int uT() {
        C0E55 player;
        C0E48 c0e48 = this.LL;
        long jJh = (c0e48 == null || (player = c0e48.getPlayer()) == null) ? 0L : player.Jh();
        int i = this.LLLIZZ;
        if (jJh - ((long) i) < 0) {
            return 0;
        }
        return (int) (jJh - ((long) i));
    }

    public final InterfaceC360860ECu vT() {
        return (InterfaceC360860ECu) this.LLLLLIL.getValue();
    }

    public final boolean zT() {
        C0E55 player;
        C0E48 c0e48 = this.LL;
        return ((long) ((this.LLLIZZ + this.LLLJIL) - this.LLLJ)) - ((c0e48 == null || (player = c0e48.getPlayer()) == null) ? 0L : player.Jh()) < 30;
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final int RR() {
        return C357780E0y.LIZ() ? R.layout.c1_ : R.layout.c19;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLFFI = null;
        this.LLLFZ = null;
        this.LLLI = null;
        this.LLLII = null;
        this.LLLIIII = null;
        this.LLLIIIIL = null;
        this.LLLIIIL = null;
        this.LLLIIL = null;
        this.LLLIILIL = null;
    }

    public final void lT() {
        NLEEditor nLEEditorLJI;
        mT().setBeats(C13BV.INSTANCE);
        mT().setListener(null);
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            c0e48.S7().LIZIZ(Boolean.FALSE, "is_showing_beats_panel", false);
        }
        InterfaceC360800ECo interfaceC360800ECo = this.LLLILZ;
        if (interfaceC360800ECo != null) {
            C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.FULL_SCREEN}, null, Boolean.TRUE, null, null, 26);
        }
        C0E48 c0e482 = this.LL;
        if (c0e482 == null || (nLEEditorLJI = c0e482.LLFII().LJI()) == null) {
            return;
        }
        nLEEditorLJI.resetHead();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC360800ECo interfaceC360800ECo;
        NLEEditor nLEEditorLJI;
        super.onDestroyView();
        C0E48 c0e48 = this.LL;
        if (c0e48 != null && (nLEEditorLJI = c0e48.LLFII().LJI()) != null) {
            nLEEditorLJI.resetHead();
        }
        clearFromXmlViewCache();
        C358570E3z c358570E3z = this.LLLLJI;
        if (c358570E3z != null && (interfaceC360800ECo = this.LLLILZ) != null) {
            interfaceC360800ECo.J40(c358570E3z);
        }
        InterfaceC360800ECo interfaceC360800ECo2 = this.LLLILZ;
        if (interfaceC360800ECo2 != null) {
            interfaceC360800ECo2.Fi2();
        }
    }

    public final void AT(boolean z) {
        boolean z2;
        List listLIZIZ = vT().LIZIZ(requireActivity(), z);
        if (listLIZIZ != null) {
            ((ArrayList) this.LLLJL).clear();
            ((ArrayList) this.LLLJL).addAll(listLIZIZ);
            mT().setBeats(listLIZIZ);
        }
        List<BeatInfo> list = this.LLLJL;
        if ((list instanceof Collection) && ((ArrayList) list).isEmpty()) {
            z2 = false;
        } else {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                z2 = true;
                if (((BeatInfo) it2.next()).beatSource == 1) {
                    break;
                }
            }
            z2 = false;
        }
        this.LLLLIILL = z2;
        sT().setChecked(this.LLLLIILL);
        CT(false);
    }

    public final void CT(boolean z) {
        C197039127h c197039127hPT = pT();
        if (c197039127hPT != null) {
            c197039127hPT.setEnabled(mT().LIZLLL());
        }
        C197039127h c197039127hOT = oT();
        if (c197039127hOT != null) {
            c197039127hOT.setEnabled(mT().LJI());
        }
        if (!z) {
            if (((ArrayList) this.LLLJL).isEmpty()) {
                FrameLayout frameLayoutRT = rT();
                if (frameLayoutRT != null) {
                    frameLayoutRT.setEnabled(false);
                }
                FrameLayout frameLayoutRT2 = rT();
                if (frameLayoutRT2 != null) {
                    C786410Ut5.U4(frameLayoutRT2, 0.34f);
                    return;
                }
                return;
            }
            FrameLayout frameLayoutRT3 = rT();
            if (frameLayoutRT3 != null) {
                frameLayoutRT3.setEnabled(true);
            }
            FrameLayout frameLayoutRT4 = rT();
            if (frameLayoutRT4 == null) {
                return;
            }
            C786410Ut5.U4(frameLayoutRT4, 1.0f);
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void JS(boolean z) {
        String str;
        if (!z) {
            return;
        }
        VideoPublishEditModel videoPublishEditModelZS = ZS();
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (videoPublishEditModelZS != null) {
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelZS, this.LL, new Pair(-1, -1));
            if (videoPublishEditModelZS.creativeModel.pugcTemplateData.isFromCreateTemplate) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLJFF.LJ("is_from_create_template", str);
            c0labLJFF.LJ("is_editor_pro", "1");
            C20684815ws.LJIILLIIL("save_beats", c0labLJFF.LIZ);
        }
        List listLJ = C357660E0m.LJ(this.LLLLII, this.LLLJL);
        boolean z2 = false;
        if (this.LLLLIILLL) {
            if (C357660E0m.LJFF(this.LLLLII, this.LLLJL)) {
                Context context = getContext();
                if (context != null) {
                    C1397580mTM c1397580mTM = new C1397580mTM(context);
                    c1397580mTM.LJI(getString(2131827300));
                    c1397580mTM.LIZIZ(getString(2131827298));
                    C985403tE.LIZ(c1397580mTM, new AwS371S0200000_5(this, (AudioBeatsPanelFragment) listLJ, (List<BeatInfo>) 65));
                    c1397580mTM.LJII = false;
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    VideoPublishEditModel videoPublishEditModelZS2 = ZS();
                    if (videoPublishEditModelZS2 != null) {
                        C0LAB c0labLJFF2 = C361680EFy.LJFF(-1L, videoPublishEditModelZS2, this.LL, new Pair(-1, -1));
                        if (videoPublishEditModelZS2.creativeModel.pugcTemplateData.isFromCreateTemplate) {
                            str2 = "1";
                        }
                        c0labLJFF2.LJ("is_from_create_template", str2);
                        c0labLJFF2.LJ("is_editor_pro", "1");
                        C20684815ws.LJIILLIIL("update_sound_sync_window_show", c0labLJFF2.LIZ);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        lT();
        List<BeatInfo> list = this.LLLJL;
        NLETrackSlot nLETrackSlot = this.LLLLII;
        C0E48 c0e48 = this.LL;
        if (this.LLLLIILL && !this.LLLLIIL) {
            z2 = true;
        }
        C357660E0m.LJIILIIL(list, nLETrackSlot, c0e48, z2);
        super.JS(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [X.0E3z, X.0Ekh] */
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
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, com.ss.ugc.android.editor.bottom.panel.BasePanelFragment, com.ss.ugc.android.editor.bottom.panel.EditorContextFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        boolean z;
        float f;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        boolean zLIZ;
        String str;
        long maxEnd;
        NLETrack nLETrackRn;
        float f2;
        NLEEditor nLEEditorLJI;
        NLESegmentAudio nLESegmentAudioDynamicCast;
        VecNLETrackSPtr tracks;
        NLESegmentAudio nLESegmentAudioDynamicCast2;
        NLESegmentAudio nLESegmentAudioDynamicCast3;
        int iLIZ;
        int iLIZ2;
        int iLIZ3;
        C19A3 c19a3;
        C1DRG c1drg;
        super.onViewCreated(view, bundle);
        if (C0E47.LIZ()) {
            Scene sceneLIZ = C0EBE.LIZ(getView());
            String strLJLJL = null;
            if ((sceneLIZ instanceof C19A3) && (c19a3 = (C19A3) sceneLIZ) != null && (c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a3)).LLJJI) != null) {
                this.LLLILZ = (InterfaceC360800ECo) c1drg.LJIIL(null, InterfaceC360800ECo.class);
                this.LLLILZJ = (C0E5S) c1drg.LJIIL(null, C0E5S.class);
            }
            if (C297750Bll.LIZ()) {
                i = 2131827303;
            } else {
                i = 2131827302;
            }
            String string = getString(i);
            TuxTextView tuxTextViewDS = dS();
            if (tuxTextViewDS != null) {
                tuxTextViewDS.setText(string);
            }
            zS();
            InterfaceC360800ECo interfaceC360800ECo = this.LLLILZ;
            if (interfaceC360800ECo != null) {
                C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.FULL_SCREEN}, null, Boolean.FALSE, null, null, 26);
            }
            if (C363750ENx.LIZ() > C0ES3.LIZ()) {
                z = true;
            } else {
                z = false;
            }
            ViewGroup.LayoutParams layoutParams = nT().getLayoutParams();
            if (layoutParams != null) {
                if (z && !fT()) {
                    iLIZ3 = C0FU0.LIZ(48.0f);
                } else {
                    iLIZ3 = C0FU0.LIZ(40.0f);
                }
                layoutParams.height = iLIZ3;
            }
            nT().LJJJJL(new AwS584S0100000_5(this, 1190));
            if (z) {
                f = 20.0f;
            } else {
                f = 12.0f;
            }
            int iLIZ4 = C0FU0.LIZ(f);
            ViewGroup.LayoutParams layoutParams2 = pT().getLayoutParams();
            if (layoutParams2 != null) {
                if (z && !fT()) {
                    iLIZ2 = C0FU0.LIZ(48.0f);
                } else {
                    iLIZ2 = C0FU0.LIZ(40.0f);
                }
                layoutParams2.width = iLIZ2;
            }
            ViewGroup.MarginLayoutParams marginLayoutParamsLJI = C1383370m6R.LJI(pT());
            if (marginLayoutParamsLJI != null) {
                marginLayoutParamsLJI.setMarginEnd(iLIZ4);
            }
            pT().LJJJJL(new AwS584S0100000_5(this, 1191));
            ViewGroup.LayoutParams layoutParams3 = oT().getLayoutParams();
            if (layoutParams3 != null) {
                if (z && !fT()) {
                    iLIZ = C0FU0.LIZ(48.0f);
                } else {
                    iLIZ = C0FU0.LIZ(40.0f);
                }
                layoutParams3.width = iLIZ;
            }
            ViewGroup.MarginLayoutParams marginLayoutParamsLJI2 = C1383370m6R.LJI(oT());
            if (marginLayoutParamsLJI2 != null) {
                marginLayoutParamsLJI2.setMarginStart(iLIZ4);
            }
            oT().LJJJJL(new AwS584S0100000_5(this, 1192));
            C0E48 c0e48 = this.LL;
            if (c0e48 != null) {
                nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
            } else {
                nLETrackSlotLLLLLLIL = null;
            }
            this.LLLLII = nLETrackSlotLLLLLLIL;
            C0E48 c0e482 = this.LL;
            if (c0e482 != null && (tracks = C350870DpF.LJI(c0e482).getTracks()) != null) {
                Iterator<NLETrack> it2 = tracks.iterator();
                while (it2.hasNext()) {
                    for (NLETrackSlot nLETrackSlot : it2.next().getSlots()) {
                        if (!Intrinsics.LJFF(nLETrackSlot, this.LLLLII) && (nLESegmentAudioDynamicCast3 = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) != null) {
                            nLESegmentAudioDynamicCast3.setVolume(0.0f);
                        }
                        Iterator<NLETrackSlot> it3 = nLETrackSlot.getKeyframes().iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null && (nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) != null) {
                                nLESegmentAudioDynamicCast2.setVolume(0.0f);
                            }
                        }
                    }
                }
            }
            NLETrackSlot nLETrackSlot2 = this.LLLLII;
            if (nLETrackSlot2 != null && (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot2.getMainSegment())) != null) {
                nLESegmentAudioDynamicCast.setVolume(1.0f);
            }
            C0E48 c0e483 = this.LL;
            if (c0e483 != null && (nLEEditorLJI = c0e483.LLFII().LJI()) != null) {
                nLEEditorLJI.commit();
            }
            View viewFindViewById = this.LLLIIIIL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.bup);
                } else {
                    viewFindViewById = null;
                }
                this.LLLIIIIL = (C368140Ec0) viewFindViewById;
            }
            ViewGroup.LayoutParams layoutParams4 = viewFindViewById.getLayoutParams();
            if (layoutParams4 != null) {
                if (z) {
                    f2 = 80.0f;
                } else {
                    f2 = 68.0f;
                }
                layoutParams4.height = C0FU0.LIZ(f2);
            }
            View viewFindViewById2 = this.LLLIIIIL;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.bup);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLLIIIIL = (C368140Ec0) viewFindViewById2;
            }
            ((C368140Ec0) viewFindViewById2).setGapWidth(0.0f);
            InterfaceC360810ECp interfaceC360810ECpMT = mT();
            NLETrackSlot nLETrackSlot3 = this.LLLLII;
            if (nLETrackSlot3 != null && C351220Dpo.LLILLIZIL(nLETrackSlot3)) {
                C0E48 c0e484 = this.LL;
                if (c0e484 != null && (nLETrackRn = c0e484.Rn()) != null) {
                    maxEnd = nLETrackRn.getMaxEnd();
                } else {
                    maxEnd = 0;
                }
                NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot3.deepClone(true));
                NLESegmentAudio nLESegmentAudioDynamicCast4 = NLESegmentAudio.dynamicCast(nLETrackSlotDynamicCast.getMainSegment());
                if (nLESegmentAudioDynamicCast4 != null) {
                    nLESegmentAudioDynamicCast4.setSpeed(1.0f);
                }
                long startTime = nLETrackSlotDynamicCast.getStartTime();
                this.LLLIZZ = C352310DrZ.LIZ(startTime);
                NLESegmentAudio nLESegmentAudioDynamicCast5 = NLESegmentAudio.dynamicCast(nLETrackSlotDynamicCast.getMainSegment());
                if (nLESegmentAudioDynamicCast5 != null) {
                    if ((nLESegmentAudioDynamicCast5.getTimeClipEnd() + startTime) - nLESegmentAudioDynamicCast5.getTimeClipStart() > maxEnd) {
                        nLESegmentAudioDynamicCast5.setTimeClipEnd((nLESegmentAudioDynamicCast5.getTimeClipStart() + maxEnd) - startTime);
                    }
                    this.LLLJ = C352310DrZ.LIZ(nLESegmentAudioDynamicCast5.getTimeClipStart());
                    this.LLLJIL = C352310DrZ.LIZ(nLESegmentAudioDynamicCast5.getTimeClipEnd());
                }
                interfaceC360810ECpMT.LJ(nLETrackSlotDynamicCast, z);
                interfaceC360810ECpMT.setAudioTrackPaint(new C369610EeN(requireActivity()));
                HandlerHook.viewPost(mT().getHorizontalScrollView(), new ARunnableS16S0101000_5(uT(), this, 15));
            }
            hT();
            if (C357780E0y.LIZ()) {
                eT();
                View viewFindViewById3 = this.LLLIIIL;
                if (viewFindViewById3 == null) {
                    View view4 = getView();
                    if (view4 != null) {
                        viewFindViewById3 = view4.findViewById(R.id.y9p);
                    } else {
                        viewFindViewById3 = null;
                    }
                    this.LLLIIIL = (FrameLayout) viewFindViewById3;
                }
                FrameLayout frameLayout = (FrameLayout) viewFindViewById3;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(0, frameLayout);
                }
                FrameLayout frameLayoutRT = rT();
                if (frameLayoutRT != null) {
                    AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(this, 1662);
                    C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                    ComposeView composeView = new ComposeView(frameLayoutRT.getContext(), null, 6);
                    C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(2004581199, new AwS455S0200000_19((InterfaceC1685750ty9) c1685760tyA, awS549S0100000_5, 55), true));
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams5.gravity = 8388629;
                    C786410Ut5.k6(composeView, layoutParams5);
                    frameLayoutRT.addView(composeView);
                }
                FrameLayout frameLayoutQT = qT();
                if (frameLayoutQT != null) {
                    C0EG9.LIZ(frameLayoutQT, new AwS549S0100000_5(this, 1663));
                }
            }
            mT().setListener(new InterfaceC371250Eh1() { // from class: X.0ECm
                @Override // X.InterfaceC371250Eh1
                public final void LIZ() {
                    C0E55 player;
                    C0E48 c0e485 = this.LIZ.LL;
                    if (c0e485 == null || (player = c0e485.getPlayer()) == null) {
                        return;
                    }
                    player.pause(false);
                }

                @Override // X.InterfaceC371250Eh1
                public final void LIZIZ() {
                    C0E55 player;
                    C0E48 c0e485 = this.LIZ.LL;
                    if (c0e485 == null || (player = c0e485.getPlayer()) == null) {
                        return;
                    }
                    player.pause(false);
                }

                @Override // X.InterfaceC371250Eh1
                public final void LIZJ(Pair<BeatInfo, Integer> pair) {
                    int i2;
                    C0E55 player;
                    int i3;
                    String str2 = "";
                    if (pair != null) {
                        C197039127h c197039127hNT = this.LIZ.nT();
                        if (c197039127hNT != null) {
                            Context context = this.LIZ.getContext();
                            if (context != null) {
                                if (C297750Bll.LIZ()) {
                                    i3 = 2131827293;
                                } else {
                                    i3 = 2131827292;
                                }
                                String string2 = context.getString(i3);
                                if (string2 != null) {
                                    str2 = string2;
                                }
                            }
                            c197039127hNT.setText(str2);
                        }
                        C197039127h c197039127hNT2 = this.LIZ.nT();
                        if (c197039127hNT2 != null) {
                            c197039127hNT2.setButtonStartIcon(Integer.valueOf(R.raw.icon_minus_fill_small));
                        }
                        C0E48 c0e485 = this.LIZ.LL;
                        if (c0e485 == null || (player = c0e485.getPlayer()) == null || !player.isPlaying()) {
                            new C0ZDN(this.LIZ.requireContext()).LIZ(0);
                            return;
                        }
                        return;
                    }
                    C197039127h c197039127hNT3 = this.LIZ.nT();
                    if (c197039127hNT3 != null) {
                        Context context2 = this.LIZ.getContext();
                        if (context2 != null) {
                            if (C297750Bll.LIZ()) {
                                i2 = 2131827290;
                            } else {
                                i2 = 2131848650;
                            }
                            String string3 = context2.getString(i2);
                            if (string3 != null) {
                                str2 = string3;
                            }
                        }
                        c197039127hNT3.setText(str2);
                    }
                    C197039127h c197039127hNT4 = this.LIZ.nT();
                    if (c197039127hNT4 == null) {
                        return;
                    }
                    c197039127hNT4.setButtonStartIcon(Integer.valueOf(R.raw.icon_plus_small));
                }

                @Override // X.InterfaceC371250Eh1
                public final void LIZLLL(boolean z2) {
                    C0E48 c0e485;
                    C0E55 player;
                    C0E55 player2;
                    C0E48 c0e486;
                    C0E55 player3;
                    this.LIZ.CT(true);
                    C0E48 c0e487 = this.LIZ.LL;
                    if (c0e487 != null && (player2 = c0e487.getPlayer()) != null && player2.isPlaying()) {
                        if (this.LIZ.zT() && (c0e486 = this.LIZ.LL) != null && (player3 = c0e486.getPlayer()) != null) {
                            player3.pause(false);
                            return;
                        }
                        return;
                    }
                    AudioBeatsPanelFragment audioBeatsPanelFragment = this.LIZ;
                    audioBeatsPanelFragment.LLLLILI = true;
                    int curTimeInMainTrack = audioBeatsPanelFragment.mT().getCurTimeInMainTrack();
                    if (z2 && (c0e485 = this.LIZ.LL) != null && (player = c0e485.getPlayer()) != null) {
                        player.LJIJ(curTimeInMainTrack, Boolean.TRUE, null);
                    }
                    AnonymousClass0956 anonymousClass0956 = this.LIZ.LLLLIL;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    AudioBeatsPanelFragment audioBeatsPanelFragment2 = this.LIZ;
                    audioBeatsPanelFragment2.LLLLIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(audioBeatsPanelFragment2), null, null, new C353440DtO(this.LIZ, curTimeInMainTrack, null), 3);
                }

                @Override // X.InterfaceC371250Eh1
                public final void LJ(Pair<BeatInfo, Integer> pair) {
                    C0E55 player;
                    C0E55 player2;
                    C0E48 c0e485 = this.LIZ.LL;
                    if (c0e485 != null && (player2 = c0e485.getPlayer()) != null) {
                        player2.pause(false);
                    }
                    C0E48 c0e486 = this.LIZ.LL;
                    if (c0e486 != null && (player = c0e486.getPlayer()) != null) {
                        player.LJIJ(pair.getFirst().timestampInMS, Boolean.TRUE, null);
                    }
                    LIZJ(pair);
                }
            });
            C786410Ut5.U8(nT(), new ACListenerS140S0100000_5(this, 157));
            C786410Ut5.U8(pT(), new ACListenerS140S0100000_5(this, 158));
            C786410Ut5.U8(oT(), new ACListenerS140S0100000_5(this, 159));
            C786410Ut5.f9(sT(), new ACListenerS140S0100000_5(this, 160));
            C0E48 c0e485 = this.LL;
            if (c0e485 != null) {
                c0e485.S7().LIZIZ(Boolean.TRUE, "is_showing_beats_panel", false);
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C355890DxL(this, null), 3);
            InterfaceC360800ECo interfaceC360800ECo2 = this.LLLILZ;
            if (interfaceC360800ECo2 != null) {
                interfaceC360800ECo2.IO();
            }
            InterfaceC360800ECo interfaceC360800ECo3 = this.LLLILZ;
            if (interfaceC360800ECo3 != null) {
                C0EB4.LIZIZ(interfaceC360800ECo3, new EnumC373450EkZ[]{EnumC373450EkZ.UNDO, EnumC373450EkZ.REDO}, null, Boolean.FALSE, null, null, 26);
            }
            ?? r5 = new InterfaceC373530Ekh() { // from class: X.0E3z
                @Override // X.InterfaceC373530Ekh
                public final int getPriority() {
                    return Integer.MAX_VALUE;
                }

                @Override // X.InterfaceC373530Ekh
                public final boolean LIZ(C0E2F c0e2f) {
                    C0E55 player;
                    C0E55 player2;
                    C0E55 player3;
                    if (Intrinsics.LJFF(c0e2f, C0E2J.LIZ)) {
                        if (this.LL.zT()) {
                            C0E48 c0e486 = this.LL.LL;
                            if (c0e486 != null && (player3 = c0e486.getPlayer()) != null) {
                                player3.LJIJ(r6.LLLIZZ, Boolean.TRUE, new AwS549S0100000_5(this.LL, 1660));
                            }
                        } else {
                            AudioBeatsPanelFragment audioBeatsPanelFragment = this.LL;
                            if (audioBeatsPanelFragment.LLLLILI) {
                                audioBeatsPanelFragment.mT().getHorizontalScrollView().smoothScrollBy(0, 0);
                                this.LL.LLLLJ = true;
                                return true;
                            }
                            C0E48 c0e487 = audioBeatsPanelFragment.LL;
                            if (c0e487 != null && (player2 = c0e487.getPlayer()) != null) {
                                player2.LLIL(false);
                                return true;
                            }
                        }
                        return true;
                    }
                    if (Intrinsics.LJFF(c0e2f, C0E2I.LIZ)) {
                        C0E48 c0e488 = this.LL.LL;
                        if (c0e488 != null && (player = c0e488.getPlayer()) != null) {
                            player.pause(false);
                        }
                        return true;
                    }
                    if (Intrinsics.LJFF(c0e2f, C0E2L.LIZ)) {
                        this.LL.AT(true);
                        VideoPublishEditModel videoPublishEditModelZS = this.LL.ZS();
                        if (videoPublishEditModelZS != null) {
                            C0EC5.LIZJ(videoPublishEditModelZS, this.LL.LL, true);
                        }
                        return true;
                    }
                    if (!Intrinsics.LJFF(c0e2f, C0E2N.LIZ)) {
                        return false;
                    }
                    this.LL.AT(false);
                    VideoPublishEditModel videoPublishEditModelZS2 = this.LL.ZS();
                    if (videoPublishEditModelZS2 != null) {
                        C0EC5.LIZJ(videoPublishEditModelZS2, this.LL.LL, false);
                    }
                    return true;
                }
            };
            InterfaceC360800ECo interfaceC360800ECo4 = this.LLLILZ;
            if (interfaceC360800ECo4 != 0) {
                interfaceC360800ECo4.Cx0(r5);
            }
            this.LLLLJI = r5;
            C0E48 c0e486 = this.LL;
            if (c0e486 != null) {
                zLIZ = C359160E6g.LIZ(C350870DpF.LJI(c0e486));
            } else {
                zLIZ = false;
            }
            this.LLLLIILLL = zLIZ;
            ((ArrayList) this.LLLJL).clear();
            ((ArrayList) this.LLLJL).addAll(C357660E0m.LIZLLL(this.LLLLII));
            ArrayList arrayList = (ArrayList) this.LLLJL;
            if (arrayList.size() > 1) {
                C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(153));
            }
            mT().setBeats(C13LP.LLIIII(this.LLLJL));
            NLETrackSlot nLETrackSlot4 = this.LLLLII;
            if (nLETrackSlot4 != null) {
                strLJLJL = C351220Dpo.LJLJL(nLETrackSlot4, "beats_auto_generate_enable", null);
            }
            this.LLLLIILL = Boolean.parseBoolean(strLJLJL);
            sT().setChecked(this.LLLLIILL);
            CT(false);
            vT().LIZ(C13LP.LLIIII(this.LLLJL), EnumC360830ECr.INIT_LOAD);
            VideoPublishEditModel videoPublishEditModelZS = ZS();
            if (videoPublishEditModelZS != null) {
                C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelZS, this.LL, new Pair(-1, -1));
                if (videoPublishEditModelZS.creativeModel.pugcTemplateData.isFromCreateTemplate) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c0labLJFF.LJ("is_from_create_template", str);
                c0labLJFF.LJ("is_editor_pro", "1");
                C20684815ws.LJIILLIIL("sound_beats_show", c0labLJFF.LIZ);
            }
        }
    }

    public final void xT(int i, boolean z) {
        C0E55 player;
        C0E48 c0e48;
        C0E55 player2;
        int i2 = this.LLLJ;
        if (i < i2 || i > (i2 = this.LLLJIL)) {
            i = i2;
        }
        C0E48 c0e482 = this.LL;
        if (c0e482 != null && (player = c0e482.getPlayer()) != null && player.isPlaying() && (c0e48 = this.LL) != null && (player2 = c0e48.getPlayer()) != null) {
            player2.pause(false);
        }
        mT().LIZJ(i, Boolean.valueOf(z));
    }
}
