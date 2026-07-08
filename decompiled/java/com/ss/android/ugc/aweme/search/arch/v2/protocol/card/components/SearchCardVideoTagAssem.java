package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C07E5;
import X.C13LZ;
import X.C1908520zlS;
import X.C1913107eT;
import X.C2188811AlT;
import X.C418040GaI;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C640290P9n;
import X.C703302op;
import X.C786410Ut5;
import X.C800330VaR;
import X.C814420VxA;
import X.EnumC657080Ppy;
import X.InterfaceC1587906Jp;
import X.InterfaceC435460H5s;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCardVideoTagAssem extends ReusedUISlotAssem<SearchCardVideoTagAssem> implements InterfaceC712990Rxx<InterfaceC435460H5s> {
    public static final float LLJL = C418040GaI.LIZ(3);
    public TuxTextView LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f13;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.video_holder_tag_text);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC435460H5s interfaceC435460H5s) {
        String title;
        VideoTag videoTag;
        float fLIZ;
        int iIntValue;
        Drawable drawableLIZIZ;
        Drawable drawableLIZIZ2;
        VideoTag videoTag2;
        Aweme aweme = interfaceC435460H5s.getAweme();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateVideoLabel (");
        sbLIZ.append(hashCode());
        sbLIZ.append("), aid: ");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(", tag: ");
        Video video = aweme.getVideo();
        if (video != null && (videoTag2 = video.getVideoTag()) != null) {
            title = videoTag2.getTitle();
        } else {
            title = null;
        }
        sbLIZ.append(title);
        C2188811AlT.LIZIZ(sbLIZ);
        Video video2 = aweme.getVideo();
        if (video2 != null && (videoTag = video2.getVideoTag()) != null && C703302op.LIZ(videoTag.getTitle())) {
            Integer numLIZ = C640290P9n.LIZ(videoTag.getBackgroundColor());
            Integer numLIZ2 = C640290P9n.LIZ(videoTag.getFontColor());
            Integer numValueOf = Integer.valueOf(C1913107eT.LIZIZ());
            if (numValueOf.intValue() > 0) {
                fLIZ = C418040GaI.LIZ(numValueOf.intValue());
            } else {
                fLIZ = LLJL;
            }
            TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                tuxTextView.setText(videoTag.getTitle());
                if (numLIZ2 != null) {
                    iIntValue = numLIZ2.intValue();
                } else {
                    iIntValue = -1;
                }
                tuxTextView.setTextColor(iIntValue);
                if (Intrinsics.LJFF(videoTag.getType(), EnumC657080Ppy.POI_DISTANCE.getType())) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(12.0d)));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(12.0d)));
                    c419910GdJ.LIZ = R.raw.icon_map_pin_fill;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                    TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxTextView.getContext());
                    if (tuxTextView.getLayoutDirection() == 1) {
                        tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZ, (Drawable) null);
                    } else {
                        tuxTextView.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZ, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.0d))));
                    if (numLIZ != null) {
                        drawableLIZIZ2 = C1908520zlS.LIZIZ(fLIZ, numLIZ.intValue());
                    } else {
                        drawableLIZIZ2 = C800330VaR.LIZIZ(tuxTextView.getContext(), R.drawable.d3u);
                    }
                    tuxTextView.setBackground(drawableLIZIZ2);
                } else {
                    if (numLIZ != null) {
                        int iIntValue2 = numLIZ.intValue();
                        tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        drawableLIZIZ = C1908520zlS.LIZIZ(fLIZ, iIntValue2);
                    } else {
                        drawableLIZIZ = C800330VaR.LIZIZ(tuxTextView.getContext(), R.drawable.d3u);
                    }
                    tuxTextView.setBackground(drawableLIZIZ);
                }
                tuxTextView.getBackground().setAlpha((int) (Float.valueOf(C13LZ.LJ(videoTag.getOpacity(), 0, 100) / 100.0f).floatValue() * 255));
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView2 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 8);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC435460H5s interfaceC435460H5s) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC435460H5s interfaceC435460H5s) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
