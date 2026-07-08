package com.bytedance.android.livesdk.revenue.level.api.service;

import X.C006A;
import X.C1094590eaf;
import X.C1094950ebF;
import X.C1095110ebV;
import X.C1095140ebY;
import X.C1117530fBf;
import X.C419430GcX;
import X.C419440GcY;
import X.InterfaceC1095350ebt;
import X.InterfaceC1096360edW;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS135S0110000_17;
import org.json.JSONObject;
import webcast.data.FansLevelInfo;
import webcast.data.SubSplitStatus;

/* JADX INFO: loaded from: classes18.dex */
public interface IFansClubService extends C006A {
    int AR(List<BadgeStruct> list);

    boolean Ag1();

    boolean Bo1(String str, String str2, String str3);

    void C11();

    boolean C71(int i, int i2);

    void Fr0(String str);

    void Gy1();

    boolean HO(String str, String str2, String str3);

    boolean HZ1(long j);

    long Ib1();

    void Iy2();

    Map JA(Room room, DataChannel dataChannel, boolean z);

    boolean Kw0(DataChannel dataChannel);

    void LA2();

    void Mq2(int i, long j, long j2);

    void OF0(SparkContext sparkContext, String str);

    Class<? extends LiveRecyclableWidget> PH();

    void Pf0(long j, AwS135S0110000_17 awS135S0110000_17, AFwS205S0000000_17 aFwS205S0000000_17);

    Fragment Qn0(String str);

    void RL1(String str);

    void RV0(String str);

    void S30(Gift gift, Long l);

    C419440GcY SR1(Context context);

    void St1(Context context, C1094590eaf c1094590eaf);

    boolean TL0();

    void Ux2(DataChannel dataChannel, String str, long j, long j2, String str2, JSONObject jSONObject);

    void VN2(Context context, C1094590eaf c1094590eaf);

    boolean VV0(String str);

    C419430GcX WL2(Context context);

    void Wt2();

    int Wy2(int i);

    void c30(DataChannel dataChannel, Context context);

    boolean c70();

    void cT1(BadgeStruct badgeStruct, BadgeStruct badgeStruct2);

    void de1(Long l, Long l2);

    void eG(long j, long j2, C1095110ebV c1095110ebV);

    void eS1(DataChannel dataChannel, String str, Map map, boolean z);

    FansEntranceResConfig gY(int i);

    void i31(String str, boolean z);

    ArrayList<Double> i42();

    boolean iA2(boolean z);

    boolean il0();

    boolean kI1(DataChannel dataChannel);

    void lI2();

    void n52(String str, String str2);

    void nk1();

    boolean oS0();

    boolean pY1(SubSplitStatus subSplitStatus);

    RoomRecycleWidget pa2();

    void qH(double d);

    ImageModel qf1(long j);

    InterfaceC1096360edW qj0(boolean z, ViewGroup viewGroup, InterfaceC1095350ebt interfaceC1095350ebt, LifecycleOwner lifecycleOwner, DataChannel dataChannel);

    void rQ0(Context context, DataChannel dataChannel);

    void sp1(Context context);

    C1095140ebY tL1(User user);

    C1095140ebY uw0();

    void wQ(double d);

    boolean wd2();

    void we2();

    void wo0(FansLevelInfo fansLevelInfo, long j, long j2, long j3, String str);

    void wq1(long j, C1117530fBf c1117530fBf, AFwS205S0000000_17 aFwS205S0000000_17);

    C1094950ebF y51(long j);

    boolean z90(ImageModel imageModel, String str, String str2, String str3, String str4);
}
