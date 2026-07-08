package com.ss.android.ugc.aweme.services;

import X.C19EG;
import X.C2259691DcV;
import X.InterfaceC1364105Vn;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public interface IAvatarPublishStoryService {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    boolean canRecoverEditPage();

    void clearEditPageData();

    void dismissDialog();

    void downloadTextFont(Context context);

    boolean isChangAvatarPublish(Object obj);

    void openEditPage(C19EG c19eg, Bundle bundle, String str, String str2, boolean z, Function1<? super Boolean, Unit> function1);

    void publishDirectly(C19EG c19eg, Bundle bundle, boolean z, boolean z2, Function0<Unit> function0);

    void registerDialogCallback(Function0<Unit> function0);

    Object requestUpdateAvatar(String str, InterfaceC1364105Vn<? super AvatarUri> interfaceC1364105Vn);

    Object requestUpdateAvatar(String str, List<C2259691DcV> list, InterfaceC1364105Vn<? super AvatarUri> interfaceC1364105Vn);

    void unregisterDialogCallback();

    public static final class DefaultImpls {
        public static Object requestUpdateAvatar(IAvatarPublishStoryService iAvatarPublishStoryService, String str, InterfaceC1364105Vn<? super AvatarUri> interfaceC1364105Vn) {
            return iAvatarPublishStoryService.requestUpdateAvatar(str, new ArrayList(), interfaceC1364105Vn);
        }

        public static /* synthetic */ void publishDirectly$default(IAvatarPublishStoryService iAvatarPublishStoryService, C19EG c19eg, Bundle bundle, boolean z, boolean z2, Function0 function0, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = false;
                }
                if ((i & 8) != 0) {
                    z2 = true;
                }
                iAvatarPublishStoryService.publishDirectly(c19eg, bundle, z, z2, function0);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: publishDirectly");
        }

        public static /* synthetic */ void openEditPage$default(IAvatarPublishStoryService iAvatarPublishStoryService, C19EG c19eg, Bundle bundle, String str, String str2, boolean z, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 16) != 0) {
                    z = true;
                }
                iAvatarPublishStoryService.openEditPage(c19eg, bundle, str, str2, z, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openEditPage");
        }
    }
}
