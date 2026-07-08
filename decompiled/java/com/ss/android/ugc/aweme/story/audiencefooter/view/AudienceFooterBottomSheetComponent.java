package com.ss.android.ugc.aweme.story.audiencefooter.view;

import X.C01GW;
import X.C098200Yq;
import X.C0L44;
import X.C0LAB;
import X.C12N5;
import X.C12N6;
import X.C12N8;
import X.C1453840nw6;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20622315mn;
import X.C2341909Fp;
import X.C281180B0i;
import X.C298680BnG;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import Y.AObserverS231S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.audiencefooter.vm.AudienceFooterBottomSheetViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class AudienceFooterBottomSheetComponent extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZiQ5LSY2JiYpLyA8PCHELIOSA+Zzk6LTJiCDo3ISAiKioVJyo4LD0RJzE4JiIAICApPQw8JTUjJyo9PA==";
    public C12N8 LLIZ;
    public Function1<? super Integer, Unit> LLIZLLLIL;
    public Function1<? super Integer, Unit> LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 482));

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    @Override // X.InterfaceC344240DeY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0OM1 Sn() {
        /*
            r6 = this;
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L71
            X.01GW r0 = X.C20622315mn.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L63
            r0 = 2131848939(0x7f116eeb, float:1.9331398E38)
            java.lang.String r1 = r1.getString(r0)
        L1b:
            X.0OM1 r5 = new X.0OM1
            r5.<init>()
            X.0idj r0 = new X.0idj
            r0.<init>()
            r0.LIZJ = r1
            r5.LIZJ = r0
            r4 = 0
            r5.LIZLLL = r4
            boolean r0 = X.C20622315mn.LIZ()
            if (r0 == 0) goto L60
            r0 = 1
            X.0idn[] r3 = new X.AbstractC1250290idn[r0]
            X.0ifB r2 = new X.0ifB
            r2.<init>()
            r2.LIZLLL()
            r0 = 2130775055(0x7f010c0f, float:1.7153302E38)
            r2.LIZJ = r0
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L61
            r0 = 2131828871(0x7f112087, float:1.9290695E38)
            java.lang.String r0 = r1.getString(r0)
        L4f:
            r2.LJIIIIZZ = r0
            kotlin.jvm.internal.AwS573S0100000_29 r1 = new kotlin.jvm.internal.AwS573S0100000_29
            r0 = 483(0x1e3, float:6.77E-43)
            r1.<init>(r6, r0)
            r2.LIZJ(r1)
            r3[r4] = r2
            r5.LIZIZ(r3)
        L60:
            return r5
        L61:
            r0 = 0
            goto L4f
        L63:
            boolean r0 = X.C20622315mn.LIZ()
            if (r0 == 0) goto L71
            r0 = 2131846769(0x7f116671, float:1.9326997E38)
            java.lang.String r1 = r1.getString(r0)
            goto L1b
        L71:
            java.lang.String r1 = ""
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.audiencefooter.view.AudienceFooterBottomSheetComponent.Sn():X.0OM1");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        VideoPublishEditModel videoPublishEditModel;
        Boolean boolValueOf;
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        MusicObject musicObject;
        VideoPublishEditModel editModel;
        VideoPublishEditModel videoPublishEditModel2;
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.ba5);
        this.LLIZ = (C12N8) view.findViewById(R.id.ba3);
        ((AudienceFooterBottomSheetViewModel) this.LLJI.getValue()).LL.observe(this, new AObserverS231S0100000_29(this, 179));
        C12N8 c12n8 = this.LLIZ;
        if (c12n8 != null) {
            c12n8.setPostToStoryOnClick(this.LLIZLLLIL);
        }
        C12N8 c12n82 = this.LLIZ;
        if (c12n82 != null) {
            c12n82.setSheetDismissOnClick(new AwS573S0100000_29(this, 952));
        }
        C12N8 c12n83 = this.LLIZ;
        VideoPublishEditModel videoPublishEditModel3 = null;
        if (c12n83 != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                videoPublishEditModel2 = (VideoPublishEditModel) arguments.getSerializable("args");
            } else {
                videoPublishEditModel2 = null;
            }
            c12n83.setEditModel(videoPublishEditModel2);
        }
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            videoPublishEditModel = (VideoPublishEditModel) arguments2.getSerializable("args");
        } else {
            videoPublishEditModel = null;
        }
        int i = 4;
        if (((Boolean) C281180B0i.LIZIZ.getValue()).booleanValue() && videoPublishEditModel != null && videoPublishEditModel.isPrivate == 1) {
            String str = AudienceFooterBottomSheetOption._pnsPageId;
            c19ehLJIIJ.LIZIZ(R.id.ba5, C12N6.LIZ(videoPublishEditModel, 3));
        } else {
            String str2 = AudienceFooterBottomSheetOption._pnsPageId;
            AudienceFooterBottomSheetOption audienceFooterBottomSheetOptionLIZ = C12N6.LIZ(videoPublishEditModel, 0);
            AudienceFooterBottomSheetOption audienceFooterBottomSheetOptionLIZ2 = C12N6.LIZ(videoPublishEditModel, 1);
            c19ehLJIIJ.LIZIZ(R.id.ba5, audienceFooterBottomSheetOptionLIZ);
            c19ehLJIIJ.LIZIZ(R.id.ba5, audienceFooterBottomSheetOptionLIZ2);
            if (C298680BnG.LIZ()) {
                if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (musicBuzModel = creativeModel.musicBuzModel) != null && (musicObject = musicBuzModel.music) != null) {
                    boolValueOf = Boolean.valueOf(musicObject.isCommerceMusic);
                } else {
                    boolValueOf = null;
                }
                if (C0L44.LIZIZ(boolValueOf) && !C1453840nw6.LJ(videoPublishEditModel)) {
                    c19ehLJIIJ.LIZIZ(R.id.ba5, C12N6.LIZ(videoPublishEditModel, 4));
                }
            }
        }
        if (C20622315mn.LIZ()) {
            c19ehLJIIJ.LIZIZ(R.id.ba5, C12N6.LIZ(videoPublishEditModel, 2));
        }
        c19ehLJIIJ.LJIIIZ();
        if (((Boolean) C20622315mn.LIZLLL.getValue()).booleanValue()) {
            C12N5 c12n5 = C12N5.LIZ;
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                videoPublishEditModel3 = (VideoPublishEditModel) arguments3.getSerializable("args");
            }
            c12n5.getClass();
            if (videoPublishEditModel3 != null) {
                C0LAB c0labLIZ = C12N5.LIZ(videoPublishEditModel3);
                c0labLIZ.LJ("message_button_show_way", "story_edit_page_share_panel");
                C2341909Fp.LIZ("story_edit_page_post_to_story_panel_show", c0labLIZ.LIZ);
            }
        } else {
            C12N5 c12n52 = C12N5.LIZ;
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                videoPublishEditModel3 = (VideoPublishEditModel) arguments4.getSerializable("args");
            }
            c12n52.getClass();
            if (videoPublishEditModel3 != null) {
                C2341909Fp.LIZ("story_edit_page_share_panel_show", C12N5.LIZ(videoPublishEditModel3).LIZ);
            }
        }
        C12N8 c12n84 = this.LLIZ;
        if (c12n84 != null && (editModel = c12n84.getEditModel()) != null) {
            int i2 = editModel.isPrivate;
            this.LLJI.getValue().getClass();
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2 || i2 != 4) {
                        i = 1;
                    }
                } else {
                    i = 3;
                }
            } else {
                i = 0;
            }
            ((AudienceFooterBottomSheetViewModel) this.LLJI.getValue()).vQ2(i);
            C12N8 c12n85 = this.LLIZ;
            if (c12n85 != null) {
                c12n85.LL = i2;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.rs, viewGroup, false);
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
