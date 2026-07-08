package com.ss.android.ugc.tiktok.addyours.service;

import X.AbstractC1386130mAt;
import X.C098200Yq;
import X.C099R;
import X.C0OFL;
import X.C0PEM;
import X.C0TGX;
import X.C1233040iBy;
import X.C1720106oR;
import X.C189200o6;
import X.C19EG;
import X.C2187451AjH;
import X.C2188508hn;
import X.C2188608ho;
import X.C2188808hq;
import X.C2188811AlT;
import X.C2188908hr;
import X.C2241008qG;
import X.C23250099c;
import X.C2344009Gk;
import X.C259800zU;
import X.C267660AeK;
import X.C304900BxI;
import X.C344460Deu;
import X.C634160Ou6;
import X.C730000SkI;
import X.InterfaceC1210900hcG;
import X.InterfaceC1364105Vn;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewStub;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListPage;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursNoticeVideosResp;
import com.ss.android.ugc.tiktok.addyours.route.LegacyQnaRouteInterceptor;
import com.ss.android.ugc.tiktok.addyours.service.AddYoursServiceImpl;
import com.ss.android.ugc.tiktok.addyours.utils.AddYoursStickerManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursServiceImpl implements IAddYoursService {

    public static final class AddYoursCollectionListPageData extends PowerViewPagerFragmentItem<AddYoursCollectionListPage> {
        public static final Parcelable.Creator<AddYoursCollectionListPageData> CREATOR = new Parcelable.Creator<AddYoursCollectionListPageData>() { // from class: X.0OFJ
            @Override // android.os.Parcelable.Creator
            public final AddYoursServiceImpl.AddYoursCollectionListPageData createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new AddYoursServiceImpl.AddYoursCollectionListPageData();
            }

            @Override // android.os.Parcelable.Creator
            public final AddYoursServiceImpl.AddYoursCollectionListPageData[] newArray(int i) {
                return new AddYoursServiceImpl.AddYoursCollectionListPageData[i];
            }
        };

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final IInterceptor LJIIIIZZ() {
        return new LegacyQnaRouteInterceptor();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final boolean LJII() {
        if (!C304900BxI.LIZ() || ((Number) C267660AeK.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        Keva repo = Keva.getRepo("add_yours_profile_guide");
        if (repo.getBoolean("has_click_cancel", false) || repo.getBoolean("has_click_notice", false) || repo.getInt("auto_hide_count", 0) >= 3) {
            return false;
        }
        return System.currentTimeMillis() - repo.getLong("last_show_time", 0L) >= 259200000;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final Pair<String, String>[] LIZIZ(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs;
        String string;
        InteractStickerStruct next;
        AddYoursStickerStruct addYoursStickerStruct;
        if (aweme != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null) {
            Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
            while (true) {
                string = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getAddYoursStickerStruct() != null) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InteractStickerStruct interactStickerStruct = next;
            if (interactStickerStruct != null && (addYoursStickerStruct = interactStickerStruct.getAddYoursStickerStruct()) != null) {
                Pair<String, String>[] pairArr = new Pair[3];
                pairArr[0] = new Pair<>("is_add_yours", "1");
                Long topicId = addYoursStickerStruct.getTopicId();
                if (topicId != null) {
                    string = topicId.toString();
                }
                String str = "";
                if (string == null) {
                    string = "";
                }
                pairArr[1] = new Pair<>("add_yours_id", string);
                String text = addYoursStickerStruct.getText();
                if (text != null) {
                    str = text;
                }
                pairArr[2] = new Pair<>("add_yours_title", str);
                return pairArr;
            }
        }
        return new Pair[]{new Pair<>("is_add_yours", CardStruct.IStatusCode.DEFAULT)};
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final C0OFL LJI(final Context context) {
        if (!C304900BxI.LIZ() || this == null) {
            return null;
        }
        return new C0OFL(context) { // from class: X.0OFF
            public final FavoriteTabItemV2 LLILLJJLI;

            @Override // X.C0OFL
            public final FavoriteTabItemV2 LIZ() {
                return this.LLILLJJLI;
            }

            {
                this.LLILLJJLI = new FavoriteTabItemV2(new AddYoursServiceImpl.AddYoursCollectionListPageData(), context.getString(2131825077), "add_yours", "questions");
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onCollectEvent(C0NKE c0nke) {
                if (c0nke.LIZIZ != EnumC615090OAp.COLLECT) {
                    return;
                }
                int collectStatus = c0nke.LIZ.getCollectStatus();
                if (collectStatus != 0) {
                    if (collectStatus == 1) {
                        C0OFL.LIZLLL(this.LL, 1);
                        return;
                    }
                    return;
                }
                C0OFL.LIZIZ(this.LL);
            }
        };
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final Object LJIIIZ(Aweme aweme, Object obj) {
        List<InteractStickerStruct> interactStickerStructs;
        String string;
        InteractStickerStruct next;
        AddYoursStickerStruct addYoursStickerStruct;
        if (aweme != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null) {
            Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
            while (true) {
                string = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getAddYoursStickerStruct() != null) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InteractStickerStruct interactStickerStruct = next;
            if (interactStickerStruct != null && (addYoursStickerStruct = interactStickerStruct.getAddYoursStickerStruct()) != null) {
                LJIILL(obj, "is_add_yours", "1");
                Long topicId = addYoursStickerStruct.getTopicId();
                if (topicId != null) {
                    string = topicId.toString();
                }
                String str = "";
                if (string == null) {
                    string = "";
                }
                LJIILL(obj, "add_yours_id", string);
                String text = addYoursStickerStruct.getText();
                if (text != null) {
                    str = text;
                }
                LJIILL(obj, "add_yours_title", str);
                return obj;
            }
        }
        LJIILL(obj, "is_add_yours", CardStruct.IStatusCode.DEFAULT);
        return obj;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final Object LJIIJ(String str, InterfaceC1364105Vn<? super AddYoursStickerStruct> interfaceC1364105Vn) {
        AddYoursStickerManager.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getStickerByTopicText, text=");
        sbLIZ.append(str);
        C1720106oR.LJI("AddYoursStickerManager", C2188811AlT.LIZIZ(sbLIZ));
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C2188908hr(false, new C259800zU(), str, null));
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final Object LJIIL(long j, InterfaceC1364105Vn<? super AddYoursStickerStruct> interfaceC1364105Vn) {
        AddYoursStickerManager.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAddYoursStickerByQA, questionId=");
        sbLIZ.append(j);
        sbLIZ.append(", forceNet=");
        sbLIZ.append(false);
        C1720106oR.LJI("AddYoursStickerManager", C2188811AlT.LIZIZ(sbLIZ));
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C2188808hq(false, new C259800zU(), j, null));
    }

    public static void LJIILL(Object obj, String str, String str2) {
        Object objPut;
        try {
            if (obj instanceof AbstractC1386130mAt) {
                AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) obj;
                abstractC1386130mAt.getClass();
                abstractC1386130mAt.LJFF(str, str2, InterfaceC1210900hcG.LIZ);
                objPut = abstractC1386130mAt;
            } else if (obj instanceof C2241008qG) {
                C2241008qG c2241008qG = (C2241008qG) obj;
                c2241008qG.LIZ.put(str, str2);
                objPut = c2241008qG;
            } else if (obj instanceof C2344009Gk) {
                C2344009Gk c2344009Gk = (C2344009Gk) obj;
                c2344009Gk.getClass();
                c2344009Gk.LJIIIIZZ(str, str2);
                objPut = c2344009Gk;
            } else if (obj instanceof JSONObject) {
                objPut = ((JSONObject) obj).put(str, str2);
            } else {
                objPut = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(objPut);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LIZ(C0TGX c0tgx, ViewStub viewStub, C19EG c19eg) {
        PopupManager.LJIJI(new C634160Ou6(c0tgx, viewStub, c19eg), true);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LIZLLL(C19EG c19eg, Aweme aweme, AddYourRecordParam addYourRecordParam) {
        ((IAddYoursStickerRecordService) ServiceManager.get().getService(IAddYoursStickerRecordService.class)).LIZ(c19eg, aweme, addYourRecordParam).LJFF();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C19EG r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            if (r6 != 0) goto L6
            return
        L6:
            if (r5 == 0) goto L6f
            int r1 = r5.hashCode()
            r0 = -2113244387(0xffffffff820a731d, float:-1.0171675E-37)
            if (r1 == r0) goto L64
            r0 = -1895514253(0xffffffff8f04bf73, float:-6.544974E-30)
            if (r1 == r0) goto L59
            r0 = -1795956819(0xffffffff94f3dfad, float:-2.4624954E-26)
            if (r1 != r0) goto L6f
            java.lang.String r0 = "add_yours_card"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L6f
            java.lang.String r2 = "add_yours_icon"
        L25:
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "open eoy h5, enterMethod: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " mapped enterFrom: "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r6)
            java.lang.String r0 = "&enter_from="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r4, r0)
            r0.open()
            return
        L59:
            java.lang.String r0 = "click_eoy_banner"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L6f
            java.lang.String r2 = "add_yours_banner"
            goto L25
        L64:
            java.lang.String r0 = "detail_page_shoot"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L6f
            java.lang.String r2 = "add_yours_shoot"
            goto L25
        L6f:
            java.lang.String r2 = "addyours_other"
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.service.AddYoursServiceImpl.LJFF(X.19EG, java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final Object LIZJ(long j, String str, List list, C344460Deu c344460Deu) throws Throwable {
        Object objLJI = C23250099c.LJI(c344460Deu, C0PEM.LIZJ, new C2188508hn(j, str, list, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJ(Context context, Aweme aweme, TextExtraStruct textExtraStruct, String str) {
        String userId;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
        String secUid = null;
        if (textExtraStruct != null) {
            userId = textExtraStruct.getUserId();
        } else {
            userId = null;
        }
        smartRouteBuildRoute.withParam("uid", userId);
        if (textExtraStruct != null) {
            secUid = textExtraStruct.getSecUid();
        }
        smartRouteBuildRoute.withParam("sec_user_id", secUid);
        smartRouteBuildRoute.withParam("profile_from", "video_at");
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("video_id", aweme.getAid());
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final AddYoursNoticeVideosResp LJIILIIL(int i, long j, long j2, String str) {
        return C2188608ho.LIZ().getTopicParticipants(j, j2, i, str).execute().LIZIZ;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJIIJJI(Context context, Bundle bundle, String str, String str2, String str3) {
        if (C304900BxI.LIZ()) {
            String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
            C730000SkI.LIZIZ.LIZIZ(1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("//add_yours/hub/");
            sbLIZ.append(curUserId);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
            smartRouteBuildRoute.withParam("show_topic_detail", 1);
            smartRouteBuildRoute.withParam("topic_id", str);
            smartRouteBuildRoute.withParam("is_from_qa", true);
            smartRouteBuildRoute.withParam("enter_method", "qa_share");
            smartRouteBuildRoute.withParam("enter_from", str3);
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.open();
            return;
        }
        C1233040iBy c1233040iBy = new C1233040iBy(context);
        c1233040iBy.LIZIZ(2131845725);
        c1233040iBy.LIZLLL();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJIILJJIL(Context context, AddYoursTopic addYoursTopic, Aweme aweme, Integer num, List<AddYoursAvatar> list, boolean z, String str, String str2, int i, String str3) {
        AddYoursAvatar[] addYoursAvatarArr;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//addyours/topic_detail");
        smartRouteBuildRoute.withParam("topic", addYoursTopic);
        smartRouteBuildRoute.withParam("from_aweme", aweme);
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("follow_status", num);
        if (list != null) {
            addYoursAvatarArr = (AddYoursAvatar[]) list.toArray(new AddYoursAvatar[0]);
        } else {
            addYoursAvatarArr = null;
        }
        smartRouteBuildRoute.withParam("user_avatars", addYoursAvatarArr);
        smartRouteBuildRoute.withParam("category_name", str2);
        smartRouteBuildRoute.withParam("entrance_category", i);
        smartRouteBuildRoute.withParam("is_from_qa_sticker", z);
        smartRouteBuildRoute.withParam("viewed_user_id", str3);
        smartRouteBuildRoute.open();
    }
}
