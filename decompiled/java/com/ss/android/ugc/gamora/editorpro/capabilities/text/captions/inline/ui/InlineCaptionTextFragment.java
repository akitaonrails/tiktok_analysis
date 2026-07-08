package com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui;

import X.AbstractC1250290idn;
import X.C051R;
import X.C08XD;
import X.C098200Yq;
import X.C0DHG;
import X.C0E1V;
import X.C0E1X;
import X.C0E47;
import X.C0E48;
import X.C0E55;
import X.C0EJ1;
import X.C0EJ3;
import X.C0F6L;
import X.C0F6N;
import X.C0F6W;
import X.C0F8B;
import X.C0F90;
import X.C0FWN;
import X.C0OM1;
import X.C123P;
import X.C1250250idj;
import X.C1250300ido;
import X.C12ES;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1402610mbT;
import X.C1416310mxZ;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C201955140j;
import X.C21566519ah;
import X.C21566919al;
import X.C296180BjE;
import X.C349550Dn7;
import X.C349560Dn8;
import X.C349680DnK;
import X.C350410DoV;
import X.C350870DpF;
import X.C363430EMr;
import X.C363710ENt;
import X.C363730ENv;
import X.C363740ENw;
import X.C364210EPr;
import X.C632670Orh;
import X.C786410Ut5;
import X.C985403tE;
import X.DialogInterfaceOnClickListenerC391560FWw;
import X.EnumC357140DzM;
import X.InterfaceC1391500mJY;
import X.InterfaceC364230EPt;
import Y.AComparatorS24S0000000_5;
import Y.AObserverS209S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.logic.InlineCaptionTextViewModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionTextFragment;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS655S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public final class InlineCaptionTextFragment extends TTResourcePanelFragment<InlineCaptionTextViewModel> implements C0F6L {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9KyQ8KC06JCw4ICogZjHELIOSEpMTt9KyQ8PSY8JjZiICE/ISspZzo6ZgwiJSY9LQYtOTs6JysYLDcnDjctLiI2JjE=";
    public final VideoPublishEditModel LLLFFI;
    public final int LLLFZ;
    public final int LLLI;
    public final String LLLII;
    public final String LLLIIII;
    public final C0EJ3 LLLIIIIL;
    public FrameLayout LLLIIIL;
    public C0F6N LLLIIL;
    public InputMethodManager LLLIILIL;
    public SoftKeyBoardListener LLLIL;
    public RecyclerView LLLILZ;
    public TuxNavBar LLLILZJ;
    public C0F6W LLLILZLLLI;
    public C363710ENt LLLIZZ;
    public boolean LLLJIL;
    public final ArrayList<NLETrackSlot> LLLJ = new ArrayList<>();
    public Long LLLJL = 0L;

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void ES(boolean z) {
    }

    @Override // X.C0F6L
    public final void M2(int i) {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void PS(EnumC357140DzM enumC357140DzM) {
    }

    @Override // X.C0F6L
    public final void Qq(boolean z) {
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final int RR() {
        return R.layout.bzt;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final String qS() {
        return "inline_caption_text";
    }

    @Override // X.C0F6L
    public final void rR(boolean z) {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void HS() {
        if (!this.LLLJIL) {
            jT();
            return;
        }
        lT();
        if (!C296180BjE.LIZ()) {
            C19EG activity = getActivity();
            if (activity != null) {
                C21566919al c21566919al = new C21566919al(activity);
                c21566919al.LIZ(2131826897);
                c21566919al.LJIIJ(2131826895, new DialogInterfaceOnClickListenerC391560FWw(this, 2), false);
                c21566919al.LJII(R.string.f1_, null, false);
                new C21566519ah(c21566919al).LIZLLL();
                return;
            }
            return;
        }
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            if (C0DHG.LIZ() && C1388190mED.LIZ(activity2) != null) {
                C632670Orh.LIZIZ(activity2, new C19719212De(-1385840577, new AwS655S0100000_6(this, 7), true));
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(activity2);
            c1397580mTM.LIZ(2131830679);
            C985403tE.LIZ(c1397580mTM, new AwS584S0100000_5(this, 553));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public final void jT() {
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            C350870DpF.LJIIIZ(c0e48, "quit_edit_caption_text", this.LLLJL);
        }
        lT();
        NR();
    }

    public final void mT() {
        VecNLETrackSlotSPtr slots;
        C0E48 c0e48 = this.LL;
        NLETrack nLETrackLIZ = C349560Dn8.LIZ(c0e48 != null ? C350870DpF.LJI(c0e48) : null);
        if (nLETrackLIZ != null && (slots = nLETrackLIZ.getSlots()) != null) {
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                this.LLLJ.add(it2.next());
            }
        }
        ArrayList<NLETrackSlot> arrayList = this.LLLJ;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(38));
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final ViewModel QS() {
        requireActivity();
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        return C364210EPr.LIZIZ(InlineCaptionTextViewModel.class);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIIIL = null;
    }

    public final void lT() {
        View currentFocus;
        C19EG activity = getActivity();
        if (activity == null || (currentFocus = activity.getCurrentFocus()) == null) {
            return;
        }
        InputMethodManager inputMethodManager = this.LLLIILIL;
        (inputMethodManager != null ? inputMethodManager : null).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        SoftKeyBoardListener softKeyBoardListener = this.LLLIL;
        if (softKeyBoardListener == null) {
            softKeyBoardListener = null;
        }
        softKeyBoardListener.LIZ();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void JS(boolean z) {
        int startTime;
        C0E55 player;
        NLETrack trackBySlot;
        NLEEditor nLEEditorLJI;
        NLETrack trackBySlot2;
        NLEEditor nLEEditorLJI2;
        NLEModel model;
        C0F6N c0f6n = null;
        if (this.LLLJIL) {
            C0E48 c0e48 = this.LL;
            if (c0e48 != null && (nLEEditorLJI2 = c0e48.LLFII().LJI()) != null && (model = nLEEditorLJI2.getModel()) != null) {
                model.setExtra("is_editorpro_edit_captions", "true");
            }
            C0E48 c0e482 = this.LL;
            if (c0e482 != null) {
                for (NLETrackSlot nLETrackSlot : C349550Dn7.LIZJ(C350870DpF.LJI(c0e482))) {
                    String extra = nLETrackSlot.getExtra("text");
                    String extra2 = nLETrackSlot.getExtra("text_wrap_list");
                    if (extra2 != null && extra2.length() != 0) {
                        String strLJIIIIZZ = C123P.LJIIIIZZ(C363430EMr.LIZJ(extra2));
                        NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                        if (nLESegmentTextStickerDynamicCast != null) {
                            NLEModel nLEModelMS = mS();
                            if (nLEModelMS != null) {
                                trackBySlot2 = nLEModelMS.getTrackBySlot(nLETrackSlot);
                            } else {
                                trackBySlot2 = null;
                            }
                            if ((extra == null || a0.LJJJIL(extra)) && trackBySlot2 != null) {
                                trackBySlot2.removeSlot(nLETrackSlot);
                            }
                            if (nLESegmentTextStickerDynamicCast.getIsRichtext() && !Intrinsics.LJFF(nLESegmentTextStickerDynamicCast.getContent(), extra)) {
                                C0F8B c0f8b = NLETextRichContent.Companion;
                                String richContent = nLESegmentTextStickerDynamicCast.getRichContent();
                                c0f8b.getClass();
                                NLETextRichContent nLETextRichContentLIZ = C0F8B.LIZ(richContent);
                                nLESegmentTextStickerDynamicCast.setContent(extra);
                                nLETextRichContentLIZ.richTextData.setTextStr(strLJIIIIZZ);
                                nLETextRichContentLIZ.setRichText(nLETextRichContentLIZ.richTextData.toLabelStr());
                                nLESegmentTextStickerDynamicCast.setRichContent(nLETextRichContentLIZ.toJsonStr());
                                NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone(true));
                                C349680DnK.LIZ(nLETrackSlotDynamicCast);
                                if (trackBySlot2 != null) {
                                    trackBySlot2.removeSlot(nLETrackSlot);
                                }
                                String content = nLESegmentTextStickerDynamicCast.getContent();
                                if (content != null && !a0.LJJJIL(content) && trackBySlot2 != null) {
                                    trackBySlot2.addSlot(nLETrackSlotDynamicCast);
                                }
                            }
                        }
                    }
                }
            }
            C0E48 c0e483 = this.LL;
            if (c0e483 != null) {
                C350870DpF.LIZ(c0e483, false);
            }
            String strLIZIZ = C051R.LIZIZ(new C0E1X(C0E1V.EDIT_CAPTION.getNameId(), null, null, null, null, 30));
            C0E48 c0e484 = this.LL;
            if (c0e484 != null) {
                nLEEditorLJI = c0e484.LLFII().LJI();
            } else {
                nLEEditorLJI = null;
            }
            C350410DoV.LIZLLL(nLEEditorLJI, true, strLIZIZ, false, true);
            C0EJ3 c0ej3 = this.LLLIIIIL;
            if (c0ej3 != null) {
                c0ej3.Rc();
            }
        }
        C0E48 c0e485 = this.LL;
        if (c0e485 != null) {
            for (NLETrackSlot nLETrackSlot2 : C349550Dn7.LIZJ(C350870DpF.LJI(c0e485))) {
                String extra3 = nLETrackSlot2.getExtra("text");
                if (extra3 == null || extra3.length() == 0) {
                    NLEModel nLEModelMS2 = mS();
                    if (nLEModelMS2 != null && (trackBySlot = nLEModelMS2.getTrackBySlot(nLETrackSlot2)) != null) {
                        trackBySlot.removeSlot(nLETrackSlot2);
                    }
                }
            }
        }
        VideoPublishEditModel videoPublishEditModelZS = ZS();
        if (videoPublishEditModelZS != null) {
            C1402610mbT.LJJJIL(videoPublishEditModelZS, this.LLLJIL, 1, this.LLLIIII, null);
        }
        C0E48 c0e486 = this.LL;
        if (c0e486 != null && (player = c0e486.getPlayer()) != null) {
            player.LJIJJLI();
            player.pause(false);
        }
        if (C363740ENw.LJI(this.LL, null, null) == null) {
            this.LLJJIJI = false;
        }
        C0F6N c0f6n2 = this.LLLIIL;
        if (c0f6n2 != null) {
            c0f6n = c0f6n2;
        }
        int i = c0f6n.LLJI;
        if (i != -1 && i < c0f6n.LLIZ.size()) {
            startTime = ((TextStickerData) ListProtector.get(c0f6n.LLIZ, c0f6n.LLJI)).getStartTime();
        } else if (c0f6n.LLIZ.isEmpty()) {
            startTime = 0;
        } else {
            startTime = ((TextStickerData) ListProtector.get(c0f6n.LLIZ, 0)).getStartTime();
        }
        Long lValueOf = Long.valueOf(startTime);
        this.LLLJL = lValueOf;
        C0E48 c0e487 = this.LL;
        if (c0e487 != null) {
            c0e487.S7().LIZIZ(lValueOf, "quit_edit_caption_text", false);
        }
        lT();
        NR();
    }

    @Override // X.C0F6L
    public final void Wf(C0F90 c0f90) {
        InputMethodManager inputMethodManager = this.LLLIILIL;
        if (inputMethodManager == null) {
            inputMethodManager = null;
        }
        inputMethodManager.showSoftInput(c0f90, 1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Long l;
        String string;
        String string2;
        String string3;
        Object objJ2;
        boolean z;
        super.onActivityCreated(bundle);
        if (C0E47.LIZ()) {
            C0E48 c0e48 = this.LL;
            View viewFindViewById = null;
            if (c0e48 != null) {
                l = (Long) c0e48.S7().LIZJ("video_position_event", null);
            } else {
                l = null;
            }
            this.LLLJL = l;
            if (l != null) {
                this.LLLJL = Long.valueOf(l.longValue() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
            mT();
            this.LLLIZZ = new C363710ENt(this.LL, getContext());
            this.LLLIIL = new C0F6N(this.LLLFFI, this.LL, this.LLLII, this.LLLIIII, this);
            RecyclerView recyclerView = this.LLLILZ;
            if (recyclerView == null) {
                recyclerView = null;
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            C0F6N c0f6n = this.LLLIIL;
            if (c0f6n == null) {
                c0f6n = null;
            }
            recyclerView.setAdapter(c0f6n);
            recyclerView.addItemDecoration(new C0F6W((int) C12ES.LIZJ(0.0f, recyclerView.getContext()), (int) C12ES.LIZJ(40.0f, recyclerView.getContext())));
            recyclerView.setItemAnimator(null);
            RecyclerView recyclerView2 = this.LLLILZ;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            ((LinearLayoutManager) recyclerView2.getLayoutManager()).scrollToPositionWithOffset(0, (int) C12ES.LIZJ(100.0f, getActivity()));
            TuxNavBar tuxNavBar = this.LLLILZJ;
            if (tuxNavBar == null) {
                tuxNavBar = null;
            }
            tuxNavBar.setNavBackground(255);
            TuxNavBar tuxNavBar2 = this.LLLILZJ;
            if (tuxNavBar2 == null) {
                tuxNavBar2 = null;
            }
            C0OM1 c0om1 = new C0OM1();
            AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
            C1250300ido c1250300ido = new C1250300ido();
            Context context = getContext();
            if (context == null || (string = context.getString(R.string.f1_)) == null) {
                string = "Cancel";
            }
            c1250300ido.LIZJ = string;
            c1250300ido.LJ = true;
            c1250300ido.LIZ(new AwS549S0100000_5(this, 1039));
            abstractC1250290idnArr[0] = c1250300ido;
            c0om1.LJ(abstractC1250290idnArr);
            AbstractC1250290idn[] abstractC1250290idnArr2 = new AbstractC1250290idn[1];
            C1250300ido c1250300ido2 = new C1250300ido();
            Context context2 = getContext();
            if (context2 == null || (string2 = context2.getString(R.string.sg8)) == null) {
                string2 = "Save";
            }
            c1250300ido2.LIZJ = string2;
            c1250300ido2.LJ = true;
            c1250300ido2.LIZ(new AwS549S0100000_5(this, 1040));
            abstractC1250290idnArr2[0] = c1250300ido2;
            c0om1.LIZIZ(abstractC1250290idnArr2);
            C1250250idj c1250250idj = new C1250250idj();
            Context context3 = getContext();
            if (context3 == null || (string3 = context3.getString(2131826896)) == null) {
                string3 = "Edit captions";
            }
            c1250250idj.LIZJ = string3;
            c0om1.LIZJ = c1250250idj;
            tuxNavBar2.setNavActions(c0om1);
            C19EG activity = getActivity();
            if (activity != null) {
                objJ2 = C786410Ut5.J2(activity, "input_method");
            } else {
                objJ2 = null;
            }
            this.LLLIILIL = (InputMethodManager) objJ2;
            SoftKeyBoardListener softKeyBoardListenerLIZ = C0FWN.LIZ(getActivity());
            this.LLLIL = softKeyBoardListenerLIZ;
            softKeyBoardListenerLIZ.LIZIZ(new InterfaceC1391500mJY() { // from class: X.0F5V
                @Override // X.InterfaceC1391500mJY
                public final void LLLL(int i) {
                }

                @Override // X.InterfaceC1391500mJY
                public final void LJJIIJ(int i) {
                    InlineCaptionTextFragment inlineCaptionTextFragment = this.LL;
                    if (inlineCaptionTextFragment.LLLILZLLLI == null) {
                        inlineCaptionTextFragment.LLLILZLLLI = new C0F6W(0, i);
                        InlineCaptionTextFragment inlineCaptionTextFragment2 = this.LL;
                        RecyclerView recyclerView3 = inlineCaptionTextFragment2.LLLILZ;
                        C0F6N c0f6n2 = null;
                        if (recyclerView3 == null) {
                            recyclerView3 = null;
                        }
                        recyclerView3.addItemDecoration(inlineCaptionTextFragment2.LLLILZLLLI);
                        RecyclerView recyclerView4 = this.LL.LLLILZ;
                        if (recyclerView4 == null) {
                            recyclerView4 = null;
                        }
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView4.getLayoutManager();
                        InlineCaptionTextFragment inlineCaptionTextFragment3 = this.LL;
                        C0F6N c0f6n3 = inlineCaptionTextFragment3.LLLIIL;
                        if (c0f6n3 != null) {
                            c0f6n2 = c0f6n3;
                        }
                        linearLayoutManager.scrollToPositionWithOffset(c0f6n2.LLJI, (int) C12ES.LIZJ(100.0f, inlineCaptionTextFragment3.getActivity()));
                    }
                    this.LL.getClass();
                }

                @Override // X.InterfaceC1391500mJY
                public final void LJZI(int i) {
                    InlineCaptionTextFragment inlineCaptionTextFragment = this.LL;
                    C0F6W c0f6w = inlineCaptionTextFragment.LLLILZLLLI;
                    if (c0f6w != null) {
                        RecyclerView recyclerView3 = inlineCaptionTextFragment.LLLILZ;
                        if (recyclerView3 == null) {
                            recyclerView3 = null;
                        }
                        recyclerView3.removeItemDecoration(c0f6w);
                        inlineCaptionTextFragment.LLLILZLLLI = null;
                    }
                    this.LL.getClass();
                }
            });
            C0F6N c0f6n2 = this.LLLIIL;
            if (c0f6n2 == null) {
                c0f6n2 = null;
            }
            ArrayList<NLETrackSlot> arrayList = this.LLLJ;
            int i = this.LLLFZ;
            int i2 = this.LLLI;
            c0f6n2.LLIZ.clear();
            for (NLETrackSlot nLETrackSlot : arrayList) {
                ArrayList<TextStickerData> arrayList2 = c0f6n2.LLIZ;
                VideoPublishEditModel videoPublishEditModel = c0f6n2.LL;
                if (videoPublishEditModel != null && C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel)) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList2.add(C363740ENw.LJIIIIZZ(nLETrackSlot, !z));
            }
            c0f6n2.LLJI = i;
            c0f6n2.LLJILJILJ = i2;
            c0f6n2.notifyDataSetChanged();
            InputMethodManager inputMethodManager = this.LLLIILIL;
            if (inputMethodManager == null) {
                inputMethodManager = null;
            }
            inputMethodManager.toggleSoftInput(0, 2);
            C786410Ut5.d6(gS(), new FrameLayout.LayoutParams(-1, -1));
            View view = this.LLLIIIL;
            if (view == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.fk7);
                }
                this.LLLIIIL = (FrameLayout) viewFindViewById;
                view = viewFindViewById;
            }
            C786410Ut5.a6((FrameLayout) view, new LinearLayout.LayoutParams(-1, -1));
            LinearLayout linearLayoutBS = bS();
            if (linearLayoutBS != null) {
                C786410Ut5.LJZL(4, linearLayoutBS);
            }
            C786410Ut5.LJZL(8, YS());
            LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).observe(getViewLifecycleOwner(), new AObserverS209S0100000_5(this, 122));
        }
    }

    public final String kT(int i, int i2) {
        NLETrackSlot next;
        Iterator<NLETrackSlot> it2 = this.LLLJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                NLETrackSlot nLETrackSlot = next;
                long startTime = nLETrackSlot.getStartTime();
                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                if (startTime / j == i && nLETrackSlot.getEndTime() / j == i2) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrackSlot nLETrackSlot2 = next;
        if (nLETrackSlot2 == null) {
            return null;
        }
        return nLETrackSlot2.getUUID();
    }

    @Override // X.C0F6L
    public final void Yt(Pair<Integer, Integer> pair, TextStickerData textStickerData, TextStickerData textStickerData2) {
        C363710ENt c363710ENt = this.LLLIZZ;
        if (c363710ENt == null) {
            c363710ENt = null;
        }
        String strKT = kT(pair.getFirst().intValue(), pair.getSecond().intValue());
        if (strKT == null) {
            strKT = "";
        }
        c363710ENt.LIZIZ(strKT, textStickerData, textStickerData2);
        C201955140j.LIZ("InlineCaptionTextFragment -> splitCaption -> hasEdited = true");
        this.LLLJIL = true;
        mT();
    }

    @Override // X.C0F6L
    public final void kO(TextStickerData textStickerData, int i, int i2) {
        C0E48 c0e48;
        NLETrackSlot nLETrackSlotLIZIZ;
        C363710ENt c363710ENt = this.LLLIZZ;
        if (c363710ENt == null) {
            c363710ENt = null;
        }
        String strKT = kT(textStickerData.getStartTime(), textStickerData.getEndTime());
        if (strKT == null) {
            strKT = "";
        }
        String textStr = textStickerData.getTextStr();
        if (textStr == null) {
            textStr = "";
        }
        if (c363710ENt.LIZIZ != null && (c0e48 = c363710ENt.LIZ) != null && (nLETrackSlotLIZIZ = C349550Dn7.LIZIZ(C350870DpF.LJI(c0e48), strKT)) != null) {
            TextStickerData textStickerDataLIZ = C0EJ1.LIZ(nLETrackSlotLIZIZ.getExtra("text_sticker_data"));
            C363730ENv.LJIIIZ(textStickerDataLIZ, textStr, c363710ENt.LIZIZ);
            nLETrackSlotLIZIZ.setExtra("text_sticker_data", C0EJ1.LIZIZ(textStickerDataLIZ));
            nLETrackSlotLIZIZ.setExtra("text_wrap_list", C363430EMr.LJ(textStickerDataLIZ.getTextWrapList()));
            nLETrackSlotLIZIZ.setExtra("text", textStickerDataLIZ.getTextStr());
            nLETrackSlotLIZIZ.setExtra("text_inline_styles", "");
        }
        C201955140j.LIZ("InlineCaptionTextFragment -> updateCaptionText -> hasEdited = true");
        this.LLLJIL = true;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.ugc.android.editor.bottom.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (viewOnCreateView != null) {
            this.LLLILZ = (RecyclerView) viewOnCreateView.findViewById(R.id.grd);
            this.LLLILZJ = (TuxNavBar) viewOnCreateView.findViewById(R.id.bsm);
        }
        C19GS c19gs = null;
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

    @Override // X.C0F6L
    public final void sr(TextStickerData textStickerData, Pair<Integer, Integer> pair, TextStickerData textStickerData2, Pair<Integer, Integer> pair2) {
        C363710ENt c363710ENt = this.LLLIZZ;
        if (c363710ENt == null) {
            c363710ENt = null;
        }
        String strKT = kT(pair.getFirst().intValue(), pair.getSecond().intValue());
        String str = "";
        if (strKT == null) {
            strKT = "";
        }
        String strKT2 = kT(pair2.getFirst().intValue(), pair2.getSecond().intValue());
        if (strKT2 != null) {
            str = strKT2;
        }
        c363710ENt.LIZ(strKT, str, textStickerData);
        C201955140j.LIZ("InlineCaptionTextFragment -> mergerCaption -> hasEdited = true");
        this.LLLJIL = true;
        mT();
    }

    public InlineCaptionTextFragment(VideoPublishEditModel videoPublishEditModel, int i, int i2, String str, String str2, C0EJ3 c0ej3) {
        this.LLLFFI = videoPublishEditModel;
        this.LLLFZ = i;
        this.LLLI = i2;
        this.LLLII = str;
        this.LLLIIII = str2;
        this.LLLIIIIL = c0ej3;
    }
}
