package com.ss.android.ugc.aweme.im.sticker.basic.provider;

import X.C09R3;
import X.C0ZSY;
import X.C13LE;
import X.C1807670x8n;
import X.C1834340xpo;
import X.C1ETI;
import X.C21167617sY;
import X.C2217381BqS;
import X.C450100Hku;
import X.C450160Hl0;
import X.InterfaceC1808360x9u;
import X.InterfaceC1808700xAS;
import X.InterfaceC1808720xAU;
import X.InterfaceC1808750xAX;
import X.InterfaceC1808780xAa;
import X.InterfaceC1839980xyu;
import X.InterfaceC2217461Bqa;
import X.InterfaceC450290HlD;
import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sticker.api.provider.IStickerApiProviderService;
import com.ss.android.ugc.aweme.im.sticker.api.provider.StickerApiStubs;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService;
import com.ss.android.ugc.aweme.services.external.ability.VideoStickerEntryMethod;

/* JADX INFO: loaded from: classes28.dex */
public final class BasicStickerApiProviderService implements IStickerApiProviderService {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] $$delegatedProperties;
    public volatile C450100Hku backend_getStickerRepositoryDiLcom_ss_android_ugc_aweme_im_sticker_basic_repo_BasicStickerRepository;
    public volatile C1834340xpo backend_getTypingRecommendationStickerCacheDiLcom_ss_android_ugc_aweme_im_sticker_basic_repo_BasicTypingRecommendationStickerCache;
    public final C21167617sY stickerRepositoryDi$delegate;
    public final C21167617sY typingRecommendationStickerCacheDi$delegate;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BasicStickerApiProviderService.class, "stickerRepositoryDi", "getStickerRepositoryDi()Lcom/ss/android/ugc/aweme/im/sticker/basic/repo/BasicStickerRepository;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BasicStickerApiProviderService.class, "typingRecommendationStickerCacheDi", "getTypingRecommendationStickerCacheDi()Lcom/ss/android/ugc/aweme/im/sticker/basic/repo/BasicTypingRecommendationStickerCache;", 0);
        c09r3.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    private final C450100Hku getStickerRepositoryDi() {
        C450100Hku c450100Hku = this.backend_getStickerRepositoryDiLcom_ss_android_ugc_aweme_im_sticker_basic_repo_BasicStickerRepository;
        if (c450100Hku == null) {
            synchronized (this) {
                c450100Hku = this.backend_getStickerRepositoryDiLcom_ss_android_ugc_aweme_im_sticker_basic_repo_BasicStickerRepository;
                if (c450100Hku == null) {
                    C450100Hku c450100Hku2 = (C450100Hku) C1807670x8n.LLLLZLLLI((C450160Hl0) C1807670x8n.LLLLZLLIL());
                    this.backend_getStickerRepositoryDiLcom_ss_android_ugc_aweme_im_sticker_basic_repo_BasicStickerRepository = c450100Hku2;
                    return c450100Hku2;
                }
            }
        }
        return c450100Hku;
    }

    private final C1834340xpo getTypingRecommendationStickerCacheDi() {
        C1834340xpo c1834340xpo = this.backend_getTypingRecommendationStickerCacheDiLcom_ss_android_ugc_aweme_im_sticker_basic_repo_BasicTypingRecommendationStickerCache;
        if (c1834340xpo == null) {
            synchronized (this) {
                c1834340xpo = this.backend_getTypingRecommendationStickerCacheDiLcom_ss_android_ugc_aweme_im_sticker_basic_repo_BasicTypingRecommendationStickerCache;
                if (c1834340xpo == null) {
                    C1834340xpo c1834340xpo2 = (C1834340xpo) C1807670x8n.LLLZ();
                    this.backend_getTypingRecommendationStickerCacheDiLcom_ss_android_ugc_aweme_im_sticker_basic_repo_BasicTypingRecommendationStickerCache = c1834340xpo2;
                    return c1834340xpo2;
                }
            }
        }
        return c1834340xpo;
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.provider.IStickerApiProviderService
    public InterfaceC1839980xyu getPhoto2StickerEventTracker() {
        return StickerApiStubs.INSTANCE.getPhoto2StickerEventTracker();
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.provider.IStickerApiProviderService
    public InterfaceC1808750xAX getPhoto2StickerInlineRepository() {
        return StickerApiStubs.INSTANCE.getPhoto2StickerInlineRepository();
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.provider.IStickerApiProviderService
    public C1ETI getPhoto2StickerKeva() {
        return StickerApiStubs.INSTANCE.getPhoto2StickerKeva();
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.provider.IStickerApiProviderService
    public InterfaceC1808700xAS getPhoto2StickerPerfTracker() {
        return StickerApiStubs.INSTANCE.getPhoto2StickerPerfTracker();
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.provider.IStickerApiProviderService
    public C0ZSY getPhoto2StickerService() {
        return StickerApiStubs.INSTANCE.getPhoto2StickerService();
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.provider.IStickerApiProviderService
    public InterfaceC1808780xAa getPhoto2StickerUploadService() {
        return StickerApiStubs.INSTANCE.getPhoto2StickerUploadService();
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.provider.IStickerApiProviderService
    public InterfaceC1808360x9u getPhotoCommentStickerRepository() {
        return StickerApiStubs.INSTANCE.getPhotoCommentStickerRepository();
    }

    public BasicStickerApiProviderService() {
        C21167617sY c21167617sY = C21167617sY.LIZ;
        this.stickerRepositoryDi$delegate = c21167617sY;
        this.typingRecommendationStickerCacheDi$delegate = c21167617sY;
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.provider.IStickerApiProviderService
    public InterfaceC450290HlD getStickerRepository() {
        return getStickerRepositoryDi();
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.provider.IStickerApiProviderService
    public InterfaceC1808720xAU getTypingRecommendationStickerCache() {
        return getTypingRecommendationStickerCacheDi();
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.provider.IStickerApiProviderService
    public IVideo2StickerService getVideo2StickerService() {
        return new IVideo2StickerService() { // from class: X.0m9Y
            @Override // com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService
            public final void photo2Sticker(Activity activity, MediaModel mediaModel, Intent intent, IVideo2StickerService.Callback callback) {
            }

            @Override // com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService
            public final void photo2Sticker(Activity activity, String str, Intent intent, IVideo2StickerService.Callback callback) {
            }

            @Override // com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService
            public final void video2StickerEdit(Activity activity, Aweme aweme, VideoStickerEntryMethod videoStickerEntryMethod, IVideo2StickerService.Callback callback, String str, String str2) {
            }

            @Override // com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService
            public final void downloadAndOpenVideoTrimForSticker(Activity activity, Aweme aweme, IVideo2StickerService.Callback callback) {
                IVideo2StickerService.DefaultImpls.downloadAndOpenVideoTrimForSticker(this, activity, aweme, callback);
            }

            @Override // com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService
            public final void openVideoTrimForSticker(Activity activity, String str, long j, String str2) {
                IVideo2StickerService.DefaultImpls.openVideoTrimForSticker(this, activity, str, j, str2);
            }
        };
    }
}
