package com.ss.android.ugc.aweme.story.highlights.service;

import X.C01GW;
import X.C06TF;
import X.C06TG;
import X.C1390920mIc;
import X.C13BV;
import X.C1440005kM;
import X.C452501pT;
import X.C453940Hr6;
import X.C786410Ut5;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsCollectionListSheetFragment;
import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsCreationSheetFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryHighlightsImmersiveSheetServiceImpl implements IStoryHighlightsImmersiveSheetService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(674));

    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsImmersiveSheetService
    public final void LIZ(Aweme aweme, FragmentManager fragmentManager) {
        C06TF c06tfLIZJ;
        boolean z;
        String uri;
        List<String> urlList;
        Collection collection;
        Fragment storyHighlightsCollectionListSheetFragment;
        UrlModel cover;
        UrlModel cover2;
        IAwemeService iAwemeService;
        String aid = aweme.getAid();
        if (aid != null && aid.length() != 0 && (iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null)) != null) {
            iAwemeService.LLILLL(aweme);
        }
        IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager = (IStoryHighlightsMyDataManager) this.LIZ.getValue();
        if (iStoryHighlightsMyDataManager == null || (c06tfLIZJ = iStoryHighlightsMyDataManager.LIZJ()) == null) {
            c06tfLIZJ = C06TF.NOT_LOADED;
        }
        IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager2 = (IStoryHighlightsMyDataManager) this.LIZ.getValue();
        if (iStoryHighlightsMyDataManager2 != null && iStoryHighlightsMyDataManager2.LJIILLIIL()) {
            z = true;
        } else {
            z = false;
        }
        Video video = aweme.getVideo();
        String str = "";
        if (video == null || (cover2 = video.getCover()) == null || (uri = cover2.getUri()) == null) {
            uri = "";
        }
        Video video2 = aweme.getVideo();
        if (video2 == null || (cover = video2.getCover()) == null || (urlList = cover.getUrlList()) == null) {
            urlList = C13BV.INSTANCE;
        }
        String aid2 = aweme.getAid();
        if (aid2 != null) {
            str = aid2;
        }
        StoryHighlightInfo storyHighlightInfo = aweme.storyHighlightInfo;
        if (storyHighlightInfo == null || (collection = storyHighlightInfo.collectionIds) == null) {
            collection = C13BV.INSTANCE;
        }
        if (c06tfLIZJ == C06TF.NOT_LOADED || (c06tfLIZJ == C06TF.LOADED && !z)) {
            storyHighlightsCollectionListSheetFragment = new StoryHighlightsCollectionListSheetFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("collection_cover_uri", uri, bundle);
            C786410Ut5.LJJJIL(bundle, "collection_cover_url_list", new ArrayList(urlList));
            C786410Ut5.LJJJI("cover_aweme_id", str, bundle);
            C786410Ut5.LJJJIL(bundle, "highlight_collection_ids", new ArrayList(collection));
            storyHighlightsCollectionListSheetFragment.setArguments(bundle);
        } else {
            String str2 = StoryHighlightsCreationSheetFragment._pnsPageId;
            storyHighlightsCollectionListSheetFragment = C06TG.LIZ(uri, str, urlList, false, false);
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = storyHighlightsCollectionListSheetFragment;
        c1390920mIc.LJIIIIZZ(0);
        c1390920mIc.LIZ.LLJLILLLLZIIL = false;
        c1390920mIc.LJI(21);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLILZIL = true;
        tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0635
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C1440005kM.LIZ(new C453940Hr6(false, false, 6));
            }
        };
        tuxSheet.show(fragmentManager, "StoryHighlightsSheet");
        C1440005kM.LIZ(new C453940Hr6(true, false, 6));
    }
}
