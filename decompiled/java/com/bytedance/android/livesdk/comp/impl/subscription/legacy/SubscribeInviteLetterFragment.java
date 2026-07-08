package com.bytedance.android.livesdk.comp.impl.subscription.legacy;

import X.AbstractC1320710kTN;
import X.C098200Yq;
import X.C09JN;
import X.C0IJT;
import X.C0IPN;
import X.C0J1N;
import X.C0JSS;
import X.C0KPJ;
import X.C0UO0;
import X.C1124870fNV;
import X.C1126540fQC;
import X.C1143780fs0;
import X.C11RD;
import X.C1320700kTM;
import X.C1320810kTX;
import X.C1322200kVm;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C474500IjA;
import X.C480460Ism;
import X.C497740JfY;
import X.C510380Jzw;
import X.C786410Ut5;
import X.EnumC510330Jzr;
import X.InterfaceC1330440kj4;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.comp.impl.subscription.legacy.SubscribeInviteLetterFragment;
import com.bytedance.android.livesdk.livesetting.subscription.SubscribeInvitationLynxUrlSetting;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationListData;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscribeInviteLetterFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvHELIOSOyYjPCwjJ2E/LSItKjZ9GzAuOiwhIScpACElITEpBSonPCA+Dz0yLygpJzs=";
    public String LL = "";
    public String LLILLJJLI;
    public C1126540fQC LLILLL;
    public C16FS LLILZ;
    public C16F5 LLILZIL;
    public C16F5 LLILZLL;
    public ImageView LLIZ;
    public LinearLayout LLIZLLLIL;

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LL = arguments.getString("letter_enter_from");
            this.LLILLJJLI = arguments.getString("letter_activity_id", null);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILLL = (C1126540fQC) view.findViewById(R.id.lmi);
        this.LLILZ = (C16FS) view.findViewById(R.id.ct0);
        this.LLIZ = (ImageView) view.findViewById(R.id.lmh);
        this.LLILZIL = (C16F5) view.findViewById(R.id.zrv);
        this.LLILZLL = (C16F5) view.findViewById(R.id.zrh);
        this.LLIZLLLIL = (LinearLayout) view.findViewById(R.id.nkg);
        String strLJIIJ = C1143780fs0.LJIIJ(C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_invite_letter_bg.png");
        ImageView imageView = this.LLIZ;
        C16FS c16fs = null;
        if (imageView == null) {
            imageView = null;
        }
        C0JSS.LJ(imageView, new ImageModel(strLJIIJ, Collections.singletonList(strLJIIJ)), 0);
        C1126540fQC c1126540fQC = this.LLILLL;
        if (c1126540fQC == null) {
            c1126540fQC = null;
        }
        C786410Ut5.LLJJI(c1126540fQC, 0);
        Uri uri = UriProtector.parse(C1143780fs0.LJIIJ(C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_3"), "live_subscribe_invitation_letter.webp"));
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJI(uri);
        c1320810kTXLIZJ.LJIIJJI = true;
        c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0Iiy
            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LJ(String str, Object obj, Animatable animatable) throws IllegalAccessException, NoSuchFieldException {
                if (animatable != null) {
                    Field declaredField = AnimatedDrawable2.class.getDeclaredField("LL");
                    declaredField.setAccessible(true);
                    declaredField.set(animatable, 1);
                    animatable.start();
                }
            }
        };
        AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
        C1126540fQC c1126540fQC2 = this.LLILLL;
        if (c1126540fQC2 == null) {
            c1126540fQC2 = null;
        }
        c1126540fQC2.setController(abstractC1320710kTNLIZ);
        String str = this.LLILLJJLI;
        if (str != null && str.length() != 0) {
            C16F5 c16f5 = this.LLILZLL;
            if (c16f5 == null) {
                c16f5 = null;
            }
            C1124870fNV.LIZJ().getClass();
            String strLIZIZ = C1124870fNV.LIZIZ("pm_mt_sub_optin_envelop_desc");
            if (strLIZIZ == null) {
                strLIZIZ = C497740JfY.LJIJI(2131844416);
            }
            c16f5.setText(strLIZIZ);
            C16FS c16fs2 = this.LLILZ;
            if (c16fs2 == null) {
                c16fs2 = null;
            }
            C1124870fNV.LIZJ().getClass();
            String strLIZIZ2 = C1124870fNV.LIZIZ("pm_mt_sub_optin_envelop_btn");
            if (strLIZIZ2 == null) {
                strLIZIZ2 = C497740JfY.LJIJI(2131844415);
            }
            c16fs2.setText(strLIZIZ2);
            String str2 = this.LLILLJJLI;
            if (str2 != null) {
                C0KPJ.ze.LIZLLL(Boolean.TRUE, str2);
            }
            C16FS c16fs3 = this.LLILZ;
            if (c16fs3 != null) {
                c16fs = c16fs3;
            }
            C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.0IzK
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SubscribeInviteLetterFragment subscribeInviteLetterFragment = this.LL;
                    subscribeInviteLetterFragment.getClass();
                    C0K8F c0k8f = C0K8F.LIZ;
                    Context context = subscribeInviteLetterFragment.getContext();
                    String activityUrl = SubscribeInvitationLynxUrlSetting.INSTANCE.getActivityUrl();
                    c0k8f.getClass();
                    C0K8F.LJ(context, activityUrl, "live_take_popup", "live_take_popup", "live_take_page", "", "", "", false, null, "page", "");
                    if ((subscribeInviteLetterFragment.getParentFragment() instanceof LiveDialogFragment) && ((LiveDialogFragment) subscribeInviteLetterFragment.getParentFragment()).isShowing()) {
                        ((DialogFragment) subscribeInviteLetterFragment.getParentFragment()).dismiss();
                    }
                }
            });
        } else {
            C0KPJ.ye.LJFF(Boolean.FALSE);
            C16FS c16fs4 = this.LLILZ;
            if (c16fs4 != null) {
                c16fs = c16fs4;
            }
            C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.0Iix
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    final SubscribeInviteLetterFragment subscribeInviteLetterFragment = this.LL;
                    subscribeInviteLetterFragment.getClass();
                    C480460Ism.LIZ().getClass();
                    ((C0J1N) C510380Jzw.LJIILJJIL(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).updateInviteeState(1, ""), EnumC510330Jzr.GENERAL, subscribeInviteLetterFragment.LL, "sub/invitation/update_invitee_status", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJIILIIL(new C0UO0()).LIZJ(C11RD.LIZLLL(subscribeInviteLetterFragment))).LIZ(new C09JN() { // from class: X.0IzL
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("SubscribeInviteLetterFragment@4f4f.updateInviteeStatusAndClose$dispose$1");
                            if (subscribeInviteLetterFragment.getContext() != null) {
                                C0K8F c0k8f = C0K8F.LIZ;
                                Context context = subscribeInviteLetterFragment.getContext();
                                String invitation_card = SubscribeInvitationLynxUrlSetting.INSTANCE.getInvitation_card();
                                c0k8f.getClass();
                                C0K8F.LJ(context, invitation_card, "live_take_popup", "live_take_popup", "live_take_page", "", "", "", false, null, "page", "");
                                if ((subscribeInviteLetterFragment.getParentFragment() instanceof LiveDialogFragment) && ((LiveDialogFragment) subscribeInviteLetterFragment.getParentFragment()).isShowing()) {
                                    ((DialogFragment) subscribeInviteLetterFragment.getParentFragment()).dismiss();
                                }
                            }
                            C1C7U.LIZIZ("SubscribeInviteLetterFragment@4f4f.updateInviteeStatusAndClose$dispose$1");
                        }
                    }, new C09JN() { // from class: X.0IKT
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("SubscribeInviteLetterFragment@4f4f.updateInviteeStatusAndClose$dispose$2");
                            C20441214yg.LJII((Throwable) obj);
                            if ((subscribeInviteLetterFragment.getParentFragment() instanceof LiveDialogFragment) && ((LiveDialogFragment) subscribeInviteLetterFragment.getParentFragment()).isShowing()) {
                                ((DialogFragment) subscribeInviteLetterFragment.getParentFragment()).dismiss();
                            }
                            C1C7U.LIZIZ("SubscribeInviteLetterFragment@4f4f.updateInviteeStatusAndClose$dispose$2");
                        }
                    });
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_invitation_popup_click");
                    c474500IjALIZ.LJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()));
                    c474500IjALIZ.LJJII(subscribeInviteLetterFragment.LL, "entrance");
                    c474500IjALIZ.LJJII("live_take_page", "event_page");
                    c474500IjALIZ.LIZ();
                }
            });
            C480460Ism.LIZ().getClass();
            ((C0J1N) C510380Jzw.LJIILJJIL(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).getInviterList(4), EnumC510330Jzr.GENERAL, this.LL, "sub/invitation/get_invitation_list", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJIILIIL(new C0UO0()).LIZJ(C11RD.LIZLLL(this))).LIZ(new C09JN() { // from class: X.0IOZ
                @Override // X.C09JN
                public final void accept(Object obj) {
                    User value;
                    String strLJIJJ;
                    C1C7U.LIZ("SubscribeInviteLetterFragment@4f4f.requestInviters$dispose$1");
                    T t = ((BaseResponse) obj).data;
                    if (t != null) {
                        SubscribeInviteLetterFragment subscribeInviteLetterFragment = this.LL;
                        Map<String, User> map = ((SubInvitationListData) t).invitersInfo;
                        subscribeInviteLetterFragment.getClass();
                        if (map != null && !map.isEmpty()) {
                            LinearLayout linearLayout = subscribeInviteLetterFragment.LLIZLLLIL;
                            C16F5 c16f52 = null;
                            if (linearLayout == null) {
                                linearLayout = null;
                            }
                            C786410Ut5.LJJJJJL(linearLayout);
                            int size = 3;
                            if (map.size() < 3) {
                                size = map.size();
                            }
                            Iterator<Map.Entry<String, User>> it2 = map.entrySet().iterator();
                            int i = 0;
                            while (it2.hasNext()) {
                                User value2 = it2.next().getValue();
                                if (i >= size) {
                                    break;
                                }
                                i++;
                                if (value2 != null) {
                                    LayoutInflater layoutInflaterNe = C786410Ut5.ne(subscribeInviteLetterFragment.getContext());
                                    LinearLayout linearLayout2 = subscribeInviteLetterFragment.LLIZLLLIL;
                                    if (linearLayout2 == null) {
                                        linearLayout2 = null;
                                    }
                                    View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.h0d, linearLayout2, false);
                                    C465700IOa c465700IOa = new C465700IOa(viewTd);
                                    ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
                                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                        if (i == 1) {
                                            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart((int) C497740JfY.LIZIZ(0.0f));
                                        } else {
                                            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart((int) C497740JfY.LIZIZ(-6.0f));
                                        }
                                        C786410Ut5.W5(c465700IOa.LIZ, layoutParams);
                                    }
                                    LinearLayout linearLayout3 = subscribeInviteLetterFragment.LLIZLLLIL;
                                    if (linearLayout3 == null) {
                                        linearLayout3 = null;
                                    }
                                    linearLayout3.addView(viewTd);
                                    C1121670fIL.LJIILIIL(c465700IOa.LIZIZ, value2.getAvatarThumb(), c465700IOa.LIZIZ.getWidth(), c465700IOa.LIZIZ.getHeight(), R.drawable.el_);
                                }
                            }
                            Iterator<Map.Entry<String, User>> it3 = map.entrySet().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    value = it3.next().getValue();
                                    if (value != null) {
                                        break;
                                    }
                                } else {
                                    value = null;
                                    break;
                                }
                            }
                            String strLIZ = C0KVU.LIZ(value);
                            if (map.size() == 1) {
                                strLJIJJ = C497740JfY.LJIJJ(2131843927, strLIZ);
                            } else {
                                strLJIJJ = C497740JfY.LJIJJ(2131843928, strLIZ);
                            }
                            C16F5 c16f53 = subscribeInviteLetterFragment.LLILZIL;
                            if (c16f53 != null) {
                                c16f52 = c16f53;
                            }
                            c16f52.setText(strLJIJJ);
                        }
                    }
                    C1C7U.LIZIZ("SubscribeInviteLetterFragment@4f4f.requestInviters$dispose$1");
                }
            }, new C09JN() { // from class: X.00ox
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SubscribeInviteLetterFragment@4f4f.requestInviters$dispose$2");
                    C20441214yg.LJII((Throwable) obj);
                    C1C7U.LIZIZ("SubscribeInviteLetterFragment@4f4f.requestInviters$dispose$2");
                }
            });
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_invitation_popup_show");
        c474500IjALIZ.LJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        c474500IjALIZ.LJJII(this.LL, "entrance");
        c474500IjALIZ.LJJII("live_take_page", "event_page");
        c474500IjALIZ.LIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gj1, viewGroup, false);
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
