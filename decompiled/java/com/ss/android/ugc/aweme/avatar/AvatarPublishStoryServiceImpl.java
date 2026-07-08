package com.ss.android.ugc.aweme.avatar;

import X.AbstractC848400XPy;
import X.C098200Yq;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0FI2;
import X.C0MLY;
import X.C0MOJ;
import X.C0MP1;
import X.C0VSJ;
import X.C0XQ7;
import X.C11S5;
import X.C122T;
import X.C1443550nfV;
import X.C1443650nff;
import X.C1701940uOG;
import X.C189200o6;
import X.C19565911gn;
import X.C19EG;
import X.C1C7U;
import X.C2188811AlT;
import X.C2259691DcV;
import X.C23260099m;
import X.C298130BmN;
import X.C566990MLp;
import X.C580230MpJ;
import X.InterfaceC1364105Vn;
import Y.AfS172S0100000_3;
import Y.AfS177S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.services.IAvatarPublishStoryService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS118S0400000_22;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS409S0200000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AvatarPublishStoryServiceImpl implements IAvatarPublishStoryService {
    public Function0<Unit> LIZ = AFwS194S0000000_8.get$arr$(72);

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final void clearEditPageData() {
        C580230MpJ.LIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final boolean canRecoverEditPage() {
        return C580230MpJ.LIZ != null;
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final void dismissDialog() {
        this.LIZ.invoke();
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final void unregisterDialogCallback() {
        this.LIZ = AFwS194S0000000_8.get$arr$(73);
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final void downloadTextFont(Context context) {
        C19565911gn.LIZ();
        C122T.LIZ();
        C122T.LIZIZ();
        C0FI2.LJIJJ().LJJIL(context, Boolean.valueOf(!C298130BmN.LIZ()));
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final boolean isChangAvatarPublish(Object obj) {
        if (obj != null && (obj instanceof VideoPublishEditModel)) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            ChangeAvatarModel changeAvatarModel = videoPublishEditModel.creativeModel.changeAvatarModel;
            if (changeAvatarModel.isFromChangeAvatar && (changeAvatarModel.isSingletonRecover || !videoPublishEditModel.mIsFromDraft)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final void registerDialogCallback(Function0<Unit> function0) {
        this.LIZ = function0;
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final Object requestUpdateAvatar(String str, InterfaceC1364105Vn<? super AvatarUri> interfaceC1364105Vn) {
        return IAvatarPublishStoryService.DefaultImpls.requestUpdateAvatar(this, str, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final Object requestUpdateAvatar(String str, List<C2259691DcV> list, InterfaceC1364105Vn<? super AvatarUri> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C0VSJ c0vsj = new C0VSJ(str);
        long j = 1024;
        int length = (int) (((c0vsj.length() / j) + 1) * j);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(Api.LIZIZ);
        sbLIZ.append("?uid=");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        final Looper mainLooper = Looper.getMainLooper();
        ((AbstractC848400XPy) iAccountUserServiceLJFF).LJJZ(new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.avatar.AvatarPublishStoryServiceImpl$requestUpdateAvatar$2$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("AvatarPublishStoryServiceImpl@ef4a.requestUpdateAvatar$2$1");
                Object messageObj = HandlerHook.getMessageObj(message.obj);
                if (messageObj instanceof AvatarUri) {
                    InterfaceC1364105Vn<AvatarUri> interfaceC1364105Vn2 = c23260099m;
                    C189200o6.m2constructorimpl(messageObj);
                    interfaceC1364105Vn2.resumeWith(messageObj);
                } else if (messageObj instanceof Throwable) {
                    InterfaceC1364105Vn<AvatarUri> interfaceC1364105Vn3 = c23260099m;
                    C098200Yq c098200Yq = new C098200Yq((Throwable) messageObj);
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC1364105Vn3.resumeWith(c098200Yq);
                } else {
                    InterfaceC1364105Vn<AvatarUri> interfaceC1364105Vn4 = c23260099m;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("uploadAvatar return unexpected type: ");
                    sbLIZ2.append(messageObj);
                    C098200Yq c098200Yq2 = new C098200Yq(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2)));
                    C189200o6.m2constructorimpl(c098200Yq2);
                    interfaceC1364105Vn4.resumeWith(c098200Yq2);
                }
                C1C7U.LIZIZ("AvatarPublishStoryServiceImpl@ef4a.requestUpdateAvatar$2$1");
            }
        }, strLIZIZ, length, c0vsj.getPath(), list);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final void publishDirectly(C19EG c19eg, Bundle bundle, boolean z, boolean z2, Function0<Unit> function0) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(c19eg, "avatar_story_publish", true)) {
            C566990MLp.LIZ(bundle);
            VideoPublishEditModel videoPublishEditModel = C580230MpJ.LIZ;
            C1443550nfV c1443550nfV = new C1443550nfV(c19eg, bundle, z, new AwS409S0200000_8(bundle, function0, 10));
            if (videoPublishEditModel != null && z2) {
                videoPublishEditModel.creativeModel.changeAvatarModel.publishEnterMethod = "direct_post";
                c1443550nfV.LIZIZ(videoPublishEditModel);
                C0MLY c0mly = new C0MLY(videoPublishEditModel);
                C1443650nff c1443650nff = c1443550nfV.LIZLLL;
                c0mly.LIZ(c1443650nff.LIZLLL, c1443650nff.LIZJ, new AwS371S0200000_5(c1443550nfV, videoPublishEditModel, 224));
                return;
            }
            C0MP1 c0mp1 = new C0MP1(c1443550nfV.LJ.creativeInfo, new C0MOJ(false, false, 3));
            C1443650nff c1443650nff2 = c1443550nfV.LIZLLL;
            C0MP1.LIZ(c0mp1, c1443650nff2.LIZLLL, false, c1443650nff2.LIZJ, true, 20).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS177S0100000_8(c1443550nfV, 92), new AfS172S0100000_3(c1443550nfV, 32));
            return;
        }
        function0.invoke();
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final void openEditPage(C19EG c19eg, Bundle bundle, String str, String str2, boolean z, final Function1<? super Boolean, Unit> function1) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(c19eg, "avatar_story_edit", true)) {
            C566990MLp.LIZ(bundle);
            if (canRecoverEditPage() && z) {
                VideoPublishEditModel videoPublishEditModel = C580230MpJ.LIZ;
                if (videoPublishEditModel == null) {
                    return;
                }
                new C0MLY(videoPublishEditModel).LIZ(str, str2, new AwS118S0400000_22(c19eg, (C19EG) videoPublishEditModel, (VideoPublishEditModel) bundle, (Bundle) function1, (Function1<? super Boolean, Unit>) 0));
                return;
            }
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).openGotoNextService().gotoNextPage(c19eg, false, bundle, Collections.singletonList(str), new IPageToFinish() { // from class: X.0MpI
                @Override // com.ss.android.ugc.aweme.services.external.ability.IPageToFinish
                public final void onFinish(boolean z2) {
                    function1.invoke(Boolean.valueOf(z2));
                }
            });
            return;
        }
        function1.invoke(Boolean.FALSE);
    }
}
