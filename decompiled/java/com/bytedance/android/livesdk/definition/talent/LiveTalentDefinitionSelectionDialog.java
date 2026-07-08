package com.bytedance.android.livesdk.definition.talent;

import X.C0IJT;
import X.C0IL2;
import X.C1161920gLG;
import X.C13BV;
import X.C15438062q;
import X.C2097908Jt;
import X.C418440Gaw;
import X.C465450INb;
import X.C465470INd;
import X.C465500INg;
import X.C474500IjA;
import X.C475510Ikn;
import X.C786410Ut5;
import X.C814420VxA;
import X.C930940aKi;
import X.InterfaceC480510Isr;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveShowResolutionSelectionSetting;
import com.bytedance.android.livesdk.performance.PerformanceManagerImpl;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveTalentDefinitionSelectionDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LCAqICE6PCwjJ2EnHELIOSKSkpJzt9BCw6LBsyJCAiPQs2LiwiIDs6JysfLCM2KzElJiEXISQgJig=";
    public View LLJLLL;
    public RecyclerView LLJZ;
    public View LLJZIJLIL;
    public String LLLFF;
    public int LLL = -1;
    public int LLLF = -1;
    public String LLLFFI = "click_outside";

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        String str = this.LLLFF;
        if (str == null) {
            return;
        }
        String str2 = this.LLLFFI;
        int i = this.LLL;
        int i2 = this.LLLF;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_manual_videoquality_event");
        int i3 = i2 - i;
        String str3 = i3 > 0 ? "upgrade" : i3 < 0 ? "downgrade" : "no_change";
        c474500IjALIZ.LJJII(C465500INg.LIZ, "manual_videoquality_sid");
        c474500IjALIZ.LJJII("close_panel", "manual_videoquality_action_type");
        c474500IjALIZ.LJJII(str, "selected_quality");
        c474500IjALIZ.LJJII(str3, "quality_delta");
        c474500IjALIZ.LJJII(str2, "close_method");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.draggable = false;
        sheetOptions.cancelable = true;
        sheetOptions.cornerRadius = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        return sheetOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable] */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Room room;
        ?? arrayList;
        String lowerCase;
        String currentResolution;
        StreamUrl streamUrl;
        LinkedList<LiveCoreSDKData.Quality> linkedList;
        int i;
        super.onViewCreated(view, bundle);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_manual_videoquality_event");
        c474500IjALIZ.LJIIIIZZ();
        C465500INg.LIZ = UUID.randomUUID().toString();
        PerformanceManagerImpl performanceManagerImplRs = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).Rs();
        String str = C465500INg.LIZ;
        performanceManagerImplRs.LLLLLL = str;
        c474500IjALIZ.LJJII(str, "manual_videoquality_sid");
        c474500IjALIZ.LJJII("videoquality_entry_exposed", "manual_videoquality_action_type");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        this.LLJZ = (RecyclerView) view.findViewById(R.id.yug);
        this.LLJZIJLIL = view.findViewById(R.id.yue);
        View viewFindViewById = view.findViewById(R.id.yuf);
        this.LLJLLL = viewFindViewById;
        if (viewFindViewById != null) {
            if (LiveShowResolutionSelectionSetting.INSTANCE.needPersistAcrossRooms()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        }
        View view2 = this.LLJZIJLIL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 52), view2);
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        ArrayList<C465470INd> arrayList2 = new ArrayList();
        if (((dataChannelLJ != null && (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) != null) || (room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) != null) && (streamUrl = room.getStreamUrl()) != null && (linkedList = streamUrl.qualityList) != null) {
            arrayList = new ArrayList();
            for (LiveCoreSDKData.Quality quality : linkedList) {
                String str2 = quality.sdkKey;
                if (str2 != null && !a0.LJJJIL(str2)) {
                    arrayList.add(quality);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        String str3 = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str3);
        if (interfaceC480510IsrLIZIZ != null && (currentResolution = interfaceC480510IsrLIZIZ.getCurrentResolution()) != null) {
            str4 = currentResolution;
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (LiveCoreSDKData.Quality quality2 : arrayList) {
            C465470INd c465470INd = new C465470INd(quality2);
            boolean zLJFF = Intrinsics.LJFF(str4, quality2.sdkKey);
            c465470INd.LIZLLL = zLJFF;
            if (zLJFF) {
                this.LLLFF = quality2.sdkKey;
                int i2 = quality2.level;
                this.LLLF = i2;
                this.LLL = i2;
            }
            arrayList3.add(Boolean.valueOf(arrayList2.add(c465470INd)));
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList2, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C465470INd c465470INd2 : arrayList2) {
            String str5 = c465470INd2.LIZIZ;
            if (str5 != null) {
                lowerCase = str5.toLowerCase(Locale.ROOT);
            } else {
                lowerCase = null;
            }
            Pair pair = new Pair(lowerCase, c465470INd2.LIZ);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        C465450INb c465450INb = new C465450INb(this.LLJZ, arrayList2, linkedHashMap, new AwS621S0100000_7(this, 6));
        RecyclerView recyclerView = this.LLJZ;
        if (recyclerView != null) {
            recyclerView.setAdapter(c465450INb);
        }
        RecyclerView recyclerView2 = this.LLJZ;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hq4, viewGroup, false);
    }
}
