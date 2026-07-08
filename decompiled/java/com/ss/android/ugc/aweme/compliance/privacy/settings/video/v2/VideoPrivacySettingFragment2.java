package com.ss.android.ugc.aweme.compliance.privacy.settings.video.v2;

import X.AbstractC191832103a;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C103L;
import X.C103N;
import X.C104A;
import X.C10A4;
import X.C10AV;
import X.C1219900hqm;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1395130mPP;
import X.C1440005kM;
import X.C1447940nma;
import X.C1685300txQ;
import X.C189200o6;
import X.C1915050zvz;
import X.C191819102n;
import X.C191821102p;
import X.C191834103c;
import X.C191848103q;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2344009Gk;
import X.C298640BnC;
import X.C298650BnD;
import X.C298670BnF;
import X.C384050F3z;
import X.C452501pT;
import X.C586090Myl;
import X.C729510SjV;
import X.C786410Ut5;
import X.EnumC1430380nKG;
import X.InterfaceC344240DeY;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.VideoItemRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.VideoItemSettings;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.video.base.VideoPrivacySettingPageViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class VideoPrivacySettingFragment2 extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9ODclPy4wMWs/HELIOSLDsnISsrOmElISEpJmElemsaICs2JxU+IDkyKzwfLDsnISsrDz0yLygpJzth";
    public ConstraintLayout LL;
    public RecyclerView LLILLJJLI;
    public final C103L LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public Aweme LLILZLL;
    public final C01GW LLIZ;

    public final RecyclerView MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ms4) : null;
            this.LLILLJJLI = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS572S0100000_28(this, 170));
        c0om1.LIZIZ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        Aweme aweme = this.LLILZLL;
        c1250250idj.LIZJ = getString((aweme == null || !C729510SjV.LJJIJIL(aweme)) ? 2131845181 : 2131849415);
        c0om1.LIZJ = c1250250idj;
        return c0om1;
    }

    public VideoPrivacySettingFragment2() {
        SoftReference<C103L> softReference = C10AV.LIZ;
        C103L c103l = softReference != null ? softReference.get() : null;
        C10AV.LIZ = null;
        c103l = c103l == null ? new C103L("", new C103N(""), 0, null, null, 60) : c103l;
        this.LLILLL = c103l;
        this.LLILZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 172));
        this.LLILZIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 173));
        this.LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 171));
        TPSCRenderManager tPSCRenderManagerLIZJ = C191821102p.LIZJ();
        Lifecycle lifecycle = getLifecycle();
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 169));
        tPSCRenderManagerLIZJ.getClass();
        TPSCRenderManager.LIZIZ(lifecycle, c103l, c01gwLIZIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        List<PhotoModeImageUrlModel> imageList;
        StandardBusinessModel standardBusinessModel;
        CMPreviewInfo cmPreviewInfo;
        Long previewSettingsDuration;
        String string;
        int privateStatus;
        int privateStatus2;
        super.onDestroy();
        Aweme aweme = this.LLILZLL;
        if (aweme != null) {
            C10A4 c10a4 = C10A4.LIZ;
            this.LLIZ.getValue().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - 0;
            boolean zLIZLLL = C1395130mPP.LIZLLL(aweme);
            String str = (String) this.LLILZ.getValue();
            Aweme aweme2 = this.LLILZLL;
            Integer numValueOf = null;
            if (aweme2 != null) {
                if (aweme2.isSubOnlyVideo()) {
                    privateStatus2 = 3;
                } else {
                    AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme2);
                    privateStatus2 = statusSafety != null ? statusSafety.getPrivateStatus() : 1;
                }
                numValueOf = Integer.valueOf(privateStatus2);
            }
            c10a4.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            C191819102n.LIZ.getClass();
            c2344009Gk.LIZJ(C191819102n.LIZLLL() ? 1 : 0, "is_private");
            String str2 = CardStruct.IStatusCode.DEFAULT;
            c2344009Gk.LJIIIIZZ("is_allow_pugc_template", zLIZLLL ? "1" : CardStruct.IStatusCode.DEFAULT);
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
            c2344009Gk.LIZJ(C191819102n.LIZ().getFriendCount(), "muf_cnt");
            c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
            AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(aweme);
            if (statusSafety2 != null && Integer.valueOf(statusSafety2.getPrivateStatus()) != null) {
                if (numValueOf != null) {
                    privateStatus = numValueOf.intValue();
                } else {
                    AwemeStatus statusSafety3 = AwemeExtKt.getStatusSafety(aweme);
                    if (statusSafety3 == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    privateStatus = statusSafety3.getPrivateStatus();
                }
                c2344009Gk.LJFF("privacy_status", C10A4.LIZIZ(privateStatus));
            }
            if (C298670BnF.LIZ()) {
                ContentModel contentModel = aweme.getContentModel();
                if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (cmPreviewInfo = standardBusinessModel.getCmPreviewInfo()) != null && (previewSettingsDuration = cmPreviewInfo.getPreviewSettingsDuration()) != null && (string = previewSettingsDuration.toString()) != null) {
                    str2 = string;
                }
                c2344009Gk.LJFF("preview_duration", str2);
            }
            if (C298650BnD.LIZ()) {
                C10A4.LIZ(c2344009Gk, aweme);
            }
            if (C298640BnC.LIZ()) {
                int iLIZIZ = C1447940nma.LIZIZ(aweme);
                int size = 0;
                c2344009Gk.LIZJ(iLIZIZ <= 0 ? 0 : 1, "if_preview_on");
                PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    size = imageList.size();
                }
                c2344009Gk.LIZJ(size, "total_photo_cnt");
                c2344009Gk.LIZJ(iLIZIZ, "preview_photo_cnt");
            }
            C20684815ws.LJIILLIIL("exit_privacy_setting_video", c2344009Gk.LIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Aweme aweme;
        Aweme aweme2;
        super.onPause();
        Aweme aweme3 = this.LLILZLL;
        if (aweme3 == null) {
            return;
        }
        if ((C1395130mPP.LJ(EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE(), aweme3) || (((aweme = this.LLILZLL) != null && C1395130mPP.LJ(EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE(), aweme)) || ((aweme2 = this.LLILZLL) != null && C1395130mPP.LJ(EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE(), aweme2)))) && ((VideoPrivacySettingPageViewModel) new ViewModelProvider(this).get(VideoPrivacySettingPageViewModel.class)).LLILZLL) {
            C1440005kM.LIZ(new C1219900hqm());
            Aweme aweme4 = this.LLILZLL;
            if (aweme4 != null) {
                C1440005kM.LIZ(new C586090Myl(aweme4));
            }
        }
        Aweme aweme5 = this.LLILZLL;
        if (aweme5 == null || !C1395130mPP.LIZJ(aweme5)) {
            return;
        }
        C1440005kM.LIZ(new C1219900hqm());
        Aweme aweme6 = this.LLILZLL;
        if (aweme6 != null) {
            C1440005kM.LIZ(new C586090Myl(aweme6));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String aid;
        Serializable serializable;
        Map<String, PrivacySettingsRestrictionItem> mapLJ;
        Serializable serializable2;
        Map<String, Integer> mapLJ2;
        Integer numValueOf;
        String aid2;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        CMPreviewInfo cmPreviewInfo;
        String str;
        int privateStatus;
        int privateStatus2;
        VideoItemSettings videoItemSettings;
        VideoItemRestriction videoItemRestriction;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        Long previewSettingsDuration = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.boe);
            } else {
                viewFindViewById = null;
            }
            this.LL = (ConstraintLayout) viewFindViewById;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1e);
        View viewFindViewById2 = this.LL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.boe);
            } else {
                viewFindViewById2 = null;
            }
            this.LL = (ConstraintLayout) viewFindViewById2;
        }
        viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById2.getContext()));
        if (this.LLILZLL == null) {
            return;
        }
        int i = 1;
        MR().setLayoutManager(new WrapLinearLayoutManager(getContext(), 1));
        MR().setItemAnimator(null);
        VideoPrivacySettingPageViewModel videoPrivacySettingPageViewModel = (VideoPrivacySettingPageViewModel) new ViewModelProvider(this).get(VideoPrivacySettingPageViewModel.class);
        Aweme aweme = this.LLILZLL;
        videoPrivacySettingPageViewModel.LL = aweme;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        videoPrivacySettingPageViewModel.LLILLJJLI = aid;
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("restriction");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof VideoItemRestriction) || (videoItemRestriction = (VideoItemRestriction) serializable) == null || (mapLJ = videoItemRestriction.getRestrictionMap()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        videoPrivacySettingPageViewModel.LLILLL = mapLJ;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable2 = arguments2.getSerializable("settings");
        } else {
            serializable2 = null;
        }
        if (!(serializable2 instanceof VideoItemSettings) || (videoItemSettings = (VideoItemSettings) serializable2) == null || (mapLJ2 = videoItemSettings.getSettingMap()) == null) {
            mapLJ2 = C2097608Jq.LJ();
        }
        videoPrivacySettingPageViewModel.LLILZ = mapLJ2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            C19EG activity = getActivity();
            if (activity != null) {
                arguments3.putInt("sender_hashcode", System.identityHashCode(activity));
            }
        } else {
            arguments3 = null;
        }
        videoPrivacySettingPageViewModel.LLILZIL = arguments3;
        TPSCRenderManager tPSCRenderManagerLIZJ = C191821102p.LIZJ();
        C191848103q c191848103q = new C191848103q(new ContextThemeWrapper(requireContext(), R.style.abn), this, this, this.LLILLL.LIZ, getArguments(), null, null, 224);
        List<? extends C104A> list = this.LLILLL.LJ;
        tPSCRenderManagerLIZJ.getClass();
        C191834103c c191834103cLIZJ = TPSCRenderManager.LIZJ(c191848103q, list);
        ((ArrayList) c191834103cLIZJ.LLILZIL).add(new AbstractC191832103a() { // from class: X.103Z
            @Override // X.AbstractC191832103a
            public final void LIZ(List<? extends AbstractC191843103l> list2) {
            }

            @Override // X.AbstractC191832103a
            public final void LIZIZ(List<AbstractC191840103i> list2) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) list2;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
                arrayList.add(new AnonymousClass1042(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            }
        });
        c191834103cLIZJ.LJJIJIIJIL();
        MR().setAdapter(c191834103cLIZJ);
        C10A4 c10a4 = C10A4.LIZ;
        Aweme aweme2 = this.LLILZLL;
        String str2 = (String) this.LLILZ.getValue();
        String str3 = (String) this.LLILZIL.getValue();
        Aweme aweme3 = this.LLILZLL;
        if (aweme3 != null) {
            if (aweme3.isSubOnlyVideo()) {
                privateStatus2 = 3;
            } else {
                AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme3);
                if (statusSafety != null) {
                    privateStatus2 = statusSafety.getPrivateStatus();
                } else {
                    privateStatus2 = 1;
                }
            }
            numValueOf = Integer.valueOf(privateStatus2);
        } else {
            numValueOf = null;
        }
        c10a4.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (aweme2 != null) {
            aid2 = aweme2.getAid();
        } else {
            aid2 = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid2);
        C191819102n.LIZ.getClass();
        c2344009Gk.LIZJ(C191819102n.LIZLLL() ? 1 : 0, "is_private");
        c2344009Gk.LIZJ(C191819102n.LIZ().getFriendCount(), "muf_cnt");
        if (aweme2 != null) {
            if (C729510SjV.LJJIJIL(aweme2)) {
                str = "story";
            } else {
                str = "post";
            }
            c2344009Gk.LJFF("story type", str);
            AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(aweme2);
            if (statusSafety2 != null && Integer.valueOf(statusSafety2.getPrivateStatus()) != null) {
                if (numValueOf != null) {
                    privateStatus = numValueOf.intValue();
                } else {
                    AwemeStatus statusSafety3 = AwemeExtKt.getStatusSafety(aweme2);
                    if (statusSafety3 != null) {
                        privateStatus = statusSafety3.getPrivateStatus();
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                c2344009Gk.LJFF("privacy_status", C10A4.LIZIZ(privateStatus));
            }
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        if (aweme2 != null && (contentModel = aweme2.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (cmPreviewInfo = standardBusinessModel.getCmPreviewInfo()) != null) {
            previewSettingsDuration = cmPreviewInfo.getPreviewSettingsDuration();
        }
        c2344009Gk.LJ(previewSettingsDuration, "preview_duration");
        if (C298650BnD.LIZ()) {
            C10A4.LIZ(c2344009Gk, aweme2);
        }
        if (C298640BnC.LIZ()) {
            int iLIZIZ = C1447940nma.LIZIZ(aweme2);
            int size = 0;
            if (iLIZIZ <= 0) {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "if_preview_on");
            if (aweme2 != null && (photoModeImageInfo = aweme2.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                size = imageList.size();
            }
            c2344009Gk.LIZJ(size, "total_photo_cnt");
            c2344009Gk.LIZJ(iLIZIZ, "preview_photo_cnt");
        }
        C20684815ws.LJIILLIIL("video_privacy_setting_pop_up_show", c2344009Gk.LIZ);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.b_q);
        if (viewGroup != null) {
            C1915050zvz.LIZ.getClass();
            C1915050zvz.LIZ("existing_post_privacy_setting", viewGroup);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bev, viewGroup, false);
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
}
