package com.ss.android.ugc.aweme.story.feed.immersive.component.post;

import X.AbstractC738140SxQ;
import X.C098200Yq;
import X.C1220000hqw;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C13LP;
import X.C189200o6;
import X.C339190DRl;
import X.C427460GpU;
import X.C451610HnL;
import X.C452070Ho5;
import X.C694840RNi;
import X.C706480RnS;
import X.C712140Rwa;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.highlights.feed.InboxSkylightHighlightsCellFeedSharedVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS686S0100000_2;

/* JADX INFO: loaded from: classes12.dex */
public final class HighlightStoryTagComponent extends BaseCellSlotComponent<HighlightStoryTagComponent> {
    public C427460GpU LLJLLIL;
    public TuxTextView LLJLLL;
    public StoryHighlightInfo LLJZ;
    public User LLJZIJLIL;
    public String LLL;
    public String LLLF;
    public final C736950SvV LLLFF;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fbm;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 751);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_highlights_theme_tag", true, awS555S0100000_11);
    }

    public HighlightStoryTagComponent() {
        AFwS198S0000000_11 aFwS198S0000000_11 = AFwS198S0000000_11.get$arr$(174);
        this.LLLFF = new C736950SvV(C13LE.LIZ(InboxSkylightHighlightsCellFeedSharedVM.class), aFwS198S0000000_11, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS243S0000000_11.get$arr$(403), new AwS555S0100000_11((AbstractC738140SxQ) this, 752), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
        try {
            C339190DRl.LIZLLL(getContentView());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        try {
            C339190DRl.LIZIZ(getContentView());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLLIL = (C427460GpU) view.findViewById(R.id.joh);
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.w9_);
        C786410Ut5.I7(new AbS686S0100000_2(this, 11), view);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return C694840RNi.LIZJ(videoItemParams, jm());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String str;
        StoryHighlightCollection storyHighlightCollection;
        String str2;
        StoryHighlightCollection storyHighlightCollection2;
        UrlModel urlModel;
        List<String> urlList;
        String str3;
        TuxTextView tuxTextView;
        VideoItemParams videoItemParams2 = videoItemParams;
        this.LLJZIJLIL = videoItemParams2.getAweme().getAuthor();
        StoryHighlightInfo storyHighlightInfo = videoItemParams2.getAweme().storyHighlightInfo;
        if (storyHighlightInfo != null) {
            this.LLJZ = storyHighlightInfo;
            StoryHighlightCollection storyHighlightCollection3 = storyHighlightInfo.containerCollectionInfo;
            if (storyHighlightCollection3 != null && (str3 = storyHighlightCollection3.title) != null && (tuxTextView = this.LLJLLL) != null) {
                tuxTextView.setText(str3);
            }
            StoryHighlightInfo storyHighlightInfo2 = this.LLJZ;
            String str4 = null;
            if (storyHighlightInfo2 != null && (storyHighlightCollection2 = storyHighlightInfo2.containerCollectionInfo) != null && (urlModel = storyHighlightCollection2.collectionCoverUrl) != null && (urlList = urlModel.getUrlList()) != null) {
                str4 = (String) C13LP.LJJJLL(urlList);
            }
            StoryHighlightInfo storyHighlightInfo3 = this.LLJZ;
            if (storyHighlightInfo3 == null || (storyHighlightCollection = storyHighlightInfo3.containerCollectionInfo) == null || (str2 = storyHighlightCollection.collectionId) == null || (str = (String) ((LinkedHashMap) C712140Rwa.LIZ).get(str2)) == null) {
                str = str4;
            }
            if (str4 != null) {
                if (!Intrinsics.LJFF(this.LLL, str4) || !Intrinsics.LJFF(this.LLLF, str)) {
                    this.LLL = str4;
                    this.LLLF = str;
                    C427460GpU c427460GpU = this.LLJLLIL;
                    if (c427460GpU != null) {
                        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str4);
                        c1331670kl3LJIIIZ.LJJ(c427460GpU.LL);
                        C786410Ut5.h3(c1331670kl3LJIIIZ);
                        if (str == null) {
                            str = "";
                        }
                        C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str);
                        c1331670kl3LJIIIZ2.LJJ(c427460GpU.LLILLJJLI);
                        C786410Ut5.h3(c1331670kl3LJIIIZ2);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}
