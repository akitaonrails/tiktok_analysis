package com.ss.android.ugc.aweme.story.audiencefooter.view;

import X.C01GW;
import X.C098200Yq;
import X.C0CHQ;
import X.C0GTR;
import X.C0LAB;
import X.C12N5;
import X.C1308910kAL;
import X.C1324750kZt;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1378990lzN;
import X.C1685300txQ;
import X.C1841350y17;
import X.C189200o6;
import X.C19292410dm;
import X.C19EG;
import X.C19GS;
import X.C2341909Fp;
import X.C298680BnG;
import X.C418440Gaw;
import X.C427870Gq9;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS163S0100000_29;
import Y.ACListenerS61S0101000_29;
import Y.AObserverS231S0100000_29;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.audiencefooter.vm.AudienceFooterBottomSheetViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class AudienceFooterBottomSheetOption extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZiQ5LSY2JiYpLyA8HELIOSPCA+Zzk6LTJiCDo3ISAiKioVJyo4LD0RJzE4JiIAICApPQAjPCwjJw==";
    public int LLIZ;
    public ConstraintLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public C1841350y17 LLJILJIL;
    public TuxIconView LLJILJILJ;
    public VideoPublishEditModel LLJILLL;
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 485));

    public final void SR() {
        String string;
        Context context = getContext();
        if (context == null || (string = context.getString(2131848941)) == null) {
            string = "";
        }
        aS(R.raw.icon_tab_bottom_friends_fill, R.attr.ee, R.attr.a1q, null, string);
    }

    public final void UR() {
        String string;
        Context context = getContext();
        if (context == null || (string = context.getString(2131836997)) == null) {
            string = "";
        }
        aS(R.raw.icon_paperplane, R.attr.z_, R.attr.zi, Integer.valueOf(R.drawable.ajz), string);
    }

    public final AudienceFooterBottomSheetViewModel WR() {
        return (AudienceFooterBottomSheetViewModel) this.LLJJ.getValue();
    }

    public final void ZR() {
        C1841350y17 c1841350y17 = this.LLJILJIL;
        if (c1841350y17 != null) {
            C786410Ut5.LLLLZ(c1841350y17, 8);
        }
        TuxIconView tuxIconView = this.LLJILJILJ;
        if (tuxIconView != null) {
            tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            tuxIconView.setIconRes(R.raw.icon_chevron_right_ltr);
            tuxIconView.setTintColorRes(R.attr.a1k);
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
    }

    public final void VR() {
        Context context;
        UrlModel avatarThumb;
        View view = getView();
        if (view == null || (context = view.getContext()) == null) {
            return;
        }
        C427870Gq9 c427870Gq9 = new C427870Gq9(context);
        c427870Gq9.setScaleType(ImageView.ScaleType.CENTER_CROP);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38)));
        layoutParams.gravity = 17;
        C786410Ut5.F6(c427870Gq9, layoutParams);
        c427870Gq9.setPlaceholderImage(R.drawable.a6l);
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null && (avatarThumb = currentUser.getAvatarThumb()) != null) {
            C1324750kZt.LJI(c427870Gq9, avatarThumb, -1, -1);
        }
        C1331070kk5 hierarchy = c427870Gq9.getHierarchy();
        if (hierarchy != null) {
            C1331100kk8 c1331100kk8 = new C1331100kk8();
            c1331100kk8.LIZIZ = true;
            c1331100kk8.LJFF(C418440Gaw.LIZIZ(1));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, context);
            c1331100kk8.LJFF = numLIZJ != null ? numLIZJ.intValue() : 0;
            hierarchy.LJJIII(c1331100kk8);
        }
        C0GTR c0gtr = new C0GTR(context, null, 6);
        c0gtr.setRingWidth(C418440Gaw.LIZIZ(3));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        layoutParams2.gravity = 17;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gtr);
        c0gtr.setLayoutParams(layoutParams2);
        FrameLayout frameLayout = this.LLJ;
        if (frameLayout != null) {
            frameLayout.addView(c427870Gq9);
        }
        FrameLayout frameLayout2 = this.LLJ;
        if (frameLayout2 != null) {
            frameLayout2.addView(c0gtr);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLIZ = arguments.getInt("optionType");
            this.LLJILLL = (VideoPublishEditModel) arguments.getSerializable("args");
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        VideoPublishEditModel videoPublishEditModel;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        VideoPublishEditModel videoPublishEditModel2;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        super.onViewCreated(view, bundle);
        this.LLIZLLLIL = (ConstraintLayout) view.findViewById(R.id.ba4);
        this.LLJ = (FrameLayout) view.findViewById(R.id.i30);
        this.LLJI = (TuxTextView) view.findViewById(R.id.z_6);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.z_5);
        this.LLJILJIL = (C1841350y17) view.findViewById(R.id.sp7);
        this.LLJILJILJ = (TuxIconView) view.findViewById(R.id.f740l9b);
        if (C298680BnG.LIZ()) {
            int i = this.LLIZ;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                Context context = getContext();
                                if (context == null || (string15 = context.getString(2131839704)) == null) {
                                    string15 = "";
                                }
                                aS(R.raw.icon_star_ring_fill, R.attr.zm, R.attr.ny, null, string15);
                                TuxTextView tuxTextView = this.LLJI;
                                if (tuxTextView != null) {
                                    Context context2 = getContext();
                                    if (context2 != null) {
                                        string17 = context2.getString(2131839704);
                                    } else {
                                        string17 = null;
                                    }
                                    tuxTextView.setText(string17);
                                }
                                TuxTextView tuxTextView2 = this.LLJIJIL;
                                if (tuxTextView2 != null) {
                                    Context context3 = getContext();
                                    if (context3 != null) {
                                        string16 = context3.getString(2131839707);
                                    } else {
                                        string16 = null;
                                    }
                                    tuxTextView2.setText(string16);
                                }
                                C1841350y17 c1841350y17 = this.LLJILJIL;
                                if (c1841350y17 != null) {
                                    c1841350y17.setChecked(false);
                                }
                                ConstraintLayout constraintLayout = this.LLIZLLLIL;
                                if (constraintLayout != null) {
                                    C786410Ut5.Y7(constraintLayout, new ACListenerS61S0101000_29(this, 4, 6));
                                }
                            }
                        } else {
                            VR();
                            TuxTextView tuxTextView3 = this.LLJI;
                            if (tuxTextView3 != null) {
                                Context context4 = getContext();
                                if (context4 != null) {
                                    string14 = context4.getString(2131848940);
                                } else {
                                    string14 = null;
                                }
                                tuxTextView3.setText(string14);
                            }
                            TuxTextView tuxTextView4 = this.LLJIJIL;
                            if (tuxTextView4 != null) {
                                Context context5 = getContext();
                                if (context5 != null) {
                                    string13 = context5.getString(2131849035);
                                } else {
                                    string13 = null;
                                }
                                tuxTextView4.setText(string13);
                            }
                            C1841350y17 c1841350y172 = this.LLJILJIL;
                            if (c1841350y172 != null) {
                                c1841350y172.setChecked(true);
                            }
                        }
                    } else {
                        UR();
                        TuxTextView tuxTextView5 = this.LLJI;
                        if (tuxTextView5 != null) {
                            Context context6 = getContext();
                            if (context6 != null) {
                                string12 = context6.getString(2131836997);
                            } else {
                                string12 = null;
                            }
                            tuxTextView5.setText(string12);
                        }
                        TuxTextView tuxTextView6 = this.LLJIJIL;
                        if (tuxTextView6 != null) {
                            C786410Ut5.LLLLZLL(tuxTextView6, 8);
                        }
                        C1841350y17 c1841350y173 = this.LLJILJIL;
                        if (c1841350y173 != null) {
                            c1841350y173.setChecked(false);
                        }
                        ZR();
                        ConstraintLayout constraintLayout2 = this.LLIZLLLIL;
                        if (constraintLayout2 != null) {
                            C786410Ut5.Y7(constraintLayout2, new ACListenerS163S0100000_29(this, 240));
                        }
                        Bundle arguments = getArguments();
                        if (arguments != null && (videoPublishEditModel2 = (VideoPublishEditModel) arguments.getSerializable("args")) != null) {
                            C12N5.LIZ.getClass();
                            C0LAB c0labLIZ = C12N5.LIZ(videoPublishEditModel2);
                            c0labLIZ.LJ("message_button_show_way", "story_edit_page_share_panel");
                            C2341909Fp.LIZ("story_edit_page_send_message_button_show", c0labLIZ.LIZ);
                        }
                    }
                } else {
                    SR();
                    TuxTextView tuxTextView7 = this.LLJI;
                    if (tuxTextView7 != null) {
                        Context context7 = getContext();
                        if (context7 != null) {
                            string11 = context7.getString(2131848941);
                        } else {
                            string11 = null;
                        }
                        tuxTextView7.setText(string11);
                    }
                    TuxTextView tuxTextView8 = this.LLJIJIL;
                    if (tuxTextView8 != null) {
                        Context context8 = getContext();
                        if (context8 != null) {
                            string10 = context8.getString(2131848943);
                        } else {
                            string10 = null;
                        }
                        tuxTextView8.setText(string10);
                    }
                    C1841350y17 c1841350y174 = this.LLJILJIL;
                    if (c1841350y174 != null) {
                        c1841350y174.setChecked(false);
                    }
                    ConstraintLayout constraintLayout3 = this.LLIZLLLIL;
                    if (constraintLayout3 != null) {
                        C786410Ut5.Y7(constraintLayout3, new ACListenerS61S0101000_29(this, 1, 5));
                    }
                }
            } else {
                VR();
                TuxTextView tuxTextView9 = this.LLJI;
                if (tuxTextView9 != null) {
                    Context context9 = getContext();
                    if (context9 != null) {
                        string9 = context9.getString(2131848940);
                    } else {
                        string9 = null;
                    }
                    tuxTextView9.setText(string9);
                }
                TuxTextView tuxTextView10 = this.LLJIJIL;
                if (tuxTextView10 != null) {
                    Context context10 = getContext();
                    if (context10 != null) {
                        string8 = context10.getString(2131848942);
                    } else {
                        string8 = null;
                    }
                    tuxTextView10.setText(string8);
                }
                C1841350y17 c1841350y175 = this.LLJILJIL;
                if (c1841350y175 != null) {
                    c1841350y175.setChecked(true);
                }
                ConstraintLayout constraintLayout4 = this.LLIZLLLIL;
                if (constraintLayout4 != null) {
                    C786410Ut5.Y7(constraintLayout4, new ACListenerS61S0101000_29(this, 0, 4));
                }
            }
            C1841350y17 c1841350y176 = this.LLJILJIL;
            if (c1841350y176 != null) {
                c1841350y176.setClickable(false);
            }
        } else {
            int i2 = this.LLIZ;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            VR();
                            TuxTextView tuxTextView11 = this.LLJI;
                            if (tuxTextView11 != null) {
                                Context context11 = getContext();
                                if (context11 != null) {
                                    string7 = context11.getString(2131848940);
                                } else {
                                    string7 = null;
                                }
                                tuxTextView11.setText(string7);
                            }
                            TuxTextView tuxTextView12 = this.LLJIJIL;
                            if (tuxTextView12 != null) {
                                Context context12 = getContext();
                                if (context12 != null) {
                                    string6 = context12.getString(2131849035);
                                } else {
                                    string6 = null;
                                }
                                tuxTextView12.setText(string6);
                            }
                            C1841350y17 c1841350y177 = this.LLJILJIL;
                            if (c1841350y177 != null) {
                                c1841350y177.setChecked(true);
                            }
                        }
                    } else {
                        UR();
                        TuxTextView tuxTextView13 = this.LLJI;
                        if (tuxTextView13 != null) {
                            Context context13 = getContext();
                            if (context13 != null) {
                                string5 = context13.getString(2131836997);
                            } else {
                                string5 = null;
                            }
                            tuxTextView13.setText(string5);
                        }
                        TuxTextView tuxTextView14 = this.LLJIJIL;
                        if (tuxTextView14 != null) {
                            C786410Ut5.LLLLZLL(tuxTextView14, 8);
                        }
                        C1841350y17 c1841350y178 = this.LLJILJIL;
                        if (c1841350y178 != null) {
                            c1841350y178.setChecked(false);
                        }
                        ZR();
                        ConstraintLayout constraintLayout5 = this.LLIZLLLIL;
                        if (constraintLayout5 != null) {
                            C786410Ut5.Y7(constraintLayout5, new ACListenerS163S0100000_29(this, 240));
                        }
                        Bundle arguments2 = getArguments();
                        if (arguments2 != null && (videoPublishEditModel = (VideoPublishEditModel) arguments2.getSerializable("args")) != null) {
                            C12N5.LIZ.getClass();
                            C0LAB c0labLIZ2 = C12N5.LIZ(videoPublishEditModel);
                            c0labLIZ2.LJ("message_button_show_way", "story_edit_page_share_panel");
                            C2341909Fp.LIZ("story_edit_page_send_message_button_show", c0labLIZ2.LIZ);
                        }
                    }
                } else {
                    SR();
                    TuxTextView tuxTextView15 = this.LLJI;
                    if (tuxTextView15 != null) {
                        Context context14 = getContext();
                        if (context14 != null) {
                            string4 = context14.getString(2131848941);
                        } else {
                            string4 = null;
                        }
                        tuxTextView15.setText(string4);
                    }
                    TuxTextView tuxTextView16 = this.LLJIJIL;
                    if (tuxTextView16 != null) {
                        Context context15 = getContext();
                        if (context15 != null) {
                            string3 = context15.getString(2131848943);
                        } else {
                            string3 = null;
                        }
                        tuxTextView16.setText(string3);
                    }
                    C1841350y17 c1841350y179 = this.LLJILJIL;
                    if (c1841350y179 != null) {
                        c1841350y179.setChecked(false);
                    }
                    ConstraintLayout constraintLayout6 = this.LLIZLLLIL;
                    if (constraintLayout6 != null) {
                        C786410Ut5.Y7(constraintLayout6, new ACListenerS61S0101000_29(this, i2, 3));
                    }
                }
            } else {
                VR();
                TuxTextView tuxTextView17 = this.LLJI;
                if (tuxTextView17 != null) {
                    Context context16 = getContext();
                    if (context16 != null) {
                        string2 = context16.getString(2131848940);
                    } else {
                        string2 = null;
                    }
                    tuxTextView17.setText(string2);
                }
                TuxTextView tuxTextView18 = this.LLJIJIL;
                if (tuxTextView18 != null) {
                    Context context17 = getContext();
                    if (context17 != null) {
                        string = context17.getString(2131848942);
                    } else {
                        string = null;
                    }
                    tuxTextView18.setText(string);
                }
                C1841350y17 c1841350y1710 = this.LLJILJIL;
                if (c1841350y1710 != null) {
                    c1841350y1710.setChecked(true);
                }
                ConstraintLayout constraintLayout7 = this.LLIZLLLIL;
                if (constraintLayout7 != null) {
                    C786410Ut5.Y7(constraintLayout7, new ACListenerS61S0101000_29(this, i2, 2));
                }
            }
            C1841350y17 c1841350y1711 = this.LLJILJIL;
            if (c1841350y1711 != null) {
                c1841350y1711.setClickable(false);
            }
        }
        WR().LL.observe(this, new AObserverS231S0100000_29(this, 180));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.rt, viewGroup, false);
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

    public final void aS(int i, int i2, int i3, Integer num, String str) {
        Context context;
        View view = getView();
        if (view != null && (context = view.getContext()) != null) {
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            tuxIconView.setIconRes(i);
            tuxIconView.setTintColorRes(i2);
            tuxIconView.setContentDescription(str);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            layoutParams.gravity = 17;
            C786410Ut5.M6(tuxIconView, layoutParams);
            CardView cardView = new CardView(context, null);
            C786410Ut5.j6(cardView, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))));
            C1378990lzN.LIZIZ(cardView, Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))), null, null, null, null, 30);
            cardView.setCardElevation(0.0f);
            if (num == null) {
                Integer numLIZJ = C1308910kAL.LIZJ(i3, cardView.getContext());
                if (numLIZJ != null) {
                    cardView.setCardBackgroundColor(numLIZJ.intValue());
                }
            } else {
                cardView.setBackgroundResource(num.intValue());
            }
            cardView.addView(tuxIconView);
            FrameLayout frameLayout = this.LLJ;
            if (frameLayout != null) {
                frameLayout.addView(cardView);
            }
        }
    }
}
