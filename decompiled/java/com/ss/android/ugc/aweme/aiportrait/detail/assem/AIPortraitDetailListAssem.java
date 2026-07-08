package com.ss.android.ugc.aweme.aiportrait.detail.assem;

import X.C19EH;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1400710mYP;
import Y.ARunnableS109S0100000_9;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.aiportrait.detail.AIPortraitDetailAwemeListFragment;
import com.ss.android.ugc.aweme.aiportrait.detail.AIPortraitDetailFragment;
import com.ss.android.ugc.aweme.feed.model.AIPortraitInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes10.dex */
public final class AIPortraitDetailListAssem extends DynamicAssem {
    public AIPortraitDetailAwemeListFragment LLJJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    /* JADX INFO: renamed from: do */
    public final void mo127do() {
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void hp() {
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(R.id.ms4);
        Zo(frameLayout);
        super.xo();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        AIPortraitDetailFragment aIPortraitDetailFragment;
        final Aweme aweme;
        final String origPromptId;
        AIPortraitInfo aIPortraitInfo;
        String rootPromptId;
        AIPortraitInfo aIPortraitInfo2;
        if (this.LLJJI != null) {
            return;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (!(fragmentLJI instanceof AIPortraitDetailFragment) || (aIPortraitDetailFragment = (AIPortraitDetailFragment) fragmentLJI) == null || (aweme = aIPortraitDetailFragment.getAweme()) == null) {
            return;
        }
        String aid = aweme.getAid();
        final String str = "";
        if (aid == null) {
            aid = "";
        }
        final String templateId = aIPortraitDetailFragment.getTemplateId();
        if (aid.length() == 0) {
            C786410Ut5.LJLLLLLL(8, getContentView());
            return;
        }
        Aweme aweme2 = aIPortraitDetailFragment.getAweme();
        if (aweme2 == null || (aIPortraitInfo2 = aweme2.aiPortraitInfo) == null || (origPromptId = aIPortraitInfo2.getOrigPromptId()) == null) {
            origPromptId = "";
        }
        Aweme aweme3 = aIPortraitDetailFragment.getAweme();
        if (aweme3 != null && (aIPortraitInfo = aweme3.aiPortraitInfo) != null && (rootPromptId = aIPortraitInfo.getRootPromptId()) != null) {
            str = rootPromptId;
        }
        InterfaceC1400710mYP interfaceC1400710mYP = new InterfaceC1400710mYP(templateId, origPromptId, str, aweme) { // from class: X.0OFo
            public final String LL;
            public final String LLILLJJLI;
            public final String LLILLL;
            public final Aweme LLILZ;
            public static final C616390OFp Companion = new Object() { // from class: X.0OFp
            };
            public static final int $stable = 8;

            @Override // X.InterfaceC1400710mYP
            public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme4, int i) {
                return C635990Ox3.LIZ(this, c1398410mUh, aweme4, i);
            }

            @Override // X.InterfaceC1400710mYP
            public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
                return C635990Ox3.LIZJ(this, i, c19eg, interfaceC214902198i);
            }

            @Override // X.InterfaceC1400710mYP
            public /* bridge */ /* synthetic */ void interceptSmartRoute(View view2, int i, SmartRoute smartRoute, Aweme aweme4, C1398410mUh c1398410mUh) {
                C635990Ox3.LIZLLL(this, view2, i, smartRoute, aweme4, c1398410mUh);
            }

            @Override // X.InterfaceC1400710mYP
            public /* bridge */ /* synthetic */ boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder) {
                return C635990Ox3.LJ(this, viewHolder);
            }

            @Override // X.InterfaceC1400710mYP
            public /* bridge */ /* synthetic */ void onJumpToDetail(String str2) {
                C635990Ox3.LJFF(this, str2);
            }

            @Override // X.InterfaceC1400710mYP
            public C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme4) {
                c1398410mUh.LIZ = "from_ai_portrait_detail";
                c1398410mUh.LIZJ = "ai_portrait_detail";
                return c1398410mUh;
            }

            @Override // X.InterfaceC1400710mYP
            public C1255920ims<? extends AbstractC1255880imo<?, ?>> getPresenter(int i, C19EG c19eg) {
                C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims = new C1255920ims<>();
                c1255920ims.LJIIJ(new C0OCO());
                return c1255920ims;
            }

            @Override // X.InterfaceC1400710mYP
            public boolean sendCustomRequest(C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims, int i) {
                if (c1255920ims != null) {
                    c1255920ims.LIZJ(Integer.valueOf(i), this.LL, this.LLILLJJLI, this.LLILLL, 130, 0, this.LLILZ);
                }
                return true;
            }

            @Override // X.InterfaceC1400710mYP
            public C1398630mV3 onCreateDetailAwemeViewHolder(View view2, String str2, InterfaceC1260110itd interfaceC1260110itd) {
                return new C1398630mV3(view2, str2, interfaceC1260110itd);
            }

            {
                this.LL = templateId;
                this.LLILLJJLI = origPromptId;
                this.LLILLL = str;
                this.LLILZ = aweme;
            }
        };
        AIPortraitDetailAwemeListFragment aIPortraitDetailAwemeListFragment = new AIPortraitDetailAwemeListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("detail_aweme_list_type", 130);
        C786410Ut5.LJJJI("event_label", "ai_portrait_detail", bundle);
        C786410Ut5.LJJJI("detail_id", aid, bundle);
        aIPortraitDetailAwemeListFragment.setArguments(bundle);
        aIPortraitDetailAwemeListFragment.LLLILZJ = interfaceC1400710mYP;
        this.LLJJI = aIPortraitDetailAwemeListFragment;
        aIPortraitDetailAwemeListFragment.LLLFFI = true;
        aIPortraitDetailAwemeListFragment.LLLIILIL = aIPortraitDetailFragment;
        FragmentManager childFragmentManager = aIPortraitDetailFragment.getChildFragmentManager();
        C19EH c19ehLJIIJ = childFragmentManager.LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.ms4, aIPortraitDetailAwemeListFragment, "ai_portrait_detail_list");
        c19ehLJIIJ.LJIJI(new ARunnableS109S0100000_9(aIPortraitDetailAwemeListFragment, 26), false);
        if (!childFragmentManager.LJLJJI()) {
            c19ehLJIIJ.LJIIIZ();
        } else {
            c19ehLJIIJ.LJIIJ();
        }
    }
}
