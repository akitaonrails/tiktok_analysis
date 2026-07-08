package com.ss.android.ugc.profile.business.ur.following.ui;

import X.C01GW;
import X.C0HTI;
import X.C1262790ixx;
import X.C1602160rnK;
import X.C1722300uv6;
import X.C2187451AjH;
import X.C452501pT;
import X.C616540OGe;
import X.InterfaceC1073860e3E;
import X.InterfaceC1261750iwH;
import Y.ARunnableS22S0201000_16;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.following.ui.BaseRelationFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.relation.experiment.TriadRecMoreConfig;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelAuthEdmAndSmsGuideV3;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import com.ss.android.ugc.profile.business.ur.following.ui.SuggestRelationFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class SuggestRelationFragment extends BaseRelationFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTHELIOSdiLyA/JCo7ICE0ZjAlZxwmLyIpOjsBLSktPSY8JgM+KCg+LSs4";
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2316));
    public C1262790ixx LLJILJIL;

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int NR() {
        return 2131845490;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int OR() {
        return 2131849341;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final String getEnterFrom() {
        return "suggested_list";
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int getLayoutId() {
        return R.layout.c9s;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void LJFF() {
        C1262790ixx c1262790ixx;
        InterfaceC1261750iwH interfaceC1261750iwH = (InterfaceC1261750iwH) this.LLJIJIL.getValue();
        if (interfaceC1261750iwH != null && (c1262790ixx = this.LLJILJIL) != null) {
            c1262790ixx.Eg(interfaceC1261750iwH);
        }
        C1262790ixx c1262790ixx2 = this.LLJILJIL;
        if (c1262790ixx2 != null) {
            c1262790ixx2.reset();
        }
        C1262790ixx c1262790ixx3 = this.LLJILJIL;
        if (c1262790ixx3 != null) {
            c1262790ixx3.LLFZ(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void UR() {
        InterfaceC1073860e3E interfaceC1073860e3E = (InterfaceC1073860e3E) this.LLJIJIL.getValue();
        if (interfaceC1073860e3E != null) {
            interfaceC1073860e3E.m6();
        }
    }

    public final C1722300uv6 ZR() {
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.nl;
        Drawable drawableLIZ = c0hti.LIZ(requireContext());
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        c1722300uv6.LJI = getString(R.string.m25);
        c1722300uv6.LJIIIIZZ = getString(R.string.f8c);
        c1722300uv6.LJIIIZ = new AwS598S0100000_19(this, 376);
        return c1722300uv6;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void onPageSelected() {
        InterfaceC1073860e3E interfaceC1073860e3E = (InterfaceC1073860e3E) this.LLJIJIL.getValue();
        if (interfaceC1073860e3E != null) {
            interfaceC1073860e3E.av(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1262790ixx c1262790ixx;
        super.onDestroyView();
        InterfaceC1261750iwH interfaceC1261750iwH = (InterfaceC1261750iwH) this.LLJIJIL.getValue();
        if (interfaceC1261750iwH == null || (c1262790ixx = this.LLJILJIL) == null) {
            return;
        }
        c1262790ixx.ng(interfaceC1261750iwH);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(SuggestRelationFragment.class.getName());
        }
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1262790ixx c1262790ixx = (C1262790ixx) view.findViewById(R.id.user_card_layout);
        int visibility = c1262790ixx.getVisibility();
        c1262790ixx.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c1262790ixx);
        c1262790ixx.LJLJLLL(null, this, new AwS598S0100000_19(this, 935));
        c1262790ixx.Eg(new InterfaceC1261750iwH() { // from class: X.0ix8
            @Override // X.InterfaceC1261750iwH
            public final void LLF(RecyclerView recyclerView, int i) {
            }

            @Override // X.InterfaceC1261750iwH
            public final void nO0(C1075800e6M c1075800e6M) {
            }

            @Override // X.InterfaceC1261750iwH
            public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
                LinearLayoutManager linearLayoutManager;
                String elementId;
                String elementId2;
                C1261650iw7 c1261650iw7;
                C1261650iw7 c1261650iw72;
                String nickname;
                C1261860iwS c1261860iwS;
                C1261860iwS c1261860iwS2;
                C1261650iw7 c1261650iw73;
                C1261860iwS c1261860iwS3;
                final Context context;
                String str;
                PopupInstanceConfig popupInstanceConfig;
                List<String> urlList;
                int i = 0;
                String nickname2 = null;
                if (abstractC1261460ivo instanceof C1261440ivm) {
                    final C1261860iwS c1261860iwS4 = (C1261860iwS) abstractC1261460ivo.LIZ;
                    if ((c1261860iwS4.getFollowStatus() == C0SY7.FOLLOWED.getValue() || c1261860iwS4.getFollowStatus() == C0SY7.FOLLOW_MUTUAL.getValue() || c1261860iwS4.getFollowStatus() == C0SY7.FOLLOW_REQUESTED.getValue()) && (context = this.LL.getContext()) != null) {
                        final SuggestRelationFragment suggestRelationFragment = this.LL;
                        if (!ChannelsAuthRefactorExp.INSTANCE.enabled() && !ChannelAuthEdmAndSmsGuideV3.INSTANCE.enabled()) {
                            ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIIJ(suggestRelationFragment.getActivity(), "follow_finish", new InterfaceC1914010zuJ() { // from class: X.0ix9
                                @Override // X.InterfaceC1914010zuJ
                                public final void LIZIZ() {
                                }

                                @Override // X.InterfaceC1914010zuJ
                                public final void LIZ() {
                                    List<String> urlList2;
                                    INoticeService iNoticeService = (INoticeService) PluggableExtentionKt.pluggableSpi$default(INoticeService.class, false, false, false, 14, null);
                                    if (iNoticeService != null) {
                                        Context context2 = context;
                                        suggestRelationFragment.getClass();
                                        UrlModel avatarThumb = c1261860iwS4.getAvatarThumb();
                                        iNoticeService.LJJLIIIJILLIZJL(context2, new C1917290zzb(null, "suggested_list", null, "follow", (avatarThumb == null || (urlList2 = avatarThumb.getUrlList()) == null) ? null : (String) C13LP.LJJJLL(urlList2), null, null, null, null, 8165));
                                    }
                                }
                            });
                        } else {
                            UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("follow_finish");
                            unifiedAuthPopupConfigLIZJ.setSceneId("follow_finish_suggest_relation");
                            unifiedAuthPopupConfigLIZJ.setSubSceneId("follow_finish_suggest_relation");
                            suggestRelationFragment.getClass();
                            unifiedAuthPopupConfigLIZJ.setEnterFrom("suggested_list");
                            UrlModel avatarThumb = c1261860iwS4.getAvatarThumb();
                            if (avatarThumb != null && (urlList = avatarThumb.getUrlList()) != null) {
                                str = (String) C13LP.LJJJLL(urlList);
                            } else {
                                str = null;
                            }
                            unifiedAuthPopupConfigLIZJ.setAvatar(str);
                            String nickname3 = c1261860iwS4.getNickname();
                            if (nickname3 == null || !Boolean.valueOf(!a0.LJJJIL(nickname3)).booleanValue()) {
                                nickname3 = "";
                            }
                            unifiedAuthPopupConfigLIZJ.setTargetUserName(nickname3);
                            unifiedAuthPopupConfigLIZJ.setSysPage("follow_finish");
                            List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
                            if (list != null && (!list.isEmpty()) && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, 0)) != null) {
                                popupInstanceConfig.setPopupCombinationType(3);
                            }
                            ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(context, null, unifiedAuthPopupConfigLIZJ);
                        }
                    }
                }
                if (C304890BxH.LIZIZ() && ((TriadRecMoreConfig) C1263420iyy.LIZIZ.getValue()).withAutoScroll == 1 && (abstractC1261460ivo instanceof C1261360ive)) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
                    SuggestRelationFragment suggestRelationFragment2 = this.LL;
                    C1261360ive c1261360ive = (C1261360ive) abstractC1261460ivo;
                    suggestRelationFragment2.getClass();
                    RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
                    if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                        C1261860iwS c1261860iwS5 = (C1261860iwS) c1261360ive.LIZ;
                        if (c1261860iwS5 != null) {
                            elementId = c1261860iwS5.getElementId();
                        } else {
                            elementId = null;
                        }
                        int i2 = 0;
                        for (InterfaceC1891350zJl interfaceC1891350zJl : viewOnAttachStateChangeListenerC20604515jv.getListItems()) {
                            if ((interfaceC1891350zJl instanceof C1261650iw7) && (c1261650iw73 = (C1261650iw7) interfaceC1891350zJl) != null && (c1261860iwS3 = c1261650iw73.LLILLJJLI) != null) {
                                elementId2 = c1261860iwS3.getElementId();
                            } else {
                                elementId2 = null;
                            }
                            if (Intrinsics.LJFF(elementId2, elementId)) {
                                if (i2 > 0) {
                                    int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                                    if (iFindLastCompletelyVisibleItemPosition >= 0) {
                                        i = iFindLastCompletelyVisibleItemPosition;
                                    }
                                    Object obj = ListProtector.get(viewOnAttachStateChangeListenerC20604515jv.getListItems(), i);
                                    if (obj instanceof C1261650iw7) {
                                        c1261650iw7 = (C1261650iw7) obj;
                                    } else {
                                        c1261650iw7 = null;
                                    }
                                    Object obj2 = ListProtector.get(viewOnAttachStateChangeListenerC20604515jv.getListItems(), i2);
                                    if (obj2 instanceof C1261650iw7) {
                                        c1261650iw72 = (C1261650iw7) obj2;
                                    } else {
                                        c1261650iw72 = null;
                                    }
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("AUTOSCROLL - rec more inserted, visibleItemIndex: ");
                                    sbLIZ.append(i);
                                    sbLIZ.append(", nickname ");
                                    if (c1261650iw7 != null && (c1261860iwS2 = c1261650iw7.LLILZIL) != null) {
                                        nickname = c1261860iwS2.getNickname();
                                    } else {
                                        nickname = null;
                                    }
                                    sbLIZ.append(nickname);
                                    C1720106oR.LJI("SuggestRelationFragment", C2188811AlT.LIZIZ(sbLIZ));
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("AUTOSCROLL - rec more inserted, targetItemIndex: ");
                                    sbLIZ2.append(i2);
                                    sbLIZ2.append(", nickname ");
                                    if (c1261650iw72 != null && (c1261860iwS = c1261650iw72.LLILLJJLI) != null) {
                                        nickname2 = c1261860iwS.getNickname();
                                    }
                                    sbLIZ2.append(nickname2);
                                    C1720106oR.LJI("SuggestRelationFragment", C2188811AlT.LIZIZ(sbLIZ2));
                                    int size = i2 + c1261360ive.LIZJ.size();
                                    int size2 = viewOnAttachStateChangeListenerC20604515jv.getListItems().size() - 1;
                                    if (size > size2) {
                                        size = size2;
                                    }
                                    if (size > i) {
                                        int i3 = C2187451AjH.LIZ;
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("AUTOSCROLL - needToShowItemIndex ");
                                        sbLIZ3.append(size);
                                        sbLIZ3.append(" lastCompletelyVisibleItemIndex, ");
                                        sbLIZ3.append(i);
                                        C1720106oR.LJI("SuggestRelationFragment", C2188811AlT.LIZIZ(sbLIZ3));
                                        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS22S0201000_16(size, linearLayoutManager, suggestRelationFragment2, 7));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i2++;
                        }
                    }
                }
            }
        });
        if (!this.LLILZIL) {
            c1262790ixx.LLFZ(false);
        }
        this.LLJILJIL = c1262790ixx;
    }
}
