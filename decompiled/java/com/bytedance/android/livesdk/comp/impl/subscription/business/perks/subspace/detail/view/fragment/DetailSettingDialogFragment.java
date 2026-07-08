package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment;

import X.C16F5;
import X.C497740JfY;
import X.C500980Jkm;
import X.C504880Jr4;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.DetailSettingDialogFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedAbility;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class DetailSettingDialogFragment extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2s8HELIOSLD04O2s/PC0gOCQvLGE3LTEtICN9PiwpPmE1OiQrJCo9PGsILDsyISkfLDsnISsrDSYyJCorDz0yLygpJzs=";
    public LinearLayout LL;
    public ConstraintLayout LLILLJJLI;
    public ConstraintLayout LLILLL;
    public View LLILZ;
    public C16F5 LLILZIL;
    public C16F5 LLILZLL;
    public C504880Jr4 LLIZ;
    public SubSpaceDetailVM LLIZLLLIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final ConstraintLayout MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qgq) : null;
            this.LLILLJJLI = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final ConstraintLayout NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.un_pin_panel) : null;
            this.LLILLL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gb6);
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
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SpacePost spacePost;
        super.onViewCreated(view, bundle);
        C504880Jr4 c504880Jr4 = this.LLIZ;
        View viewFindViewById = null;
        if (c504880Jr4 != null && (spacePost = c504880Jr4.LLILLL) != null) {
            if (spacePost.isPinned) {
                C786410Ut5.LL(8, MR());
            } else {
                C786410Ut5.LL(8, NR());
            }
            if (spacePost.pollInfo != null) {
                View viewFindViewById2 = this.LLILZ;
                if (viewFindViewById2 == null) {
                    View view2 = getView();
                    if (view2 != null) {
                        viewFindViewById2 = view2.findViewById(R.id.fz3);
                    } else {
                        viewFindViewById2 = null;
                    }
                    this.LLILZ = viewFindViewById2;
                }
                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                C786410Ut5.LL(8, MR());
                C786410Ut5.LL(8, NR());
            }
            C786410Ut5.Y7(MR(), new View.OnClickListener() { // from class: X.0Jsr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    DetailSettingDialogFragment detailSettingDialogFragment = this.LL;
                    SubSpaceDetailVM subSpaceDetailVM = detailSettingDialogFragment.LLIZLLLIL;
                    if (subSpaceDetailVM != null) {
                        subSpaceDetailVM.CQ2(0, new C505920Jsk(detailSettingDialogFragment), new C505980Jsq(this.LL));
                    }
                }
            });
            C786410Ut5.Y7(NR(), new View.OnClickListener() { // from class: X.0Jst
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    DetailSettingDialogFragment detailSettingDialogFragment = this.LL;
                    SubSpaceDetailVM subSpaceDetailVM = detailSettingDialogFragment.LLIZLLLIL;
                    if (subSpaceDetailVM != null) {
                        subSpaceDetailVM.CQ2(1, new C505930Jsl(detailSettingDialogFragment), new C506000Jss(this.LL));
                    }
                }
            });
        }
        View viewFindViewById3 = this.LL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.fla);
            } else {
                viewFindViewById3 = null;
            }
            this.LL = (LinearLayout) viewFindViewById3;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById3, new View.OnClickListener() { // from class: X.0Jsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                final DetailSettingDialogFragment detailSettingDialogFragment = this.LL;
                detailSettingDialogFragment.getClass();
                C782110Um9 c782110Um9 = new C782110Um9(detailSettingDialogFragment.getContext());
                c782110Um9.LIZJ = C497740JfY.LJIJI(2131844295);
                c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131844294));
                c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131844292), new InterfaceC743640TFa() { // from class: X.0Jsi
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        liveDialog.dismiss();
                    }
                });
                c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131844293), new InterfaceC743640TFa() { // from class: X.0JsF
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        DetailSettingDialogFragment detailSettingDialogFragment2 = detailSettingDialogFragment;
                        final SubSpaceDetailVM subSpaceDetailVM = detailSettingDialogFragment2.LLIZLLLIL;
                        if (subSpaceDetailVM != null) {
                            final C505640JsI c505640JsI = new C505640JsI(liveDialog, detailSettingDialogFragment2);
                            final C505620JsG c505620JsG = new C505620JsG(liveDialog, detailSettingDialogFragment);
                            C504880Jr4 c504880Jr4VQ2 = subSpaceDetailVM.vQ2();
                            if (c504880Jr4VQ2 != null) {
                                final long j = c504880Jr4VQ2.LLILZ;
                                C480460Ism.LIZ().getClass();
                                C0J1N c0j1n = (C0J1N) C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).deletePost(j), EnumC510330Jzr.GENERAL, "SubSpaceDetailVM", "sub/space/post/delete", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(subSpaceDetailVM));
                                if (c0j1n != null) {
                                    c0j1n.LIZ(new C09JN() { // from class: X.0JsE
                                        @Override // X.C09JN
                                        public final void accept(Object obj) {
                                            C1C7U.LIZ("SubSpaceDetailVM@ca2c.deletePost$1");
                                            c505640JsI.invoke();
                                            InterfaceC665370Q7z interfaceC665370Q7z = subSpaceDetailVM.LL;
                                            if (interfaceC665370Q7z == null) {
                                                interfaceC665370Q7z = null;
                                            }
                                            SubSpaceFeedAbility subSpaceFeedAbility = (SubSpaceFeedAbility) C1558520qew.LIZ(interfaceC665370Q7z, SubSpaceFeedAbility.class, null);
                                            if (subSpaceFeedAbility != null) {
                                                subSpaceFeedAbility.Gh(j);
                                            }
                                            SubSpaceDetailVM subSpaceDetailVM2 = subSpaceDetailVM;
                                            subSpaceDetailVM2.getClass();
                                            subSpaceDetailVM2.setState(new C505660JsK());
                                            C1C7U.LIZIZ("SubSpaceDetailVM@ca2c.deletePost$1");
                                        }
                                    }, new C09JN() { // from class: X.07xs
                                        @Override // X.C09JN
                                        public final void accept(Object obj) {
                                            C1C7U.LIZ("SubSpaceDetailVM@ca2c.deletePost$2");
                                            c505620JsG.invoke(obj);
                                            C1C7U.LIZIZ("SubSpaceDetailVM@ca2c.deletePost$2");
                                        }
                                    });
                                }
                                subSpaceDetailVM.wQ2().LIZIZ("delete");
                            }
                        }
                    }
                });
                c782110Um9.LJIILLIIL = true;
                c782110Um9.LJIILL = true;
                C786410Ut5.E4(c782110Um9.LIZ());
            }
        });
        C504880Jr4 c504880Jr42 = this.LLIZ;
        if (c504880Jr42 != null && c504880Jr42.LLJJJ) {
            View viewFindViewById4 = this.LLILZIL;
            if (viewFindViewById4 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.dbb);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILZIL = (C16F5) viewFindViewById4;
            }
            TextView textView = (TextView) viewFindViewById4;
            if (textView != null) {
                textView.setText(C497740JfY.LJIJI(2131856642));
            }
            View view5 = this.LLILZLL;
            if (view5 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById = view6.findViewById(R.id.rsh);
                }
                this.LLILZLL = (C16F5) viewFindViewById;
                view5 = viewFindViewById;
            }
            TextView textView2 = (TextView) view5;
            if (textView2 != null) {
                textView2.setText(C497740JfY.LJIJI(2131856643));
            }
        }
    }
}
