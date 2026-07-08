package com.ss.android.ugc.aweme.vibefeed.feed.component;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C069P;
import X.C0OM1;
import X.C0VSJ;
import X.C0XQ7;
import X.C1220000hqw;
import X.C1251150ifB;
import X.C12ES;
import X.C1308910kAL;
import X.C1331670kl3;
import X.C1388190mED;
import X.C13LE;
import X.C14KQ;
import X.C15438062q;
import X.C1559260qg8;
import X.C1575290r5z;
import X.C1575350r65;
import X.C1575440r6E;
import X.C1575530r6N;
import X.C1575910r6z;
import X.C1576040r7C;
import X.C1620630sH7;
import X.C1697810uHb;
import X.C19659111vp;
import X.C197039127h;
import X.C19EG;
import X.C2097608Jq;
import X.C21578619ce;
import X.C2188811AlT;
import X.C299700Bou;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427660Gpo;
import X.C431260Gvc;
import X.C438710HIf;
import X.C451610HnL;
import X.C452070Ho5;
import X.C638790P3t;
import X.C638810P3v;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1338240kve;
import X.EnumC1575330r63;
import X.EnumC912680ZrG;
import Y.ACListenerS126S0200000_24;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.vibefeed.experiment.SocialVibeFeedConfigSetting;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedEntranceViewModel;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedInviteParam;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public class InvitePanelAssem extends UISlotAssem {
    public C21578619ce LLJJI;
    public ImageView LLJJIII;
    public TuxTextView LLJJIJI;
    public LinearLayout LLJJIJIIJIL;
    public View LLJJIJIL;
    public C197039127h LLJJJ;
    public TuxNavBar LLJJJIL;
    public C427660Gpo LLJJJJ;
    public C427660Gpo LLJJJJJIL;
    public final C736950SvV LLJJJJLIIL;
    public final C1559260qg8 LLJJL;
    public EnumC1575330r63 LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.i80;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final VibeFeedInviteParam kp() {
        return (VibeFeedInviteParam) this.LLJJL.getValue();
    }

    public InvitePanelAssem() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(399);
        this.LLJJJJLIIL = new C736950SvV(C13LE.LIZ(VibeFeedEntranceViewModel.class), aFwS213S0000000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(519), new AwS568S0100000_24((AbstractC738140SxQ) this, 1490), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJL = new C1559260qg8(new C723590SZx(this, VibeFeedInviteParam.class, null), checkSupervisorPrepared());
        this.LLJJLIIIJLLLLLLLZ = EnumC1575330r63.INVITE;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (this.LLJJLIIIJLLLLLLLZ != EnumC1575330r63.INTRODUCTION) {
            C1575290r5z c1575290r5z = C1575290r5z.LIZ;
            VibeFeedInviteParam vibeFeedInviteParamKp = kp();
            EnumC1575330r63 enumC1575330r63 = this.LLJJLIIIJLLLLLLLZ;
            c1575290r5z.getClass();
            C1575290r5z.LIZIZ(vibeFeedInviteParamKp, enumC1575330r63);
            return;
        }
        C1575290r5z c1575290r5z2 = C1575290r5z.LIZ;
        String conversationId = kp().getConversationId();
        String feedId = kp().getFeedId();
        EnumC912680ZrG mutualFeedScene = kp().getMutualFeedScene();
        c1575290r5z2.getClass();
        C1575290r5z.LJFF(conversationId, feedId, "feed_intro", mutualFeedScene);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    public final void hp(boolean z) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (onBackPressedDispatcher = c19egLIZ.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LJ();
        }
        if (this.LLJJLIIIJLLLLLLLZ == EnumC1575330r63.INTRODUCTION) {
            C1575290r5z c1575290r5z = C1575290r5z.LIZ;
            String conversationId = kp().getConversationId();
            String feedId = kp().getFeedId();
            EnumC912680ZrG mutualFeedScene = kp().getMutualFeedScene();
            c1575290r5z.getClass();
            C1575290r5z.LJI(conversationId, feedId, "feed_intro", "got_it", mutualFeedScene);
            return;
        }
        C1575290r5z c1575290r5z2 = C1575290r5z.LIZ;
        VibeFeedInviteParam vibeFeedInviteParamKp = kp();
        EnumC1575330r63 enumC1575330r63 = this.LLJJLIIIJLLLLLLLZ;
        c1575290r5z2.getClass();
        C1575290r5z.LIZ(vibeFeedInviteParamKp, enumC1575330r63, z);
    }

    public final void ip(boolean z) {
        Context context = getContext();
        if (context != null) {
            hp(z);
            C638790P3t.LIZ(context, new C638810P3v(kp().getMutualFeedScene(), kp().getEntranceType(), null, kp().getToUserId(), "", kp().getConversationId(), C2097608Jq.LJ(), 132));
        }
    }

    public final void lp(Context context) {
        boolean z;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        TuxTextView tuxTextView = this.LLJJIJI;
        if (tuxTextView != null) {
            tuxTextView.setText(C1575350r65.LIZJ(context, this.LLJJLIIIJLLLLLLLZ, kp()));
        }
        List<C1575910r6z> listLIZ = C1575350r65.LIZ(context, this.LLJJLIIIJLLLLLLLZ, kp());
        ArrayList<View> arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
        int i = 0;
        for (C1575910r6z c1575910r6z : listLIZ) {
            int i2 = i + 1;
            if (i >= 0) {
                C1575910r6z c1575910r6z2 = c1575910r6z;
                boolean z2 = true;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.ga, null);
                TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.bvl);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                tuxIconView.setTintColor(iIntValue);
                tuxIconView.setIconRes(c1575910r6z2.LIZ);
                CharSequence charSequence = c1575910r6z2.LIZIZ;
                if (charSequence == null || charSequence.length() <= 0) {
                    z2 = false;
                }
                if (z2) {
                    TuxTextView tuxTextView2 = (TuxTextView) viewLJLLJ.findViewById(R.id.bvn);
                    tuxTextView2.setTuxFont(32);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context);
                    if (numLIZJ2 != null) {
                        iIntValue3 = numLIZJ2.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    tuxTextView2.setTextColor(iIntValue3);
                    tuxTextView2.setText(c1575910r6z2.LIZIZ);
                    C786410Ut5.LLLLZLL(tuxTextView2, 0);
                    tuxTextView2.setMovementMethod(C431260Gvc.LIZ);
                    C426750GoL.LJIIIZ(viewLJLLJ.findViewById(R.id.bvm), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, false, 29);
                } else {
                    C786410Ut5.LLLLZLL((TuxTextView) viewLJLLJ.findViewById(R.id.bvn), 8);
                    ((TextView) viewLJLLJ.findViewById(R.id.bvm)).setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                }
                TuxTextView tuxTextView3 = (TuxTextView) viewLJLLJ.findViewById(R.id.bvm);
                tuxTextView3.setTuxFont(41);
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.uf, context);
                if (numLIZJ3 != null) {
                    iIntValue2 = numLIZJ3.intValue();
                } else {
                    iIntValue2 = 0;
                }
                tuxTextView3.setTextColor(iIntValue2);
                tuxTextView3.setText(c1575910r6z2.LIZJ);
                tuxTextView3.setTextDirection(5);
                tuxTextView3.setMovementMethod(C431260Gvc.LIZ);
                if (!z) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    C786410Ut5.W5(viewLJLLJ, layoutParams);
                }
                arrayList.add(viewLJLLJ);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        LinearLayout linearLayout = this.LLJJIJIIJIL;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        for (View view : arrayList) {
            LinearLayout linearLayout2 = this.LLJJIJIIJIL;
            if (linearLayout2 != null) {
                linearLayout2.addView(view);
            }
        }
        C197039127h c197039127h = this.LLJJJ;
        if (c197039127h != null) {
            c197039127h.setText(C1575350r65.LIZIZ(context, this.LLJJLIIIJLLLLLLLZ, kp()));
            if (this.LLJJLIIIJLLLLLLLZ == EnumC1575330r63.INVITE_GAP) {
                c197039127h.setEnabled(false);
                c197039127h.setClickable(false);
            }
            C786410Ut5.U8(c197039127h, new ACListenerS126S0200000_24(c197039127h, this, 12));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        int i;
        UrlModel avatarThumb;
        UrlModel avatarThumb2;
        int i2;
        UrlModel avatarThumb3;
        UrlModel avatarThumb4;
        UrlModel avatarThumb5;
        UrlModel avatarThumb6;
        int i3;
        UrlModel avatarThumb7;
        UrlModel avatarThumb8;
        super.onViewCreated(view);
        view.findViewById(R.id.kxm);
        this.LLJJI = (C21578619ce) view.findViewById(R.id.ky6);
        this.LLJJIII = (ImageView) view.findViewById(R.id.kxj);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.kyb);
        this.LLJJIJIIJIL = (LinearLayout) view.findViewById(R.id.kxn);
        this.LLJJIJIL = view.findViewById(R.id.cfr);
        this.LLJJJ = (C197039127h) view.findViewById(R.id.kx7);
        this.LLJJJIL = (TuxNavBar) view.findViewById(R.id.vibe_feed_invite_navbar);
        this.LLJJJJ = (C427660Gpo) view.findViewById(R.id.vibe_feed_avatar_left_top);
        this.LLJJJJJIL = (C427660Gpo) view.findViewById(R.id.vibe_feed_avatar_right_bottom);
        TuxNavBar tuxNavBar = this.LLJJJIL;
        if (tuxNavBar != null) {
            tuxNavBar.setNavBackground(0);
        }
        TuxNavBar tuxNavBar2 = this.LLJJJIL;
        if (tuxNavBar2 != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZJ(new AwS568S0100000_24(this, 1893));
            c0om1.LJ(c1251150ifB);
            tuxNavBar2.setNavActions(c0om1);
        }
        this.LLJJLIIIJLLLLLLLZ = kp().getPanelType();
        Context context = getContext();
        if (context != null) {
            C1575530r6N c1575530r6N = C1575530r6N.LIZ;
            boolean zLIZIZ = C960203pA.LIZIZ(context);
            c1575530r6N.getClass();
            C0VSJ c0vsjLIZ = C1575530r6N.LIZ(zLIZIZ);
            if (C960203pA.LIZIZ(context)) {
                str = SocialVibeFeedConfigSetting.LIZ().invitePanelTopDarkPicUrl;
            } else {
                str = SocialVibeFeedConfigSetting.LIZ().invitePanelTopLightPicUrl;
            }
            C1331670kl3 c1331670kl3LJFF = C1575440r6E.LJFF(c0vsjLIZ, str);
            c1331670kl3LJFF.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LJFF.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJFF.LJJII(new C1620630sH7(this, context, 3));
            if ((C1576040r7C.LIZ() && C1576040r7C.LJFF().inviteHideAvatar) || kp().getMutualFeedScene().isGroup()) {
                C427660Gpo c427660Gpo = this.LLJJJJ;
                if (c427660Gpo != null) {
                    C786410Ut5.LLLLLJIL(c427660Gpo, 8);
                }
                C427660Gpo c427660Gpo2 = this.LLJJJJJIL;
                if (c427660Gpo2 != null) {
                    C786410Ut5.LLLLLJIL(c427660Gpo2, 8);
                }
            } else {
                int iLJIILJJIL = C12ES.LJIILJJIL(C14KQ.LIZIZ(C1388190mED.LIZ(context)), context);
                float f = iLJIILJJIL;
                float f2 = f * 0.5948718f;
                User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                IMContactApi.LIZ.getClass();
                IMUser iMUserLJ = C069P.LIZ().LJ().LJ(kp().getToUserId(), null);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initPanelAvatarLocation: screenWidth:");
                sbLIZ.append(iLJIILJJIL);
                sbLIZ.append(" imageViewHeight:");
                sbLIZ.append(f2);
                sbLIZ.append(' ');
                C299700Bou.LIZIZ("InvitePanelAssem", C2188811AlT.LIZIZ(sbLIZ));
                if (iLJIILJJIL < 375) {
                    C427660Gpo c427660Gpo3 = this.LLJJJJ;
                    if (c427660Gpo3 != null) {
                        c427660Gpo3.setSize(48);
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
                        Drawable drawableLIZ = c384050F3z.LIZ(context);
                        C19659111vp c19659111vp = new C19659111vp();
                        c19659111vp.LJ = Integer.valueOf(R.attr.ou);
                        c19659111vp.LIZ = C418440Gaw.LIZIZ(24);
                        c427660Gpo3.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(context)));
                        i3 = 48;
                        C426750GoL.LJIIIZ(c427660Gpo3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.25f * f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) f2) * 0.17d)))), 0, 0, false, 16);
                        if (iMUserLJ != null) {
                            avatarThumb8 = iMUserLJ.getAvatarThumb();
                        } else {
                            avatarThumb8 = null;
                        }
                        C427660Gpo.LJIIJJI(c427660Gpo3, C438710HIf.LIZ(avatarThumb8), false, null, null, false, false, null, null, false, null, 990);
                    } else {
                        i3 = 48;
                    }
                    C427660Gpo c427660Gpo4 = this.LLJJJJJIL;
                    if (c427660Gpo4 != null) {
                        c427660Gpo4.setSize(i3);
                        C384050F3z c384050F3z2 = new C384050F3z();
                        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
                        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zi);
                        Drawable drawableLIZ2 = c384050F3z2.LIZ(context);
                        C19659111vp c19659111vp2 = new C19659111vp();
                        c19659111vp2.LJ = Integer.valueOf(R.attr.ou);
                        c19659111vp2.LIZ = C418440Gaw.LIZIZ(24);
                        c427660Gpo4.setBackground(C426750GoL.LJIILIIL(drawableLIZ2, c19659111vp2.LIZ(context)));
                        C426750GoL.LJIIIZ(c427660Gpo4, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f * 0.27f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) f2) * 0.17d)))), false, 16);
                        if (curUser != null) {
                            avatarThumb7 = curUser.getAvatarThumb();
                        } else {
                            avatarThumb7 = null;
                        }
                        C427660Gpo.LJIIJJI(c427660Gpo4, C438710HIf.LIZ(avatarThumb7), false, null, null, false, false, null, null, false, null, 990);
                    }
                } else if (iLJIILJJIL < 428) {
                    C427660Gpo c427660Gpo5 = this.LLJJJJ;
                    if (c427660Gpo5 != null) {
                        c427660Gpo5.setSize(56);
                        C384050F3z c384050F3z3 = new C384050F3z();
                        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(28));
                        c384050F3z3.LIZIZ = Integer.valueOf(R.attr.zi);
                        Drawable drawableLIZ3 = c384050F3z3.LIZ(context);
                        C19659111vp c19659111vp3 = new C19659111vp();
                        c19659111vp3.LJ = Integer.valueOf(R.attr.ou);
                        c19659111vp3.LIZ = C418440Gaw.LIZIZ(28);
                        c427660Gpo5.setBackground(C426750GoL.LJIILIIL(drawableLIZ3, c19659111vp3.LIZ(context)));
                        C426750GoL.LJIIIZ(c427660Gpo5, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.25f * f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) f2) * 0.17d)))), 0, 0, false, 16);
                        if (iMUserLJ != null) {
                            avatarThumb6 = iMUserLJ.getAvatarThumb();
                        } else {
                            avatarThumb6 = null;
                        }
                        C427660Gpo.LJIIJJI(c427660Gpo5, C438710HIf.LIZ(avatarThumb6), false, null, null, false, false, null, null, false, null, 990);
                    }
                    C427660Gpo c427660Gpo6 = this.LLJJJJJIL;
                    if (c427660Gpo6 != null) {
                        c427660Gpo6.setSize(56);
                        C384050F3z c384050F3z4 = new C384050F3z();
                        c384050F3z4.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(28));
                        c384050F3z4.LIZIZ = Integer.valueOf(R.attr.zi);
                        Drawable drawableLIZ4 = c384050F3z4.LIZ(context);
                        C19659111vp c19659111vp4 = new C19659111vp();
                        c19659111vp4.LJ = Integer.valueOf(R.attr.ou);
                        c19659111vp4.LIZ = C418440Gaw.LIZIZ(28);
                        c427660Gpo6.setBackground(C426750GoL.LJIILIIL(drawableLIZ4, c19659111vp4.LIZ(context)));
                        C426750GoL.LJIIIZ(c427660Gpo6, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f * 0.27f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) f2) * 0.2d)))), false, 16);
                        if (curUser != null) {
                            avatarThumb5 = curUser.getAvatarThumb();
                        } else {
                            avatarThumb5 = null;
                        }
                        C427660Gpo.LJIIJJI(c427660Gpo6, C438710HIf.LIZ(avatarThumb5), false, null, null, false, false, null, null, false, null, 990);
                    }
                } else if (iLJIILJJIL < 720) {
                    C427660Gpo c427660Gpo7 = this.LLJJJJ;
                    if (c427660Gpo7 != null) {
                        c427660Gpo7.setSize(64);
                        C384050F3z c384050F3z5 = new C384050F3z();
                        c384050F3z5.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(32));
                        c384050F3z5.LIZIZ = Integer.valueOf(R.attr.zi);
                        Drawable drawableLIZ5 = c384050F3z5.LIZ(context);
                        C19659111vp c19659111vp5 = new C19659111vp();
                        c19659111vp5.LJ = Integer.valueOf(R.attr.ou);
                        c19659111vp5.LIZ = C418440Gaw.LIZIZ(32);
                        c427660Gpo7.setBackground(C426750GoL.LJIILIIL(drawableLIZ5, c19659111vp5.LIZ(context)));
                        i2 = 32;
                        C426750GoL.LJIIIZ(c427660Gpo7, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.25f * f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) f2) * 0.17d)))), 0, 0, false, 16);
                        if (iMUserLJ != null) {
                            avatarThumb4 = iMUserLJ.getAvatarThumb();
                        } else {
                            avatarThumb4 = null;
                        }
                        C427660Gpo.LJIIJJI(c427660Gpo7, C438710HIf.LIZ(avatarThumb4), false, null, null, false, false, null, null, false, null, 990);
                    } else {
                        i2 = 32;
                    }
                    C427660Gpo c427660Gpo8 = this.LLJJJJJIL;
                    if (c427660Gpo8 != null) {
                        c427660Gpo8.setSize(64);
                        C384050F3z c384050F3z6 = new C384050F3z();
                        c384050F3z6.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
                        c384050F3z6.LIZIZ = Integer.valueOf(R.attr.zi);
                        Drawable drawableLIZ6 = c384050F3z6.LIZ(context);
                        C19659111vp c19659111vp6 = new C19659111vp();
                        c19659111vp6.LJ = Integer.valueOf(R.attr.ou);
                        c19659111vp6.LIZ = C418440Gaw.LIZIZ(Integer.valueOf(i2));
                        c427660Gpo8.setBackground(C426750GoL.LJIILIIL(drawableLIZ6, c19659111vp6.LIZ(context)));
                        C426750GoL.LJIIIZ(c427660Gpo8, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f * 0.27f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) f2) * 0.2d)))), false, 16);
                        if (curUser != null) {
                            avatarThumb3 = curUser.getAvatarThumb();
                        } else {
                            avatarThumb3 = null;
                        }
                        C427660Gpo.LJIIJJI(c427660Gpo8, C438710HIf.LIZ(avatarThumb3), false, null, null, false, false, null, null, false, null, 990);
                    }
                } else {
                    C427660Gpo c427660Gpo9 = this.LLJJJJ;
                    if (c427660Gpo9 != null) {
                        c427660Gpo9.setSize(96);
                        C384050F3z c384050F3z7 = new C384050F3z();
                        c384050F3z7.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(48));
                        c384050F3z7.LIZIZ = Integer.valueOf(R.attr.zi);
                        Drawable drawableLIZ7 = c384050F3z7.LIZ(context);
                        C19659111vp c19659111vp7 = new C19659111vp();
                        c19659111vp7.LJ = Integer.valueOf(R.attr.ou);
                        c19659111vp7.LIZ = C418440Gaw.LIZIZ(48);
                        c427660Gpo9.setBackground(C426750GoL.LJIILIIL(drawableLIZ7, c19659111vp7.LIZ(context)));
                        i = 96;
                        C426750GoL.LJIIIZ(c427660Gpo9, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.25f * f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) f2) * 0.17d)))), 0, 0, false, 16);
                        if (iMUserLJ != null) {
                            avatarThumb2 = iMUserLJ.getAvatarThumb();
                        } else {
                            avatarThumb2 = null;
                        }
                        C427660Gpo.LJIIJJI(c427660Gpo9, C438710HIf.LIZ(avatarThumb2), false, null, null, false, false, null, null, false, null, 990);
                    } else {
                        i = 96;
                    }
                    C427660Gpo c427660Gpo10 = this.LLJJJJJIL;
                    if (c427660Gpo10 != null) {
                        c427660Gpo10.setSize(i);
                        C384050F3z c384050F3z8 = new C384050F3z();
                        c384050F3z8.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(48));
                        c384050F3z8.LIZIZ = Integer.valueOf(R.attr.zi);
                        Drawable drawableLIZ8 = c384050F3z8.LIZ(context);
                        C19659111vp c19659111vp8 = new C19659111vp();
                        c19659111vp8.LJ = Integer.valueOf(R.attr.ou);
                        c19659111vp8.LIZ = C418440Gaw.LIZIZ(48);
                        c427660Gpo10.setBackground(C426750GoL.LJIILIIL(drawableLIZ8, c19659111vp8.LIZ(context)));
                        C426750GoL.LJIIIZ(c427660Gpo10, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f * 0.27f)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) f2) * 0.2d)))), false, 16);
                        if (curUser != null) {
                            avatarThumb = curUser.getAvatarThumb();
                        } else {
                            avatarThumb = null;
                        }
                        C427660Gpo.LJIIJJI(c427660Gpo10, C438710HIf.LIZ(avatarThumb), false, null, null, false, false, null, null, false, null, 990);
                    }
                }
            }
            lp(context);
            if (this.LLJJLIIIJLLLLLLLZ != EnumC1575330r63.INTRODUCTION) {
                C197039127h c197039127h = this.LLJJJ;
                if (c197039127h != null) {
                    c197039127h.setLoading(true);
                }
                ((VibeFeedEntranceViewModel) this.LLJJJJLIIL.getValue()).xQ2(kp().getToUserId(), kp().getConversationId(), kp().getMutualFeedScene(), false, new AwS603S0100000_24(this, 689));
            }
        }
    }
}
