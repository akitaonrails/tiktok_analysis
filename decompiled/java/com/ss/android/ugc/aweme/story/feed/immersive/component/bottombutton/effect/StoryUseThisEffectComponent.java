package com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.effect;

import X.C01GW;
import X.C0LAB;
import X.C0RF0;
import X.C11VU;
import X.C1245204u2;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1383370m6R;
import X.C1415610mwR;
import X.C20684815ws;
import X.C2189821An6;
import X.C337180DJs;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C438710HIf;
import X.C452501pT;
import X.C706480RnS;
import X.C786410Ut5;
import X.EnumC1430380nKG;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import wh6.AbS332S0300000_21;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryUseThisEffectComponent extends BaseCellSlotComponent<StoryUseThisEffectComponent> {
    public static final /* synthetic */ int LLLFZ = 0;
    public LinearLayout LLJLLIL;
    public SmartImageView LLJLLL;
    public TuxTextView LLJZ;
    public LinearLayout LLJZIJLIL;
    public SmartImageView LLL;
    public TuxTextView LLLF;
    public final Map<String, String> LLLFF = new LinkedHashMap();
    public final C01GW LLLFFI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(173));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fda;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 739);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_two_btn_bottom", true, awS555S0100000_11);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        RadiusLayout radiusLayout = (RadiusLayout) view.findViewById(R.id.w95);
        if (radiusLayout != null) {
            radiusLayout.setRadius(C418440Gaw.LIZIZ(4));
        }
        RadiusLayout radiusLayout2 = (RadiusLayout) view.findViewById(R.id.w91);
        if (radiusLayout2 != null) {
            radiusLayout2.setRadius(C418440Gaw.LIZIZ(4));
        }
        this.LLJZIJLIL = (LinearLayout) view.findViewById(R.id.w92);
        this.LLL = (SmartImageView) view.findViewById(R.id.w90);
        this.LLLF = (TuxTextView) view.findViewById(R.id.w93);
        double dLIZIZ = (((double) C1415610mwR.LIZIZ()) * 0.8d) - ((double) C11VU.LIZIZ(60.0f, view.getContext()));
        TuxTextView tuxTextView = this.LLLF;
        if (tuxTextView != null) {
            tuxTextView.setMaxWidth((int) dLIZIZ);
        }
        this.LLJLLIL = (LinearLayout) view.findViewById(R.id.w96);
        this.LLJLLL = (SmartImageView) view.findViewById(R.id.w94);
        this.LLJZ = (TuxTextView) view.findViewById(R.id.w97);
        if (((Number) C1245204u2.LIZ.getValue()).intValue() == 1) {
            LinearLayout linearLayout = this.LLJLLIL;
            if (linearLayout != null) {
                C337180DJs.LIZ(linearLayout);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.LLJLLIL;
        if (linearLayout2 != null) {
            C337180DJs.LIZJ(linearLayout2);
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(C11VU.LIZIZ(16.0f, view.getContext()));
        int iMin = Math.min((int) (textPaint.measureText(C1383370m6R.LJIIJ(2131833496)) + C11VU.LIZIZ(60.0f, view.getContext())), (int) (((double) C1415610mwR.LIZIZ()) * 0.8d));
        TuxTextView tuxTextView2 = this.LLJZ;
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setMaxWidth(iMin - ((int) C11VU.LIZIZ(60.0f, view.getContext())));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return this.LLJLILLLLZIIL.LL;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Context context;
        AnchorCommonStruct next;
        String str;
        String aid;
        String authorUid;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        Map<String, String> extra;
        VideoItemParams videoItemParams2 = videoItemParams;
        List<AnchorCommonStruct> anchors = videoItemParams2.getAweme().getAnchors();
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                context = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getType() == EnumC1430380nKG.PROP.getTYPE()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct = next;
            if (anchorCommonStruct != null) {
                Map<String, String> map = this.LLLFF;
                String str2 = videoItemParams2.mEventType;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                map.put("enter_from", str2);
                C0RF0 c0rf0 = jm().LIZLLL;
                if (c0rf0 == null || (baseFeedPageParams = c0rf0.LJ) == null || (c2189821An6 = baseFeedPageParams.param) == null || (extra = c2189821An6.getExtra()) == null || (str = extra.get("enter_position")) == null) {
                    str = "";
                }
                map.put("enter_position", str);
                map.put("entrance_type", "prop");
                Aweme aweme = videoItemParams2.getAweme();
                if (aweme == null || (aid = aweme.getAid()) == null) {
                    aid = "";
                }
                map.put("group_id", aid);
                Aweme aweme2 = videoItemParams2.getAweme();
                if (aweme2 != null && (authorUid = AwemeExtKt.getAuthorUid(aweme2)) != null) {
                    str3 = authorUid;
                }
                map.put("author_id", str3);
                map.put("position", "video_cover");
                map.put("prop_id", anchorCommonStruct.getId());
                Ep("story_try_out_show", "shoot");
                C01GW c01gw = C1245204u2.LIZ;
                if (((Number) c01gw.getValue()).intValue() == 2) {
                    Ep("story_try_out_show", "detail_page");
                }
                TuxTextView tuxTextView = this.LLLF;
                if (tuxTextView != null) {
                    tuxTextView.setText(C1383370m6R.LJIIJ(2131833496));
                }
                if (((Number) c01gw.getValue()).intValue() == 2) {
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(anchorCommonStruct.getThumbnail()));
                    SmartImageView smartImageView = this.LLJLLL;
                    if (smartImageView != null) {
                        context = smartImageView.getContext();
                    }
                    c1331670kl3LJIIIIZZ.LJJIJL(context);
                    c1331670kl3LJIIIIZZ.LJJ(this.LLJLLL);
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                    TuxTextView tuxTextView2 = this.LLJZ;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(anchorCommonStruct.getKeyword());
                    }
                    LinearLayout linearLayout = this.LLJLLIL;
                    if (linearLayout != null) {
                        C786410Ut5.I7(new AbS332S0300000_21(this, videoItemParams2, anchorCommonStruct, 0), linearLayout);
                    }
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_camera_fill;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                    TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(LJJIJL().getContext());
                    SmartImageView smartImageView2 = this.LLL;
                    if (smartImageView2 != null) {
                        smartImageView2.setImageDrawable(tuxIconDrawableLIZ);
                    }
                } else {
                    C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(anchorCommonStruct.getThumbnail()));
                    c1331670kl3LJIIIIZZ2.LJJIIZ(R.drawable.a49);
                    SmartImageView smartImageView3 = this.LLL;
                    if (smartImageView3 != null) {
                        context = smartImageView3.getContext();
                    }
                    c1331670kl3LJIIIIZZ2.LJJIJL(context);
                    c1331670kl3LJIIIIZZ2.LJJ(this.LLL);
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ2);
                }
                LinearLayout linearLayout2 = this.LLJZIJLIL;
                if (linearLayout2 != null) {
                    C786410Ut5.I7(new AbS332S0300000_21(this, videoItemParams2, anchorCommonStruct, 1), linearLayout2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }

    public final void Ep(String str, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("button_type", str2);
        c0lab.LJI(this.LLLFF);
        C20684815ws.LJIILLIIL(str, c0lab.LIZ);
    }
}
