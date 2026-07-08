package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.cell;

import X.C1175120ggY;
import X.C1183810guZ;
import X.C1189170h3D;
import X.C13LP;
import X.C1473870oSP;
import X.C1482640ogY;
import X.C1509340pNc;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1187490h0V;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.poi.PoiAwemeConfig;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeaderTopVideosVideoCell extends BasePoiHeaderTopVideosCardCell implements InterfaceC1187490h0V {
    public C1473870oSP LLIZ;
    public C1189170h3D LLIZLLLIL;
    public Aweme LLJ;

    public final String S5() {
        Integer numValueOf;
        SmartImageView smartImageView = this.LL;
        return (smartImageView == null || (numValueOf = Integer.valueOf(smartImageView.getVisibility())) == null) ? "null" : numValueOf.intValue() == 0 ? "VISIBLE" : numValueOf.intValue() == 8 ? "GONE" : numValueOf.intValue() == 4 ? "INVISIBLE" : "null";
    }

    @Override // X.InterfaceC1187490h0V
    public final boolean isPlaying() {
        C1189170h3D c1189170h3D = this.LLIZLLLIL;
        return c1189170h3D != null && c1189170h3D.LJI;
    }

    public final void U5() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZ = R.raw.icon_play_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView != null) {
            tuxIconView.setImageDrawable(tuxIconDrawableLIZ);
        }
        TuxIconView tuxIconView2 = this.LLILZ;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy: cover=");
        sbLIZ.append(S5());
        sbLIZ.append(" -> VISIBLE, aid=");
        Aweme aweme = this.LLJ;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            C786410Ut5.LLFF(0, smartImageView);
        }
        C1189170h3D c1189170h3D = this.LLIZLLLIL;
        if (c1189170h3D != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("release(): aid=");
            Video video = c1189170h3D.LJII;
            sbLIZ2.append(video != null ? video.getAid() : null);
            C2188811AlT.LIZIZ(sbLIZ2);
            c1189170h3D.LJI = false;
            c1189170h3D.LJIIJ = false;
            VideoViewComponent videoViewComponent = c1189170h3D.LIZLLL;
            if (videoViewComponent != null) {
                videoViewComponent.LJIIJJI();
            }
            VideoViewComponent videoViewComponent2 = c1189170h3D.LIZLLL;
            if (videoViewComponent2 != null) {
                videoViewComponent2.release();
            }
            VideoViewComponent videoViewComponent3 = c1189170h3D.LIZLLL;
            if (videoViewComponent3 != null) {
                videoViewComponent3.H1(c1189170h3D.LJIILIIL);
            }
            c1189170h3D.LIZLLL = null;
        }
        this.LLIZLLLIL = null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewAttachedToWindow: cover=");
        sbLIZ.append(S5());
        sbLIZ.append(", aid=");
        Aweme aweme = this.LLJ;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewDetachedFromWindow: cover=");
        sbLIZ.append(S5());
        sbLIZ.append(" -> VISIBLE, aid=");
        Aweme aweme = this.LLJ;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        stop();
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            C786410Ut5.LLFF(0, smartImageView);
        }
    }

    @Override // X.InterfaceC1187490h0V
    public final void play() {
        C1482640ogY c1482640ogY;
        PoiDataStruct poiDataStruct;
        PoiAwemeConfig poiAwemeConfig;
        PoiDataStruct poiDataStruct2;
        PoiAwemeConfig poiAwemeConfig2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play(): cover=");
        sbLIZ.append(S5());
        sbLIZ.append(", aid=");
        Aweme aweme = this.LLJ;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        sbLIZ.append(", isPlaying=");
        C1189170h3D c1189170h3D = this.LLIZLLLIL;
        sbLIZ.append(c1189170h3D != null ? Boolean.valueOf(c1189170h3D.LJI) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        C1189170h3D c1189170h3D2 = this.LLIZLLLIL;
        if (c1189170h3D2 != null) {
            Aweme aweme2 = this.LLJ;
            Video video = aweme2 != null ? aweme2.getVideo() : null;
            Aweme aweme3 = this.LLJ;
            Long lValueOf = Long.valueOf(C1175120ggY.LIZLLL((aweme3 == null || (poiDataStruct2 = aweme3.getPoiDataStruct()) == null || (poiAwemeConfig2 = poiDataStruct2.poiAwemeConfig) == null) ? null : poiAwemeConfig2.startMs));
            Aweme aweme4 = this.LLJ;
            Long lValueOf2 = Long.valueOf(C1175120ggY.LIZLLL((aweme4 == null || (poiDataStruct = aweme4.getPoiDataStruct()) == null || (poiAwemeConfig = poiDataStruct.poiAwemeConfig) == null) ? null : poiAwemeConfig.endMs));
            if (video != null) {
                Video video2 = c1189170h3D2.LJII;
                boolean zLJFF = Intrinsics.LJFF(video2 != null ? video2.getAid() : null, video.getAid());
                if (!zLJFF) {
                    c1189170h3D2.LJIIIIZZ = false;
                    c1189170h3D2.LJIIIZ = false;
                }
                c1189170h3D2.LJII = video;
                c1189170h3D2.LJ = lValueOf != null ? lValueOf.longValue() : 0L;
                c1189170h3D2.LJFF = lValueOf2 != null ? lValueOf2.longValue() : 0L;
                c1189170h3D2.LJI = true;
                VideoViewComponent videoViewComponent = c1189170h3D2.LIZLLL;
                if (videoViewComponent == null || (c1482640ogY = videoViewComponent.LLILLL) == null || !c1482640ogY.Da()) {
                    c1189170h3D2.LJIIJ = true;
                } else {
                    c1189170h3D2.LJIIJ = false;
                    if (zLJFF && c1189170h3D2.LJIIIIZZ) {
                        VideoViewComponent videoViewComponent2 = c1189170h3D2.LIZLLL;
                        if (videoViewComponent2 != null) {
                            videoViewComponent2.resume();
                        }
                        c1189170h3D2.LIZ.invoke();
                    } else {
                        c1189170h3D2.LIZ();
                    }
                }
            }
        }
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
    }

    @Override // X.InterfaceC1187490h0V
    public final void stop() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop(): cover=");
        sbLIZ.append(S5());
        sbLIZ.append(", aid=");
        Aweme aweme = this.LLJ;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        sbLIZ.append(", isPlaying=");
        C1189170h3D c1189170h3D = this.LLIZLLLIL;
        sbLIZ.append(c1189170h3D != null ? Boolean.valueOf(c1189170h3D.LJI) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        C1189170h3D c1189170h3D2 = this.LLIZLLLIL;
        if (c1189170h3D2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("pause(): aid=");
            Video video = c1189170h3D2.LJII;
            sbLIZ2.append(video != null ? video.getAid() : null);
            C2188811AlT.LIZIZ(sbLIZ2);
            c1189170h3D2.LJI = false;
            VideoViewComponent videoViewComponent = c1189170h3D2.LIZLLL;
            if (videoViewComponent != null) {
                videoViewComponent.pause();
            }
        }
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.cell.BasePoiHeaderTopVideosCardCell
    /* JADX INFO: renamed from: P5 */
    public final void onBindItemView(C1183810guZ c1183810guZ) {
        super.onBindItemView(c1183810guZ);
        SmartImageView smartImageView = this.LL;
        boolean z = false;
        if (smartImageView != null) {
            C786410Ut5.LLFF(0, smartImageView);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind: aid=");
        Aweme aweme = c1183810guZ.LLILLJJLI.getAweme();
        String aid = null;
        if (aweme != null) {
            aid = aweme.getAid();
        }
        sbLIZ.append(aid);
        sbLIZ.append(", cover=");
        sbLIZ.append(S5());
        sbLIZ.append(", hasVideo=");
        Aweme aweme2 = c1183810guZ.LLILLJJLI.getAweme();
        if (aweme2 != null && aweme2.getVideo() != null) {
            z = true;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        Aweme aweme3 = c1183810guZ.LLILLJJLI.getAweme();
        if (aweme3 != null && aweme3.getVideo() != null) {
            this.LLJ = c1183810guZ.LLILLJJLI.getAweme();
            T5(c1183810guZ.LLILZ, c1183810guZ.LLILZIL);
            U5();
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.cell.BasePoiHeaderTopVideosCardCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((C1183810guZ) interfaceC1891350zJl);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e1o, viewGroup, false);
        I5(viewTd);
        C1473870oSP c1473870oSP = (C1473870oSP) viewTd.findViewById(R.id.xrx);
        this.LLIZ = c1473870oSP;
        if (c1473870oSP != null && !C1509340pNc.LIZ()) {
            this.LLIZLLLIL = new C1189170h3D(c1473870oSP, new AwS562S0100000_18(this, 2485), new AwS562S0100000_18(this, 2486), new AwS562S0100000_18(this, 2487));
        }
        return viewTd;
    }

    public final void T5(int i, int i2) {
        Video video;
        ViewGroup.LayoutParams layoutParams;
        Aweme aweme = this.LLJ;
        if (aweme != null && (video = aweme.getVideo()) != null && video.getWidth() > 0 && video.getHeight() > 0 && i > 0 && i2 > 0) {
            float width = video.getWidth();
            float height = video.getHeight();
            float f = i;
            float f2 = i2;
            if (height / f2 < width / f) {
                i = C814420VxA.LIZIZ(width * (f2 / height));
            } else {
                i2 = C814420VxA.LIZIZ((f / width) * height);
            }
            C1473870oSP c1473870oSP = this.LLIZ;
            if (c1473870oSP != null && (layoutParams = c1473870oSP.getLayoutParams()) != null) {
                if (layoutParams.width != i || layoutParams.height != i2) {
                    layoutParams.width = i;
                    layoutParams.height = i2;
                    C1473870oSP c1473870oSP2 = this.LLIZ;
                    if (c1473870oSP2 != null) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1473870oSP2);
                        c1473870oSP2.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        Aweme aweme;
        String aid;
        C1183810guZ c1183810guZ = (C1183810guZ) interfaceC1891350zJl;
        super.onBindItemView(c1183810guZ, list);
        if (Intrinsics.LJFF(C13LP.LJJJLL(list), "aweme_change_payload") && (aweme = c1183810guZ.LLILLJJLI.getAweme()) != null) {
            this.LLJ = aweme;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBind(payload): aid=");
            Aweme aweme2 = c1183810guZ.LLILLJJLI.getAweme();
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append(", cover=");
            sbLIZ.append(S5());
            C2188811AlT.LIZIZ(sbLIZ);
            T5(c1183810guZ.LLILZ, c1183810guZ.LLILZIL);
            U5();
        }
    }
}
