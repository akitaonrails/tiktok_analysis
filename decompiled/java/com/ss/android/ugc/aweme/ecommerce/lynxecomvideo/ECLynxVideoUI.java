package com.ss.android.ugc.aweme.ecommerce.lynxecomvideo;

import X.C01GW;
import X.C03DZ;
import X.C03IT;
import X.C09C2;
import X.C0H1M;
import X.C1311730kEt;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1389890mGx;
import X.C1488750oqP;
import X.C1488800oqU;
import X.C21352818hK;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1338240kve;
import X.EnumC1769850w9n;
import X.InterfaceC1312540kGC;
import X.InterfaceC1488770oqR;
import X.InterfaceC1967107nB;
import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.ugc.aweme.ecommerce.lynxecomvideo.ECLynxVideoUI;
import com.ss.android.ugc.aweme.ecommerce.lynxecomvideo.model.VideoInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import j27.s;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class ECLynxVideoUI extends UISimpleView<C21352818hK> {
    public String LL;
    public boolean LLILLJJLI;
    public long LLILLL;
    public String LLILZ;
    public boolean LLILZIL;
    public String LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public final C01GW LLJI;

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        ((C21352818hK) this.mView).LL.LIZIZ();
    }

    public ECLynxVideoUI(s sVar) {
        super(sVar);
        this.LLILZLL = "contain";
        this.LLJI = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(68));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(C1311730kEt c1311730kEt) {
        EnumC1338240kve enumC1338240kve;
        List<String> urls;
        List<String> urls2;
        super.afterPropsUpdated(c1311730kEt);
        String strLJII = null;
        if (this.LLILLJJLI) {
            this.LLILLJJLI = false;
            C21352818hK c21352818hK = (C21352818hK) this.mView;
            if (c21352818hK != null) {
                boolean z = this.LLILZIL;
                String str = this.LLILZLL;
                String str2 = this.LLILZ;
                boolean z2 = this.LLIZ;
                String str3 = this.LLIZLLLIL;
                String str4 = this.LLJ;
                if (str2 != null) {
                    c21352818hK.setPoster(str2);
                    if (Intrinsics.LJFF(str, "cover")) {
                        enumC1338240kve = EnumC1338240kve.CENTER_CROP;
                    } else {
                        enumC1338240kve = EnumC1338240kve.FIT_CENTER;
                    }
                    Image image = c21352818hK.LLILZIL;
                    EnumC1769850w9n enumC1769850w9n = EnumC1769850w9n.VIDEO_POSTER;
                    if (image != null && (urls2 = image.getUrls()) != null && urls2.isEmpty()) {
                        C03DZ.LIZ(c21352818hK.LLILLJJLI);
                    } else {
                        if (image != null) {
                            urls = image.getUrls();
                        } else {
                            urls = null;
                        }
                        C03IT c03it = new C03IT(C0H1M.LIZ(urls, enumC1769850w9n));
                        C1326790kdB.LIZ.getClass();
                        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(c03it);
                        c1331670kl3LIZLLL.LJJ(c21352818hK.LLILLJJLI);
                        c1331670kl3LIZLLL.LJJ = enumC1338240kve;
                        C786410Ut5.h3(c1331670kl3LIZLLL);
                    }
                    C03DZ.LIZJ(c21352818hK.LLILLJJLI);
                }
                c21352818hK.setObjectFit(str);
                c21352818hK.setLoop(z2);
                if (str3 != null) {
                    c21352818hK.setTag(str3);
                }
                if (str4 != null) {
                    c21352818hK.setEnterFrom(str4);
                }
                if (z) {
                    c21352818hK.LIZ();
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current_video_id: ");
            sbLIZ.append(this.LL);
            sbLIZ.append(", autoPlay: ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(", objectFit: ");
            sbLIZ.append(this.LLILZLL);
            sbLIZ.append(", poster: ");
            sbLIZ.append(this.LLILZ);
            sbLIZ.append(", loop: ");
            sbLIZ.append(this.LLIZ);
            sbLIZ.append(", tag: ");
            sbLIZ.append(this.LLIZLLLIL);
            sbLIZ.append(", enterFrom: ");
            sbLIZ.append(this.LLJ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String str5 = this.LLIZLLLIL;
            if (str5 == null) {
                str5 = "";
            }
            C1488800oqU.LIZ("update_immutable_props", strLIZIZ, null, str5, null, 20);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("afterPropsUpdated, src: ");
        if (c1311730kEt != null) {
            strLJII = c1311730kEt.LJII("src");
        }
        sbLIZ2.append(strLJII);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context != null) {
            C21352818hK c21352818hK = new C21352818hK(context);
            c21352818hK.setStatusChangeListener(new InterfaceC1488770oqR() { // from class: X.18hL
                @Override // X.InterfaceC1488770oqR
                public final void LIZ(float f) {
                    C1298720jtu c1298720jtu;
                    ECLynxVideoUI eCLynxVideoUI = this.LIZ;
                    s sVar = eCLynxVideoUI.mContext;
                    if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
                        C1298700jts c1298700jts = new C1298700jts(eCLynxVideoUI.getSign(), "progress");
                        c1298700jts.LIZIZ(Float.valueOf(f), "time");
                        c1298720jtu.LIZIZ(c1298700jts);
                    }
                }

                @Override // X.InterfaceC1488770oqR
                public final void LIZIZ(String str) {
                    C1298720jtu c1298720jtu;
                    String str2 = "";
                    if (Intrinsics.LJFF(str, "first_frame")) {
                        C03DZ.LIZ(((C21352818hK) this.LIZ.mView).LLILLJJLI);
                        String strValueOf = String.valueOf(System.currentTimeMillis() - this.LIZ.LLILLL);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("current_video_id: ");
                        sbLIZ.append(this.LIZ.LL);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        String str3 = this.LIZ.LLIZLLLIL;
                        if (str3 == null) {
                            str3 = "";
                        }
                        C1488800oqU.LIZ("first_frame", strLIZIZ, strValueOf, str3, null, 16);
                        this.LIZ.LLILLL = 0L;
                    }
                    s sVar = this.LIZ.mContext;
                    if (sVar != null && (c1298720jtu = sVar.LLIZ) != null && str.length() > 0) {
                        ECLynxVideoUI eCLynxVideoUI = this.LIZ;
                        C1298700jts c1298700jts = new C1298700jts(eCLynxVideoUI.getSign(), "statuschange");
                        c1298700jts.LIZIZ(str, "state");
                        c1298720jtu.LIZIZ(c1298700jts);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("current_video_id: ");
                        sbLIZ2.append(eCLynxVideoUI.LL);
                        sbLIZ2.append(", state: ");
                        sbLIZ2.append(str);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        String str4 = eCLynxVideoUI.LLIZLLLIL;
                        if (str4 != null) {
                            str2 = str4;
                        }
                        C1488800oqU.LIZ("state_change", strLIZIZ2, null, str2, null, 20);
                    }
                }

                @Override // X.InterfaceC1488770oqR
                public final void onError(String str) {
                    C1298720jtu c1298720jtu;
                    ECLynxVideoUI eCLynxVideoUI = this.LIZ;
                    s sVar = eCLynxVideoUI.mContext;
                    if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
                        C1298700jts c1298700jts = new C1298700jts(eCLynxVideoUI.getSign(), "statuschange");
                        c1298700jts.LIZIZ("error", "state");
                        c1298700jts.LIZIZ(str, "error_message");
                        c1298720jtu.LIZIZ(c1298700jts);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("current_video_id: ");
                    sbLIZ.append(this.LIZ.LL);
                    sbLIZ.append(", error: ");
                    sbLIZ.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    String str2 = this.LIZ.LLIZLLLIL;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C1488800oqU.LIZ("error", strLIZIZ, null, str2, null, 20);
                }
            });
            return c21352818hK;
        }
        return null;
    }

    @InterfaceC1312540kGC(name = "autoplay")
    public final void setAutoPlay(boolean z) {
        this.LLILZIL = z;
    }

    @InterfaceC1312540kGC(name = "aweme")
    public final void setAweme(String str) {
        T t;
        boolean z;
        String str2 = "";
        try {
            if (str == null) {
                String str3 = this.LLIZLLLIL;
                if (str3 == null) {
                    str3 = "";
                }
                C1488800oqU.LIZ("set_aweme", "aweme is null", null, str3, null, 20);
                return;
            }
            Aweme aweme = (Aweme) C09C2.LIZ().LJII(str, Aweme.class);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("videoId: ");
            sbLIZ.append(aweme.getAid());
            sbLIZ.append(", currentVideoId: ");
            sbLIZ.append(this.LL);
            sbLIZ.append(",video is null: ");
            if (aweme.getVideo() == null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String str4 = this.LLIZLLLIL;
            if (str4 == null) {
                str4 = "";
            }
            C1488800oqU.LIZ("set_aweme", strLIZIZ, null, str4, null, 20);
            String str5 = this.LL;
            if (aweme.getVideo() != null && aweme.getAid() != null && !Intrinsics.LJFF(aweme.getAid(), str5)) {
                C21352818hK c21352818hK = (C21352818hK) this.mView;
                if (c21352818hK != null) {
                    c21352818hK.setAweme(aweme);
                }
                this.LL = aweme.getAid();
                this.LLILLJJLI = true;
                this.LLILLL = System.currentTimeMillis();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (((Boolean) this.LLJI.getValue()).booleanValue() && (t = this.mView) != 0) {
                C1389890mGx c1389890mGx = new C1389890mGx(t);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setAweme error: ");
                sbLIZ2.append(e.getMessage());
                c1389890mGx.LJIIJ(C2188811AlT.LIZIZ(sbLIZ2));
                c1389890mGx.LJIIJJI();
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("error: ");
            sbLIZ3.append(e.getMessage());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            String str6 = this.LLIZLLLIL;
            if (str6 != null) {
                str2 = str6;
            }
            C1488800oqU.LIZ("set_aweme", strLIZIZ2, null, str2, null, 20);
        }
    }

    @InterfaceC1312540kGC(name = "enterfrom")
    public final void setEnterFrom(String str) {
        this.LLJ = str;
    }

    @InterfaceC1312540kGC(name = "loop")
    public final void setLoop(boolean z) {
        this.LLIZ = z;
    }

    @InterfaceC1312540kGC(name = "muted")
    public final void setMuted(boolean z) {
        C21352818hK c21352818hK = (C21352818hK) this.mView;
        if (c21352818hK != null) {
            c21352818hK.setMuted(z);
        }
    }

    @InterfaceC1312540kGC(name = "objectfit")
    public final void setObjectFit(String str) {
        if (str != null) {
            this.LLILZLL = str;
        }
    }

    @InterfaceC1312540kGC(name = "poster")
    public final void setPoster(String str) {
        this.LLILZ = str;
    }

    @InterfaceC1312540kGC(name = "src")
    public final void setSrc(String str) {
        T t;
        boolean z;
        String str2;
        String str3 = "";
        try {
            if (str == null) {
                String str4 = this.LLIZLLLIL;
                if (str4 == null) {
                    str4 = "";
                }
                C1488800oqU.LIZ("set_src", "src is null", null, str4, null, 20);
                return;
            }
            VideoInfo videoInfo = (VideoInfo) C09C2.LIZ().LJII(str, VideoInfo.class);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("videoId: ");
            sbLIZ.append(videoInfo.videoId);
            sbLIZ.append(", currentVideoId: ");
            sbLIZ.append(this.LL);
            sbLIZ.append(",video is null: ");
            if (videoInfo.video == null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            C1488800oqU.LIZ("set_src", C2188811AlT.LIZIZ(sbLIZ), null, null, null, 28);
            String str5 = this.LL;
            if (videoInfo.video != null && (str2 = videoInfo.videoId) != null && !Intrinsics.LJFF(str2, str5)) {
                C21352818hK c21352818hK = (C21352818hK) this.mView;
                if (c21352818hK != null) {
                    c21352818hK.setSrc(videoInfo);
                }
                this.LL = videoInfo.videoId;
                this.LLILLJJLI = true;
                this.LLILLL = System.currentTimeMillis();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (((Boolean) this.LLJI.getValue()).booleanValue() && (t = this.mView) != 0) {
                C1389890mGx c1389890mGx = new C1389890mGx(t);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setSrc error: ");
                sbLIZ2.append(e.getMessage());
                c1389890mGx.LJIIJ(C2188811AlT.LIZIZ(sbLIZ2));
                c1389890mGx.LJIIJJI();
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("error: ");
            sbLIZ3.append(e.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            String str6 = this.LLIZLLLIL;
            if (str6 != null) {
                str3 = str6;
            }
            C1488800oqU.LIZ("set_src", strLIZIZ, null, str3, null, 20);
        }
    }

    @InterfaceC1312540kGC(name = "tag")
    public final void setTag(String str) {
        this.LLIZLLLIL = str;
    }

    @InterfaceC1967107nB
    public final void pause(ReadableMap readableMap, Callback callback) {
        C21352818hK c21352818hK = (C21352818hK) this.mView;
        if (c21352818hK != null) {
            c21352818hK.LL.LJ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current_video_id: ");
        sbLIZ.append(this.LL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String str = this.LLIZLLLIL;
        if (str == null) {
            str = "";
        }
        C1488800oqU.LIZ("pause", strLIZIZ, null, str, null, 20);
    }

    @InterfaceC1967107nB
    public final void play(ReadableMap readableMap, Callback callback) {
        C21352818hK c21352818hK = (C21352818hK) this.mView;
        if (c21352818hK != null) {
            c21352818hK.LIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current_video_id: ");
        sbLIZ.append(this.LL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String str = this.LLIZLLLIL;
        if (str == null) {
            str = "";
        }
        C1488800oqU.LIZ("play", strLIZIZ, null, str, null, 20);
    }

    @InterfaceC1967107nB
    public final void seek(ReadableMap readableMap, Callback callback) {
        double dDoubleValue;
        boolean zBooleanValue;
        Double dValueOf;
        Boolean boolValueOf = null;
        try {
            dValueOf = Double.valueOf(readableMap.getDouble("time"));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (dValueOf != null) {
            dDoubleValue = dValueOf.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        try {
            boolValueOf = Boolean.valueOf(readableMap.getBoolean("play"));
        } catch (CancellationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw e2;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        if (boolValueOf != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = true;
        }
        C21352818hK c21352818hK = (C21352818hK) this.mView;
        if (c21352818hK != null) {
            float f = (float) dDoubleValue;
            C1488750oqP c1488750oqP = c21352818hK.LL;
            if (c1488750oqP.LLJJIJIIJIL != 0.0f) {
                c1488750oqP.getPlayer().seek((f / c1488750oqP.LLJJIJIIJIL) * 100);
                if (zBooleanValue) {
                    c1488750oqP.LJIIIZ();
                } else {
                    c1488750oqP.LJ();
                }
            }
        }
        String str = "current_video_id: " + this.LL + ", time: " + dDoubleValue + ", play: " + zBooleanValue;
        String str2 = this.LLIZLLLIL;
        if (str2 == null) {
            str2 = "";
        }
        C1488800oqU.LIZ("seek", str, null, str2, null, 20);
    }
}
