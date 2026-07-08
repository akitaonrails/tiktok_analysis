package com.ss.android.ugc.aweme.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C10IT;
import X.C12823050b;
import X.C1308910kAL;
import X.C13LE;
import X.C1841350y17;
import X.C19719912Dl;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2241008qG;
import X.C326980Cro;
import X.C452080Ho6;
import X.C452501pT;
import X.C729980SkG;
import X.C735370Ssx;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C794420VEi;
import X.C800330VaR;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS154S0100000_19;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.viewmodel.MentionPostedAndLikeVideoVM;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class PostedAndLikeVideoCell extends BaseVideoCell<C12823050b> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final AssemVMLazy LLJILJILJ;
    public final String LLJILLL;
    public final C326980Cro LLJJ;
    public TuxIconView LLJJI;
    public TuxTextView LLJJIII;
    public TuxIconView LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public TextView LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PostedAndLikeVideoCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/viewmodel/MentionPostedAndLikeVideoVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PostedAndLikeVideoCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MentionPostedAndLikeVideoVM.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 479);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(78);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 464), awS563S0100000_19, AFwS207S0000000_19.get$arr$(68), new AwS563S0100000_19((C03K6) this, 465), new AwS563S0100000_19((C03K6) this, 467), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 469), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 471), null, new AwS563S0100000_19((C03K6) this, 472));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19((C03K6) this, 466);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 468);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 470);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_192, 28));
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 473);
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ, 474);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 475);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 476);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 477);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_194, awS563S0100000_19, new C452080Ho6(), awS563S0100000_195, awS563S0100000_196, awS563S0100000_193, aFwS257S0000000_19, awS563S0100000_197, awS563S0100000_198, awS563S0100000_199);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 478), awS563S0100000_19, AFwS207S0000000_19.get$arr$(69), new AwS563S0100000_19((C03K6) this, 480), new AwS563S0100000_19((C03K6) this, 481), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 482), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 483), null, new AwS563S0100000_19((C03K6) this, 484));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 485), awS563S0100000_19, AFwS207S0000000_19.get$arr$(70), new AwS563S0100000_19((C03K6) this, 486), new AwS563S0100000_19((C03K6) this, 487), new AwS563S0100000_19((C03K6) this, 488), aFwS257S0000000_19, null, null, new AwS563S0100000_19((C03K6) this, 489));
        }
        this.LLJILJILJ = assemVMLazy;
        this.LLJILLL = "PostedAndLikeVideoCell";
        this.LLJJ = new C326980Cro();
    }

    public final MentionPostedAndLikeVideoVM V5() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (MentionPostedAndLikeVideoVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C786410Ut5.Q8(N5(), new ACListenerS154S0100000_19(this, 89));
        C786410Ut5.e9(I5(), new ACListenerS154S0100000_19(this, 90));
    }

    public final void U5(Aweme aweme) {
        Video video = aweme.getVideo();
        if (video.getCover() != null && video.getCover().getUrlList() != null && video.getCover().getUrlList().size() != 0 && !TextUtils.isEmpty((CharSequence) ListProtector.get(video.getCover().getUrlList(), 0))) {
            UrlModel animatedCover = video.getAnimatedCover();
            if (animatedCover == null) {
                animatedCover = video.getCover();
            }
            T5(animatedCover, this.LLJILLL, aweme);
            return;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bv, L5());
        if (numLIZJ == null) {
            return;
        }
        N5().setImageResource(numLIZJ.intValue());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        AwemeStatus statusSafety;
        UrlModel urlModelLIZ;
        C12823050b c12823050b = (C12823050b) interfaceC1891350zJl;
        super.onBindItemView(c12823050b);
        Aweme aweme = c12823050b.LL;
        TuxTextView tuxTextView = this.LLJJIII;
        View view = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        ViewGroup viewGroup = this.LLILZ;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.LJLZ(0, viewGroup);
        View view2 = this.LLJJIJIIJIL;
        if (view2 == null) {
            view2 = null;
        }
        if (view2.getVisibility() == 0) {
            View view3 = this.LLJJIJIIJIL;
            if (view3 == null) {
                view3 = null;
            }
            C786410Ut5.LJLLLLLL(8, view3);
        }
        if (AwemeExtKt.isProhibited(aweme) && C735370Ssx.LJJIJLIJ(aweme)) {
            TuxTextView tuxTextView2 = this.LLJJIII;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
            ViewGroup viewGroup2 = this.LLILZ;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            C786410Ut5.LJLZ(8, viewGroup2);
            View view4 = this.LLJJIJIIJIL;
            if (view4 == null) {
                view4 = null;
            }
            C786410Ut5.LJLLLLLL(0, view4);
            TuxTextView tuxTextView3 = this.LLJJIII;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            tuxTextView3.setTuxFont(73);
            if (!TextUtils.isEmpty(AwemeExtKt.getCoverNotice(aweme))) {
                TuxTextView tuxTextView4 = this.LLJJIII;
                if (tuxTextView4 == null) {
                    tuxTextView4 = null;
                }
                tuxTextView4.setText(AwemeExtKt.getCoverNotice(aweme));
            } else {
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("type", "cover_notice");
                c2241008qG.LIZ.put("log_id", aweme.getRequestId());
                c2241008qG.LIZ.put("item_id", aweme.getAid());
                C794420VEi.LIZIZ("notice_content_empty", "", c2241008qG.LJ());
            }
        }
        if (aweme.getIsTop() == 1 && V5().LL == 6) {
            TextView textView = this.LLJJJ;
            if (textView == null) {
                textView = null;
            }
            C786410Ut5.LLIL(textView, 0);
        } else {
            TextView textView2 = this.LLJJJ;
            if (textView2 == null) {
                textView2 = null;
            }
            C786410Ut5.LLIL(textView2, 8);
        }
        if (AwemeExtKt.isScheduleVideo(aweme)) {
            C786410Ut5.LLLLZLL(R5(), 0);
            Drawable drawableLIZIZ = C800330VaR.LIZIZ(L5(), R.drawable.bb2);
            TuxTextView tuxTextViewR5 = R5();
            if (tuxTextViewR5 != null) {
                tuxTextViewR5.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableLIZIZ, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            R5().setText(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(aweme.getScheduleTime() * 1000)));
            R5().setTuxFont(72);
        } else {
            S5(c12823050b);
        }
        if (aweme.isSubOnlyVideo()) {
            TuxIconView tuxIconView = this.LLJJI;
            if (tuxIconView == null) {
                tuxIconView = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            TuxIconView tuxIconView2 = this.LLJJI;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            tuxIconView2.setIconRes(R.raw.icon_star_ring);
        } else if (!C729980SkG.LJIIIIZZ(aweme) || ((statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null && statusSafety.getPrivateStatus() == 0)) {
            TuxIconView tuxIconView3 = this.LLJJI;
            if (tuxIconView3 == null) {
                tuxIconView3 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        } else {
            TuxIconView tuxIconView4 = this.LLJJI;
            if (tuxIconView4 == null) {
                tuxIconView4 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
            TuxIconView tuxIconView5 = this.LLJJI;
            if (tuxIconView5 == null) {
                tuxIconView5 = null;
            }
            tuxIconView5.setTintColor(C20642515q3.LJFF().getColor(R.color.f569bc));
            AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(aweme);
            if (statusSafety2 != null && statusSafety2.getPrivateStatus() == 1) {
                TuxIconView tuxIconView6 = this.LLJJI;
                if (tuxIconView6 == null) {
                    tuxIconView6 = null;
                }
                tuxIconView6.setIconRes(R.raw.icon_lock_small);
            } else {
                AwemeStatus statusSafety3 = AwemeExtKt.getStatusSafety(aweme);
                if (statusSafety3 != null && statusSafety3.getPrivateStatus() == 2) {
                    TuxIconView tuxIconView7 = this.LLJJI;
                    if (tuxIconView7 == null) {
                        tuxIconView7 = null;
                    }
                    tuxIconView7.setIconRes(R.raw.icon_two_person);
                }
            }
        }
        View view5 = this.LLJJIJIIJIL;
        if (view5 == null) {
            view5 = null;
        }
        if (view5.getVisibility() == 0) {
            TuxIconView tuxIconView8 = this.LLJJIJI;
            if (tuxIconView8 == null) {
                tuxIconView8 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView8, 8);
        } else {
            TuxIconView tuxIconView9 = this.LLJJI;
            if (tuxIconView9 == null) {
                tuxIconView9 = null;
            }
            if (tuxIconView9.getVisibility() == 0) {
                TuxIconView tuxIconView10 = this.LLJJIJI;
                if (tuxIconView10 == null) {
                    tuxIconView10 = null;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView10, 8);
            } else if (C10IT.LJIIIZ(aweme)) {
                TuxIconView tuxIconView11 = this.LLJJIJI;
                if (tuxIconView11 == null) {
                    tuxIconView11 = null;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView11, 0);
            } else {
                TuxIconView tuxIconView12 = this.LLJJIJI;
                if (tuxIconView12 == null) {
                    tuxIconView12 = null;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView12, 8);
            }
        }
        if ((aweme.getVideo() == null || !aweme.getVideo().isCallback()) && (urlModelLIZ = this.LLJJ.LIZ(aweme.getAid())) != null && urlModelLIZ.getUrlList().size() != 0 && !TextUtils.isEmpty((CharSequence) ListProtector.get(urlModelLIZ.getUrlList(), 0))) {
            T5(urlModelLIZ, this.LLJILLL, aweme);
        } else {
            U5(aweme);
        }
        N5().setForeground(this.itemView.getContext().getDrawable(R.drawable.cma));
        if (C10IT.LJIIJJI(aweme)) {
            View view6 = this.LLILZLL;
            if (view6 != null) {
                view = view6;
            }
            C786410Ut5.LJLLLLLL(0, view);
            return;
        }
        View view7 = this.LLILZLL;
        if (view7 != null) {
            view = view7;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dma, viewGroup, false);
        this.LLJJI = (TuxIconView) viewTd.findViewById(R.id.video_locked);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.tv_play_count);
        this.LLJJIII = (TuxTextView) viewTd.findViewById(R.id.s_8);
        this.LLJJIJI = (TuxIconView) viewTd.findViewById(R.id.video_audio_violation);
        this.LLILZ = (ViewGroup) viewTd.findViewById(R.id.video_info_container);
        this.LLJJIJIIJIL = viewTd.findViewById(R.id.o0x);
        this.LLJJIJIL = viewTd.findViewById(R.id.vxb);
        viewTd.findViewById(R.id.vx_);
        this.LLILZLL = viewTd.findViewById(R.id.video_cover_mask);
        this.LL = (SmartImageView) viewTd.findViewById(R.id.cover);
        this.LLILZIL = (C1841350y17) viewTd.findViewById(R.id.dqk);
        this.LLJJJ = (TextView) viewTd.findViewById(R.id.tv_top);
        return viewTd;
    }
}
