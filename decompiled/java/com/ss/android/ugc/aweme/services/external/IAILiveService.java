package com.ss.android.ugc.aweme.services.external;

import X.InterfaceC1364105Vn;
import X.InterfaceC658750Psf;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.services.story.IAlbumParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public interface IAILiveService {
    boolean canShowBanner();

    IAlbumParam defaultAlbumParam();

    void downloadGuideResourceIfNeed();

    boolean enableInboxBanner();

    boolean enableMDPBanner();

    boolean enableStoryAILivePhotoAlbumEntrance();

    boolean enableStoryAILiveSearchBanner();

    boolean forbidAnchor();

    String getAILivePhotoEntranceCoverUrl();

    String getAILivePhotoEntranceDynamicCoverUrl();

    String getDynamicString(int i, String str, Object... objArr);

    int getQuotaRemain(String str);

    String getTranslateResult(String str);

    void goPostAlbum(Activity activity, OpenPostAlbumParams openPostAlbumParams, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager, Function0<Unit> function0);

    void goStoryAlbum(Activity activity, IAlbumParam iAlbumParam);

    void goStoryAlbumWithGuideCheck(Activity activity, Context context, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager, IAlbumParam iAlbumParam);

    boolean isAILiveEnable();

    boolean isAILiveShootWay(String str, String str2);

    boolean isPostAILiveEnable();

    boolean isStoryAILiveEnable();

    void mobInboxBanner(String str);

    void onClickBanner();

    void onShowBanner();

    void postEvent(HelpCenterResultEvent helpCenterResultEvent);

    Object processMusicFollowingCreation(IShortVideoContext iShortVideoContext, Context context, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    DialogFragment provideAILiveSheetContentView(Context context, OpenPostAlbumParams openPostAlbumParams);

    InterfaceC658750Psf provideImageMonitorListener(ImageMonitorParams imageMonitorParams);

    void refreshQuotaCache(RefreshQuotaScene refreshQuotaScene);

    void refreshQuotaCacheIfNeed(RefreshQuotaScene refreshQuotaScene);

    Object requestNotifyQuotaUpdate(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    boolean shouldShowSheetWhenClickAnchor();

    Object translateAnchorText(String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    public static final class DefaultImpls {
        public static /* synthetic */ int getQuotaRemain$default(IAILiveService iAILiveService, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                return iAILiveService.getQuotaRemain(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getQuotaRemain");
        }

        public static /* synthetic */ String getDynamicString$default(IAILiveService iAILiveService, int i, String str, Object[] objArr, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    str = null;
                }
                return iAILiveService.getDynamicString(i, str, objArr);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDynamicString");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void goPostAlbum$default(IAILiveService iAILiveService, Activity activity, OpenPostAlbumParams openPostAlbumParams, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager, Function0 function0, int i, Object obj) {
            if (obj == null) {
                if ((i & 16) != 0) {
                    function0 = null;
                }
                iAILiveService.goPostAlbum(activity, openPostAlbumParams, lifecycleOwner, fragmentManager, function0);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goPostAlbum");
        }
    }
}
