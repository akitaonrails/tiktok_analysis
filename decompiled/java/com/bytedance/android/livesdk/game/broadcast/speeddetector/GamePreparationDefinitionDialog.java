package com.bytedance.android.livesdk.game.broadcast.speeddetector;

import X.C0IJT;
import X.C0TKK;
import X.C0UT0;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1119170fEJ;
import X.C1338270kvh;
import X.C168W;
import X.C19370910qR;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C772710USv;
import X.C772730USx;
import X.C772740USy;
import X.C786410Ut5;
import X.EnumC1284950jXh;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationDefinitionDialogAlive;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationPageDestroyEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerGameSettings;
import com.bytedance.android.livesdk.livesetting.game.TtliveGameEnableCategoryGearsSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class GamePreparationDefinitionDialog extends LiveSheetFragment implements C0UT0 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyOzFiHELIOSOj82LSEoLDs2KzEjO2EUKSgpGT02OCQ+KDs6JysILCk6Jiw4ICA9DCwtJSA0";
    public ConstraintLayout LLJLLL;
    public RecyclerView LLJZ;
    public C772730USx LLJZIJLIL;

    @Override // X.C0UT0
    public final void e3() {
        close(1);
    }

    public static List uS() {
        PushStreamInfo pushStreamInfo;
        List<PushStreamInfo.Quality> listLJ;
        ArrayList<PushStreamInfo.Quality> arrayList;
        String str;
        String str2;
        ArrayList arrayList2 = new ArrayList();
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) DataChannelGlobal.LLILZ.gg0(C168W.class);
        if (roomCreateInfo != null) {
            Map<Long, PushStreamInfo> map = roomCreateInfo.pushStreamInfoMap;
            if (map != null && (pushStreamInfo = map.get(4L)) != null) {
                if (TtliveGameEnableCategoryGearsSetting.INSTANCE.isEnable()) {
                    EnumC1284950jXh enumC1284950jXh = C19370910qR.LIZ;
                    listLJ = C19370910qR.LJ(pushStreamInfo.multiQualities);
                } else {
                    listLJ = pushStreamInfo.qualityList;
                }
                if (listLJ != null) {
                    arrayList = new ArrayList();
                    for (PushStreamInfo.Quality quality : listLJ) {
                        PushStreamInfo.Quality quality2 = quality;
                        if (!a0.LJJIIZI(quality2.sdkKey, "auto", false) && (str2 = quality2.sdkKey) != null && !a0.LJJJIL(str2)) {
                            arrayList.add(quality);
                        }
                    }
                } else {
                    arrayList = null;
                }
                PushStreamInfo.Quality quality3 = (PushStreamInfo.Quality) DataChannelGlobal.LLILZ.gg0(BroadcastShareScreenDefinition.class);
                if (quality3 == null || (str = quality3.sdkKey) == null) {
                    str = "";
                }
                String strLIZ = TTLHVideoQualityStrategyManagerGameSettings.INSTANCE.enabledStrategyCenter() ? C772710USv.LIZ() : null;
                Map<String, Object> map2 = C1338270kvh.LIZ;
                if (arrayList != null) {
                    for (PushStreamInfo.Quality quality4 : arrayList) {
                        C772740USy c772740USy = new C772740USy(quality4);
                        c772740USy.LIZLLL = C500260Jjc.LJJIIZ(str) && Intrinsics.LJFF(str, quality4.sdkKey);
                        c772740USy.LJ = C500260Jjc.LJJIIZ(strLIZ) && Intrinsics.LJFF(strLIZ, quality4.sdkKey);
                        arrayList2.add(c772740USy);
                    }
                }
                Map<String, Object> map3 = C1338270kvh.LIZ;
            }
        }
        return arrayList2;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131840775));
        return c1119170fEJ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zW(GamePreparationDefinitionDialogAlive.class, Boolean.FALSE);
        }
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zW(GamePreparationDefinitionDialogAlive.class, Boolean.TRUE);
        }
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/livesdk/game/broadcast/speeddetector/GamePreparationDefinitionDialog", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5O8hiJ8XnJH7IOh2ClEoql8SBxkkym27PxNyccfBzfT1GgXe7DV8xdni5fP4a", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (!z) {
            C0TKK.LIZJ("quality_setting");
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        Map<String, Object> map = C1338270kvh.LIZ;
        C0TKK.LIZJ("quality_setting");
        this.LLJLLL = (ConstraintLayout) view.findViewById(R.id.yp2);
        if (TTLHVideoQualityStrategyManagerGameSettings.INSTANCE.enabledStrategyCenter()) {
            ConstraintLayout constraintLayout = this.LLJLLL;
            if (constraintLayout != null) {
                C786410Ut5.LL(0, constraintLayout);
            }
            ConstraintLayout constraintLayout2 = this.LLJLLL;
            if (constraintLayout2 != null) {
                C786410Ut5.Y7(constraintLayout2, new ACListenerS147S0100000_12(this, 196));
            }
        } else {
            ConstraintLayout constraintLayout3 = this.LLJLLL;
            if (constraintLayout3 != null) {
                C786410Ut5.LL(8, constraintLayout3);
            }
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(this, GamePreparationPageDestroyEvent.class, new AwS591S0100000_12(this, 986));
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.EQ2(this, this, BroadcastShareScreenDefinition.class, new AwS591S0100000_12(this, 541));
        PushStreamInfo.Quality quality = (PushStreamInfo.Quality) dataChannelGlobal.gg0(BroadcastShareScreenDefinition.class);
        if (quality == null || (str = quality.sdkKey) == null) {
            str = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_definition_selection_page_show");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "current_definition");
        c474500IjALIZ.LJJ("screen_share");
        c474500IjALIZ.LIZ();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.yp1);
        this.LLJZ = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        }
        C772730USx c772730USx = new C772730USx(this, this.LLJZ, uS(), C475510Ikn.LJ(this), this);
        this.LLJZIJLIL = c772730USx;
        RecyclerView recyclerView2 = this.LLJZ;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(c772730USx);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g70, viewGroup, false);
    }
}
