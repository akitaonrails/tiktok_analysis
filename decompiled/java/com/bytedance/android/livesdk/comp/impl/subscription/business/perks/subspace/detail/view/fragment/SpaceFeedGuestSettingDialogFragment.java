package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment;

import X.C500980Jkm;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.SpaceFeedGuestSettingDialogFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import webcast.api.sub.HomePageInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class SpaceFeedGuestSettingDialogFragment extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2s8LD04O2HELIOSs/PC0gOCQvLGE3LTEtICN9PiwpPmE1OiQrJCo9PGsfOS4wLQMpLCsUPSA/PRw2PDElJygXISQgJigVOiQrJCo9PA==";
    public LinearLayout LL;
    public SubSpaceFeedVM LLILLJJLI;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gba);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJI = 0.5f;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.hfl);
            } else {
                viewFindViewById = null;
            }
            this.LL = (LinearLayout) viewFindViewById;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById, new View.OnClickListener() { // from class: X.0Jt4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                final SpaceFeedGuestSettingDialogFragment spaceFeedGuestSettingDialogFragment = this.LL;
                spaceFeedGuestSettingDialogFragment.getClass();
                C782110Um9 c782110Um9 = new C782110Um9(spaceFeedGuestSettingDialogFragment.getContext());
                c782110Um9.LIZJ = C497740JfY.LJIJI(2131844339);
                c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131844338));
                c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131844334), new InterfaceC743640TFa() { // from class: X.0JtE
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        liveDialog.dismiss();
                    }
                });
                c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131844337), new InterfaceC743640TFa() { // from class: X.0Jt3
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        String str;
                        SpaceFeedGuestSettingDialogFragment spaceFeedGuestSettingDialogFragment2 = spaceFeedGuestSettingDialogFragment;
                        final SubSpaceFeedVM subSpaceFeedVM = spaceFeedGuestSettingDialogFragment2.LLILLJJLI;
                        if (subSpaceFeedVM != null) {
                            final C506200JtC c506200JtC = new C506200JtC(liveDialog, spaceFeedGuestSettingDialogFragment2);
                            final C506160Jt8 c506160Jt8 = new C506160Jt8(liveDialog, spaceFeedGuestSettingDialogFragment);
                            C504510JqT c504510JqTVQ2 = subSpaceFeedVM.vQ2();
                            if (c504510JqTVQ2 != null && (str = c504510JqTVQ2.LLILZ) != null) {
                                C480460Ism.LIZ().getClass();
                                C0J1N c0j1n = (C0J1N) C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).quitSpace(str), EnumC510330Jzr.GENERAL, "SubSpaceFeedVM", "sub/space/quit", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(subSpaceFeedVM));
                                if (c0j1n != null) {
                                    c0j1n.LIZ(new C09JN() { // from class: X.0Jt2
                                        @Override // X.C09JN
                                        public final void accept(Object obj) {
                                            HomePageInfo homePageInfo;
                                            C1C7U.LIZ("SubSpaceFeedVM@e7dc.exitSpace$1");
                                            c506200JtC.invoke();
                                            subSpaceFeedVM.setState(new C506180JtA());
                                            C504450JqN c504450JqNWQ2 = subSpaceFeedVM.wQ2();
                                            C504510JqT c504510JqTVQ22 = subSpaceFeedVM.vQ2();
                                            if (c504510JqTVQ22 != null) {
                                                homePageInfo = c504510JqTVQ22.LLILZLL;
                                            } else {
                                                homePageInfo = null;
                                            }
                                            c504450JqNWQ2.LIZLLL("exit_space", homePageInfo, subSpaceFeedVM.zQ2());
                                            C1C7U.LIZIZ("SubSpaceFeedVM@e7dc.exitSpace$1");
                                        }
                                    }, new C09JN() { // from class: X.07xz
                                        @Override // X.C09JN
                                        public final void accept(Object obj) {
                                            C1C7U.LIZ("SubSpaceFeedVM@e7dc.exitSpace$2");
                                            c506160Jt8.invoke(obj);
                                            C1C7U.LIZIZ("SubSpaceFeedVM@e7dc.exitSpace$2");
                                        }
                                    });
                                }
                            }
                        }
                    }
                });
                c782110Um9.LJIILLIIL = true;
                c782110Um9.LJIILL = true;
                C786410Ut5.E4(c782110Um9.LIZ());
            }
        });
    }
}
