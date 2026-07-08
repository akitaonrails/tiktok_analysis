package com.ss.android.ugc.feed.platform.cell.template;

import X.C12ES;
import X.C1308910kAL;
import X.C1387620mDI;
import X.C14LC;
import X.C1843500y4a;
import X.C309690CBz;
import X.C724270Sb3;
import X.C786410Ut5;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.VideoViewCellRootView;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CCTemplateInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class CCTemplateAreaAssem extends FeedBaseAssem<CCTemplateAreaAssem> {
    public VideoViewCellRootView LLJJLIIIJLLLLLLLZ;
    public RelativeLayout LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fs4;
    }

    public final VideoViewCellRootView tp() {
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.view_rootview) : null;
            this.LLJJLIIIJLLLLLLLZ = (VideoViewCellRootView) viewFindViewById;
        }
        return (VideoViewCellRootView) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object obj;
        FrameLayout.LayoutParams layoutParams;
        Aweme aweme;
        CCTemplateInfo ccTemplateInfo;
        TextView textView = (TextView) view.findViewById(R.id.dka);
        TextView textView2 = (TextView) view.findViewById(R.id.dkf);
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (ccTemplateInfo = aweme.getCcTemplateInfo()) != null) {
            textView.setText(ccTemplateInfo.getAuthorName());
            textView2.setText(ccTemplateInfo.getTemplate_desc());
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.dkg);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C12ES.LIZJ(4.0f, view.getContext()));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zj, view.getContext());
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        tuxTextView.setBackground(gradientDrawable);
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        C1387620mDI c1387620mDI = C1387620mDI.LIZ;
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        Aweme aweme2 = ((VideoItemParams) obj2).getAweme();
        c1387620mDI.getClass();
        if (C1387620mDI.LJI(aweme2)) {
            int i = C14LC.LJIILLIIL;
            C309690CBz.LIZ.getClass();
            int iLIZIZ = C14LC.LIZIZ();
            if (i == 0) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.bottomMargin = iLIZIZ;
                    C786410Ut5.W5(view, layoutParams);
                }
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        Context context;
        TextView textView;
        Resources resources;
        String string;
        View viewFindViewById4;
        View viewFindViewById5;
        View viewFindViewById6;
        VideoItemParams videoItemParams2 = videoItemParams;
        C1387620mDI c1387620mDI = C1387620mDI.LIZ;
        Aweme aweme = videoItemParams2.getAweme();
        c1387620mDI.getClass();
        View viewFindViewById7 = null;
        strJ4 = null;
        strJ4 = null;
        String strJ4 = null;
        if (C1387620mDI.LJI(aweme)) {
            VideoViewCellRootView videoViewCellRootViewTp = tp();
            if (videoViewCellRootViewTp != null && (viewFindViewById6 = videoViewCellRootViewTp.findViewById(R.id.widget_container)) != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById6);
            }
            View viewFindViewById8 = this.LLJL;
            if (viewFindViewById8 == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById8 = viewLJJIJL.findViewById(R.id.dkc);
                } else {
                    viewFindViewById8 = null;
                }
                this.LLJL = (RelativeLayout) viewFindViewById8;
            }
            RelativeLayout relativeLayout = (RelativeLayout) viewFindViewById8;
            if (relativeLayout != null) {
                C786410Ut5.LLIIL(relativeLayout, 0);
            }
            if (videoItemParams2.getAweme().getCcTemplateInfo() != null && !videoItemParams2.getAweme().getCcTemplateInfo().getMusic_copyright()) {
                VideoViewCellRootView videoViewCellRootViewTp2 = tp();
                if (videoViewCellRootViewTp2 != null && (viewFindViewById5 = videoViewCellRootViewTp2.findViewById(R.id.dke)) != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById5);
                }
            } else {
                VideoViewCellRootView videoViewCellRootViewTp3 = tp();
                if (videoViewCellRootViewTp3 != null && (viewFindViewById2 = videoViewCellRootViewTp3.findViewById(R.id.dke)) != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                }
            }
            if (videoItemParams2.getAweme().getCcTemplateInfo() != null && videoItemParams2.getAweme().getCcTemplateInfo().getUsage() > 0 && (context = getContext()) != null && context.getResources() != null) {
                VideoViewCellRootView videoViewCellRootViewTp4 = tp();
                if (videoViewCellRootViewTp4 != null && (viewFindViewById4 = videoViewCellRootViewTp4.findViewById(R.id.dkg)) != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById4);
                }
                VideoViewCellRootView videoViewCellRootViewTp5 = tp();
                if (videoViewCellRootViewTp5 != null && (textView = (TextView) videoViewCellRootViewTp5.findViewById(R.id.dkg)) != null) {
                    Context context2 = getContext();
                    if (context2 != null && (resources = context2.getResources()) != null && (string = resources.getString(2131858041)) != null) {
                        strJ4 = C786410Ut5.j4(string, Arrays.copyOf(new Object[]{C1843500y4a.LIZIZ(videoItemParams2.getAweme().getCcTemplateInfo().getUsage())}, 1));
                    }
                    textView.setText(strJ4);
                    return;
                }
                return;
            }
            VideoViewCellRootView videoViewCellRootViewTp6 = tp();
            if (videoViewCellRootViewTp6 == null || (viewFindViewById3 = videoViewCellRootViewTp6.findViewById(R.id.dkg)) == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, viewFindViewById3);
            return;
        }
        VideoViewCellRootView videoViewCellRootViewTp7 = tp();
        if (videoViewCellRootViewTp7 != null && (viewFindViewById = videoViewCellRootViewTp7.findViewById(R.id.widget_container)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        View view = this.LLJL;
        if (view == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById7 = viewLJJIJL2.findViewById(R.id.dkc);
            }
            this.LLJL = (RelativeLayout) viewFindViewById7;
            view = viewFindViewById7;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) view;
        if (relativeLayout2 == null) {
            return;
        }
        C786410Ut5.LLIIL(relativeLayout2, 8);
    }
}
