package com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.curve;

import X.C01GW;
import X.C0E1V;
import X.C0E1X;
import X.C0E48;
import X.C0E55;
import X.C0EB4;
import X.C0EBE;
import X.C0EG9;
import X.C0FXL;
import X.C0LAB;
import X.C1664600tQ2;
import X.C197039127h;
import X.C19A3;
import X.C19EG;
import X.C1AF0;
import X.C1DRG;
import X.C20684815ws;
import X.C214906198m;
import X.C2292508yZ;
import X.C293810BfP;
import X.C301800BsI;
import X.C350410DoV;
import X.C350870DpF;
import X.C351220Dpo;
import X.C351510DqH;
import X.C357780E0y;
import X.C358740E4q;
import X.C361680EFy;
import X.C364210EPr;
import X.C366940Ea4;
import X.C372670EjJ;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C7740030o;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC357140DzM;
import X.EnumC373450EkZ;
import X.InterfaceC360800ECo;
import X.InterfaceC364230EPt;
import Y.AObserverS207S0100000_3;
import Y.AObserverS209S0100000_5;
import Y.ARunnableS74S0200000_5;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.common.SpeedViewModel;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS474S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class CurveSpeedEditFragment extends TTResourcePanelFragment<SpeedViewModel> implements View.OnClickListener {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9KyQ8KC06JCw4HELIOSICogZjMlLSo8ZjY8LCo3ZiY5Ozk2ZgY5Ozk2GzUpLCsWLCw4Dz0yLygpJzs=";
    public ConstraintLayout LLLFFI;
    public TuxIconView LLLFZ;
    public TuxTextView LLLI;
    public TuxTextView LLLII;
    public C366940Ea4 LLLIIII;
    public C197039127h LLLIIIIL;
    public FrameLayout LLLIIIL;
    public boolean LLLIILIL;
    public NLENode LLLIL;
    public boolean LLLILZLLLI;
    public InterfaceC360800ECo LLLIZZ;
    public final C01GW LLLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 742));
    public int LLLILZ = -1;
    public long LLLILZJ = -1;
    public boolean LLLJ = true;
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 743));
    public final C01GW LLLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 744));

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void GS() {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void PS(EnumC357140DzM enumC357140DzM) {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final String qS() {
        return "speed_curve_edit_panel";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final ViewModel QS() {
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        return C364210EPr.LIZIZ(SpeedViewModel.class);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final String hS() {
        return C2292508yZ.LIZJ(new C0E1X(C0E1V.CHANGE_CURVE_SPEED_EDIT.getNameId(), null, null, null, null, 30));
    }

    public final C366940Ea4 jT() {
        View viewFindViewById = this.LLLIIII;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fbq) : null;
            this.LLLIIII = (C366940Ea4) viewFindViewById;
        }
        return (C366940Ea4) viewFindViewById;
    }

    public final TuxIconView kT() {
        View viewFindViewById = this.LLLFZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.lr1) : null;
            this.LLLFZ = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final ConstraintLayout lT() {
        View viewFindViewById = this.LLLFFI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.zjn) : null;
            this.LLLFFI = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C197039127h mT() {
        View viewFindViewById = this.LLLIIIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tv_points_edit) : null;
            this.LLLIIIIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void HS() {
        NLETrack nLETrackRn;
        C0E55 player;
        NLEEditor nLEEditorLJI;
        if (C301800BsI.LIZ()) {
            super.HS();
        } else {
            NLENode nLENode = this.LLLIL;
            if (nLENode != null) {
                NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLENode);
                if (nLEModelDynamicCast != null) {
                    C0E48 c0e48 = this.LL;
                    if (c0e48 != null && (nLEEditorLJI = c0e48.LLFII().LJI()) != null) {
                        nLEEditorLJI.setModel(nLEModelDynamicCast);
                    }
                    C0E48 c0e482 = this.LL;
                    if (c0e482 != null) {
                        C350870DpF.LIZ(c0e482, false);
                    }
                    C0E48 c0e483 = this.LL;
                    if (c0e483 != null && (player = c0e483.getPlayer()) != null) {
                        player.LJIJJLI();
                        player.pause(false);
                    }
                }
                if (this.LLLILZ != -1) {
                    C0E48 c0e484 = this.LL;
                    NLETrackSlot slotByIndex = (c0e484 == null || (nLETrackRn = c0e484.Rn()) == null) ? null : nLETrackRn.getSlotByIndex(this.LLLILZ);
                    C0E48 c0e485 = this.LL;
                    if (c0e485 != null) {
                        c0e485.S7().LIZIZ(new C358740E4q(slotByIndex, 0, null, false, 0, 238), "select_slot_event", false);
                    }
                }
            }
            NR();
        }
        ((SpeedViewModel) wS()).updateCurrentCurveSpeedInfo();
        ((SpeedViewModel) wS()).seekToPreviousPos();
        ResourceItem currentResourceItem = ((SpeedViewModel) wS()).getCurrentResourceItem();
        if (currentResourceItem != null) {
            oT(currentResourceItem, "cancel_curve_speed_spots", Boolean.valueOf(C301800BsI.LIZ()), Boolean.TRUE);
        }
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final int RR() {
        return C357780E0y.LIZ() ? R.layout.c13 : R.layout.c12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void UR() {
        ((SpeedViewModel) wS()).changeCurveSpeedEditPanelVisibility(false);
        int i = C301800BsI.LIZ() ? 0 : 4;
        InterfaceC360800ECo interfaceC360800ECo = this.LLLIZZ;
        if (interfaceC360800ECo != null) {
            C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.REDO, EnumC373450EkZ.UNDO, EnumC373450EkZ.FULL_SCREEN}, Integer.valueOf(i), null, null, null, 28);
        }
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
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ((C214906198m) this.LLLIIL.getValue()).dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void JS(boolean z) {
        long duration;
        C0E55 player;
        C0E55 player2;
        C0E48 c0e48;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLEEditor nLEEditorLJI;
        JSONObject jSONObject;
        NLETrackSlot nLETrackSlotLLLLLLIL2;
        C0E48 c0e482 = this.LL;
        if (c0e482 != null && (nLETrackSlotLLLLLLIL2 = c0e482.LLLLLLIL()) != null) {
            duration = nLETrackSlotLLLLLLIL2.getDuration();
        } else {
            duration = 0;
        }
        if (duration < 100000) {
            C19EG activity = getActivity();
            if (activity != null) {
                C372670EjJ.LIZIZ(C786410Ut5.j4(activity.getString(2131848673), Arrays.copyOf(new Object[]{"0.1"}, 1)));
                return;
            }
            return;
        }
        if (this.LLLIILIL && (c0e48 = this.LL) != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null) {
            String currentCurveSpeedResId = ((SpeedViewModel) wS()).getCurrentCurveSpeedResId();
            List<PointF> currentCurveSpeedPoints = ((SpeedViewModel) wS()).getCurrentCurveSpeedPoints();
            try {
                if (nLETrackSlotLLLLLLIL.hasExtra("ep_edited_curve_speed_params")) {
                    jSONObject = new JSONObject(nLETrackSlotLLLLLLIL.getExtra("ep_edited_curve_speed_params"));
                } else {
                    jSONObject = new JSONObject();
                }
                jSONObject.remove(currentCurveSpeedResId);
                if (this.LLLILZLLLI) {
                    Type type = new TypeToken<List<? extends PointF>>() { // from class: X.0ECN
                    }.getType();
                    Gson gson = C7740030o.LIZ().getGson();
                    GsonProtectorUtils.toJson(gson, currentCurveSpeedPoints, type);
                    jSONObject.put(currentCurveSpeedResId, GsonProtectorUtils.toJson(gson, currentCurveSpeedPoints, type));
                }
                nLETrackSlotLLLLLLIL.setExtra("ep_edited_curve_speed_params", C786410Ut5.J3(jSONObject));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
            C0E48 c0e483 = this.LL;
            if (c0e483 != null) {
                nLEEditorLJI = c0e483.LLFII().LJI();
            } else {
                nLEEditorLJI = null;
            }
            C350410DoV.LIZLLL(nLEEditorLJI, C301800BsI.LIZ(), hS(), false, C301800BsI.LIZ());
        }
        C0E48 c0e484 = this.LL;
        if (c0e484 != null && (player2 = c0e484.getPlayer()) != null) {
            player2.LJIJJLI();
        }
        C0E48 c0e485 = this.LL;
        if (c0e485 != null && (player = c0e485.getPlayer()) != null) {
            player.pause(false);
        }
        NR();
        ResourceItem currentResourceItem = ((SpeedViewModel) wS()).getCurrentResourceItem();
        if (currentResourceItem != null) {
            oT(currentResourceItem, "save_curve_speed_spots", Boolean.valueOf(C301800BsI.LIZ()), Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.curve.CurveSpeedEditFragment.onClick(android.view.View):void");
    }

    public final void pT(View view) {
        Drawable drawable;
        if (!(view instanceof TuxIconView)) {
            return;
        }
        TuxIconView tuxIconView = (TuxIconView) view;
        if (tuxIconView.isActivated()) {
            drawable = (Drawable) this.LLLJIL.getValue();
        } else {
            drawable = (Drawable) this.LLLJL.getValue();
        }
        tuxIconView.setImageDrawable(drawable);
    }

    public final void qT(boolean z) {
        float f;
        this.LLLILZLLLI = z;
        ConstraintLayout constraintLayoutLT = lT();
        if (constraintLayoutLT != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.4f;
            }
            C786410Ut5.c5(constraintLayoutLT, f);
        }
        ConstraintLayout constraintLayoutLT2 = lT();
        if (constraintLayoutLT2 != null) {
            constraintLayoutLT2.setClickable(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void nT(ResourceItem resourceItem, boolean z) {
        VideoPublishEditModel videoPublishEditModelZS = ZS();
        if (videoPublishEditModelZS != null) {
            C0E48 c0e48 = this.LL;
            String resourceEngName = ((SpeedViewModel) wS()).getResourceEngName(resourceItem);
            if (resourceEngName == null) {
                resourceEngName = "none";
            }
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelZS, c0e48, new Pair(-1, -1));
            String str = "1";
            c0labLJFF.LJ("is_editor_pro", "1");
            c0labLJFF.LJ("tab_name", resourceEngName);
            if (!z) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLJFF.LJ("is_add_or_delete", str);
            c0labLJFF.LJ("track_type", C361680EFy.LJIL(c0e48));
            C20684815ws.LJIILLIIL("click_curve_speed_spots", c0labLJFF.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, com.ss.ugc.android.editor.bottom.panel.BasePanelFragment, com.ss.ugc.android.editor.bottom.panel.EditorContextFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLENode nLENodeDeepClone;
        int iIntValue;
        C0E48 c0e48;
        NLETrackSlot nLETrackSlotLLLLLLIL2;
        NLESegmentAudio nLESegmentAudio;
        NLETrackSlot nLETrackSlotLLLLLLIL3;
        C0E48 c0e482;
        NLETrack nLETrackRn;
        Integer numValueOf;
        C0E55 player;
        MutableLiveData mutableLiveDataLIZLLL;
        NLETrackSlot nLETrackSlotLLLLLLIL4;
        String resourceId;
        C19A3 c19a3;
        C1DRG c1drg;
        super.onViewCreated(view, bundle);
        Scene sceneLIZ = C0EBE.LIZ(getView());
        if ((sceneLIZ instanceof C19A3) && (c19a3 = (C19A3) sceneLIZ) != null && (c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a3)).LLJJI) != null) {
            this.LLLIZZ = (InterfaceC360800ECo) c1drg.LJIIL(null, InterfaceC360800ECo.class);
        }
        C366940Ea4 c366940Ea4JT = jT();
        if (c366940Ea4JT != null) {
            c366940Ea4JT.setProgressChange(new AwS474S0200000_5(this, c366940Ea4JT, 0));
            c366940Ea4JT.setPointListChange(new C0FXL(this, 5));
            c366940Ea4JT.setEditModeChange(new AwS584S0100000_5(this, 982));
            c366940Ea4JT.setDraggingChange(new AwS584S0100000_5(this, 983));
            HandlerHook.viewPost(c366940Ea4JT, new ARunnableS74S0200000_5(this, c366940Ea4JT, 50));
        }
        pT(kT());
        TuxIconView tuxIconViewKT = kT();
        if (tuxIconViewKT != null) {
            C786410Ut5.a9(tuxIconViewKT, this);
        }
        C197039127h c197039127hMT = mT();
        if (c197039127hMT != null) {
            C786410Ut5.U8(c197039127hMT, this);
        }
        ConstraintLayout constraintLayoutLT = lT();
        if (constraintLayoutLT != null) {
            C786410Ut5.Y7(constraintLayoutLT, this);
        }
        C366940Ea4 c366940Ea4JT2 = jT();
        if (c366940Ea4JT2 != null) {
            c366940Ea4JT2.setPlayProgress(0.0f);
        }
        C366940Ea4 c366940Ea4JT3 = jT();
        if (c366940Ea4JT3 != null) {
            c366940Ea4JT3.setPoints(((SpeedViewModel) wS()).getCurrentCurveSpeedPoints());
        }
        C0E48 c0e483 = this.LL;
        if (c0e483 != null && (nLETrackSlotLLLLLLIL4 = c0e483.LLLLLLIL()) != null) {
            ResourceItem currentResourceItem = ((SpeedViewModel) wS()).getCurrentResourceItem();
            if (currentResourceItem == null || (resourceId = currentResourceItem.getResourceId()) == null) {
                resourceId = "";
            }
            qT(!C351220Dpo.LLJILJILJ(nLETrackSlotLLLLLLIL4, resourceId));
        }
        ((SpeedViewModel) wS()).getPlayProgress().observe(this, new AObserverS209S0100000_5(this, 181));
        zS();
        if (fT()) {
            hT();
        } else {
            iT();
        }
        if (C357780E0y.LIZ()) {
            eT();
            View viewFindViewById = this.LLLIIIL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.pp_);
                } else {
                    viewFindViewById = null;
                }
                this.LLLIIIL = (FrameLayout) viewFindViewById;
            }
            ViewGroup viewGroup = (ViewGroup) viewFindViewById;
            if (viewGroup != null) {
                C0EG9.LIZ(viewGroup, new AwS549S0100000_5(this, 1266));
            }
        }
        if (!fT()) {
            ((SpeedViewModel) wS()).getPlayState().observe(getViewLifecycleOwner(), new AObserverS209S0100000_5(this, 82));
            C0E48 c0e484 = this.LL;
            if (c0e484 != null && (player = c0e484.getPlayer()) != null && (mutableLiveDataLIZLLL = player.LIZLLL()) != null) {
                mutableLiveDataLIZLLL.observe(this, new AObserverS209S0100000_5(this, 83));
            }
            if (C293810BfP.LIZ()) {
                TuxIconView tuxIconViewKT2 = kT();
                if (tuxIconViewKT2 != null) {
                    ViewGroup.LayoutParams layoutParams = tuxIconViewKT2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                        C786410Ut5.W5(tuxIconViewKT2, layoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                TuxIconView tuxIconViewKT3 = kT();
                if (tuxIconViewKT3 != null) {
                    C426750GoL.LJIIL(tuxIconViewKT3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 16);
                }
            }
        }
        ((SpeedViewModel) wS()).getCurveSpeedInfo().observe(getViewLifecycleOwner(), new AObserverS207S0100000_3(this, 6));
        C351510DqH c351510DqH = C351510DqH.LIZ;
        C0E48 c0e485 = this.LL;
        if (c0e485 != null) {
            nLETrackSlotLLLLLLIL = c0e485.LLLLLLIL();
        } else {
            nLETrackSlotLLLLLLIL = null;
        }
        c351510DqH.getClass();
        String strLJJI = C351510DqH.LJJI(nLETrackSlotLLLLLLIL);
        TuxTextView tuxTextViewDS = dS();
        if (tuxTextViewDS != null) {
            tuxTextViewDS.setText(strLJJI);
        }
        C0E48 c0e486 = this.LL;
        if (c0e486 != null) {
            nLENodeDeepClone = C350870DpF.LJI(c0e486).deepClone(false);
        } else {
            nLENodeDeepClone = null;
        }
        this.LLLIL = nLENodeDeepClone;
        C0E48 c0e487 = this.LL;
        if (c0e487 != null && (nLETrackSlotLLLLLLIL3 = c0e487.LLLLLLIL()) != null && (c0e482 = this.LL) != null && (nLETrackRn = c0e482.Rn()) != null && (numValueOf = Integer.valueOf(nLETrackRn.getSlotIndex(nLETrackSlotLLLLLLIL3))) != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -1;
        }
        this.LLLILZ = iIntValue;
        C0E48 c0e488 = this.LL;
        if (c0e488 != null && C351220Dpo.LLLILZ(c0e488) && (c0e48 = this.LL) != null && (nLETrackSlotLLLLLLIL2 = c0e48.LLLLLLIL()) != null && (nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlotLLLLLLIL2.getMainSegment())) != null) {
            this.LLLILZJ = nLESegmentAudio.getTimeClipEnd();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void oT(ResourceItem resourceItem, String str, Boolean bool, Boolean bool2) {
        VideoPublishEditModel videoPublishEditModelZS = ZS();
        if (videoPublishEditModelZS != null) {
            C0E48 c0e48 = this.LL;
            String resourceEngName = ((SpeedViewModel) wS()).getResourceEngName(resourceItem);
            if (resourceEngName == null) {
                resourceEngName = "none";
            }
            C361680EFy.LJJZ(videoPublishEditModelZS, c0e48, resourceEngName, str, bool, bool2);
        }
    }
}
