package com.ss.android.ugc.aweme.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1212130heF;
import X.C12823050b;
import X.C12ES;
import X.C1324840ka2;
import X.C13LE;
import X.C1841350y17;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C341940Daq;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS154S0100000_19;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.viewmodel.MentionMusicVideoVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MusicVideoCell extends BaseVideoCell<C12823050b> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final String LLJILJILJ = "MusicVideoCell";
    public final String LLJILLL = "Preview music video";
    public final AssemVMLazy LLJJ;
    public TextView LLJJI;
    public TextView LLJJIII;
    public TextView LLJJIJI;
    public RemoteImageView LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicVideoCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/viewmodel/MentionMusicVideoVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicVideoCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MentionMusicVideoVM.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 453);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(77);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 438), awS563S0100000_19, AFwS207S0000000_19.get$arr$(65), new AwS563S0100000_19((C03K6) this, 439), new AwS563S0100000_19((C03K6) this, 441), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 443), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 445), null, new AwS563S0100000_19((C03K6) this, 446));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19((C03K6) this, 440);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 442);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 444);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_192, 27));
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 447);
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ, 448);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 449);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 450);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 451);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_194, awS563S0100000_19, new C452080Ho6(), awS563S0100000_195, awS563S0100000_196, awS563S0100000_193, aFwS257S0000000_19, awS563S0100000_197, awS563S0100000_198, awS563S0100000_199);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 452), awS563S0100000_19, AFwS207S0000000_19.get$arr$(66), new AwS563S0100000_19((C03K6) this, 454), new AwS563S0100000_19((C03K6) this, 455), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 456), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 457), null, new AwS563S0100000_19((C03K6) this, 458));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 459), awS563S0100000_19, AFwS207S0000000_19.get$arr$(67), new AwS563S0100000_19((C03K6) this, 460), new AwS563S0100000_19((C03K6) this, 461), new AwS563S0100000_19((C03K6) this, 462), aFwS257S0000000_19, null, null, new AwS563S0100000_19((C03K6) this, 463));
        }
        this.LLJJ = assemVMLazy;
    }

    public final MentionMusicVideoVM U5() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (MentionMusicVideoVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C786410Ut5.Q8(N5(), new ACListenerS154S0100000_19(this, 87));
        C786410Ut5.e9(I5(), new ACListenerS154S0100000_19(this, 88));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C12823050b c12823050b = (C12823050b) interfaceC1891350zJl;
        super.onBindItemView(c12823050b);
        N5().setContentDescription("");
        this.LLIZ = c12823050b.LL;
        RemoteImageView remoteImageView = this.LLJJIJIIJIL;
        TextView textView = null;
        if (remoteImageView == null) {
            remoteImageView = null;
        }
        C786410Ut5.l(remoteImageView, 4);
        TextView textView2 = this.LLJJIJI;
        if (textView2 == null) {
            textView2 = null;
        }
        C786410Ut5.LLIL(textView2, 8);
        TextView textView3 = this.LLJJI;
        if (textView3 == null) {
            textView3 = null;
        }
        C786410Ut5.LLIL(textView3, 8);
        TextView textView4 = this.LLJJIII;
        if (textView4 == null) {
            textView4 = null;
        }
        C786410Ut5.LLIL(textView4, 8);
        View view = this.LLILZLL;
        if (view == null) {
            view = null;
        }
        C1212130heF.LIZ(view, c12823050b.LL);
        if (c12823050b.LL.getMusicStarter() != null) {
            TextView textView5 = this.LLJJIII;
            if (textView5 == null) {
                textView5 = null;
            }
            C786410Ut5.LLIL(textView5, 0);
            if (!TextUtils.isEmpty(c12823050b.LL.getLabelMusicStarterText())) {
                TextView textView6 = this.LLJJIII;
                if (textView6 == null) {
                    textView6 = null;
                }
                textView6.setText(c12823050b.LL.getLabelMusicStarterText());
            }
        }
        S5(c12823050b);
        Aweme aweme = this.LLIZ;
        if (aweme == null) {
            aweme = null;
        }
        Video video = aweme.getVideo();
        if (video != null) {
            UrlModel cover = video.getCover();
            String str = this.LLJILJILJ;
            Aweme aweme2 = this.LLIZ;
            if (aweme2 == null) {
                aweme2 = null;
            }
            T5(cover, str, aweme2);
        }
        if (c12823050b.LL.isPgcShow()) {
            if (c12823050b.LL.getTextTopLabels() != null && c12823050b.LL.getTextTopLabels().size() > 0) {
                TextView textView7 = this.LLJJIJI;
                if (textView7 == null) {
                    textView7 = null;
                }
                C786410Ut5.LLIL(textView7, 0);
                RemoteImageView remoteImageView2 = this.LLJJIJIIJIL;
                if (remoteImageView2 == null) {
                    remoteImageView2 = null;
                }
                C786410Ut5.l(remoteImageView2, 8);
                TextView textView8 = this.LLJJIJI;
                if (textView8 != null) {
                    textView = textView8;
                }
                V5(textView, (AwemeTextLabelModel) ListProtector.get(c12823050b.LL.getTextTopLabels(), 0));
                return;
            }
            return;
        }
        if (c12823050b.LL.getMusicStarter() != null || c12823050b.LL.getOriginAuthor() != null || !TextUtils.equals(this.LLJILLL, "challenge") || c12823050b.LL.getIsTop() != 1) {
            return;
        }
        if (c12823050b.LL.getTextTopLabels() != null && c12823050b.LL.getTextTopLabels().size() > 0) {
            TextView textView9 = this.LLJJIJI;
            if (textView9 == null) {
                textView9 = null;
            }
            C786410Ut5.LLIL(textView9, 0);
            RemoteImageView remoteImageView3 = this.LLJJIJIIJIL;
            if (remoteImageView3 == null) {
                remoteImageView3 = null;
            }
            C786410Ut5.l(remoteImageView3, 8);
            TextView textView10 = this.LLJJIJI;
            if (textView10 != null) {
                textView = textView10;
            }
            V5(textView, (AwemeTextLabelModel) ListProtector.get(c12823050b.LL.getTextTopLabels(), 0));
            return;
        }
        TextView textView11 = this.LLJJIJI;
        if (textView11 == null) {
            textView11 = null;
        }
        C786410Ut5.LLIL(textView11, 8);
        RemoteImageView remoteImageView4 = this.LLJJIJIIJIL;
        if (remoteImageView4 == null) {
            remoteImageView4 = null;
        }
        C786410Ut5.l(remoteImageView4, 0);
        RemoteImageView remoteImageView5 = this.LLJJIJIIJIL;
        if (remoteImageView5 == null) {
            remoteImageView5 = null;
        }
        C1324840ka2.LJI(remoteImageView5, c12823050b.LL.getLabelTop(), (int) C12ES.LIZJ(6.0f, L5()), (int) C12ES.LIZJ(6.0f, L5()), null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dm_, viewGroup, false);
        this.LL = (SmartImageView) viewTd.findViewById(R.id.cover);
        this.LLJJIJIIJIL = (RemoteImageView) viewTd.findViewById(R.id.lee);
        this.LLILZIL = (C1841350y17) viewTd.findViewById(R.id.dqk);
        this.LLILZ = (ViewGroup) viewTd.findViewById(R.id.video_info_container);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.tv_play_count);
        this.LLJJI = (TextView) viewTd.findViewById(R.id.lvf);
        this.LLJJIII = (TextView) viewTd.findViewById(R.id.lvn);
        this.LLJJIJI = (TextView) viewTd.findViewById(R.id.lwp);
        View viewFindViewById = viewTd.findViewById(R.id.video_cover_mask);
        this.LLILZLL = viewFindViewById;
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
        return viewTd;
    }

    public final void V5(TextView textView, AwemeTextLabelModel awemeTextLabelModel) {
        if (TextUtils.isEmpty(awemeTextLabelModel.getLabelName())) {
            C786410Ut5.LLIL(textView, 8);
            return;
        }
        textView.setText(awemeTextLabelModel.getLabelName());
        textView.setTextSize(0, C341940Daq.LIZ(12.0d));
        textView.setTextColor(ColorProtector.parseColor(awemeTextLabelModel.getTextColor()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ColorProtector.parseColor(awemeTextLabelModel.getBgColor()));
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(2));
        textView.setBackground(gradientDrawable);
        textView.setSingleLine();
    }
}
