package com.ss.android.ugc.aweme.favorites.service;

import X.AbstractC1549150qPp;
import X.AbstractC848400XPy;
import X.AbstractDialogC1171850gbH;
import X.C09JN;
import X.C0BLB;
import X.C0C64;
import X.C0NB9;
import X.C0NBA;
import X.C0O1H;
import X.C0OFL;
import X.C0XQ7;
import X.C10GR;
import X.C1171340gaS;
import X.C1171460gae;
import X.C1171530gal;
import X.C1171860gbI;
import X.C1171870gbJ;
import X.C1171890gbL;
import X.C1171910gbN;
import X.C1171980gbU;
import X.C11S5;
import X.C1206780hVc;
import X.C1208700hYi;
import X.C1210040has;
import X.C1210050hat;
import X.C1210060hau;
import X.C1367960lha;
import X.C1372630lp7;
import X.C1389890mGx;
import X.C1389910mGz;
import X.C13BV;
import X.C13LE;
import X.C1440005kM;
import X.C1503430pE5;
import X.C1506540pJ6;
import X.C1548820qPI;
import X.C15M3;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C288990BUj;
import X.C294850Bh5;
import X.C303810BvX;
import X.C397901gf;
import X.C418440Gaw;
import X.C443120HZe;
import X.C614440O8c;
import X.C731840SnG;
import X.C742510TAr;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1171320gaQ;
import X.InterfaceC1370310llN;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import X.ViewOnTouchListenerC1171840gbG;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.experiment.DiscoverCollectTemplateConfig;
import com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentOtherProfile;
import com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2;
import com.ss.android.ugc.aweme.favorites.business.collaboration.CollaborativeUserInfo;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.favorites.business.collection.DeleteAbility;
import com.ss.android.ugc.aweme.favorites.business.collection.ReNameAbility;
import com.ss.android.ugc.aweme.favorites.business.collection.collaborative.CollaborativeCollectionListContentAssem;
import com.ss.android.ugc.aweme.favorites.business.monitor.FavoriteApiNetworkPartner;
import com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionRouteInterceptor;
import com.ss.android.ugc.aweme.favorites.business.music.MusicDetailFromFavoriteInterceptor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.LocalServiceInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS18S1210000_18;
import kotlin.jvm.internal.AwS22S1210000_12;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes19.dex */
public class FavoriteServiceImpl implements IFavoriteService {
    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final C19719912Dl LIZIZ() {
        return C13LE.LIZ(CollaborativeCollectionListContentAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final String LJIIIZ(String str) {
        return str;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJIJ() {
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return SettingsManager.LJ("settings_has_ever_shown_favorite_notice", 0) == 0;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJJIFFI() {
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final List<C0OFL> LJJIIJZLJL(List<C0OFL> list) {
        return list;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
        return C1697810uHb.LJ(C15M3.class, C1503430pE5.class, C1506540pJ6.class);
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final FavoriteApiNetworkPartner LIZ() {
        return new FavoriteApiNetworkPartner();
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJ() {
        C1440005kM.LIZ(new C742510TAr(new CollectionManageRequest(3, null, null, null, null, null, null, null, null, null, null, null), null));
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final MusicCollectionRouteInterceptor LJI() {
        return new MusicCollectionRouteInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJIILL() {
        C1171460gae.LIZ.getClass();
        AbstractDialogC1171850gbH abstractDialogC1171850gbH = C1171460gae.LIZIZ;
        if (abstractDialogC1171850gbH != null) {
            return abstractDialogC1171850gbH.isShowing();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0hat] */
    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final C1210050hat LJIJJ() {
        return new InterfaceC1370310llN() { // from class: X.0hat
            @Override // X.InterfaceC1370310llN
            public final float LIZLLL() {
                return -1.0f;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJI() {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJII() {
                return R.raw.icon_2pt_trash_bin;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIIIZZ() {
                return R.raw.icon_2pt_trash_bin;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJIIIZ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJIILJJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIJJLI() {
                return 0;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIJ(ImageView imageView, View view, int i) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJIJIIJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJIL() {
                return true;
            }

            @Override // X.InterfaceC1370310llN
            public final String LJJIZ() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJI(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJJJIZL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJJL() {
                return false;
            }

            @Override // X.InterfaceC1370450llb
            public final int LJJJJLI() {
                return 100;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJLZIJ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJLIIIJJIZ() {
                return 2131834473;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJLIIIJL() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean enable() {
                return true;
            }

            @Override // X.InterfaceC1370310llN
            public final String key() {
                return "delete_video_collection";
            }

            @Override // X.InterfaceC1370310llN
            public final String label() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIJJI() {
                return !enable() ? 1 : 0;
            }

            @Override // X.InterfaceC1370310llN
            public final C0M7Z LJIIJ() {
                return C0M7Z.ShareButton;
            }

            @Override // X.InterfaceC1370310llN
            public final EnumC1216710hld LJJJZ() {
                return EnumC1216710hld.NORMAL;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIJJ(TextView textView) {
                C1370320llO.LJ(this, textView);
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                return C1370320llO.LIZJ(enumC1369720lkQ);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                InterfaceC665370Q7z interfaceC665370Q7zLJFF;
                DeleteAbility deleteAbility;
                Fragment fragmentLIZ = C1484805ra.LIZ(context, C13LE.LIZ(CollectionContentFragment.class));
                if (fragmentLIZ != null && (interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLIZ, null)) != null && (deleteAbility = (DeleteAbility) C1558520qew.LIZ(interfaceC665370Q7zLJFF, DeleteAbility.class, null)) != null) {
                    deleteAbility.UN();
                }
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZLLL(context, baseSharePackage, this);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJJII() {
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), null, "video_creation_finish_event"));
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJJIIZI() {
        C1171870gbJ.LIZ.getClass();
        return C1171870gbJ.LIZ().getBoolean(C1171870gbJ.LIZIZ(), false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0has] */
    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final C1210040has LJJIJIIJI() {
        return new InterfaceC1370310llN() { // from class: X.0has
            @Override // X.InterfaceC1370310llN
            public final float LIZLLL() {
                return -1.0f;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJI() {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJII() {
                return R.raw.icon_2pt_pen;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIIIZZ() {
                return R.raw.icon_2pt_pen;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJIIIZ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJIILJJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIJJLI() {
                return 0;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIJ(ImageView imageView, View view, int i) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJIJIIJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJIL() {
                return true;
            }

            @Override // X.InterfaceC1370310llN
            public final String LJJIZ() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJI(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJJJIZL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJJL() {
                return false;
            }

            @Override // X.InterfaceC1370450llb
            public final int LJJJJLI() {
                return 100;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJLZIJ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJLIIIJJIZ() {
                return 2131848033;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJLIIIJL() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean enable() {
                return true;
            }

            @Override // X.InterfaceC1370310llN
            public final String key() {
                return "rename_video_collection";
            }

            @Override // X.InterfaceC1370310llN
            public final String label() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIJJI() {
                return !enable() ? 1 : 0;
            }

            @Override // X.InterfaceC1370310llN
            public final C0M7Z LJIIJ() {
                return C0M7Z.ShareButton;
            }

            @Override // X.InterfaceC1370310llN
            public final EnumC1216710hld LJJJZ() {
                return EnumC1216710hld.NORMAL;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIJJ(TextView textView) {
                C1370320llO.LJ(this, textView);
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                return C1370320llO.LIZJ(enumC1369720lkQ);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                InterfaceC665370Q7z interfaceC665370Q7zLJFF;
                ReNameAbility reNameAbility;
                Fragment fragmentLIZ = C1484805ra.LIZ(context, C13LE.LIZ(CollectionContentFragment.class));
                if (fragmentLIZ != null && (interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLIZ, null)) != null && (reNameAbility = (ReNameAbility) C1558520qew.LIZ(interfaceC665370Q7zLJFF, ReNameAbility.class, null)) != null) {
                    reNameAbility.CA2();
                }
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZLLL(context, baseSharePackage, this);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJJIJIIJIL() {
        C1171870gbJ.LIZ.getClass();
        C1171870gbJ.LIZ().storeBoolean("collaborative_im_pop_up_", true);
        C1171860gbI.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "chat");
        c2344009Gk.LJIIIIZZ("popup_type", "join_co_collection_intro");
        C20684815ws.LJIILLIIL("ttsocial_co_collection_intro_popup_show", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJJIJL() {
        C1171870gbJ.LIZ.getClass();
        return !C1171870gbJ.LIZ().getBoolean("collaborative_pop_up_", false) && C1171890gbL.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJJIJLIJ() {
        C1171870gbJ.LIZ.getClass();
        return C1171870gbJ.LIZ().getBoolean("collaborative_im_pop_up_", false);
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJJJ() {
        C1171870gbJ.LIZ.getClass();
        C1171870gbJ.LIZ().storeBoolean(C1171870gbJ.LIZIZ(), true);
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final MusicDetailFromFavoriteInterceptor LJJJJIZL() {
        return new MusicDetailFromFavoriteInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJIIIIZZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 9, "favorite_on_video_player", false) == 0;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final int LJIIJJI() {
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 9, "favorite_on_video_player", false);
        if (1 > iLJIJ || iLJIJ >= 10) {
            return 0;
        }
        return ((iLJIJ - 1) % 3) + 1;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJIIZILJ() {
        return (C0C64.LJIILLIIL().LJIJ(31744, 0, "favorite_reverse", false) == 1 || C288990BUj.LIZ()) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJIJJLI() {
        return C0C64.LJIILLIIL().LJIJ(31744, 2, "favorite_notify_for_consumption_side", true) == 2;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJIL() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ("enable_video_favorite_tabname_opt", 1) == 1;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJJIIJ() {
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 9, "favorite_on_video_player", false);
        return 7 <= iLJIJ && iLJIJ < 10;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJJIIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 2, "favorite_notify_for_creator_side", true) != 0 ? C0C64.LJIILLIIL().LJIJ(31744, 2, "favorite_notify_for_creator_side", true) == 2 : C0C64.LJIILLIIL().LJIJ(31744, 2, "favorite_notify_for_consumption_side", true) == 2 || C0C64.LJIILLIIL().LJIJ(31744, 2, "favorite_notify_for_consumption_side", true) == 3;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJJIL() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "offline_music_add_similar", true, false);
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final String LJJJIL() {
        String strLIZ = DiscoverCollectTemplateConfig.LIZ();
        return strLIZ == null ? "" : strLIZ;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJIIJ() {
        return C614440O8c.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final C1210060hau LJJIZ(C1372630lp7 c1372630lp7) {
        return new C1210060hau(c1372630lp7);
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final ViewOnTouchListenerC1171840gbG LJIILJJIL(C731840SnG c731840SnG, C0O1H c0o1h) {
        C1171460gae.LIZ.getClass();
        return new ViewOnTouchListenerC1171840gbG(c731840SnG, c0o1h);
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJIJI(final View view, final C19EG c19eg) {
        if (c19eg != null) {
            PopupManager.LJIJI(new C10GR(view, c19eg) { // from class: X.0iXJ
                public final C19EG LL;
                public final View LLILLJJLI;

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return 3001;
                }

                @Override // X.InterfaceC20660415sw
                public final C688120Qyw i2() {
                    C19EG c19eg2 = this.LL;
                    if (c19eg2 != null) {
                        return new C688120Qyw(c19eg2, c19eg2, null);
                    }
                    return null;
                }

                @Override // X.AbstractC20656215sG
                public final boolean canShow() {
                    return !C1246280iXK.LIZ();
                }

                {
                    this.LL = c19eg;
                    this.LLILLJJLI = view;
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    C450720Hlu c450720Hlu = new C450720Hlu(new C1361400lX0(c688120Qyw.LIZ, R.style.y0));
                    c450720Hlu.LLILLJJLI.LIZIZ = this.LLILLJJLI;
                    c450720Hlu.LIZLLL();
                    c450720Hlu.LLILLJJLI.LIZLLL = EnumC1235690iGF.START;
                    c450720Hlu.LJIIJ(2131836862);
                    C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                    c1391600mJi.LJII = 3000L;
                    c1391600mJi.LJIJJ = true;
                    c1391600mJi.LJIJJLI = false;
                    c450720Hlu.LIZJ(new AwS598S0100000_19(c20656615sK, 846));
                    c450720Hlu.LIZIZ().show();
                    Keva keva = (Keva) C1246280iXK.LIZ.getValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("tooltip_shown_");
                    sbLIZ.append(C461720I8s.LIZIZ());
                    keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
                }
            }, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJJIII(Fragment fragment, String str) {
        FavoritesFragmentV2 favoritesFragmentV2;
        List<InterfaceC1891350zJl> listLIZ;
        if ((fragment instanceof FavoritesFragmentV2) && (favoritesFragmentV2 = (FavoritesFragmentV2) fragment) != null && Intrinsics.LJFF(favoritesFragmentV2.LL, Boolean.TRUE)) {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = favoritesFragmentV2.LLJJJ;
            if (viewOnAttachStateChangeListenerC20631115oD != null && (listLIZ = viewOnAttachStateChangeListenerC20631115oD.getFragmentItemOperator().LIZ()) != null && !listLIZ.isEmpty()) {
                favoritesFragmentV2.NR().LLILZLL.postValue(str);
            } else {
                favoritesFragmentV2.LLJJ = str;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJJIJ(Fragment fragment, String str) {
        if (fragment instanceof FavoritesFragmentV2) {
            FavoritesFragmentV2 favoritesFragmentV2 = (FavoritesFragmentV2) fragment;
            favoritesFragmentV2.LLJJLIIIJLLLLLLLZ = str;
            favoritesFragmentV2.ZR();
        }
        if (fragment instanceof FavoritesFragmentOtherProfile) {
            ((FavoritesFragmentOtherProfile) fragment).LLJ = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final C443120HZe LJJJJ(long j, String str) {
        int i;
        Object obj;
        boolean zBooleanValue;
        Long l;
        Boolean bool;
        try {
            InterfaceC1171320gaQ.LIZ.getClass();
            InterfaceC1171320gaQ interfaceC1171320gaQ = (InterfaceC1171320gaQ) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(Api.LIZ).create(InterfaceC1171320gaQ.class);
            long jLongValue = 0;
            if (j == 0) {
                i = 1;
            } else {
                i = 2;
            }
            CollectionContentResponse collectionContentResponse = interfaceC1171320gaQ.LJII(str, j, 30, i).execute().LIZIZ;
            C1206780hVc.LIZJ("/tiktok/collection/item_archive/item/list/v1", "net", collectionContentResponse);
            if (collectionContentResponse == null || (obj = collectionContentResponse.items) == null) {
                obj = C13BV.INSTANCE;
            }
            if (collectionContentResponse == null || (bool = collectionContentResponse.hasMore) == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            if (collectionContentResponse != null && (l = collectionContentResponse.maxCursor) != null) {
                jLongValue = l.longValue();
            }
            return new C443120HZe(obj, boolValueOf, Long.valueOf(jLongValue));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1206780hVc.LIZIZ("/tiktok/collection/item_archive/item/list/v1", th);
            throw th;
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LIZJ(C19EG c19eg, CollaborativeUserInfo collaborativeUserInfo, String str) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "//collection/collaborative/list");
        smartRouteBuildRoute.withParam("enter_from", "chat_settings");
        smartRouteBuildRoute.withParam("conversation_id", str);
        smartRouteBuildRoute.withParam("collaborative_user_info", collaborativeUserInfo);
        smartRouteBuildRoute.open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "chat_settings");
        c2344009Gk.LJIIIIZZ("chat_type", "private");
        c2344009Gk.LJIIIIZZ("conversation_id", str);
        C20684815ws.LJIILLIIL("ttsocial_chat_collection_enter", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJIILIIL(final Context context, final Aweme aweme, final String str, final int[] iArr) {
        boolean zBooleanValue;
        Boolean boolIsLSContent;
        C1171460gae.LIZ.getClass();
        if (!C1171460gae.LIZJ) {
            C1171460gae.LIZJ = true;
            System.currentTimeMillis();
            try {
                LocalServiceInfo localServiceInfo = aweme.getLocalServiceInfo();
                if (localServiceInfo != null && (boolIsLSContent = localServiceInfo.isLSContent()) != null) {
                    zBooleanValue = boolIsLSContent.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                final boolean z = zBooleanValue;
                new C1171340gaS().LLILLL.u0(0L, null, true, null, null, true, zBooleanValue, true).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0gbD
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        String str2;
                        C1C7U.LIZ("QuickFavoriteManager@2914.showQuickFavoriteDialog$1");
                        List<CollectionDetail> list = ((CollectionListResponse) obj).items;
                        C01GW c01gw = C296230BjJ.LIZ;
                        if (((Number) c01gw.getValue()).intValue() == 1) {
                            Context context2 = context;
                            C1171460gae.LIZIZ = new DialogC446620HfI(context2, iArr, new AwS18S1210000_18(context2, aweme, str, z, 2), new AwS22S1210000_12(context, aweme, str, z, 0), new AwS18S1210000_18(context, aweme, str, z, 3), str, z);
                        } else {
                            Context context3 = context;
                            C1171460gae.LIZIZ = new DialogC446550HfB(context3, iArr, new AwS18S1210000_18(context3, aweme, str, z, 4), new AwS22S1210000_12(context, aweme, str, z, 1), new AwS18S1210000_18(context, aweme, str, z, 5), str);
                        }
                        AbstractDialogC1171850gbH abstractDialogC1171850gbH = C1171460gae.LIZIZ;
                        if (abstractDialogC1171850gbH != null) {
                            abstractDialogC1171850gbH.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.0gbC
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    C1171460gae.LIZ.getClass();
                                    C1171460gae.LIZIZ = null;
                                }
                            });
                        }
                        AbstractDialogC1171850gbH abstractDialogC1171850gbH2 = C1171460gae.LIZIZ;
                        if (abstractDialogC1171850gbH2 != null) {
                            abstractDialogC1171850gbH2.Di(list);
                        }
                        AbstractDialogC1171850gbH abstractDialogC1171850gbH3 = C1171460gae.LIZIZ;
                        if (abstractDialogC1171850gbH3 != null) {
                            abstractDialogC1171850gbH3.LJJ(true);
                        }
                        int size = 0;
                        C1171460gae.LIZJ = false;
                        if (((Number) c01gw.getValue()).intValue() == 1) {
                            str2 = "ver_bubble";
                        } else {
                            str2 = "hor_bubble";
                        }
                        C1171820gbE c1171820gbE = new C1171820gbE();
                        c1171820gbE.LIZLLL = str;
                        c1171820gbE.LJIILLIIL = aweme.getAid();
                        c1171820gbE.LJIIZILJ = str2;
                        if (list != null) {
                            size = list.size();
                        }
                        c1171820gbE.LJIJ = size;
                        c1171820gbE.LJIILJJIL();
                        C1C7U.LIZIZ("QuickFavoriteManager@2914.showQuickFavoriteDialog$1");
                    }
                }, new C09JN() { // from class: X.0gai
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("QuickFavoriteManager@2914.showQuickFavoriteDialog$2");
                        C1171460gae.LIZ.getClass();
                        C1171460gae.LIZIZ = null;
                        C1171460gae.LIZJ = false;
                        C1C7U.LIZIZ("QuickFavoriteManager@2914.showQuickFavoriteDialog$2");
                    }
                });
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final AmeBaseFragment LJJI(User user, String str, boolean z, boolean z2) {
        String curSecUserId;
        if (user != null) {
            String secUid = user.getSecUid();
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (iAccountUserServiceLJFF != null) {
                curSecUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurSecUserId();
            } else {
                curSecUserId = null;
            }
            if (!Intrinsics.LJFF(secUid, curSecUserId)) {
                FavoritesFragmentOtherProfile favoritesFragmentOtherProfile = new FavoritesFragmentOtherProfile();
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("ownerUid", user.getUid(), bundle);
                C786410Ut5.LJJJI("ownerName", user.getNickname(), bundle);
                favoritesFragmentOtherProfile.setArguments(bundle);
                return favoritesFragmentOtherProfile;
            }
        }
        FavoritesFragmentV2 favoritesFragmentV2 = new FavoritesFragmentV2(Boolean.valueOf(z), str);
        Bundle arguments = favoritesFragmentV2.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean("favorite_is_from_main", z2);
        favoritesFragmentV2.setArguments(arguments);
        return favoritesFragmentV2;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJJIJIL(C19EG c19eg, String str, String str2, View view) {
        new C1171530gal(str, false, false, false, str2, true, 28).LIZLLL(view, c19eg);
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJJJI(C19EG c19eg, String str, String str2, View view) {
        new C1171530gal(str, false, false, false, str2, false, 60).LIZLLL(view, c19eg);
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJJJJI(C19EG c19eg, String str, String str2, Boolean bool) {
        boolean zBooleanValue;
        boolean zLJI = MethodIDManager.LJI(196701);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        new C1171530gal(str, zBooleanValue, false, true, str2, false, 40).LJ(c19eg);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJFF(C19EG c19eg, Object obj, String str, String str2, boolean z) {
        final CollectionDetail collectionDetail;
        String string;
        int iLIZIZ;
        int iLIZIZ2;
        final C1171910gbN c1171910gbN = new C1171910gbN(str, "", str2, false, z);
        String string2 = null;
        if ((obj instanceof CollectionDetail) && (collectionDetail = (CollectionDetail) obj) != null) {
            if (C294850Bh5.LIZ()) {
                string = c19eg.getString(2131825058);
            } else {
                string = c19eg.getString(2131834461);
            }
            Object[] objArr = new Object[1];
            String str3 = collectionDetail.name;
            if (str3 != null) {
                string2 = a0.LJLIIIL(str3).toString();
            }
            objArr[0] = string2;
            String strJ4 = C786410Ut5.j4(string, Arrays.copyOf(objArr, 1));
            if (C0BLB.LIZ() == 4 && !Intrinsics.LJFF(str2, "personal_homepage") && !Intrinsics.LJFF(str2, "collection_video")) {
                View viewFindViewById = c19eg.getWindow().getDecorView().findViewById(R.id.viewpager);
                View decorView = c19eg.getWindow().getDecorView();
                Rect rect = new Rect();
                decorView.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                viewFindViewById.getGlobalVisibleRect(rect2);
                if (Intrinsics.LJFF(str2, "graphic_detail")) {
                    iLIZIZ = rect.bottom - rect2.bottom;
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49));
                } else {
                    iLIZIZ = (rect.bottom - rect2.bottom) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
                int iLIZIZ3 = iLIZIZ + iLIZIZ2;
                if (Build.VERSION.SDK_INT >= 35) {
                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C303810BvX.LIZ()))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
                C1389910mGz c1389910mGz = new C1389910mGz(c19eg);
                c1389910mGz.LJI(R.style.y0);
                c1389910mGz.LIZ.LIZIZ = 0;
                c1389910mGz.LJ(3000L);
                c1389910mGz.LIZIZ(iLIZIZ3);
                c1389910mGz.LJIIJ(strJ4);
                c1389910mGz.LIZ.LIZLLL = 2;
                c1389910mGz.LJFF(2131846821);
                c1389910mGz.LIZ.LJIIIIZZ = new C1208700hYi(c1171910gbN, c19eg, collectionDetail, 2);
                c1389910mGz.LJIIJJI();
                C0NB9.LIZ(new C0NBA() { // from class: X.0gbQ
                    @Override // X.C0NBA
                    public final void LIZ(C0NBB c0nbb) throws JSONException {
                        c0nbb.LIZ("enter_from", c1171910gbN.LIZJ);
                        c0nbb.LIZ("group_id", c1171910gbN.LIZ);
                        c0nbb.LIZ("toast_type", "add_collection");
                        c0nbb.LIZ("collection_id", collectionDetail.id);
                    }
                }, "favourite_notice_show");
                return;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIJ(strJ4);
            c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
            c1389890mGx.LJII(R.attr.a0i);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJIIL(final C19EG c19eg, String str, String str2, final String str3, final String str4, final String str5) {
        String str6 = str2;
        if (c19eg != null && str != null && str3 != null) {
            if (str6 == null) {
                str6 = "";
            }
            final C1171530gal c1171530gal = new C1171530gal(str, false, false, false, str6, false, 60);
            C1367960lha.LIZ.getClass();
            C1367960lha.LIZ().onVideoAddToCollection(Boolean.valueOf(c1171530gal.LLILLL), str3, str4, str5, str);
            new C1171340gaS().LLILLL.LLZLLIL(new CollectionManageRequest(10, str3, null, null, null, Collections.singletonList(str), null, null, null, null, null, null), c1171530gal.LLILLL).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0gZW
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("FeedAddToFavoritesPopToast@bc43.addToCollectionOnFeed$ignore$1");
                    View decorView = c19eg.getWindow().getDecorView();
                    View viewFindViewById = c19eg.getWindow().getDecorView().findViewById(R.id.viewpager);
                    Rect rect = new Rect();
                    decorView.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    viewFindViewById.getGlobalVisibleRect(rect2);
                    int iLIZIZ = (rect.bottom - rect2.bottom) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    C1389910mGz c1389910mGz = new C1389910mGz(c19eg);
                    c1389910mGz.LJI(R.style.y0);
                    c1389910mGz.LIZ.LIZIZ = 0;
                    c1389910mGz.LJ(3000L);
                    c1389910mGz.LIZIZ(iLIZIZ);
                    c1389910mGz.LJIIJ(c19eg.getString(2131834461, str4));
                    c1389910mGz.LJI(R.style.y0);
                    c1389910mGz.LIZ.LIZLLL = 2;
                    c1389910mGz.LJFF(2131844694);
                    c1389910mGz.LIZLLL(AFwS206S0000000_18.get$arr$(128));
                    final C1171530gal c1171530gal2 = c1171530gal;
                    final C19EG c19eg2 = c19eg;
                    final String str7 = str4;
                    final String str8 = str3;
                    c1389910mGz.LIZ.LJIIIIZZ = new AbstractViewOnClickListenerC372950Ejl() { // from class: X.0gZX
                        @Override // X.AbstractViewOnClickListenerC372950Ejl
                        public final void LIZ(View view) {
                            c1171530gal2.LIZ().LJ("FeedAddToFavoritesPopToast addToCollectionOnFeed doClick");
                            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg2, "//favorite/videos/collections/content");
                            smartRouteBuildRoute.withParam("enter_from", c1171530gal2.LLILLJJLI);
                            smartRouteBuildRoute.withParam("name", str7);
                            smartRouteBuildRoute.withParam("collection_id", str8);
                            smartRouteBuildRoute.open();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(500L);
                        }
                    };
                    c1389910mGz.LJIIJJI();
                    C1170730gZT c1170730gZT = new C1170730gZT();
                    C1171530gal c1171530gal3 = c1171530gal;
                    c1170730gZT.LIZLLL = c1171530gal3.LLILLJJLI;
                    c1170730gZT.LJIIZILJ = "add";
                    c1170730gZT.LJIL = c1171530gal3.LL;
                    c1170730gZT.LJJ = 1;
                    c1170730gZT.LJIJI = str3;
                    c1170730gZT.LJIJJ = str4;
                    c1170730gZT.LJJIFFI = str5;
                    c1170730gZT.LJIILJJIL();
                    C1440005kM.LIZ(new C742510TAr(new CollectionManageRequest(3, null, null, null, null, null, null, null, null, null, null, null), null));
                    C1C7U.LIZIZ("FeedAddToFavoritesPopToast@bc43.addToCollectionOnFeed$ignore$1");
                }
            }, new C09JN() { // from class: X.00Ns
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("FeedAddToFavoritesPopToast@bc43.addToCollectionOnFeed$ignore$2");
                    C1C7U.LIZIZ("FeedAddToFavoritesPopToast@bc43.addToCollectionOnFeed$ignore$2");
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJIILLIIL(C19EG c19eg, String str, String str2, String str3, Boolean bool, boolean z) {
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        PopupManager.LJIJI(new C1171980gbU(c19eg, str, str2, str3, zBooleanValue, z), true);
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJJ(C19EG c19eg, String str, String str2, String str3, Boolean bool, boolean z, String str4) {
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        new C1171910gbN(str, str2, str3, str4, zBooleanValue, z).LIZJ(c19eg);
    }
}
