package com.ss.android.ugc.aweme.live.jsb;

import X.C13LP;
import X.InterfaceC1041760dDS;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class LiveMethod extends BaseCommonJavaMethod {
    public final WeakReference<Context> LLILLL;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public LiveMethod(WeakReference<Context> weakReference, IESJsBridge iESJsBridge) {
        super(iESJsBridge);
        this.LLILLL = weakReference;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "room_id_list");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(Long.valueOf(CastLongProtector.parseLong(jSONArray.get(i).toString())));
            }
            long j = CastLongProtector.parseLong(JSONObjectProtectorUtils.getString(jSONObject, "current_room_id"));
            String string = JSONObjectProtectorUtils.getString(jSONObject, "enter_from");
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.roomId = j;
            roomsData.enterFromMerge = string;
            roomsData.roomIds = C13LP.LLIIIILZ(arrayList);
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().watchLive(this.LLILLL.get(), enterRoomConfig);
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.onSuccess(null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZ(-1, e.getMessage());
            }
        }
    }
}
