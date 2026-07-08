package com.ss.android.ugc.aweme.services.publish;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public interface IAVPublishExtension<T> {

    public interface IAddHashTagCallback {
        void onHashTagUpdate(String str);
    }

    void callbackAnchors(List<CreateAnchorInfo> list);

    Integer getAnchorIconRawId();

    UrlModel getAnchorIconUrl();

    String getAnchorText();

    String getName();

    boolean haveAnchors(int i);

    boolean isDisplayAnchor();

    void observeClick(Function0<Unit> function0);

    void onAccountUpdate();

    void onActivityResult(int i, int i2, Intent intent);

    void onAddHashTag(String str, List<? extends TextExtraStruct> list);

    void onBackPressed(PublishOutput publishOutput);

    void onBindOptionView(Fragment fragment, View view);

    void onCreate(Fragment fragment, View view, LifecycleOwner lifecycleOwner, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, Callback callback, View view2);

    void onCreateMultiViewPublish(Fragment fragment, View view, LifecycleOwner lifecycleOwner, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, List<UploadableDraftEffect> list, List<UploadableMobileEffect> list2, ExtensionMisc extensionMisc, Callback callback, View view2);

    View onCreateOptionView(Context context, ViewGroup viewGroup, View view);

    void onDestroy();

    void onExtensionEnable(Map<AVPublishExtensionBiz, ? extends AVPublishExtensionVisible> map, boolean z);

    void onJumpToShootFromFypWithPoiData(PoiData poiData);

    void onJumpToShootFromLynxWithPoiData(PoiData poiData, Integer num, String str);

    void onPublish(PublishOutput publishOutput);

    void onResume();

    void onSaveDraft(PublishOutput publishOutput);

    void onSoftKeyboardHide(String str, List<? extends TextExtraStruct> list);

    void onUnbindOptionView();

    T provideExtensionData();

    void registerOnAddAnchorListener(Function0<Unit> function0);

    void registerOnRemoveAnchorListener(Function1<? super Integer, Unit> function1);

    void unregisterOnAddAnchorListener(Function0<Unit> function0);

    /* JADX INFO: loaded from: classes30.dex */
    public interface Callback {
        List<String> getValidHashTagList();

        void onECUpdateBC(boolean z, boolean z2, int i);

        void onECUpdateBO(boolean z, boolean z2);

        void onGameBCToggleStateUpdate(String str);

        void onReplaceSoundClickFromAnchorPanel();

        /* JADX INFO: loaded from: classes15.dex */
        public static final class DefaultImpls {
            public static void onReplaceSoundClickFromAnchorPanel(Callback callback) {
            }

            public static /* synthetic */ void onECUpdateBC$default(Callback callback, boolean z, boolean z2, int i, int i2, Object obj) {
                if (obj == null) {
                    if ((i2 & 4) != 0) {
                        i = 0;
                    }
                    callback.onECUpdateBC(z, z2, i);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onECUpdateBC");
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class DefaultImpls {
        public static <T> void callbackAnchors(IAVPublishExtension<T> iAVPublishExtension, List<CreateAnchorInfo> list) {
        }

        public static <T> Integer getAnchorIconRawId(IAVPublishExtension<T> iAVPublishExtension) {
            return null;
        }

        public static <T> UrlModel getAnchorIconUrl(IAVPublishExtension<T> iAVPublishExtension) {
            return null;
        }

        public static <T> String getAnchorText(IAVPublishExtension<T> iAVPublishExtension) {
            return null;
        }

        public static <T> boolean haveAnchors(IAVPublishExtension<T> iAVPublishExtension, int i) {
            return false;
        }

        public static <T> boolean isDisplayAnchor(IAVPublishExtension<T> iAVPublishExtension) {
            return true;
        }

        public static <T> void onAccountUpdate(IAVPublishExtension<T> iAVPublishExtension) {
        }

        public static <T> void onActivityResult(IAVPublishExtension<T> iAVPublishExtension, int i, int i2, Intent intent) {
        }

        public static <T> void onAddHashTag(IAVPublishExtension<T> iAVPublishExtension, String str, List<? extends TextExtraStruct> list) {
        }

        public static <T> void onBackPressed(IAVPublishExtension<T> iAVPublishExtension, PublishOutput publishOutput) {
        }

        public static <T> void onExtensionEnable(IAVPublishExtension<T> iAVPublishExtension, Map<AVPublishExtensionBiz, ? extends AVPublishExtensionVisible> map, boolean z) {
        }

        public static <T> void onJumpToShootFromFypWithPoiData(IAVPublishExtension<T> iAVPublishExtension, PoiData poiData) {
        }

        public static <T> void onJumpToShootFromLynxWithPoiData(IAVPublishExtension<T> iAVPublishExtension, PoiData poiData, Integer num, String str) {
        }

        public static <T> void onPublish(IAVPublishExtension<T> iAVPublishExtension, PublishOutput publishOutput) {
        }

        public static <T> void onResume(IAVPublishExtension<T> iAVPublishExtension) {
        }

        public static <T> void onSaveDraft(IAVPublishExtension<T> iAVPublishExtension, PublishOutput publishOutput) {
        }

        public static <T> void onSoftKeyboardHide(IAVPublishExtension<T> iAVPublishExtension, String str, List<? extends TextExtraStruct> list) {
        }

        public static <T> void onUnbindOptionView(IAVPublishExtension<T> iAVPublishExtension) {
        }

        public static <T> void registerOnAddAnchorListener(IAVPublishExtension<T> iAVPublishExtension, Function0<Unit> function0) {
        }

        public static <T> void registerOnRemoveAnchorListener(IAVPublishExtension<T> iAVPublishExtension, Function1<? super Integer, Unit> function1) {
        }

        public static <T> void unregisterOnAddAnchorListener(IAVPublishExtension<T> iAVPublishExtension, Function0<Unit> function0) {
        }

        public static <T> void onCreateMultiViewPublish(IAVPublishExtension<T> iAVPublishExtension, Fragment fragment, View view, LifecycleOwner lifecycleOwner, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, List<UploadableDraftEffect> list, List<UploadableMobileEffect> list2, ExtensionMisc extensionMisc, Callback callback, View view2) {
            iAVPublishExtension.onCreate(fragment, view, lifecycleOwner, bundle, aVPublishContentType, publishOutput, extensionMisc, callback, view2);
        }
    }
}
