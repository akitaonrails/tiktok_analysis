package com.ss.android.ugc.aweme.poi.detail.videolist.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0C64;
import X.C0QVF;
import X.C1011980cRQ;
import X.C1012300cRw;
import X.C10EU;
import X.C1170350gYr;
import X.C1180600gpO;
import X.C1181430gqj;
import X.C1181890grT;
import X.C1184920gwM;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185410gx9;
import X.C1187600h0g;
import X.C1188440h22;
import X.C1188460h24;
import X.C1189060h32;
import X.C1189200h3G;
import X.C1189230h3J;
import X.C1189360h3W;
import X.C1202680hP0;
import X.C1203620hQW;
import X.C123100dR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1356610lPH;
import X.C13LE;
import X.C1473870oSP;
import X.C1482640ogY;
import X.C14EU;
import X.C1843500y4a;
import X.C1908030zkf;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C422830Gi1;
import X.C427870Gq9;
import X.C438710HIf;
import X.C452080Ho6;
import X.C452501pT;
import X.C583590Muj;
import X.C737030Svd;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1012120cRe;
import X.EnumC1184730gw3;
import X.InterfaceC1184330gvP;
import X.InterfaceC1189210h3H;
import X.InterfaceC1203630hQX;
import X.InterfaceC1473950oSX;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS121S0200000_18;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiVideoListItemVideoCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import wh6.AbS508S0200000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiVideoListItemVideoCell extends PowerCell<C1187600h0g> implements InterfaceC1203630hQX {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public SmartImageView LL;
    public ImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public TextView LLILZ;
    public C427870Gq9 LLILZIL;
    public TuxTextView LLILZLL;
    public ViewGroup LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxTextView LLJ;
    public C1473870oSP LLJI;
    public View LLJIJIL;
    public C1012300cRw LLJILJIL;
    public ViewGroup LLJILJILJ;
    public boolean LLJILLL;
    public Video LLJJ;
    public InterfaceC1189210h3H LLJJI;
    public long LLJJIII;
    public final Set<String> LLJJIJI = new LinkedHashSet();
    public VideoViewComponent LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public C1188440h22 LLJJJJLIIL;
    public final C1189200h3G LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiVideoListItemVideoCell.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1203630hQX
    public final void K() {
        this.LLJJI = null;
    }

    @Override // X.InterfaceC1203630hQX
    public final void LJJJLIIL() {
        synchronized (this) {
            if (this.LLJILLL) {
                S5();
                VideoViewComponent videoViewComponent = this.LLJJIJIIJIL;
                if (videoViewComponent != null) {
                    videoViewComponent.LJIIJJI();
                }
                VideoViewComponent videoViewComponent2 = this.LLJJIJIIJIL;
                if (videoViewComponent2 != null) {
                    videoViewComponent2.release();
                }
                VideoViewComponent videoViewComponent3 = this.LLJJIJIIJIL;
                if (videoViewComponent3 != null) {
                    videoViewComponent3.H1(this.LLJJL);
                }
                this.LLJILLL = false;
                this.LLJJ = null;
                L5();
                N5();
            }
        }
    }

    public final synchronized void P5() {
        Aweme aweme;
        Aweme aweme2;
        C1482640ogY c1482640ogY;
        if (this.LLJILLL) {
            return;
        }
        if (t()) {
            VideoViewComponent videoViewComponent = this.LLJJIJIIJIL;
            Video video = null;
            if (!((videoViewComponent == null || (c1482640ogY = videoViewComponent.LLILLL) == null || !c1482640ogY.Da()) ? false : true)) {
                C1187600h0g item = getItem();
                if (item != null && (aweme2 = item.LLILLJJLI) != null) {
                    video = aweme2.getVideo();
                }
                this.LLJJ = video;
                return;
            }
            S5();
            VideoViewComponent videoViewComponent2 = this.LLJJIJIIJIL;
            if (videoViewComponent2 != null) {
                videoViewComponent2.LIZ(this.LLJJL);
            }
            VideoViewComponent videoViewComponent3 = this.LLJJIJIIJIL;
            if (videoViewComponent3 != null) {
                C1187600h0g item2 = getItem();
                videoViewComponent3.LJII((item2 == null || (aweme = item2.LLILLJJLI) == null) ? null : aweme.getVideo(), C0C64.LJIILLIIL().LJIJ(31744, 0, "decoder_type", true));
            }
            this.LLJJ = null;
            this.LLJILLL = true;
        }
    }

    @Override // X.InterfaceC1203630hQX
    public final boolean isPlaying() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v40, types: [X.0h3G] */
    public PoiVideoListItemVideoCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1315);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(437);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1298), awS562S0100000_18, AFwS206S0000000_18.get$arr$(354), new AwS562S0100000_18((C03K6) this, 1301), new AwS562S0100000_18((C03K6) this, 1303), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1305), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1307), null, new AwS562S0100000_18((C03K6) this, 1308));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 1302);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1304);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 1306);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 72));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 1309);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 1310);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 1311);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 1312);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 1313);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1314), awS562S0100000_18, AFwS206S0000000_18.get$arr$(355), new AwS562S0100000_18((C03K6) this, 1316), new AwS562S0100000_18((C03K6) this, 1317), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1318), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1319), null, new AwS562S0100000_18((C03K6) this, 1320));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1321), awS562S0100000_18, AFwS206S0000000_18.get$arr$(356), new AwS562S0100000_18((C03K6) this, 1322), new AwS562S0100000_18((C03K6) this, 1294), new AwS562S0100000_18((C03K6) this, 1296), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 1297));
        }
        this.LLJJJ = assemVMLazy;
        this.LLJJJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1300));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1299));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1295));
        this.LLJJL = new C583590Muj() { // from class: X.0h3G
            @Override // X.C583590Muj, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompleted(String str) {
                String aid;
                String aid2;
                String authorUid;
                String poiId;
                String poiCityCode;
                String typeLevel;
                String typeName;
                String poiRegionCode;
                Boolean boolIsClaimed;
                String cityCode;
                String strPoiTypeName;
                String regionCode;
                String collectInfo;
                String collectInfo2;
                Aweme aweme;
                String aid3;
                String typeLevel2;
                boolean zBooleanValue;
                Boolean boolIsClaimed2;
                Aweme aweme2;
                Aweme aweme3;
                Aweme aweme4;
                InterfaceC1189210h3H interfaceC1189210h3H = this.LL.LLJJI;
                if (interfaceC1189210h3H != null) {
                    interfaceC1189210h3H.LJJLIIIJ();
                }
                PoiVideoListItemVideoCell poiVideoListItemVideoCell = this.LL;
                Set<String> set = poiVideoListItemVideoCell.LLJJIJI;
                C1187600h0g item = poiVideoListItemVideoCell.getItem();
                if (item != null && (aweme4 = item.LLILLJJLI) != null) {
                    aid = aweme4.getAid();
                } else {
                    aid = null;
                }
                if (!C13LP.LJJJJ(aid, set)) {
                    PoiVideoListItemVideoCell poiVideoListItemVideoCell2 = this.LL;
                    poiVideoListItemVideoCell2.getClass();
                    ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
                    Fragment fragmentLJIIJ = C1189060h32.LJIIJ(poiVideoListItemVideoCell2);
                    PoiListApi.PoiDetailResponse poiDetailResponseLIZ = C1181890grT.LIZ(fragmentLJIIJ);
                    C1187600h0g item2 = poiVideoListItemVideoCell2.getItem();
                    if (item2 != null && (aweme3 = item2.LLILLJJLI) != null) {
                        aid2 = aweme3.getAid();
                    } else {
                        aid2 = null;
                    }
                    String str2 = "";
                    if (aid2 == null) {
                        aid2 = "";
                    }
                    C1187600h0g item3 = poiVideoListItemVideoCell2.getItem();
                    if (item3 == null || (aweme2 = item3.LLILLJJLI) == null || (authorUid = AwemeExtKt.getAuthorUid(aweme2)) == null) {
                        authorUid = "";
                    }
                    String strLIZIZ = C1181890grT.LIZIZ(fragmentLJIIJ);
                    C1188440h22 c1188440h22 = poiVideoListItemVideoCell2.LLJJJJLIIL;
                    if (c1188440h22 == null || (poiId = c1188440h22.getPoiId()) == null) {
                        poiId = "";
                    }
                    C1188440h22 c1188440h222 = poiVideoListItemVideoCell2.LLJJJJLIIL;
                    if (c1188440h222 == null || (poiCityCode = c1188440h222.getPoiCityCode()) == null) {
                        poiCityCode = "";
                    }
                    C1188440h22 c1188440h223 = poiVideoListItemVideoCell2.LLJJJJLIIL;
                    if (c1188440h223 != null) {
                        typeLevel = c1188440h223.getTypeLevel();
                    } else {
                        typeLevel = null;
                    }
                    if (!C123100dR.LIZ(typeLevel)) {
                        typeName = "";
                    } else {
                        C1184920gwM c1184920gwM = EnumC1184730gw3.Companion;
                        C1188440h22 c1188440h224 = poiVideoListItemVideoCell2.LLJJJJLIIL;
                        if (c1188440h224 != null) {
                            typeLevel2 = c1188440h224.getTypeLevel();
                        } else {
                            typeLevel2 = null;
                        }
                        C1188440h22 c1188440h225 = poiVideoListItemVideoCell2.LLJJJJLIIL;
                        if (c1188440h225 != null && (boolIsClaimed2 = c1188440h225.isClaimed()) != null) {
                            zBooleanValue = boolIsClaimed2.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        c1184920gwM.getClass();
                        typeName = C1184920gwM.LIZ(typeLevel2, zBooleanValue).getTypeName();
                    }
                    C1188440h22 c1188440h226 = poiVideoListItemVideoCell2.LLJJJJLIIL;
                    if (c1188440h226 == null || (poiRegionCode = c1188440h226.getPoiRegionCode()) == null) {
                        poiRegionCode = "";
                    }
                    C1188440h22 c1188440h227 = poiVideoListItemVideoCell2.LLJJJJLIIL;
                    if (c1188440h227 != null) {
                        boolIsClaimed = c1188440h227.isClaimed();
                    } else {
                        boolIsClaimed = null;
                    }
                    boolean zLJIL = ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LJIL("android.permission.ACCESS_COARSE_LOCATION");
                    boolean zLJ = iLocationBaseServiceForMT.LJ(poiVideoListItemVideoCell2.itemView.getContext());
                    boolean zLJJIJ = iLocationBaseServiceForMT.LJJIJ();
                    String strLIZLLL = C1181890grT.LIZLLL(fragmentLJIIJ);
                    if (poiDetailResponseLIZ != null) {
                        cityCode = poiDetailResponseLIZ.getCityCode();
                    } else {
                        cityCode = null;
                    }
                    String str3 = "";
                    if (cityCode != null) {
                        str2 = cityCode;
                    }
                    if (poiDetailResponseLIZ == null || (strPoiTypeName = poiDetailResponseLIZ.poiTypeName()) == null) {
                        strPoiTypeName = str3;
                    }
                    if (poiDetailResponseLIZ == null || (regionCode = poiDetailResponseLIZ.getRegionCode()) == null) {
                        regionCode = str3;
                    }
                    C1188440h22 c1188440h228 = poiVideoListItemVideoCell2.LLJJJJLIIL;
                    if (c1188440h228 != null) {
                        collectInfo = c1188440h228.getCollectInfo();
                    } else {
                        collectInfo = null;
                    }
                    if (poiDetailResponseLIZ != null) {
                        collectInfo2 = poiDetailResponseLIZ.getCollectInfo();
                    } else {
                        collectInfo2 = null;
                    }
                    boolean zLIZ = C1189230h3J.LIZ();
                    PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(poiVideoListItemVideoCell2));
                    C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C1189060h32.LJJ("group_id", aid2, linkedHashMap);
                    C1189060h32.LJJ("author_id", authorUid, linkedHashMap);
                    C1189060h32.LJJ("is_fullscreen", CardStruct.IStatusCode.DEFAULT, linkedHashMap);
                    C1189060h32.LJJ("enter_from", "poi_detail", linkedHashMap);
                    C1189060h32.LJJ("previous_page", strLIZIZ, linkedHashMap);
                    C1189060h32.LJJ("poi_id", poiId, linkedHashMap);
                    C1189060h32.LJJ("poi_city", poiCityCode, linkedHashMap);
                    C1189060h32.LJJ("poi_detail_type", typeName, linkedHashMap);
                    C1189060h32.LJJ("poi_region_code", poiRegionCode, linkedHashMap);
                    String strLJJIIZI = C1189060h32.LJJIIZI(boolIsClaimed);
                    if (strLJJIIZI == null) {
                        strLJJIIZI = str3;
                    }
                    C1189060h32.LJJ("is_claimed", strLJJIIZI, linkedHashMap);
                    C1189060h32.LJJ("enable_location", C1189060h32.LJJIJ(zLJIL), linkedHashMap);
                    C1189060h32.LJJ("system_is_precise", C1189060h32.LJJIJ(zLJ), linkedHashMap);
                    C1189060h32.LJJ("inapp_is_precise", C1189060h32.LJJIJ(zLJJIJ), linkedHashMap);
                    C1189060h32.LJJ("page_poi_id", strLIZLLL, linkedHashMap);
                    C1189060h32.LJJ("page_poi_city", str2, linkedHashMap);
                    C1189060h32.LJJ("page_poi_detail_type", strPoiTypeName, linkedHashMap);
                    C1189060h32.LJJ("page_poi_region_code", regionCode, linkedHashMap);
                    C1189060h32.LJJ("is_mute", C1189060h32.LJJIJ(zLIZ), linkedHashMap);
                    C1189060h32.LIZ(collectInfo, linkedHashMap);
                    C1189060h32.LJFF(collectInfo2, linkedHashMap);
                    C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
                    c1185040gwY.getClass();
                    C1185040gwY.LJFF("video_play_finish", linkedHashMap, c1185050gwZ);
                    PoiVideoListItemVideoCell poiVideoListItemVideoCell3 = this.LL;
                    Set<String> set2 = poiVideoListItemVideoCell3.LLJJIJI;
                    C1187600h0g item4 = poiVideoListItemVideoCell3.getItem();
                    if (item4 != null && (aweme = item4.LLILLJJLI) != null && (aid3 = aweme.getAid()) != null) {
                        str3 = aid3;
                    }
                    set2.add(str3);
                }
            }

            @Override // X.C583590Muj, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(C1481290oeN c1481290oeN) {
                this.LL.N5();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                String aid;
                String authorUid;
                String poiId;
                String poiCityCode;
                String typeLevel;
                String typeName;
                String poiRegionCode;
                Boolean boolIsClaimed;
                String cityCode;
                String strPoiTypeName;
                String regionCode;
                String collectInfo;
                String collectInfo2;
                String adClickId;
                String typeLevel2;
                Boolean boolIsClaimed2;
                Aweme aweme;
                Aweme aweme2;
                this.LL.LLJJIII = System.currentTimeMillis();
                this.LL.LLJJIJI.clear();
                PoiVideoListItemVideoCell poiVideoListItemVideoCell = this.LL;
                SmartImageView smartImageView = poiVideoListItemVideoCell.LL;
                if (smartImageView != null) {
                    C786410Ut5.LLFF(4, smartImageView);
                }
                C1012300cRw c1012300cRw = poiVideoListItemVideoCell.LLJILJIL;
                boolean zBooleanValue = false;
                if (c1012300cRw != null) {
                    C786410Ut5.r1(c1012300cRw, 0);
                }
                View view = poiVideoListItemVideoCell.LLJIJIL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                TuxTextView tuxTextView = poiVideoListItemVideoCell.LLILLL;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 4);
                }
                PoiVideoListItemVideoCell poiVideoListItemVideoCell2 = this.LL;
                poiVideoListItemVideoCell2.getClass();
                ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
                Fragment fragmentLJIIJ = C1189060h32.LJIIJ(poiVideoListItemVideoCell2);
                PoiListApi.PoiDetailResponse poiDetailResponseLIZ = C1181890grT.LIZ(fragmentLJIIJ);
                C1187600h0g item = poiVideoListItemVideoCell2.getItem();
                if (item != null && (aweme2 = item.LLILLJJLI) != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                String str = "";
                if (aid == null) {
                    aid = "";
                }
                C1187600h0g item2 = poiVideoListItemVideoCell2.getItem();
                if (item2 == null || (aweme = item2.LLILLJJLI) == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
                    authorUid = "";
                }
                String strLIZIZ = C1181890grT.LIZIZ(fragmentLJIIJ);
                C1188440h22 c1188440h22 = poiVideoListItemVideoCell2.LLJJJJLIIL;
                if (c1188440h22 == null || (poiId = c1188440h22.getPoiId()) == null) {
                    poiId = "";
                }
                C1188440h22 c1188440h222 = poiVideoListItemVideoCell2.LLJJJJLIIL;
                if (c1188440h222 == null || (poiCityCode = c1188440h222.getPoiCityCode()) == null) {
                    poiCityCode = "";
                }
                C1188440h22 c1188440h223 = poiVideoListItemVideoCell2.LLJJJJLIIL;
                if (c1188440h223 != null) {
                    typeLevel = c1188440h223.getTypeLevel();
                } else {
                    typeLevel = null;
                }
                if (!C123100dR.LIZ(typeLevel)) {
                    typeName = "";
                } else {
                    C1184920gwM c1184920gwM = EnumC1184730gw3.Companion;
                    C1188440h22 c1188440h224 = poiVideoListItemVideoCell2.LLJJJJLIIL;
                    if (c1188440h224 != null) {
                        typeLevel2 = c1188440h224.getTypeLevel();
                    } else {
                        typeLevel2 = null;
                    }
                    C1188440h22 c1188440h225 = poiVideoListItemVideoCell2.LLJJJJLIIL;
                    if (c1188440h225 != null && (boolIsClaimed2 = c1188440h225.isClaimed()) != null) {
                        zBooleanValue = boolIsClaimed2.booleanValue();
                    }
                    c1184920gwM.getClass();
                    typeName = C1184920gwM.LIZ(typeLevel2, zBooleanValue).getTypeName();
                }
                C1188440h22 c1188440h226 = poiVideoListItemVideoCell2.LLJJJJLIIL;
                if (c1188440h226 == null || (poiRegionCode = c1188440h226.getPoiRegionCode()) == null) {
                    poiRegionCode = "";
                }
                C1188440h22 c1188440h227 = poiVideoListItemVideoCell2.LLJJJJLIIL;
                if (c1188440h227 != null) {
                    boolIsClaimed = c1188440h227.isClaimed();
                } else {
                    boolIsClaimed = null;
                }
                boolean zLJIL = ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LJIL("android.permission.ACCESS_COARSE_LOCATION");
                boolean zLJ = iLocationBaseServiceForMT.LJ(poiVideoListItemVideoCell2.itemView.getContext());
                boolean zLJJIJ = iLocationBaseServiceForMT.LJJIJ();
                String strLIZLLL = C1181890grT.LIZLLL(fragmentLJIIJ);
                if (poiDetailResponseLIZ == null || (cityCode = poiDetailResponseLIZ.getCityCode()) == null) {
                    cityCode = "";
                }
                if (poiDetailResponseLIZ != null) {
                    strPoiTypeName = poiDetailResponseLIZ.poiTypeName();
                } else {
                    strPoiTypeName = null;
                }
                String str2 = "";
                if (strPoiTypeName != null) {
                    str = strPoiTypeName;
                }
                if (poiDetailResponseLIZ == null || (regionCode = poiDetailResponseLIZ.getRegionCode()) == null) {
                    regionCode = str2;
                }
                C1188440h22 c1188440h228 = poiVideoListItemVideoCell2.LLJJJJLIIL;
                if (c1188440h228 != null) {
                    collectInfo = c1188440h228.getCollectInfo();
                } else {
                    collectInfo = null;
                }
                if (poiDetailResponseLIZ != null) {
                    collectInfo2 = poiDetailResponseLIZ.getCollectInfo();
                } else {
                    collectInfo2 = null;
                }
                boolean zLIZ = C1189230h3J.LIZ();
                C1185410gx9 c1185410gx9 = (C1185410gx9) poiVideoListItemVideoCell2.LLJJJIL.getValue();
                if (c1185410gx9 == null || (adClickId = c1185410gx9.getAdClickId()) == null) {
                    adClickId = str2;
                }
                PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(poiVideoListItemVideoCell2));
                Boolean boolValueOf = Boolean.valueOf(zLJIL);
                Boolean boolValueOf2 = Boolean.valueOf(zLJ);
                Boolean boolValueOf3 = Boolean.valueOf(zLJJIJ);
                Boolean boolValueOf4 = Boolean.valueOf(zLIZ);
                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C1189060h32.LJJ("group_id", aid, linkedHashMap);
                C1189060h32.LJJ("author_id", authorUid, linkedHashMap);
                C1189060h32.LJJ("is_fullscreen", CardStruct.IStatusCode.DEFAULT, linkedHashMap);
                C1189060h32.LJJ("enter_from", "poi_detail", linkedHashMap);
                C1189060h32.LJJ("previous_page", strLIZIZ, linkedHashMap);
                C1189060h32.LJJ("poi_id", poiId, linkedHashMap);
                C1189060h32.LJJ("poi_city", poiCityCode, linkedHashMap);
                C1189060h32.LJJ("poi_detail_type", typeName, linkedHashMap);
                C1189060h32.LJJ("poi_region_code", poiRegionCode, linkedHashMap);
                String strLJJIIZI = C1189060h32.LJJIIZI(boolIsClaimed);
                if (strLJJIIZI == null) {
                    strLJJIIZI = str2;
                }
                C1189060h32.LJJ("is_claimed", strLJJIIZI, linkedHashMap);
                String strLJJIIZI2 = C1189060h32.LJJIIZI(boolValueOf);
                if (strLJJIIZI2 == null) {
                    strLJJIIZI2 = str2;
                }
                C1189060h32.LJJ("enable_location", strLJJIIZI2, linkedHashMap);
                String strLJJIIZI3 = C1189060h32.LJJIIZI(boolValueOf2);
                if (strLJJIIZI3 == null) {
                    strLJJIIZI3 = str2;
                }
                C1189060h32.LJJ("system_is_precise", strLJJIIZI3, linkedHashMap);
                String strLJJIIZI4 = C1189060h32.LJJIIZI(boolValueOf3);
                if (strLJJIIZI4 == null) {
                    strLJJIIZI4 = str2;
                }
                C1189060h32.LJJ("inapp_is_precise", strLJJIIZI4, linkedHashMap);
                C1189060h32.LJJ("page_poi_id", strLIZLLL, linkedHashMap);
                C1189060h32.LJJ("page_poi_city", cityCode, linkedHashMap);
                C1189060h32.LJJ("page_poi_detail_type", str, linkedHashMap);
                C1189060h32.LJJ("page_poi_region_code", regionCode, linkedHashMap);
                String strLJJIIZI5 = C1189060h32.LJJIIZI(boolValueOf4);
                if (strLJJIIZI5 != null) {
                    str2 = strLJJIIZI5;
                }
                C1189060h32.LJJ("is_mute", str2, linkedHashMap);
                C1189060h32.LJJ("click_id", adClickId, linkedHashMap);
                C1189060h32.LIZ(collectInfo, linkedHashMap);
                C1189060h32.LJFF(collectInfo2, linkedHashMap);
                C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
                c1185040gwY.getClass();
                C1185040gwY.LJFF("video_play", linkedHashMap, c1185050gwZ);
            }
        };
    }

    public final void N5() {
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            C786410Ut5.u5(smartImageView, 1.0f);
        }
        SmartImageView smartImageView2 = this.LL;
        if (smartImageView2 != null) {
            C786410Ut5.LLFF(0, smartImageView2);
        }
        C1012300cRw c1012300cRw = this.LLJILJIL;
        if (c1012300cRw != null) {
            C786410Ut5.r1(c1012300cRw, 4);
        }
        View view = this.LLJIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
    }

    public final void release() {
        VideoViewComponent videoViewComponent = this.LLJJIJIIJIL;
        if (videoViewComponent != null) {
            videoViewComponent.LJIIJJI();
        }
        VideoViewComponent videoViewComponent2 = this.LLJJIJIIJIL;
        if (videoViewComponent2 != null) {
            videoViewComponent2.release();
        }
        VideoViewComponent videoViewComponent3 = this.LLJJIJIIJIL;
        if (videoViewComponent3 != null) {
            videoViewComponent3.H1(this.LLJJL);
        }
        this.LLJILLL = false;
        this.LLJJ = null;
    }

    public final void L5() {
        String authorUid;
        String poiId;
        String poiCityCode;
        String typeName;
        String poiRegionCode;
        String cityCode;
        String regionCode;
        Boolean boolIsClaimed;
        Aweme aweme;
        Aweme aweme2;
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        PoiListApi.PoiDetailResponse poiDetailResponseLIZ = C1181890grT.LIZ(fragmentLJIIJ);
        C1187600h0g item = getItem();
        String aid = (item == null || (aweme2 = item.LLILLJJLI) == null) ? null : aweme2.getAid();
        if (aid == null) {
            aid = "";
        }
        C1187600h0g item2 = getItem();
        if (item2 == null || (aweme = item2.LLILLJJLI) == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        String strLIZIZ = C1181890grT.LIZIZ(fragmentLJIIJ);
        C1188440h22 c1188440h22 = this.LLJJJJLIIL;
        if (c1188440h22 == null || (poiId = c1188440h22.getPoiId()) == null) {
            poiId = "";
        }
        C1188440h22 c1188440h222 = this.LLJJJJLIIL;
        if (c1188440h222 == null || (poiCityCode = c1188440h222.getPoiCityCode()) == null) {
            poiCityCode = "";
        }
        C1188440h22 c1188440h223 = this.LLJJJJLIIL;
        if (C123100dR.LIZ(c1188440h223 != null ? c1188440h223.getTypeLevel() : null)) {
            C1184920gwM c1184920gwM = EnumC1184730gw3.Companion;
            C1188440h22 c1188440h224 = this.LLJJJJLIIL;
            String typeLevel = c1188440h224 != null ? c1188440h224.getTypeLevel() : null;
            C1188440h22 c1188440h225 = this.LLJJJJLIIL;
            boolean zBooleanValue = (c1188440h225 == null || (boolIsClaimed = c1188440h225.isClaimed()) == null) ? false : boolIsClaimed.booleanValue();
            c1184920gwM.getClass();
            typeName = C1184920gwM.LIZ(typeLevel, zBooleanValue).getTypeName();
        } else {
            typeName = "";
        }
        C1188440h22 c1188440h226 = this.LLJJJJLIIL;
        if (c1188440h226 == null || (poiRegionCode = c1188440h226.getPoiRegionCode()) == null) {
            poiRegionCode = "";
        }
        C1188440h22 c1188440h227 = this.LLJJJJLIIL;
        Boolean boolIsClaimed2 = c1188440h227 != null ? c1188440h227.isClaimed() : null;
        boolean zLJIL = ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LJIL("android.permission.ACCESS_COARSE_LOCATION");
        boolean zLJ = iLocationBaseServiceForMT.LJ(this.itemView.getContext());
        boolean zLJJIJ = iLocationBaseServiceForMT.LJJIJ();
        String strLIZLLL = C1181890grT.LIZLLL(fragmentLJIIJ);
        if (poiDetailResponseLIZ == null || (cityCode = poiDetailResponseLIZ.getCityCode()) == null) {
            cityCode = "";
        }
        String strPoiTypeName = poiDetailResponseLIZ != null ? poiDetailResponseLIZ.poiTypeName() : null;
        String str = strPoiTypeName != null ? strPoiTypeName : "";
        if (poiDetailResponseLIZ == null || (regionCode = poiDetailResponseLIZ.getRegionCode()) == null) {
            regionCode = "";
        }
        long jCurrentTimeMillis = this.LLJJIII == 0 ? 0L : System.currentTimeMillis() - this.LLJJIII;
        C1188440h22 c1188440h228 = this.LLJJJJLIIL;
        String collectInfo = c1188440h228 != null ? c1188440h228.getCollectInfo() : null;
        String collectInfo2 = poiDetailResponseLIZ != null ? poiDetailResponseLIZ.getCollectInfo() : null;
        boolean zLIZ = C1189230h3J.LIZ();
        PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(this));
        Boolean boolValueOf = Boolean.valueOf(zLJIL);
        Boolean boolValueOf2 = Boolean.valueOf(zLJ);
        Boolean boolValueOf3 = Boolean.valueOf(zLJJIJ);
        Boolean boolValueOf4 = Boolean.valueOf(zLIZ);
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1189060h32.LJJ("group_id", aid, linkedHashMap);
        C1189060h32.LJJ("author_id", authorUid, linkedHashMap);
        C1189060h32.LJJ("is_fullscreen", CardStruct.IStatusCode.DEFAULT, linkedHashMap);
        C1189060h32.LJJ("enter_from", "poi_detail", linkedHashMap);
        C1189060h32.LJJ("previous_page", strLIZIZ, linkedHashMap);
        C1189060h32.LJJ("poi_id", poiId, linkedHashMap);
        C1189060h32.LJJ("poi_city", poiCityCode, linkedHashMap);
        C1189060h32.LJJ("poi_detail_type", typeName, linkedHashMap);
        C1189060h32.LJJ("poi_region_code", poiRegionCode, linkedHashMap);
        String strLJJIIZI = C1189060h32.LJJIIZI(boolIsClaimed2);
        if (strLJJIIZI == null) {
            strLJJIIZI = "";
        }
        C1189060h32.LJJ("is_claimed", strLJJIIZI, linkedHashMap);
        String strLJJIIZI2 = C1189060h32.LJJIIZI(boolValueOf);
        if (strLJJIIZI2 == null) {
            strLJJIIZI2 = "";
        }
        C1189060h32.LJJ("enable_location", strLJJIIZI2, linkedHashMap);
        String strLJJIIZI3 = C1189060h32.LJJIIZI(boolValueOf2);
        if (strLJJIIZI3 == null) {
            strLJJIIZI3 = "";
        }
        C1189060h32.LJJ("system_is_precise", strLJJIIZI3, linkedHashMap);
        String strLJJIIZI4 = C1189060h32.LJJIIZI(boolValueOf3);
        if (strLJJIIZI4 == null) {
            strLJJIIZI4 = "";
        }
        C1189060h32.LJJ("inapp_is_precise", strLJJIIZI4, linkedHashMap);
        C1189060h32.LJJ("page_poi_id", strLIZLLL, linkedHashMap);
        C1189060h32.LJJ("page_poi_city", cityCode, linkedHashMap);
        C1189060h32.LJJ("page_poi_detail_type", str, linkedHashMap);
        C1189060h32.LJJ("page_poi_region_code", regionCode, linkedHashMap);
        String strLJJIIZI5 = C1189060h32.LJJIIZI(boolValueOf4);
        if (strLJJIIZI5 == null) {
            strLJJIIZI5 = "";
        }
        C1189060h32.LJJ("is_mute", strLJJIIZI5, linkedHashMap);
        C1189060h32.LJJ("duration", String.valueOf(lValueOf), linkedHashMap);
        C1189060h32.LIZ(collectInfo, linkedHashMap);
        C1189060h32.LJFF(collectInfo2, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("play_time", linkedHashMap, c1185050gwZ);
    }

    @Override // X.InterfaceC1203630hQX
    public final Aweme LJIIIIZZ() {
        C1187600h0g item = getItem();
        if (item != null) {
            return item.LLILLJJLI;
        }
        return null;
    }

    public final void R5() {
        Aweme aweme;
        AwemeStatistics statistics;
        Aweme aweme2;
        if (getContext() == null) {
            ViewGroup viewGroup = this.LLIZ;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LLIZ;
        int userDigg = 0;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
        C1187600h0g item = getItem();
        if (item != null && (aweme2 = item.LLILLJJLI) != null) {
            userDigg = aweme2.getUserDigg();
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = userDigg == 1 ? R.raw.icon_3pt_heart_filled : R.raw.icon_3pt_heart;
        c419910GdJ.LJ = userDigg == 1 ? Integer.valueOf(R.attr.a04) : Integer.valueOf(R.attr.a1k);
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        TuxIconView tuxIconView = this.LLIZLLLIL;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        C1187600h0g item2 = getItem();
        long diggCount = (item2 == null || (aweme = item2.LLILLJJLI) == null || (statistics = aweme.getStatistics()) == null) ? 0L : statistics.getDiggCount();
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            tuxTextView.setText(C1843500y4a.LIZIZ(diggCount));
        }
    }

    public final void S5() {
        C1012300cRw c1012300cRw;
        if (C1189230h3J.LIZ()) {
            VideoViewComponent videoViewComponent = this.LLJJIJIIJIL;
            if (videoViewComponent != null) {
                videoViewComponent.LJI();
            }
        } else {
            VideoViewComponent videoViewComponent2 = this.LLJJIJIIJIL;
            if (videoViewComponent2 != null) {
                videoViewComponent2.LJIILIIL();
            }
        }
        C1011980cRQ c1011980cRQ = EnumC1012120cRe.Companion;
        int value = C1189230h3J.LIZ() ? EnumC1012120cRe.OFF.getValue() : EnumC1012120cRe.ON.getValue();
        c1011980cRQ.getClass();
        EnumC1012120cRe enumC1012120cReLIZ = C1011980cRQ.LIZ(value);
        if (enumC1012120cReLIZ == null || (c1012300cRw = this.LLJILJIL) == null) {
            return;
        }
        c1012300cRw.LIZ(enumC1012120cReLIZ, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        release();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C1482640ogY c1482640ogY;
        super.onItemViewCreated();
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.cover);
        this.LLILZ = (TextView) this.itemView.findViewById(R.id.desc);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.video_holder_time_label);
        this.LLILLJJLI = (ImageView) this.itemView.findViewById(R.id.video_holder_author_verified_badge);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.bc6);
        this.LLILZLL = tuxTextView;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setTextDirection(5);
        this.LLIZ = (ViewGroup) this.itemView.findViewById(R.id.mn2);
        this.LLIZLLLIL = (TuxIconView) this.itemView.findViewById(R.id.mnw);
        this.LLJ = (TuxTextView) this.itemView.findViewById(R.id.qmp);
        this.LLILZIL = (C427870Gq9) this.itemView.findViewById(R.id.bbz);
        this.LLJI = (C1473870oSP) this.itemView.findViewById(R.id.xrx);
        this.LLJIJIL = this.itemView.findViewById(R.id.video_holder_tux_mask);
        this.LLJILJIL = (C1012300cRw) this.itemView.findViewById(R.id.video_holder_sound_icon);
        this.LLJILJILJ = (ViewGroup) this.itemView.findViewById(R.id.trj);
        this.LLJJIJIL = (TuxIconView) this.itemView.findViewById(R.id.video_photo_mode_iv);
        this.LLJILLL = false;
        this.LLJJ = null;
        this.LLJJIJIIJIL = new VideoViewComponent(0);
        S5();
        VideoViewComponent videoViewComponent = this.LLJJIJIIJIL;
        if (videoViewComponent != null) {
            videoViewComponent.LJIILJJIL(this.LLJI);
        }
        VideoViewComponent videoViewComponent2 = this.LLJJIJIIJIL;
        if (videoViewComponent2 != null && (c1482640ogY = videoViewComponent2.LLILLL) != null) {
            c1482640ogY.Dn(new InterfaceC1473950oSX() { // from class: X.0h3I
                @Override // X.InterfaceC1473950oSX
                public final void LIZ() {
                }

                @Override // X.InterfaceC1473950oSX
                public final /* synthetic */ void LLF(int i, int i2) {
                }

                @Override // X.InterfaceC1473950oSX
                public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                @Override // X.InterfaceC1473950oSX
                public final void LLILLIZIL(int i, int i2) {
                    PoiVideoListItemVideoCell poiVideoListItemVideoCell = this.LL;
                    if (poiVideoListItemVideoCell.LLJJ != null) {
                        poiVideoListItemVideoCell.P5();
                    }
                }
            });
        }
        VideoViewComponent videoViewComponent3 = this.LLJJIJIIJIL;
        if (videoViewComponent3 != null) {
            videoViewComponent3.LIZ(this.LLJJL);
        }
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 378));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            smartImageView.setAttached(true);
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            smartImageView.setAttached(false);
        }
        EventBus.LIZLLL().LJJI(this);
        release();
    }

    @Override // X.InterfaceC1203630hQX
    public final boolean t() {
        C1187600h0g item;
        Aweme aweme;
        Aweme aweme2;
        C1187600h0g item2 = getItem();
        return ((item2 != null && (aweme2 = item2.LLILLJJLI) != null && aweme2.getAwemeType() == 150) || (item = getItem()) == null || (aweme = item.LLILLJJLI) == null || aweme.getVideo() == null) ? false : true;
    }

    @Override // X.InterfaceC1203630hQX
    public final View getDetectView() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1203630hQX
    public final void p1() {
        P5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String nickname;
        Aweme aweme;
        int i;
        C1187600h0g item;
        Aweme aweme2;
        Video video;
        String poiId;
        C1187600h0g c1187600h0g = (C1187600h0g) interfaceC1891350zJl;
        this.LLJJIII = 0L;
        this.LLJILLL = false;
        C427870Gq9 c427870Gq9 = null;
        this.LLJJ = null;
        N5();
        C1188460h24 c1188460h24 = C1188460h24.LIZ;
        Aweme aweme3 = c1187600h0g.LLILLJJLI;
        c1188460h24.getClass();
        this.LLJJJJLIIL = C1188460h24.LJ(aweme3, "detail_item_show", null);
        Aweme aweme4 = c1187600h0g.LLILLJJLI;
        C786410Ut5.I7(new AbS508S0200000_18(c1187600h0g, this, 30, 42), this.itemView);
        String desc = c1187600h0g.LLILLJJLI.getDesc();
        if (desc == null) {
            desc = "";
        }
        C0QVF.LIZ(this.itemView, 3, desc, new ACListenerS121S0200000_18(c1187600h0g, this, 70), 4);
        C1012300cRw c1012300cRw = this.LLJILJIL;
        if (c1012300cRw != null) {
            C786410Ut5.I7(new AbS699S0100000_18(this, 61, 42), c1012300cRw);
        }
        ViewGroup viewGroup = this.LLJILJILJ;
        if (viewGroup != null) {
            if (viewGroup.getHeight() <= 0) {
                HandlerHook.viewPost(viewGroup, new ARunnableS75S0200000_6(viewGroup, this, 139));
            } else {
                I5(viewGroup.getHeight(), viewGroup.getWidth());
            }
        }
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null && (item = getItem()) != null && (aweme2 = item.LLILLJJLI) != null && (video = aweme2.getVideo()) != null) {
            C1185410gx9 c1185410gx9Nf = ((InterfaceC1184330gvP) C1170350gYr.LIZIZ(this, C13LE.LIZ(InterfaceC1184330gvP.class))).Nf();
            if (c1185410gx9Nf != null) {
                poiId = c1185410gx9Nf.getPoiId();
            } else {
                poiId = null;
            }
            C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "video_two_col", null);
            c1180600gpO.LIZLLL = new C1202680hP0(poiId, null, null, null, null, 30);
            C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(video.getOriginCover()));
            c1189360h3WLIZ.LIZLLL(smartImageView);
            c1189360h3WLIZ.LIZIZ();
        }
        if (!AwemeExtKt.isPhotoMode(aweme4) && aweme4.getAwemeType() != 160) {
            TuxIconView tuxIconView = this.LLJJIJIL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
        } else {
            Context context = getContext();
            if (context != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZ = R.raw.icon_square_corner_border_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                TuxIconView tuxIconView2 = this.LLJJIJIL;
                if (tuxIconView2 != null) {
                    tuxIconView2.setImageDrawable(tuxIconDrawableLIZ);
                }
                TuxIconView tuxIconView3 = this.LLJJIJIL;
                if (tuxIconView3 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                }
            }
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(C1356610lPH.LJII(aweme4.getCreateTime() * 1000, tuxTextView.getContext()));
            if (aweme4.isAd()) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
        }
        C1187600h0g item2 = getItem();
        if (item2 != null && (aweme = item2.LLILLJJLI) != null) {
            String desc2 = aweme.getDesc();
            if (desc2 != null && desc2.length() != 0) {
                TextView textView = this.LLILZ;
                if (textView == null) {
                    textView = null;
                }
                C786410Ut5.LLIL(textView, 0);
                TextView textView2 = this.LLILZ;
                if (textView2 == null) {
                    textView2 = null;
                }
                textView2.setText(aweme.getDesc());
            } else {
                TextView textView3 = this.LLILZ;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setText("");
                TextView textView4 = this.LLILZ;
                if (textView4 == null) {
                    textView4 = null;
                }
                C786410Ut5.LLIL(textView4, 8);
            }
        }
        User author = aweme4.getAuthor();
        if (author != null) {
            TuxTextView tuxTextView2 = this.LLILZLL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            if (C10EU.LJIJ(author)) {
                nickname = author.getUniqueId();
            } else {
                nickname = author.getNickname();
            }
            tuxTextView2.setText(nickname);
            if (C1908030zkf.LIZLLL(new UserVerify(null, author.getCustomVerify(), author.getEnterpriseVerifyReason(), -1))) {
                ImageView imageView = this.LLILLJJLI;
                if (imageView != null) {
                    C786410Ut5.LJZI(0, imageView);
                }
            } else {
                ImageView imageView2 = this.LLILLJJLI;
                if (imageView2 != null) {
                    C786410Ut5.LJZI(8, imageView2);
                }
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(author.getAvatarThumb()));
            c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
            C427870Gq9 c427870Gq92 = this.LLILZIL;
            if (c427870Gq92 != null) {
                c427870Gq9 = c427870Gq92;
            }
            c1331670kl3LJIIIIZZ.LJJ(c427870Gq9);
            c1331670kl3LJIIIIZZ.LJIIJJI();
        }
        R5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if ((viewGroup.getContext() == null || !SlashComponentUIPreloadExp.LIZ("poi_merged_list")) && !SlashComponentUIPreloadExp.LIZ("poi_video_list")) {
            return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e11, viewGroup, false);
        }
        return C1181430gqj.LIZIZ(viewGroup.getContext(), R.layout.e11, viewGroup, false);
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        HandlerHook.viewPost(this.itemView, new ARunnableS106S0100000_6(this, 313));
    }

    @Override // X.InterfaceC1203630hQX
    public final void u1(C1203620hQW c1203620hQW) {
        this.LLJJI = c1203620hQW;
    }

    public final void I5(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        Aweme aweme;
        Video video;
        C1187600h0g item = getItem();
        if (item != null && (aweme = item.LLILLJJLI) != null && (video = aweme.getVideo()) != null && video.getWidth() != 0 && video.getHeight() != 0) {
            float width = video.getWidth();
            float height = video.getHeight();
            float f = i2;
            float f2 = i;
            if (height / f2 < width / f) {
                i2 = C814420VxA.LIZIZ(width * (f2 / height));
            } else {
                i = C814420VxA.LIZIZ((f / width) * height);
            }
        }
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null && (layoutParams2 = smartImageView.getLayoutParams()) != null) {
            layoutParams2.width = i2;
            layoutParams2.height = i;
            SmartImageView smartImageView2 = this.LL;
            if (smartImageView2 != null) {
                C786410Ut5.G6(smartImageView2, layoutParams2);
            }
        }
        C1473870oSP c1473870oSP = this.LLJI;
        if (c1473870oSP != null && (layoutParams = c1473870oSP.getLayoutParams()) != null) {
            layoutParams.width = i2;
            layoutParams.height = i;
            C1473870oSP c1473870oSP2 = this.LLJI;
            if (c1473870oSP2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1473870oSP2);
                c1473870oSP2.setLayoutParams(layoutParams);
            }
        }
    }
}
