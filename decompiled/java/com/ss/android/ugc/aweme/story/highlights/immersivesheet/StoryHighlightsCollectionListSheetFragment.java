package com.ss.android.ugc.aweme.story.highlights.immersivesheet;

import X.C01GW;
import X.C04JC;
import X.C06TG;
import X.C06U0;
import X.C06U2;
import X.C06US;
import X.C098200Yq;
import X.C0LAB;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13BV;
import X.C1410205fY;
import X.C1410505fb;
import X.C1616006Uk;
import X.C1674810tgV;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2252321DDq;
import X.C23250099c;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightListForAwemeResponse;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryHighlightsCollectionListSheetFragment extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZi0lLic/ISIkPTx9ISghLD0gITHELIOSMpOic2LTFiGjs8OjwEICg7JCwrITsgCyogJSowPCwjJwM6OzEfISo2PAM+KCg+LSs4";
    public C1674810tgV LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 823));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 820));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 822));
    public C06U2 LLJIJIL;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131848952);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS546S0100000_2(this, 821));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = false;
        return c0om1;
    }

    public final StoryHighlightsImmersiveSheetVM UR() {
        return (StoryHighlightsImmersiveSheetVM) this.LLIZLLLIL.getValue();
    }

    public final StoryHighlightsCreationSheetFragment SR(boolean z) {
        Bundle arguments = getArguments();
        List stringArrayList = null;
        if (arguments != null) {
            stringArrayList = arguments.getStringArrayList("collection_cover_url_list");
        }
        String str = StoryHighlightsCreationSheetFragment._pnsPageId;
        String str2 = UR().LLJJJIL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (!(stringArrayList instanceof List) || stringArrayList == null) {
            stringArrayList = C13BV.INSTANCE;
        }
        String str4 = UR().LLJJJJ;
        if (str4 != null) {
            str3 = str4;
        }
        return C06TG.LIZ(str2, str3, stringArrayList, z, true);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        C2252321DDq c2252321DDqLJII;
        super.onViewCreated(view, bundle);
        StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVMUR = UR();
        List<String> list2 = (List) this.LLJI.getValue();
        storyHighlightsImmersiveSheetVMUR.getClass();
        if (((Boolean) C1410505fb.LIZ.getValue()).booleanValue() && (!((StoryHighlightListForAwemeResponse) storyHighlightsImmersiveSheetVMUR.LLILLJJLI.getValue()).getCollections().isEmpty())) {
            C2252321DDq c2252321DDq = storyHighlightsImmersiveSheetVMUR.LLILLJJLI;
            StoryHighlightListForAwemeResponse storyHighlightListForAwemeResponse = (StoryHighlightListForAwemeResponse) c2252321DDq.getValue();
            c2252321DDq.setValue(storyHighlightListForAwemeResponse.copy(storyHighlightListForAwemeResponse.collections, list2));
        } else {
            C2252321DDq c2252321DDq2 = storyHighlightsImmersiveSheetVMUR.LLILLJJLI;
            IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager = (IStoryHighlightsMyDataManager) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsMyDataManager.class, false, false, false, 14, null);
            if (iStoryHighlightsMyDataManager == null || (c2252321DDqLJII = iStoryHighlightsMyDataManager.LJII()) == null || (list = (List) c2252321DDqLJII.getValue()) == null) {
                list = C13BV.INSTANCE;
            }
            c2252321DDq2.setValue(new StoryHighlightListForAwemeResponse(list, list2));
        }
        C06U2 c06u2 = this.LLJIJIL;
        if (c06u2 != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C06U0(this, c06u2, null), 3);
        }
        C06U2 c06u22 = this.LLJIJIL;
        if (c06u22 != null) {
            C1674810tgV c1674810tgV = new C1674810tgV(new AwS546S0100000_2(this, 1092), new AwS581S0100000_2(this, 531), new AwS581S0100000_2(this, 532));
            this.LLIZ = c1674810tgV;
            RecyclerView recyclerView = c06u22.LLILLL;
            recyclerView.setAdapter(c1674810tgV);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.addItemDecoration(new C04JC(8));
            StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVMUR2 = UR();
            String str = (String) this.LLJ.getValue();
            storyHighlightsImmersiveSheetVMUR2.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(storyHighlightsImmersiveSheetVMUR2), null, null, new C1410205fY(storyHighlightsImmersiveSheetVMUR2, str, null), 3);
            StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVMUR3 = UR();
            storyHighlightsImmersiveSheetVMUR3.getClass();
            C06US c06us = C06US.LIZ;
            String str2 = storyHighlightsImmersiveSheetVMUR3.LLJJJJJIL;
            c06us.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", str2);
            c0lab.LJ("enter_method", "video_addto_panel_entrance");
            C20684815ws.LJIILLIIL("ttsocial_story_highlight_create_btn_show", c0lab.LIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fbj, viewGroup, false);
        int i = R.id.nnh;
        C1749280vcc c1749280vcc = (C1749280vcc) C1616006Uk.LIZ(R.id.nnh, viewTd);
        if (c1749280vcc != null) {
            i = R.id.tut;
            RecyclerView recyclerView = (RecyclerView) C1616006Uk.LIZ(R.id.tut, viewTd);
            if (recyclerView != null) {
                LinearLayout linearLayout = (LinearLayout) viewTd;
                this.LLJIJIL = new C06U2(linearLayout, c1749280vcc, recyclerView);
                C19GS c19gs = null;
                if (!(linearLayout instanceof View)) {
                    linearLayout = null;
                }
                if (linearLayout != null) {
                    try {
                        ViewTreeLifecycleOwner.set(linearLayout, getViewLifecycleOwner());
                        ViewTreeViewModelStoreOwner.set(linearLayout, this);
                        linearLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                        C19EG activity = getActivity();
                        if (activity instanceof C19GS) {
                            c19gs = (C19GS) activity;
                        }
                        C1685300txQ.LIZ(c19gs);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        return linearLayout;
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
