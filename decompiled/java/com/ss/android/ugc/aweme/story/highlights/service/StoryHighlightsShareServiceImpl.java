package com.ss.android.ugc.aweme.story.highlights.service;

import X.C1370970lmR;
import X.C19EG;
import X.InterfaceC1368680lik;
import android.app.Dialog;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryHighlightsShareServiceImpl implements IStoryHighlightsShareService {
    @Override // com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsShareService
    public final void LIZ(C19EG c19eg, final String str, final Aweme aweme, String str2) {
        AwemeSharePackage awemeSharePackageLJJIFFI;
        ShareService shareService = (ShareService) PluggableExtentionKt.pluggableSpi$default(ShareService.class, false, false, false, 14, null);
        if (shareService != null && (awemeSharePackageLJJIFFI = shareService.LJJIFFI(c19eg, str, aweme, str2)) != null) {
            IInternalShareApi.LIZ.getClass();
            C1370970lmR.LIZ().LIZIZ().LJFF(c19eg, awemeSharePackageLJJIFFI, null, null, false, new InterfaceC1368680lik() { // from class: X.06TY
                @Override // X.InterfaceC1368680lik
                public final void LIZIZ(HashMap<String, String> map) {
                }

                @Override // X.InterfaceC1368680lik
                public final void LIZJ(Dialog dialog, SharePackage sharePackage) {
                }

                @Override // X.InterfaceC1368680lik
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC1368680lik
                public final void LJ(IMContact iMContact, int i, boolean z) {
                }

                @Override // X.InterfaceC1368680lik
                public final void LJFF(SharePackage sharePackage) {
                }

                @Override // X.InterfaceC1368680lik
                public final void LJI(SharePackage sharePackage) {
                }

                @Override // X.InterfaceC1368680lik
                public final void LJII(Dialog dialog, SharePackage sharePackage) {
                }

                @Override // X.InterfaceC1368680lik
                public final void LJIIIIZZ() {
                }

                @Override // X.InterfaceC1368680lik
                public final void LJIIIZ(SharePackage sharePackage) {
                }

                @Override // X.InterfaceC1368680lik
                public final void LIZ(SharePackage sharePackage) {
                    String str3;
                    StoryHighlightCollection storyHighlightCollection;
                    C06US c06us = C06US.LIZ;
                    String str4 = str;
                    StoryHighlightInfo storyHighlightInfo = aweme.storyHighlightInfo;
                    if (storyHighlightInfo == null || (storyHighlightCollection = storyHighlightInfo.containerCollectionInfo) == null || (str3 = storyHighlightCollection.collectionId) == null) {
                        str3 = "";
                    }
                    c06us.getClass();
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("enter_from", str4);
                    c0lab.LJ("story_highlight_id", str3);
                    C20684815ws.LJIILLIIL("ttsocial_story_highlight_share_banner_show", c0lab.LIZ);
                }
            }, false, null, false, true, Boolean.TRUE, false, false, null);
        }
    }
}
