package com.ss.android.ugc.aweme.upvote.detail.panel;

import X.C019F;
import X.C0B0T;
import X.C0CHP;
import X.C10EU;
import X.C128Y;
import X.C1308910kAL;
import X.C1356800lPa;
import X.C1358120lRi;
import X.C1358550lSP;
import X.C1358940lT2;
import X.C1359600lU6;
import X.C1359720lUI;
import X.C1359730lUJ;
import X.C1359850lUV;
import X.C1359970lUh;
import X.C1388190mED;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2189821An6;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C263730AVf;
import X.C298430Bmr;
import X.C298740BnM;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C429520Gso;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC1359800lUQ;
import X.InterfaceC1359760lUM;
import X.InterfaceC2217461Bqa;
import Y.AAListenerS332S0100000_21;
import Y.ACListenerS155S0100000_21;
import Y.AObserverS224S0100000_21;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Editable;
import android.util.Property;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.input.RepostInputFragment;
import com.ss.android.ugc.aweme.upvote.setting.PublishOptConfig;
import com.zhiliaoapp.musically.R;
import defpackage.IButtonEntranceView;
import irm.AkS89S0100000_21;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvotePanelButtonAssem extends UIContentAssem implements IPanelButtonAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1359850lUV.class, null), checkSupervisorPrepared());
    public UpvotePanelListViewModel LLJ;
    public final AssemVMLazy LLJI;
    public C197039127h LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public TuxTextView LLJILLL;
    public AnimatorSet LLJJ;
    public AnimatorSet LLJJI;
    public String LLJJIII;
    public int LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UpvotePanelButtonAssem.class, "groupChatVM", "getGroupChatVM()Lcom/ss/android/ugc/aweme/upvote/detail/panel/RepostGroupChatViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public UpvotePanelButtonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostGroupChatViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS565S0100000_21(c19719912DlLIZ, 887), AFwS259S0000000_21.get$arr$(239), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final int Jo() {
        Aweme aweme;
        Aweme aweme2;
        UpvotePanelListViewModel upvotePanelListViewModel = this.LLJ;
        if (upvotePanelListViewModel == null) {
            return 0;
        }
        UpvoteStruct upvoteStructLIZJ = C1358940lT2.LIZJ(upvotePanelListViewModel.wQ2().getValue());
        User author = null;
        if (upvoteStructLIZJ == null && C1359600lU6.LIZIZ()) {
            UpvotePanelListViewModel upvotePanelListViewModel2 = this.LLJ;
            if (!C10EU.LJIILLIIL((upvotePanelListViewModel2 == null || (aweme2 = upvotePanelListViewModel2.LLJIJIL) == null) ? null : aweme2.getAuthor()) || C429520Gso.LIZ()) {
                return 1;
            }
        }
        if (!C263730AVf.LIZ() || upvoteStructLIZJ == null || C1359720lUI.LJ(upvoteStructLIZJ)) {
            return 0;
        }
        UpvotePanelListViewModel upvotePanelListViewModel3 = this.LLJ;
        if (upvotePanelListViewModel3 != null && (aweme = upvotePanelListViewModel3.LLJIJIL) != null) {
            author = aweme.getAuthor();
        }
        return ((!C10EU.LJIILLIIL(author) || C429520Gso.LIZ()) && C0CHP.LIZ()) ? 2 : 0;
    }

    public final void No() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        if (Jo() == this.LLJJIJI) {
            return;
        }
        AnimatorSet animatorSet3 = this.LLJJ;
        if (animatorSet3 != null && animatorSet3.isRunning() && (animatorSet2 = this.LLJJ) != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet4 = this.LLJJI;
        if (animatorSet4 != null && animatorSet4.isRunning() && (animatorSet = this.LLJJI) != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJILJIL, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setStartDelay(250L);
        AnimatorSet animatorSet5 = new AnimatorSet();
        if (Jo() != 0) {
            animatorSet5.playTogether(objectAnimatorOfFloat);
            animatorSet5.addListener(new AAListenerS332S0100000_21(this, 13));
        }
        animatorSet5.addListener(new AAListenerS332S0100000_21(this, 11));
        animatorSet5.addListener(new AAListenerS332S0100000_21(this, 12));
        this.LLJJI = animatorSet5;
        animatorSet5.start();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IPanelButtonAbility.class, null, null);
        }
    }

    public final void Go(int i) {
        String string;
        String string2;
        int i2;
        String aid;
        Editable editable;
        Aweme aweme;
        if (this.LLJJIJI == i) {
            return;
        }
        this.LLJJIJI = i;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    View view = this.LLJILJIL;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(0, view);
                    }
                    if (C1359970lUh.LIZIZ()) {
                        C197039127h c197039127h = this.LLJIJIL;
                        if (c197039127h != null) {
                            C339190DRl.LIZIZ(c197039127h);
                        }
                        View view2 = this.LLJILJILJ;
                        if (view2 != null) {
                            C339190DRl.LIZLLL(view2);
                        }
                        HashMap<String, Editable> map = C1356800lPa.LIZ;
                        UpvotePanelListViewModel upvotePanelListViewModel = this.LLJ;
                        if (upvotePanelListViewModel != null && (aweme = upvotePanelListViewModel.LLJIJIL) != null) {
                            aid = aweme.getAid();
                        } else {
                            aid = null;
                        }
                        String strLIZ = C1356800lPa.LIZ(aid, null, null);
                        if (strLIZ == null) {
                            editable = null;
                        } else {
                            editable = C1356800lPa.LIZ.get(strLIZ);
                        }
                        dh(editable);
                    } else {
                        C197039127h c197039127h2 = this.LLJIJIL;
                        if (c197039127h2 != null) {
                            C339190DRl.LIZLLL(c197039127h2);
                        }
                        View view3 = this.LLJILJILJ;
                        if (view3 != null) {
                            C339190DRl.LIZIZ(view3);
                        }
                        View view4 = this.LLJILJIL;
                        if (view4 != null) {
                            C786410Ut5.LJLLLLLL(0, view4);
                        }
                        C197039127h c197039127h3 = this.LLJIJIL;
                        if (c197039127h3 != null) {
                            Context context = getContext();
                            if (context != null) {
                                if (((PublishOptConfig) C1359970lUh.LIZIZ.getValue()).newHint && C263730AVf.LIZ()) {
                                    i2 = 2131838847;
                                } else if (C298430Bmr.LIZ()) {
                                    i2 = 2131824963;
                                } else {
                                    i2 = 2131850100;
                                }
                                string2 = context.getString(i2);
                            } else {
                                string2 = null;
                            }
                            c197039127h3.setText(string2);
                        }
                        C197039127h c197039127h4 = this.LLJIJIL;
                        if (c197039127h4 != null) {
                            c197039127h4.setTextColorRes(R.attr.a1h);
                        }
                        C197039127h c197039127h5 = this.LLJIJIL;
                        if (c197039127h5 != null) {
                            c197039127h5.setButtonVariant(1);
                        }
                        C197039127h c197039127h6 = this.LLJIJIL;
                        if (c197039127h6 != null) {
                            c197039127h6.setButtonStartIcon(Integer.valueOf(R.raw.icon_pen_fill));
                        }
                        C197039127h c197039127h7 = this.LLJIJIL;
                        if (c197039127h7 != null) {
                            C786410Ut5.U8(c197039127h7, new ACListenerS155S0100000_21(this, 98));
                        }
                    }
                    IButtonEntranceView iButtonEntranceView = (IButtonEntranceView) C1558520qew.LIZ(C1558520qew.LJIIL(this), IButtonEntranceView.class, null);
                    if (iButtonEntranceView != null) {
                        iButtonEntranceView.br2(true);
                        return;
                    }
                    return;
                }
                return;
            }
            View view5 = this.LLJILJIL;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(0, view5);
            }
            C339190DRl.LIZLLL(this.LLJIJIL);
            View view6 = this.LLJILJILJ;
            if (view6 != null) {
                C339190DRl.LIZIZ(view6);
            }
            C197039127h c197039127h8 = this.LLJIJIL;
            if (c197039127h8 != null) {
                Context context2 = getContext();
                if (context2 != null) {
                    string = context2.getString(2131846358);
                } else {
                    string = null;
                }
                c197039127h8.setText(string);
            }
            C197039127h c197039127h9 = this.LLJIJIL;
            if (c197039127h9 != null) {
                c197039127h9.setTextColorRes(R.attr.a0p);
            }
            C197039127h c197039127h10 = this.LLJIJIL;
            if (c197039127h10 != null) {
                c197039127h10.setButtonVariant(0);
            }
            C197039127h c197039127h11 = this.LLJIJIL;
            if (c197039127h11 != null) {
                c197039127h11.setButtonStartIcon(Integer.valueOf(R.raw.icon_repost_fill));
            }
            C197039127h c197039127h12 = this.LLJIJIL;
            if (c197039127h12 != null) {
                C786410Ut5.U8(c197039127h12, new ACListenerS155S0100000_21(this, 97));
            }
            IButtonEntranceView iButtonEntranceView2 = (IButtonEntranceView) C1558520qew.LIZ(C1558520qew.LJIIL(this), IButtonEntranceView.class, null);
            if (iButtonEntranceView2 == null) {
                return;
            }
            iButtonEntranceView2.br2(true);
            return;
        }
        View view7 = this.LLJILJIL;
        if (view7 != null) {
            C786410Ut5.LJLLLLLL(8, view7);
        }
        IButtonEntranceView iButtonEntranceView3 = (IButtonEntranceView) C1558520qew.LIZ(C1558520qew.LJIIL(this), IButtonEntranceView.class, null);
        if (iButtonEntranceView3 == null) {
            return;
        }
        iButtonEntranceView3.br2(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ho(boolean r27) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelButtonAssem.Ho(boolean):void");
    }

    public final void Lo(EnumC1359800lUQ enumC1359800lUQ) {
        FragmentManager supportFragmentManager;
        Aweme aweme;
        String str;
        InterfaceC1359760lUM interfaceC1359760lUM;
        String str2;
        VideoItemParams videoItemParams;
        VideoItemParams videoItemParams2;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        String tabName;
        VideoItemParams videoItemParams3;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Aweme aweme2 = null;
            if ((c19egLIZ instanceof C19GS) && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
                String str3 = RepostInputFragment._pnsPageId;
                C1359730lUJ.LIZIZ(c19egLIZ);
                UpvotePanelListViewModel upvotePanelListViewModel = this.LLJ;
                if (upvotePanelListViewModel != null) {
                    aweme = upvotePanelListViewModel.LLJIJIL;
                } else {
                    aweme = null;
                }
                String str4 = "";
                if (upvotePanelListViewModel == null || (videoItemParams3 = upvotePanelListViewModel.LLJI) == null || (str = videoItemParams3.mEventType) == null) {
                    str = "";
                }
                UpvotePanelListViewModel upvotePanelListViewModel2 = this.LLJ;
                if (upvotePanelListViewModel2 != null && (videoItemParams2 = upvotePanelListViewModel2.LLJI) != null && (baseFeedPageParams = videoItemParams2.baseFeedPageParams) != null && (c2189821An6 = baseFeedPageParams.param) != null && (tabName = c2189821An6.getTabName()) != null) {
                    str4 = tabName;
                }
                C128Y c128yLJI = C724240Sb0.LJI(this);
                if (c128yLJI instanceof InterfaceC1359760lUM) {
                    interfaceC1359760lUM = (InterfaceC1359760lUM) c128yLJI;
                } else {
                    interfaceC1359760lUM = null;
                }
                C1359730lUJ.LIZ(aweme, true, str, "recommend_panel", "list", str4, enumC1359800lUQ, interfaceC1359760lUM, null, null, null, null, null, null, 32320).show(supportFragmentManager, "REPOST_INPUT");
                C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                UpvotePanelListViewModel upvotePanelListViewModel3 = this.LLJ;
                if (upvotePanelListViewModel3 != null && (videoItemParams = upvotePanelListViewModel3.LLJI) != null) {
                    str2 = videoItemParams.mEventType;
                } else {
                    str2 = null;
                }
                UpvotePanelListViewModel upvotePanelListViewModel4 = this.LLJ;
                if (upvotePanelListViewModel4 != null) {
                    aweme2 = upvotePanelListViewModel4.LLJIJIL;
                }
                C1358550lSP.LJIJJLI(c1358550lSP, str2, "recommend_panel", aweme2, "click", "list", 0, enumC1359800lUQ.getClickTypeMob(), null, null, null, 928);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.panel.IPanelButtonAbility
    public final void dh(Editable editable) {
        TuxTextView tuxTextView = this.LLJILLL;
        if (tuxTextView != null) {
            int iIntValue = 0;
            if (editable != null && editable.length() != 0) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, tuxTextView.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                tuxTextView.setTextColor(iIntValue);
                tuxTextView.setText(editable);
                return;
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1p, tuxTextView.getContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            }
            tuxTextView.setTextColor(iIntValue);
            tuxTextView.setText(tuxTextView.getContext().getString(2131838849));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        MutableLiveData<UpvoteList> mutableLiveDataWQ2;
        C19EG c19egLIZIZ;
        Context context = getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            UpvotePanelListViewModel.LLJJIJI.getClass();
            this.LLJ = C1358120lRi.LIZ(c19egLIZIZ);
        }
        this.LLJILJIL = view.findViewById(R.id.i3u);
        this.LLJIJIL = (C197039127h) view.findViewById(R.id.cwf);
        if (C1359970lUh.LIZIZ()) {
            this.LLJILLL = (TuxTextView) view.findViewById(R.id.kqr);
            View viewFindViewById = view.findViewById(R.id.kqm);
            if (viewFindViewById != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
                viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
                C786410Ut5.I7(new AkS89S0100000_21(this, 9), viewFindViewById);
            } else {
                viewFindViewById = null;
            }
            this.LLJILJILJ = viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.kqp);
            if (viewFindViewById2 != null) {
                if (C298740BnM.LIZ() && C0B0T.LIZ()) {
                    C339190DRl.LIZLLL(viewFindViewById2);
                    C786410Ut5.I7(new AkS89S0100000_21(this, 10), viewFindViewById2);
                } else {
                    C339190DRl.LIZIZ(viewFindViewById2);
                }
            }
            View viewFindViewById3 = view.findViewById(R.id.kqn);
            if (viewFindViewById3 != null) {
                C786410Ut5.I7(new AkS89S0100000_21(this, 11), viewFindViewById3);
            }
        }
        Ho(true);
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217371BqR() { // from class: X.0lUc
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1155500gAu) obj).LLILLL);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1155500gAu) obj).LLILLL = ((Boolean) obj2).booleanValue();
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 96), 4);
        UpvotePanelListViewModel upvotePanelListViewModel = this.LLJ;
        if (upvotePanelListViewModel != null && (mutableLiveDataWQ2 = upvotePanelListViewModel.wQ2()) != null) {
            mutableLiveDataWQ2.observe(this, new AObserverS224S0100000_21(this, 45));
        }
    }
}
