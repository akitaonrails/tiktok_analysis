package com.ss.android.ugc.aweme.tools.draft;

import X.C01GW;
import X.C01TT;
import X.C054G;
import X.C098200Yq;
import X.C099R;
import X.C09BV;
import X.C09X2;
import X.C09X3;
import X.C09X9;
import X.C0CHQ;
import X.C0DX9;
import X.C0FI2;
import X.C0LD3;
import X.C0LEP;
import X.C0M0F;
import X.C0M0N;
import X.C0M0O;
import X.C0M0P;
import X.C0M0T;
import X.C0M0V;
import X.C0M2U;
import X.C0M3H;
import X.C0M3P;
import X.C0M4N;
import X.C0MAY;
import X.C0MJM;
import X.C0MVY;
import X.C0MYR;
import X.C0OM1;
import X.C0PEM;
import X.C1057450dcl;
import X.C1250250idj;
import X.C1250300ido;
import X.C1251150ifB;
import X.C12ES;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1466090oFr;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C189200o6;
import X.C19252910Tv;
import X.C194353111z;
import X.C19576911iZ;
import X.C19EG;
import X.C19GS;
import X.C1AF0;
import X.C201955140j;
import X.C20515215Pi;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C2387009Wy;
import X.C259800zU;
import X.C280830AzZ;
import X.C298130BmN;
import X.C419910GdJ;
import X.C423520Gj8;
import X.C452501pT;
import X.C497720JfW;
import X.C497820Jfg;
import X.C499180Jhs;
import X.C545010LZb;
import X.C561470M0j;
import X.C561520M0o;
import X.C561950M2f;
import X.C562020M2m;
import X.C562260M3k;
import X.C570300MYi;
import X.C571890Mbr;
import X.C576210Mip;
import X.C786410Ut5;
import X.C814420VxA;
import X.C985403tE;
import X.EnumC1399820mWy;
import X.EnumC562220M3g;
import X.EnumC562230M3h;
import X.EnumC638250P1r;
import X.InterfaceC1364105Vn;
import X.InterfaceC1399800mWw;
import X.InterfaceC362610EJn;
import X.InterfaceC524950KiL;
import Y.ACListenerS143S0100000_8;
import Y.ALAdapterS5S0200000_8;
import Y.AObjectS241S0100000_8;
import Y.AObserverS212S0100000_8;
import Y.ARunnableS108S0100000_8;
import android.animation.ObjectAnimator;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.appcompat.AmeBaseLegacyFragment;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS444S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes9.dex */
public class DraftFragment extends AmeBaseLegacyFragment implements C0M3H, InterfaceC362610EJn {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjHELIOSEjJiMgZiE+KCknZgE+KCknDjctLiI2JjE=";
    public ObjectAnimator LL;
    public ObjectAnimator LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public Integer LLIZLLLIL;
    public C562260M3k LLJ;
    public C562260M3k LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILLL;
    public View LLJJ;
    public TuxNavBar LLJJI;
    public C1749280vcc LLJJIII;
    public RecyclerView LLJJIJI;
    public TextView LLJJIJIIJIL;
    public TextView LLJJIJIL;
    public FrameLayout LLJJJ;
    public boolean LLJJJJ;
    public long LLJJJJLIIL;
    public C562020M2m LLJJL;
    public boolean LLJL;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public long LLJLL;
    public boolean LLJLLIL;
    public boolean LLLFFI;
    public C20515215Pi LLLFZ;
    public boolean LLLI;
    public WrapGridLayoutManager LLLII;
    public boolean LLLIIIIL;
    public final Set<String> LLJILJILJ = new LinkedHashSet();
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 473));
    public final String LLJJJJJIL = "draft_page";
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 476));
    public String LLJLLL = "";
    public final C01GW LLJZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(224));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 475));
    public final C054G LLL = C2296808zG.LIZ(C0PEM.LIZJ);
    public final C054G LLLF = C2296808zG.LIZ(C2107308Nj.LIZ);
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS552S0100000_8(this, 472));
    public Long LLLIIII = 0L;

    public final void VR() {
        this.LLLIIIIL = false;
        C1749280vcc c1749280vcc = this.LLJJIII;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 8);
    }

    public final void MR() {
        this.LLJILLL = !this.LLJILLL;
        ZR();
        DraftViewModel draftViewModelPR = PR();
        draftViewModelPR.LLJJJJ = false;
        draftViewModelPR.LLJJIJIIJIL.setValue(Boolean.TRUE);
        draftViewModelPR.LLJJL.setValue(0L);
        draftViewModelPR.LLJJJ.setValue(0);
        ((HashSet) draftViewModelPR.LLILLL).clear();
        ((HashSet) draftViewModelPR.LLILLJJLI).clear();
    }

    public DraftViewModel PR() {
        return (DraftViewModel) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final boolean RR() {
        C19EG activity;
        if (!this.LLILZLL || (activity = getActivity()) == null) {
            return false;
        }
        C561520M0o.LIZ.getClass();
        SmartRouter.buildRoute(activity, "aweme://openShoot?landing_tab=editor_tab&schema_tag=draft_box").open();
        C01TT.LIZIZ(400L, new AwS552S0100000_8(this, 474));
        return true;
    }

    public final void bS() {
        if (this.LLJJJJ) {
            return;
        }
        this.LLJJJJ = true;
        C1397580mTM c1397580mTM = new C1397580mTM(requireContext());
        c1397580mTM.LJI(null);
        c1397580mTM.LIZIZ(requireContext().getResources().getQuantityString(2131755285, 1));
        C985403tE.LIZ(c1397580mTM, new AwS587S0100000_8(this, 318));
        c1397580mTM.LIZLLL(new AwS587S0100000_8(this, 319));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final void dS() {
        String str = this.LLJLLL;
        if (str == null || str.length() == 0) {
            C201955140j.LIZJ(C0MAY.LIZIZ, "DraftFragment -> updateDraft: operatedDraftCreationId is null or empty");
        } else {
            C23250099c.LIZLLL(this.LLLF, null, null, new C0M0O(this, null), 3);
        }
    }

    public String getEnterFrom() {
        if (this.LLILLL) {
            return "storage_management";
        }
        if (this.LLILZ) {
            return "subonly_videolist";
        }
        if (this.LLILZIL) {
            return "click_profile_guide_widget";
        }
        if (this.LLILZLL) {
            return "shoot_page_edit_tab";
        }
        C562260M3k c562260M3k = this.LLJI;
        return c562260M3k != null ? c562260M3k.LIZ == EnumC562230M3h.EFFECT ? "effect_detail_page" : c562260M3k.LIZ == EnumC562230M3h.MUSIC ? "music_detail_page" : "personal_homepage" : "personal_homepage";
    }

    @Override // X.C0M3H
    public final void oa() {
        C23250099c.LIZLLL(this.LLL, null, null, new C2387009Wy(this, null), 3);
    }

    @Override // X.C0M3H
    public final void v1() {
        C570300MYi.LIZ.getClass();
    }

    public final void ZR() {
        if (getContext() == null) {
            return;
        }
        TuxNavBar tuxNavBar = this.LLJJI;
        if (tuxNavBar == null) {
            tuxNavBar = null;
        }
        tuxNavBar.LJJ(new AwS587S0100000_8(this, 314), "back");
        TuxNavBar tuxNavBar2 = this.LLJJI;
        if (tuxNavBar2 == null) {
            tuxNavBar2 = null;
        }
        tuxNavBar2.LJJ(new AwS587S0100000_8(this, 315), "select");
        TuxNavBar tuxNavBar3 = this.LLJJI;
        if (tuxNavBar3 == null) {
            tuxNavBar3 = null;
        }
        tuxNavBar3.LJJ(new AwS587S0100000_8(this, 316), "select_all");
        if (C09X9.LIZ()) {
            TuxNavBar tuxNavBar4 = this.LLJJI;
            if (tuxNavBar4 == null) {
                tuxNavBar4 = null;
            }
            tuxNavBar4.LJJ(new AwS587S0100000_8(this, 317), "settings");
        } else {
            TuxNavBar tuxNavBar5 = this.LLJJI;
            if (tuxNavBar5 == null) {
                tuxNavBar5 = null;
            }
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = this.LLJILLL ? "" : getString(2131832435);
            tuxNavBar5.LJIJJ(c1250250idj);
        }
        if (this.LLJILLL) {
            C20515215Pi c20515215Pi = this.LLLFZ;
            if (c20515215Pi != null) {
                c20515215Pi.LIZIZ();
            }
            this.LLLFZ = null;
        } else {
            SR(null);
        }
        C562020M2m c562020M2m = this.LLJJL;
        C562020M2m c562020M2m2 = c562020M2m != null ? c562020M2m : null;
        c562020M2m2.LLILZLL = this.LLJILLL;
        if (C280830AzZ.LIZ()) {
            c562020M2m2.notifyItemRangeChanged(0, c562020M2m2.LLILZIL.size(), "edit_mode_change");
        } else {
            c562020M2m2.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void aS() {
        DraftViewModel draftViewModelPR = PR();
        String enterFrom = getEnterFrom();
        String strOR = OR();
        Boolean bool = (Boolean) draftViewModelPR.LLJJIJIL.getValue();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        if (zBooleanValue) {
            int size = ((HashSet) draftViewModelPR.LLILLJJLI).size() > 0 ? draftViewModelPR.LLJJ - ((HashSet) draftViewModelPR.LLILLJJLI).size() : ((HashSet) draftViewModelPR.LLILLL).size() > 0 ? ((HashSet) draftViewModelPR.LLILLL).size() : draftViewModelPR.LLJJ;
            Integer value = draftViewModelPR.LLJJJ.getValue();
            String str = (value == null || value.intValue() == 0) ? "1" : CardStruct.IStatusCode.DEFAULT;
            C0M2U.LIZ.getClass();
            C0M2U.LIZJ(size, "select_all", enterFrom, str);
            C497720JfW c497720JfW = C497720JfW.LIZ;
            c497720JfW.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c497720JfW.getClass();
            C497720JfW.LIZ(enterFrom, strOR, linkedHashMap);
            C20684815ws.LJIILLIIL("select_all_draft", linkedHashMap);
        } else {
            C497720JfW c497720JfW2 = C497720JfW.LIZ;
            c497720JfW2.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            c497720JfW2.getClass();
            C497720JfW.LIZ(enterFrom, strOR, linkedHashMap2);
            C20684815ws.LJIILLIIL("deselect_all_draft", linkedHashMap2);
        }
        ((HashSet) draftViewModelPR.LLILLJJLI).clear();
        ((HashSet) draftViewModelPR.LLILLL).clear();
        for (C561950M2f c561950M2f : (ArrayList) draftViewModelPR.LLILZ) {
            if (c561950M2f instanceof C0M0P) {
                ((C0M0P) c561950M2f).LJIIJJI = zBooleanValue;
            }
        }
        draftViewModelPR.LLJJJJ = zBooleanValue;
        draftViewModelPR.LLJJJJJIL.LJIIJ(Unit.LIZ);
        draftViewModelPR.LLJJIJIIJIL.setValue(Boolean.valueOf(!zBooleanValue));
        draftViewModelPR.LLJJJ.setValue(zBooleanValue ? Integer.valueOf(draftViewModelPR.LLJJ) : 0);
        if (draftViewModelPR.LLJJIII) {
            draftViewModelPR.LLJJL.setValue(Long.valueOf(zBooleanValue ? draftViewModelPR.LLJJIJI : 0L));
        }
    }

    public final void cS() {
        if (getActivity() != null) {
            C19EG activity = getActivity();
            if (activity == null || !activity.isFinishing()) {
                C497720JfW c497720JfW = C497720JfW.LIZ;
                String enterFrom = getEnterFrom();
                c497720JfW.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", enterFrom);
                C20684815ws.LJIILLIIL("show_posted_draft_offline_notice", linkedHashMap);
                C20515215Pi c20515215Pi = new C20515215Pi(this);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_exclamation_mark_circle;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                c20515215Pi.LJFF(c419910GdJ);
                c20515215Pi.LIZ.LJFF = getString(2131846779);
                int iLIZJ = (int) C12ES.LIZJ(24.0f, requireContext());
                C1057450dcl c1057450dcl = c20515215Pi.LIZ;
                c1057450dcl.LJIIIZ = iLIZJ;
                c1057450dcl.LIZJ = false;
                c1057450dcl.LJIIJ = 0;
                this.LLLFZ = c20515215Pi;
                c20515215Pi.LIZLLL();
                C499180Jhs.LIZJ.storeBoolean("posted_draft_remind_feature_offline", false);
            }
        }
    }

    public void fM() {
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((InterfaceC524950KiL) requireActivity()).b8(this);
    }

    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ObjectAnimator objectAnimator = this.LL;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.LLILLJJLI;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            objectAnimator2.cancel();
        }
        this.LLJLLL = "";
        C20515215Pi c20515215Pi = this.LLLFZ;
        if (c20515215Pi != null) {
            c20515215Pi.LIZIZ();
        }
        this.LLLFZ = null;
        IDraftListener iDraftListener = (IDraftListener) this.LLJZIJLIL.getValue();
        if (iDraftListener != null) {
            C0CHQ.LIZ().LJI().LIZ().unregisterListener(iDraftListener);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.DraftFragment.onResume():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
        super.onStop();
        if (((Boolean) this.LLJZ.getValue()).booleanValue() && (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) != null) {
            iCreationAsyncTaskManagerLIZ.LJI("DraftViewModel", AFwS189S0000000_3.get$arr$(377), false);
        }
        this.LLLFFI = true;
    }

    public String OR() {
        return this.LLJJJJJIL;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    public final void SR(View view) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = this.LLJJJ;
        FrameLayout frameLayout3 = null;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        if (frameLayout2.getVisibility() == 8) {
            if (view != null) {
                view.setEnabled(true);
                return;
            }
            return;
        }
        FrameLayout frameLayout4 = this.LLJJJ;
        if (frameLayout4 == null) {
            frameLayout = null;
        } else {
            frameLayout = frameLayout4;
        }
        float[] fArr = new float[1];
        if (frameLayout4 != null) {
            frameLayout3 = frameLayout4;
        }
        fArr[0] = frameLayout3.getMeasuredHeight();
        ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout, "translationY", fArr).setDuration(200L);
        duration.addListener(new ALAdapterS5S0200000_8(this, view, 0));
        C786410Ut5.Pd(duration);
        this.LL = duration;
    }

    public final void UR(List<? extends C561950M2f> list) {
        TuxNavBar tuxNavBar;
        C561950M2f next;
        if (PR().LLJJ == 0) {
            Iterator<? extends C561950M2f> it2 = list.iterator();
            do {
                tuxNavBar = null;
                if (it2.hasNext()) {
                    next = it2.next();
                } else {
                    return;
                }
            } while (!(next instanceof C0M3P));
            if (next != null) {
                TuxNavBar tuxNavBar2 = this.LLJJI;
                if (tuxNavBar2 != null) {
                    tuxNavBar = tuxNavBar2;
                }
                tuxNavBar.LJJ(AFwS239S0000000_8.get$arr$(158), "select");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, X.0mWv] */
    @Override // X.C0M3H
    public final void aE(String str) {
        C19EG activity = getActivity();
        DraftViewModel draftViewModelPR = PR();
        AwemeDraft awemeDraftLIZ = draftViewModelPR.LLJIJIL.LIZ(str);
        if (awemeDraftLIZ == null) {
            C201955140j.LIZJ(C0MAY.LIZIZ, "createNewVideo -> draft is null");
            C1AF0.LIZJ("queryNull -> createNewVideo");
            return;
        }
        AVMusic aVMusic = awemeDraftLIZ.LJ;
        if (aVMusic != null) {
            aVMusic.ignoreReuseAudio = false;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(activity);
        C259800zU c259800zU = new C259800zU();
        C19576911iZ.LIZJ = str;
        final AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(607);
        c259800zU.element = C576210Mip.LIZ(c19egLIZIZ, EnumC1399820mWy.VISIBLE_AFTER_5S, new InterfaceC1399800mWw() { // from class: X.0M0g
            @Override // X.InterfaceC1399800mWw
            public final void LIZ() {
                aFwS194S0000000_8.invoke();
            }
        });
        C194353111z.LIZ.LIZIZ(1016, C0MVY.SHOW, C0LD3.DUAL_BALL, C0LEP.CLOSE_VISIBLE_5S);
        C0MYR.LIZ(c19egLIZIZ, awemeDraftLIZ, new AwS444S0200000_8(awemeDraftLIZ, draftViewModelPR, 20), new AwS409S0200000_8(c259800zU, (C259800zU<ProgressDialog>) draftViewModelPR, (DraftViewModel) 147)).LIZ();
    }

    public final void hS(AwemeDraft awemeDraft) {
        awemeDraft.LIZ.detailPageRecallDraftModel.isDetailPageRecallDraft = this.LLJILJILJ.contains(awemeDraft.LIZ()) ? 1 : 0;
        Integer num = this.LLIZLLLIL;
        if (num != null) {
            awemeDraft.LJIJI = num.intValue();
        }
        Integer num2 = this.LLIZLLLIL;
        if (num2 != null && num2.intValue() == 12) {
            awemeDraft.LIZ.detailPageRecallDraftModel.isDetailPageRecallPath = 2;
            return;
        }
        Integer num3 = this.LLIZLLLIL;
        if (num3 == null || num3.intValue() != 11) {
            return;
        }
        awemeDraft.LIZ.detailPageRecallDraftModel.isDetailPageRecallPath = 1;
    }

    public final void initData(boolean z) {
        boolean z2;
        this.LLJILJILJ.clear();
        C0MJM.LIZ = System.currentTimeMillis();
        C1749280vcc c1749280vcc = this.LLJJIII;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        c1749280vcc.LJ();
        C1749280vcc c1749280vcc2 = this.LLJJIII;
        if (c1749280vcc2 == null) {
            c1749280vcc2 = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc2, 0);
        this.LLJLIL = 0;
        DraftViewModel draftViewModelPR = PR();
        ((ArrayList) draftViewModelPR.LLILZ).clear();
        ((HashMap) draftViewModelPR.LLJIJIL.LIZ).clear();
        DraftViewModel draftViewModelPR2 = PR();
        boolean z3 = this.LLIZ;
        if (((ArrayList) draftViewModelPR2.LLILZ).isEmpty()) {
            if (draftViewModelPR2.BQ2() == EnumC562220M3g.POSTED) {
                z2 = true;
            } else {
                z2 = false;
            }
            ((ArrayList) draftViewModelPR2.LLILZ).add(new C561470M0j(z2));
            ((ArrayList) draftViewModelPR2.LLILZ).add(new C0M0T(0));
            ((ArrayList) draftViewModelPR2.LLILZ).add(new C561950M2f() { // from class: X.0M0i
                public final int LIZLLL = 107;

                @Override // X.C561950M2f
                public final int LIZ() {
                    return this.LIZLLL;
                }
            });
            if (z3) {
                ((ArrayList) draftViewModelPR2.LLILZ).add(new C0M0F(0));
            }
        }
        draftViewModelPR2.LLJLIL.LJIIJ(draftViewModelPR2.LLILZ);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C09X3(this, null, z), 3);
        IDraftListener iDraftListener = (IDraftListener) this.LLJZIJLIL.getValue();
        if (iDraftListener != null) {
            C0CHQ.LIZ().LJI().LIZ().registerListener(iDraftListener);
        }
    }

    @Override // X.C0M3H
    public final void l(C0M0P c0m0p) {
        if (!this.LLJILLL) {
            C0M2U c0m2u = C0M2U.LIZ;
            String enterFrom = getEnterFrom();
            c0m2u.getClass();
            C0M2U.LIZIZ(enterFrom, true);
        }
        MR();
        C23250099c.LIZLLL(this.LLL, null, null, new C0M0N(this, c0m0p, "select", null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C0FI2.LJIJJ().LJJIL(getActivity(), Boolean.valueOf(!C298130BmN.LIZ()));
        initData(false);
        ((DraftBoxActivity) getActivity()).LLILZ.LIZ(this, new AObjectS241S0100000_8(this, 104));
        PR().LLIZ.observe(this, new AObserverS212S0100000_8(this, 100));
        PR().LLJLLIL.LIZ(this, new AObjectS241S0100000_8(this, 105));
        PR().LLIZLLLIL.observe(this, new AObserverS212S0100000_8(this, 93));
        PR().LLJ.observe(this, new AObserverS212S0100000_8(this, 94));
        PR().LLJILJIL.observe(this, new AObserverS212S0100000_8(this, 95));
        PR().LLJI.observe(this, new AObserverS212S0100000_8(this, 96));
        PR().LLJJIJIL.observe(this, new AObserverS212S0100000_8(this, 97));
        PR().LLJJJIL.observe(this, new AObserverS212S0100000_8(this, 98));
        PR().LLJJJJLIIL.LIZ(this, new AObjectS241S0100000_8(this, 100));
        PR().LLJJLIIIJLLLLLLLZ.observe(this, new AObserverS212S0100000_8(this, 99));
        PR().LLJL.LIZ(this, new AObjectS241S0100000_8(this, 101));
        PR().LLJLILLLLZIIL.LIZ(this, new AObjectS241S0100000_8(this, 102));
        C499180Jhs.LIZIZ.LIZ(this, new AObjectS241S0100000_8(this, 103));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        WrapGridLayoutManager wrapGridLayoutManager = this.LLLII;
        RecyclerView recyclerView = null;
        if (wrapGridLayoutManager == null) {
            wrapGridLayoutManager = null;
        }
        if ((wrapGridLayoutManager instanceof WrapGridLayoutManager) && wrapGridLayoutManager != null) {
            wrapGridLayoutManager.LJIJ(C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIZZ(3, 0));
        }
        RecyclerView recyclerView2 = this.LLJJIJI;
        if (recyclerView2 != null) {
            recyclerView = recyclerView2;
        }
        recyclerView.invalidateItemDecorations();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.DraftFragment.onCreate(android.os.Bundle):void");
    }

    @Override // X.C0M3H
    public final void v(boolean z) {
        String str;
        if (z) {
            String enterFrom = getEnterFrom();
            if (Intrinsics.LJFF(enterFrom, "effect_detail_page")) {
                str = "effect_detail_recall_page";
            } else if (Intrinsics.LJFF(enterFrom, "music_detail_page")) {
                str = "music_detail_recall_page";
            } else {
                str = "";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            C20684815ws.LJIILLIIL("click_view_all_drafts", c2344009Gk.LIZ);
        }
        this.LLJIJIL = true;
        this.LLIZ = false;
        this.LLJ = null;
        C1466090oFr.LJIILJJIL(PR().LLILZ, AFwS239S0000000_8.get$arr$(332));
        C562020M2m c562020M2m = this.LLJJL;
        if (c562020M2m == null) {
            c562020M2m = null;
        }
        c562020M2m.notifyItemRemoved(((ArrayList) PR().LLILZ).size() - 1);
        ListProtector.add(PR().LLILZ, ((ArrayList) PR().LLILZ).size() - 1, new C0M0T(0));
        C562020M2m c562020M2m2 = this.LLJJL;
        if (c562020M2m2 == null) {
            c562020M2m2 = null;
        }
        c562020M2m2.notifyItemInserted(((ArrayList) PR().LLILZ).size() - 1);
        this.LLJLIL = 0;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C09X2(this, null), 3);
    }

    @Override // X.C0M3H
    public final void LLLLZLLIL(int i, C0M0P c0m0p) {
        Lifecycle lifecycle;
        Lifecycle.State currentState = null;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(getActivity(), "draft_again", true)) {
            C19EG activity = getActivity();
            if (activity != null && (lifecycle = activity.getLifecycle()) != null) {
                currentState = lifecycle.getCurrentState();
            }
            if (currentState == Lifecycle.State.RESUMED && activity != null) {
                this.LLLIIII = Long.valueOf(System.currentTimeMillis());
                this.LLLIIIIL = true;
                C1749280vcc c1749280vcc = this.LLJJIII;
                if (c1749280vcc == null) {
                    c1749280vcc = null;
                }
                c1749280vcc.LJ();
                C1749280vcc c1749280vcc2 = this.LLJJIII;
                if (c1749280vcc2 == null) {
                    c1749280vcc2 = null;
                }
                C786410Ut5.LLLZLZ(c1749280vcc2, 0);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DraftFragment -> onClick: position ");
                sbLIZ.append(i);
                sbLIZ.append(", draftId ");
                sbLIZ.append(c0m0p.LJ);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                C23250099c.LIZLLL(this.LLLF, null, null, new C545010LZb(this, c0m0p, null), 3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object NR(X.C0M0P r18, X.InterfaceC1364105Vn<? super java.lang.String> r19) {
        /*
            r17 = this;
            r4 = r19
            boolean r0 = r4 instanceof X.C0M0S
            if (r0 == 0) goto L96
            r2 = r4
            X.0M0S r2 = (X.C0M0S) r2
            int r3 = r2.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L96
            int r3 = r3 - r1
            r2.LLILZ = r3
        L14:
            java.lang.Object r4 = r2.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r3 = r2.LLILZ
            r0 = 1
            if (r3 == 0) goto L2b
            if (r3 != r0) goto L9f
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r5 = r2.LL
            X.C155000ia.LIZIZ(r4)
        L26:
            com.ss.android.ugc.aweme.draft.model.AVDraftExtras r0 = r5.LJJJJIZL
            java.lang.String r0 = r0.newDraftId
            return r0
        L2b:
            X.C155000ia.LIZIZ(r4)
            X.1Ds4 r3 = X.C0CHQ.LIZ()
            X.0M6F r3 = r3.LJI()
            X.0Lt7 r3 = r3.LJIILJJIL()
            X.0LvT r11 = new X.0LvT
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r5 = new com.ss.android.ugc.aweme.creative.model.CreativeInfo
            r4 = r18
            java.lang.String r6 = r4.LJ
            r8 = 0
            r9 = 6
            r7 = 0
            r10 = r8
            r5.<init>(r6, r7, r8, r9, r10)
            r16 = 14
            r12 = r5
            r13 = r7
            r14 = r7
            r15 = r7
            r11.<init>(r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r5 = r3.LJI(r11)
            if (r5 != 0) goto L5b
            java.lang.String r0 = ""
            return r0
        L5b:
            com.ss.android.ugc.aweme.draft.model.AVDraftExtras r3 = r5.LJJJJIZL
            java.lang.String r3 = r3.newDraftId
            int r3 = r3.length()
            if (r3 != 0) goto L26
            java.lang.String r4 = X.C09DJ.LIZ()
            com.ss.android.ugc.aweme.draft.model.AVDraftExtras r3 = r5.LJJJJIZL
            r3.newDraftId = r4
            X.1Ds4 r3 = X.C0CHQ.LIZ()
            X.0M6F r3 = r3.LJI()
            X.0LaW r4 = r3.LIZIZ()
            X.0Lac r3 = new X.0Lac
            X.0M2T r6 = new X.0M2T
            java.lang.String r8 = "DraftEditHelper"
            r10 = 7
            r7 = 0
            r9 = 0
            r12 = 28
            r11 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r3.<init>(r5, r6)
            r2.LL = r5
            r2.LLILZ = r0
            java.lang.Object r0 = r4.LIZIZ(r3, r2)
            if (r0 != r1) goto L26
            return r1
        L96:
            X.0M0S r2 = new X.0M0S
            r0 = r17
            r2.<init>(r0, r4)
            goto L14
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.DraftFragment.NR(X.0M0P, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WR(int r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r4 = r5.getEnterFrom()
            if (r7 != 0) goto L3d
            java.lang.String r0 = "effect_detail_page"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            r3 = 1
            if (r0 == 0) goto L32
            java.lang.String r2 = "effect"
        L11:
            X.09Gk r1 = new X.09Gk
            r1.<init>()
            java.lang.String r0 = "enter_from"
            r1.LJIIIIZZ(r0, r4)
            java.lang.String r0 = "is_filter"
            r1.LIZJ(r3, r0)
            java.lang.String r0 = "filter_by"
            r1.LJIIIIZZ(r0, r2)
            java.lang.String r0 = "draft_cnt"
            r1.LIZJ(r6, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.LIZ
            java.lang.String r0 = "draft_page_show"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L32:
            java.lang.String r0 = "music_detail_page"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L3d
            java.lang.String r2 = "music"
            goto L11
        L3d:
            r3 = 0
            r2 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.DraftFragment.WR(int, boolean):void");
    }

    @Override // X.InterfaceC362610EJn
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        VR();
        if (this.LLJILLL) {
            this.LLJILLL = false;
            SR(null);
            ZR();
            return true;
        }
        if (RR()) {
            return true;
        }
        fM();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.appcompat.AmeBaseFragmentAdaptationLegacyFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJI = (TuxNavBar) q0.LJIILLIIL(R.id.y08, view);
        this.LLJJ = q0.LJIILLIIL(R.id.w0u, view);
        this.LLJJIII = (C1749280vcc) q0.LJIILLIIL(R.id.g5f, view);
        this.LLJJIJI = (RecyclerView) q0.LJIILLIIL(R.id.t0q, view);
        RecyclerView recyclerView = null;
        if (((Boolean) this.LLJZ.getValue()).booleanValue()) {
            RecyclerView recyclerView2 = this.LLJJIJI;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            recyclerView2.setItemAnimator(new C423520Gj8() { // from class: X.0M0h
                @Override // X.C423520Gj8, X.AbstractC21674919sB
                public final boolean LJJIFFI(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
                    return false;
                }
            });
        }
        this.LLJJIJIIJIL = (TextView) q0.LJIILLIIL(R.id.zho, view);
        if (this.LLILLL) {
            TextView textView = (TextView) q0.LJIILLIIL(R.id.zmq, view);
            this.LLJJIJIL = textView;
            if (textView == null) {
                textView = null;
            }
            C786410Ut5.LLIL(textView, 0);
            TextView textView2 = this.LLJJIJIL;
            if (textView2 == null) {
                textView2 = null;
            }
            C786410Ut5.LLIL(textView2, 0);
        }
        FrameLayout frameLayout = (FrameLayout) q0.LJIILLIIL(R.id.m_y, view);
        this.LLJJJ = frameLayout;
        if (this.LLILLL) {
            if (frameLayout == null) {
                frameLayout = null;
            }
            C786410Ut5.O7(frameLayout, new ACListenerS143S0100000_8(this, 138));
        }
        if (this.LLILLL) {
            FrameLayout frameLayout2 = this.LLJJJ;
            if (frameLayout2 == null) {
                frameLayout2 = null;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams.height = C814420VxA.LIZIZ(C12ES.LIZJ(60.0f, getContext()));
            FrameLayout frameLayout3 = this.LLJJJ;
            if (frameLayout3 == null) {
                frameLayout3 = null;
            }
            C786410Ut5.a6(frameLayout3, layoutParams);
        } else {
            TextView textView3 = this.LLJJIJIIJIL;
            if (textView3 == null) {
                textView3 = null;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView3.getLayoutParams();
            layoutParams2.gravity = 17;
            layoutParams2.topMargin = 0;
            TextView textView4 = this.LLJJIJIIJIL;
            if (textView4 == null) {
                textView4 = null;
            }
            C786410Ut5.g6(textView4, layoutParams2);
        }
        if (C09X9.LIZ()) {
            TuxNavBar tuxNavBar = this.LLJJI;
            if (tuxNavBar == null) {
                tuxNavBar = null;
            }
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZIZ = "back";
            c1251150ifB.LIZJ(new AwS552S0100000_8(this, 1038));
            c0om1.LJ(c1251150ifB);
            C1250300ido c1250300ido = new C1250300ido();
            c1250300ido.LIZJ = getString(2131846782);
            EnumC638250P1r enumC638250P1r = EnumC638250P1r.SECONDARY;
            c1250300ido.LIZLLL = enumC638250P1r;
            c1250300ido.LIZIZ = "select_all";
            c1250300ido.LJFF = false;
            c1250300ido.LIZ(new AwS552S0100000_8(this, 1039));
            c0om1.LJ(c1250300ido);
            C1250300ido c1250300ido2 = new C1250300ido();
            c1250300ido2.LIZJ = getString(2131826970);
            c1250300ido2.LIZLLL = enumC638250P1r;
            c1250300ido2.LIZIZ = "select";
            c1250300ido2.LIZ(new AwS552S0100000_8(this, 1040));
            c0om1.LIZIZ(c1250300ido2);
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_gear;
            c1251150ifB2.LIZIZ = "settings";
            c1251150ifB2.LIZJ(new AwS552S0100000_8(this, 1041));
            c0om1.LIZIZ(c1251150ifB2);
            tuxNavBar.setNavActions(c0om1);
        } else {
            TuxNavBar tuxNavBar2 = this.LLJJI;
            if (tuxNavBar2 == null) {
                tuxNavBar2 = null;
            }
            C0OM1 c0om12 = new C0OM1();
            C1251150ifB c1251150ifB3 = new C1251150ifB();
            c1251150ifB3.LIZLLL();
            c1251150ifB3.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB3.LIZIZ = "back";
            c1251150ifB3.LIZJ(new AwS552S0100000_8(this, 1035));
            c0om12.LJ(c1251150ifB3);
            C1250300ido c1250300ido3 = new C1250300ido();
            c1250300ido3.LIZJ = getString(2131846782);
            EnumC638250P1r enumC638250P1r2 = EnumC638250P1r.SECONDARY;
            c1250300ido3.LIZLLL = enumC638250P1r2;
            c1250300ido3.LIZIZ = "select_all";
            c1250300ido3.LJFF = false;
            c1250300ido3.LIZ(new AwS552S0100000_8(this, 1036));
            c0om12.LJ(c1250300ido3);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getText(2131832435);
            c0om12.LIZJ = c1250250idj;
            C1250300ido c1250300ido4 = new C1250300ido();
            c1250300ido4.LIZJ = getString(2131826970);
            c1250300ido4.LIZLLL = enumC638250P1r2;
            c1250300ido4.LIZIZ = "select";
            c1250300ido4.LIZ(new AwS552S0100000_8(this, 1037));
            c0om12.LIZIZ(c1250300ido4);
            c0om12.LIZLLL = true;
            tuxNavBar2.setNavActions(c0om12);
        }
        TextView textView5 = this.LLJJIJIIJIL;
        if (textView5 == null) {
            textView5 = null;
        }
        C786410Ut5.T7(textView5, new ACListenerS143S0100000_8(this, 139));
        C19EG activity = getActivity();
        if (activity != null) {
            View view2 = this.LLJJ;
            if (view2 == null) {
                view2 = null;
            }
            view2.getLayoutParams().height = C497820Jfg.LIZJ(activity);
        }
        RecyclerView recyclerView3 = this.LLJJIJI;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.setOverScrollMode(2);
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIZZ(3, 0), getActivity());
        this.LLLII = wrapGridLayoutManager;
        RecyclerView recyclerView4 = this.LLJJIJI;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        recyclerView4.setLayoutManager(wrapGridLayoutManager);
        RecyclerView recyclerView5 = this.LLJJIJI;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        recyclerView5.addItemDecoration(new C0DX9((int) C12ES.LIZJ(1.0f, getContext())));
        WrapGridLayoutManager wrapGridLayoutManager2 = this.LLLII;
        if (wrapGridLayoutManager2 == null) {
            wrapGridLayoutManager2 = null;
        }
        C0MJM.LIZJ = wrapGridLayoutManager2.getChildCount();
        C562020M2m c562020M2m = new C562020M2m(this, PR().LLJIJIL, new AwS552S0100000_8(this, 1033), new AwS552S0100000_8(this, 1034), requireActivity());
        this.LLJJL = c562020M2m;
        c562020M2m.LLIZ = this.LLILLL;
        RecyclerView recyclerView6 = this.LLJJIJI;
        if (recyclerView6 == null) {
            recyclerView6 = null;
        }
        recyclerView6.setAdapter(c562020M2m);
        RecyclerView recyclerView7 = this.LLJJIJI;
        if (recyclerView7 == null) {
            recyclerView7 = null;
        }
        WrapGridLayoutManager wrapGridLayoutManager3 = this.LLLII;
        if (wrapGridLayoutManager3 == null) {
            wrapGridLayoutManager3 = null;
        }
        recyclerView7.addOnScrollListener(new C0M0V(this, wrapGridLayoutManager3));
        C571890Mbr c571890Mbr = new C571890Mbr("tool_draft_scroll");
        RecyclerView recyclerView8 = this.LLJJIJI;
        if (recyclerView8 != null) {
            recyclerView = recyclerView8;
        }
        recyclerView.addOnScrollListener(c571890Mbr);
        C0CHQ.LIZ().isDebugConfigOpen();
        C0CHQ.LIZ().isDebugConfigOpen();
        View view3 = getView();
        if (view3 != null) {
            HandlerHook.viewPost(view3, new ARunnableS108S0100000_8(this, 127));
        }
    }

    public final Object gS(Context context, String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDraftData , callFrom = ");
        sbLIZ.append(str);
        C201955140j.LIZJ(c0may, C2188811AlT.LIZIZ(sbLIZ));
        Object objHQ2 = PR().HQ2(new C0M4N(this.LLJLIL, PR().LLJILLL, 0), context, this.LLJ, interfaceC1364105Vn);
        if (objHQ2 == C099R.LJFF()) {
            return objHQ2;
        }
        return Unit.LIZ;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c8f, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // X.C0M3H
    public final void v3(C0M0P c0m0p, boolean z, boolean z2) {
        String str;
        String str2;
        boolean z3;
        int i;
        long jLongValue;
        long j;
        Integer value;
        DraftViewModel draftViewModelPR = PR();
        draftViewModelPR.getClass();
        c0m0p.LJIIJJI = z;
        if (z2) {
            str = "long_press";
        } else {
            str = "click_select";
        }
        int iIntValue = 0;
        if (z && ((value = draftViewModelPR.LLJJJ.getValue()) == null || value.intValue() == 0)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        if (draftViewModelPR.LLJJJJ) {
            if (z) {
                C0M2U c0m2u = C0M2U.LIZ;
                String str3 = draftViewModelPR.LLILZIL;
                c0m2u.getClass();
                C0M2U.LIZJ(1, str, str3, str2);
                ((HashSet) draftViewModelPR.LLILLL).remove(c0m0p);
            } else {
                ((HashSet) draftViewModelPR.LLILLL).add(c0m0p);
            }
            draftViewModelPR.IQ2(!((HashSet) draftViewModelPR.LLILLL).isEmpty());
        } else {
            if (z) {
                C0M2U c0m2u2 = C0M2U.LIZ;
                String str4 = draftViewModelPR.LLILZIL;
                c0m2u2.getClass();
                C0M2U.LIZJ(1, str, str4, str2);
                ((HashSet) draftViewModelPR.LLILLJJLI).add(c0m0p);
            } else {
                ((HashSet) draftViewModelPR.LLILLJJLI).remove(c0m0p);
            }
            if (((HashSet) draftViewModelPR.LLILLJJLI).size() != draftViewModelPR.LLJJ) {
                z3 = true;
            } else {
                z3 = false;
            }
            draftViewModelPR.IQ2(z3);
        }
        MutableLiveData<Integer> mutableLiveData = draftViewModelPR.LLJJJ;
        Integer value2 = mutableLiveData.getValue();
        if (value2 != null) {
            iIntValue = value2.intValue();
        }
        if (z) {
            i = iIntValue + 1;
        } else {
            i = iIntValue - 1;
        }
        mutableLiveData.setValue(Integer.valueOf(i));
        if (draftViewModelPR.LLJJIII) {
            MutableLiveData<Long> mutableLiveData2 = draftViewModelPR.LLJJL;
            Long value3 = mutableLiveData2.getValue();
            if (value3 != null) {
                jLongValue = value3.longValue();
            } else {
                jLongValue = 0;
            }
            if (z) {
                j = jLongValue + c0m0p.LJI;
            } else {
                j = jLongValue - c0m0p.LJI;
            }
            mutableLiveData2.setValue(Long.valueOf(j));
        }
    }
}
