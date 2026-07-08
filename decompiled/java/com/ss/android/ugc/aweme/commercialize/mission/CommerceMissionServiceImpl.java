package com.ss.android.ugc.aweme.commercialize.mission;

import X.AbstractC856620Xj2;
import X.C10AR;
import X.C10AZ;
import X.C10BR;
import X.C11BX;
import X.C11BY;
import X.C13LP;
import X.C15IG;
import X.C19420710yT;
import X.C197039127h;
import X.C20508215Mq;
import X.C786410Ut5;
import X.EnumC1157650gEN;
import X.InterfaceC1002530cCB;
import Y.ARunnableS98S0200000_29;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.mission.CommerceMissionServiceImpl;
import com.ss.android.ugc.aweme.commercialize.mission.music.MissionChooseMusicViewModel;
import com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService;
import com.ss.android.ugc.aweme.discover.model.HTCMissionModule;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class CommerceMissionServiceImpl implements ICommerceMissionService {
    @Override // com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService
    public final String LIZ() {
        TcmConfig tcmConfigLJII = ((ITcmService) ServiceManager.get().getService(ITcmService.class)).LJII();
        return (tcmConfigLJII == null || !tcmConfigLJII.isTcmCreator()) ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService
    public final int LIZIZ() {
        return ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getFollowerCount();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService
    public final C20508215Mq LIZLLL(AbstractC856620Xj2 abstractC856620Xj2) {
        return new C20508215Mq(abstractC856620Xj2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService
    public final int LJ(HTCMissionModule hTCMissionModule) {
        Integer num;
        Integer num2;
        Integer num3;
        if (hTCMissionModule == null || Intrinsics.LJFF(hTCMissionModule.isEligibleUser(), Boolean.FALSE) || ((((num = hTCMissionModule.missionLabelType) == null || num.intValue() != 1) && ((num2 = hTCMissionModule.missionLabelType) == null || num2.intValue() != 2)) || (num3 = hTCMissionModule.bannerType) == null || num3.intValue() != 1)) {
            return R.layout.aob;
        }
        return R.layout.aoa;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService
    public final C10AZ LJFF(C10AR c10ar) {
        return new C10AZ(c10ar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.10BT] */
    @Override // com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService
    public final C10BR LJI(Context context) {
        return new C10BR(new InterfaceC1002530cCB(context) { // from class: X.10BT
            public final Context LIZ;

            @Override // X.InterfaceC1000860c9U
            public final Context getContext() {
                return this.LIZ;
            }

            {
                this.LIZ = context;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService
    public final C15IG LJII(ViewModelStoreOwner viewModelStoreOwner) {
        return (C15IG) new ViewModelProvider(viewModelStoreOwner).get(MissionChooseMusicViewModel.class);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService
    public final void LIZJ(View view, final HTCMissionModule hTCMissionModule, final EnumC1157650gEN enumC1157650gEN, final C11BX c11bx) {
        C197039127h c197039127h;
        C19420710yT c19420710yT = new C19420710yT(view);
        int i = 0;
        if (hTCMissionModule != null && !TextUtils.isEmpty(hTCMissionModule.missionId)) {
            C786410Ut5.LJLLLLLL(0, view);
            TextView textView = c19420710yT.LIZIZ;
            if (textView != null) {
                textView.setText(hTCMissionModule.text);
            }
            TextView textView2 = c19420710yT.LIZJ;
            if (textView2 != null) {
                C19420710yT.LIZ(textView2, hTCMissionModule.description);
            }
            TextView textView3 = c19420710yT.LJ;
            if (textView3 != null) {
                textView3.setText(hTCMissionModule.progressBarText);
            }
            TextView textView4 = c19420710yT.LIZLLL;
            if (textView4 != null) {
                C19420710yT.LIZ(textView4, hTCMissionModule.participantsStr);
            }
            FrameLayout frameLayout = c19420710yT.LJI;
            if (frameLayout != null) {
                HandlerHook.viewPost(frameLayout, new ARunnableS98S0200000_29(c19420710yT, hTCMissionModule, 58));
            }
            c19420710yT.LJIIIIZZ = C13LP.LJJJJ(hTCMissionModule.bannerType, C19420710yT.LJIIIZ);
        } else {
            C786410Ut5.LJLLLLLL(8, view);
        }
        if (view.getVisibility() == 0 && hTCMissionModule != null) {
            C11BY c11by = new C11BY();
            Object[] objArr = {hTCMissionModule, enumC1157650gEN};
            do {
                c11by.LJIIIIZZ(objArr[i]);
                i++;
            } while (i < 2);
            c11by.LJII("mission_label_show", "mission_id", "eligibility", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "current_page", "creator_followers", "creator_type", "label_version");
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.11BW
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String string;
                C11BX c11bx2 = c11bx;
                CommerceMissionServiceImpl commerceMissionServiceImpl = this;
                HTCMissionModule hTCMissionModule2 = hTCMissionModule;
                commerceMissionServiceImpl.getClass();
                if (hTCMissionModule2 != null && (string = hTCMissionModule2.openUrl) != null) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(string), "url");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                        Uri.Builder builderBuildUpon = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).buildUpon();
                        builderBuildUpon.appendQueryParameter("begin_open_timestamp", String.valueOf(System.currentTimeMillis()));
                        Uri uriBuild = builderBuildUpon.build();
                        Uri uri = UriProtector.parse(string);
                        String string2 = uriBuild.toString();
                        Uri.Builder builderBuildUpon2 = uri.buildUpon();
                        builderBuildUpon2.clearQuery();
                        for (String str : C13LP.LJLJJLL(UriProtector.getQueryParameterNames(uri))) {
                            if (!Intrinsics.LJFF(str, "url")) {
                                builderBuildUpon2.appendQueryParameter(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str));
                            }
                        }
                        builderBuildUpon2.appendQueryParameter("url", string2);
                        string = builderBuildUpon2.build().toString();
                    }
                } else {
                    string = null;
                }
                c11bx2.LIZ(string);
                if (hTCMissionModule != null) {
                    C11BY c11by2 = new C11BY();
                    int i2 = 0;
                    Object[] objArr2 = {hTCMissionModule, enumC1157650gEN};
                    do {
                        c11by2.LJIIIIZZ(objArr2[i2]);
                        i2++;
                    } while (i2 < 2);
                    c11by2.LJII("mission_label_click", "mission_id", "eligibility", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "current_page", "creator_followers", "creator_type", "label_version");
                }
            }
        };
        if (c19420710yT.LJIIIIZZ && (c197039127h = c19420710yT.LJII) != null) {
            C786410Ut5.U8(c197039127h, onClickListener);
        } else {
            C786410Ut5.I7(onClickListener, view);
        }
    }
}
