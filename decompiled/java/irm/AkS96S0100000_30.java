package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0T1R;
import X.C0XS4;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1189060h32;
import X.C1212040he6;
import X.C123100dR;
import X.C1388190mED;
import X.C13LP;
import X.C14VI;
import X.C14VJ;
import X.C14VK;
import X.C14VL;
import X.C14VM;
import X.C14VO;
import X.C14VR;
import X.C1697810uHb;
import X.C1862330yYx;
import X.C19EG;
import X.C2189821An6;
import X.C442110HVh;
import X.InterfaceC1302070jzJ;
import X.InterfaceC1387820mDc;
import X.InterfaceC1432560nNm;
import X.InterfaceC836750Ws5;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.t0;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.poi.commonalbum.model.AlbumTrackParams;
import com.ss.android.ugc.aweme.poi.commonalbum.ui.LocalServiceTakePhotoCell;
import com.ss.android.ugc.aweme.poi.commonalbum.viewmodel.LocalServiceAlbumVM;
import com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoTopBarAssem;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS644S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public class AkS96S0100000_30 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public AkS96S0100000_30(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AkS96S0100000_30 akS96S0100000_30, View view) {
        String str;
        String aid;
        DetailNavArgModel navArgModel;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        Aweme awemeLJIIIIZZ;
        InterfaceC1302070jzJ interfaceC1302070jzJ = (InterfaceC1302070jzJ) ((TakoAIVideoTopBarAssem) akS96S0100000_30.l0).LLJIJIL.getValue();
        if (interfaceC1302070jzJ != null) {
            boolean z = !interfaceC1302070jzJ.LJFF();
            interfaceC1302070jzJ.LIZ(z);
            ((TakoAIVideoTopBarAssem) akS96S0100000_30.l0).Jo(z);
            TakoAIVideoTopBarAssem takoAIVideoTopBarAssem = (TakoAIVideoTopBarAssem) akS96S0100000_30.l0;
            takoAIVideoTopBarAssem.LLJJIJIL = true;
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String strLo = takoAIVideoTopBarAssem.Lo();
            String str2 = (String) takoAIVideoTopBarAssem.LLJILJILJ.getValue();
            String strNo = takoAIVideoTopBarAssem.No();
            String strSo = takoAIVideoTopBarAssem.So();
            if (z) {
                str = "click_mute";
            } else {
                str = "click_unmute";
            }
            Fragment fragment = takoAIVideoTopBarAssem.getPanelContext().LJ;
            String takoVideoSessionId = null;
            if (fragment != null && (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragment)) != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbilityLIZJ.LJIIIIZZ()) != null) {
                aid = awemeLJIIIIZZ.getAid();
            } else {
                aid = null;
            }
            C2189821An6 c2189821An6 = takoAIVideoTopBarAssem.getPanelContext().LIZJ;
            if (c2189821An6 != null && (navArgModel = c2189821An6.getNavArgModel()) != null) {
                takoVideoSessionId = navArgModel.getTakoVideoSessionId();
            }
            C1862330yYx.LLF(c1862330yYx, strLo, str2, strNo, strSo, null, null, null, "tako_video", str, aid, takoVideoSessionId, takoAIVideoTopBarAssem.Ho(), 12400);
            ((TakoAIVideoTopBarAssem) akS96S0100000_30.l0).Zo();
            if (z) {
                TakoAIVideoTopBarAssem takoAIVideoTopBarAssem2 = (TakoAIVideoTopBarAssem) akS96S0100000_30.l0;
                takoAIVideoTopBarAssem2.getClass();
                C1212040he6.LIZIZ(2131822563, takoAIVideoTopBarAssem2.LLJILLL);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [X.14VO] */
    public static final void LIZ$1(AkS96S0100000_30 akS96S0100000_30, View view) {
        Map<String, String> map;
        String str;
        C19EG c19egLIZIZ;
        String str2;
        Object baseContext;
        C14VL c14vl;
        Context context;
        AlbumTrackParams albumTrackParams;
        int iZQ2 = ((LocalServiceTakePhotoCell) akS96S0100000_30.l0).I5().zQ2();
        boolean zYQ2 = ((LocalServiceTakePhotoCell) akS96S0100000_30.l0).I5().yQ2();
        String strXQ2 = ((LocalServiceTakePhotoCell) akS96S0100000_30.l0).I5().xQ2();
        PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ((LocalServiceTakePhotoCell) akS96S0100000_30.l0));
        C442110HVh c442110HVh = ((LocalServiceTakePhotoCell) akS96S0100000_30.l0).I5().LLJI;
        String str3 = null;
        if (c442110HVh != null && (albumTrackParams = c442110HVh.LJFF) != null) {
            map = albumTrackParams.generalMobParams;
        } else {
            map = null;
        }
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null && (!map.isEmpty())) {
            linkedHashMap.putAll(map);
        }
        C1189060h32.LJJ("eligible_post_image_cnt", String.valueOf(iZQ2), linkedHashMap);
        if (zYQ2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C1189060h32.LJJ("is_camera_available", str, linkedHashMap);
        C1189060h32.LJJ("album_available_type", strXQ2, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_album_shoot_click", linkedHashMap, c1185050gwZ);
        C442110HVh c442110HVh2 = ((LocalServiceTakePhotoCell) akS96S0100000_30.l0).I5().LLJI;
        View view2 = ((LocalServiceTakePhotoCell) akS96S0100000_30.l0).itemView;
        if (view2 != null && (context = view2.getContext()) != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        List listLJIILJJIL = C1697810uHb.LJIILJJIL("image");
        if (c442110HVh2 != null) {
            str2 = c442110HVh2.LIZLLL;
        } else {
            str2 = null;
        }
        if (!C123100dR.LIZ(str2) || str2 == null) {
            str2 = "back";
        }
        C14VK c14vk = new C14VK(listLJIILJJIL, "camera", 1, true, false, str2, 216, 384, 0, false, 0, 0, false, 0, 0, false, false);
        ?? r9 = new C14VR() { // from class: X.14VO
            @Override // X.C14VR
            public final void onFailure() {
            }

            @Override // X.C14VR
            public final void onSuccess() {
            }
        };
        LocalServiceAlbumVM localServiceAlbumVMI5 = ((LocalServiceTakePhotoCell) akS96S0100000_30.l0).I5();
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6((LocalServiceTakePhotoCell) akS96S0100000_30.l0, 518);
        if (c19egLIZIZ != null) {
            WeakReference weakReference = new WeakReference(c19egLIZIZ);
            final C14VJ c14vj = new C14VJ(weakReference, new AwS609S0100000_30((C14VO) r9, 280), new AwS644S0100000_30((C14VO) r9, 45));
            Activity activityLIZ = C0XS4.LIZ((Context) weakReference.get());
            c14vj.LLILZ = localServiceAlbumVMI5;
            c14vj.LLILZIL = awS550S0100000_6;
            if (activityLIZ instanceof t0) {
                baseContext = activityLIZ.getBaseContext();
            } else {
                baseContext = activityLIZ;
            }
            if (baseContext instanceof InterfaceC836750Ws5) {
                ((InterfaceC836750Ws5) baseContext).setActivityResultListener(c14vj);
            } else if (baseContext instanceof InterfaceC1432560nNm) {
                ((InterfaceC1432560nNm) baseContext).KF(new InterfaceC1387820mDc() { // from class: X.14VN
                    @Override // X.InterfaceC1387820mDc
                    public final void onActivityResult(int i, int i2, Intent intent) {
                        c14vj.onActivityResult(i, i2, intent);
                    }
                });
            } else {
                c14vj.LIZ(1, "Failed to find proper activity");
                return;
            }
            WeakReference weakReference2 = new WeakReference(activityLIZ);
            List<String> list = c14vk.mediaTypes;
            if (list != null) {
                str3 = (String) C13LP.LJJJLZIJ(0, list);
            }
            String str4 = c14vk.sourceType;
            C14VL.Companion.getClass();
            if (str3 != null && str4 != null) {
                Locale locale = Locale.ROOT;
                if (Intrinsics.LJFF(str3.toLowerCase(locale), "image") && Intrinsics.LJFF(str4.toLowerCase(locale), "camera")) {
                    c14vl = C14VL.TAKE_PHOTO;
                } else if (Intrinsics.LJFF(str3.toLowerCase(locale), "image") && Intrinsics.LJFF(str4.toLowerCase(locale), "album")) {
                    c14vl = C14VL.PICK_PHOTO_FROM_ALBUM;
                } else if (Intrinsics.LJFF(str3.toLowerCase(locale), "video") && Intrinsics.LJFF(str4.toLowerCase(locale), "camera")) {
                    c14vl = C14VL.TAKE_VIDEO;
                } else if (Intrinsics.LJFF(str3.toLowerCase(locale), "video") && Intrinsics.LJFF(str4.toLowerCase(locale), "album")) {
                    c14vl = C14VL.PICK_VIDEO_FROM_ALBUM;
                } else {
                    c14vl = C14VL.UNSUPPORTED;
                }
            } else {
                c14vl = C14VL.UNSUPPORTED;
            }
            if (c14vl == C14VL.UNSUPPORTED) {
                c14vj.LIZ(5, "Invalid fileType and sourceType in params");
            } else {
                if (C14VM.LIZ[c14vl.ordinal()] != 1) {
                    return;
                }
                C14VI c14vi = new C14VI(weakReference2, c14vj);
                c14vj.LLILLL = c14vi;
                c14vi.LIZ(c14vk, localServiceAlbumVMI5);
            }
        }
    }

    public static final void LIZ$2(AkS96S0100000_30 akS96S0100000_30, View view) {
        Function0 function0 = (Function0) akS96S0100000_30.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
