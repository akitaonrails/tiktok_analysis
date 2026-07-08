package com.ss.android.ugc.aweme.live.spi.dummy;

import X.AbstractC464380IIy;
import X.C08MM;
import X.C0IEG;
import X.C0IES;
import X.C0IFS;
import X.C0IKH;
import X.C0K8N;
import X.C0UU6;
import X.C0UU9;
import X.C1050980dSK;
import X.C1106210etP;
import X.C11NZ;
import X.C1295960jpS;
import X.C1322110kVd;
import X.C1349210lDL;
import X.C1589100rSG;
import X.C1803830x2b;
import X.C1807570x8d;
import X.C180W;
import X.C1913190zsz;
import X.C19660711w5;
import X.C19660911w7;
import X.C19661011w8;
import X.C19EG;
import X.C1AA6;
import X.C1AD1;
import X.C1AF7;
import X.C1AKI;
import X.C1AKM;
import X.C1AKN;
import X.C1AKO;
import X.C1AKR;
import X.C1AKS;
import X.C470590Icr;
import X.C472280Ifa;
import X.C473630Ihl;
import X.C481110Itp;
import X.C759930TrT;
import X.C760150Trp;
import X.C815960Vze;
import X.EnumC1805570x5P;
import X.EnumC19379710rr;
import X.EnumC464390IIz;
import X.EnumC469210Iad;
import X.InterfaceC1051760dTa;
import X.InterfaceC1087010eOR;
import X.InterfaceC1149850g1n;
import X.InterfaceC1210360hbO;
import X.InterfaceC1210380hbQ;
import X.InterfaceC1253830ijV;
import X.InterfaceC1478005qU;
import X.InterfaceC1728700v5Q;
import X.InterfaceC1766280w42;
import X.InterfaceC1791930wjP;
import X.InterfaceC1806230x6T;
import X.InterfaceC1807610x8h;
import X.InterfaceC20313114e1;
import X.InterfaceC20673515v3;
import X.InterfaceC2175461ACa;
import X.InterfaceC2175511ACf;
import X.InterfaceC2175711ACz;
import X.InterfaceC2262081DgM;
import X.InterfaceC337570DLf;
import X.InterfaceC420801kM;
import X.InterfaceC468050IXb;
import X.InterfaceC468140IXk;
import X.InterfaceC468710IZp;
import X.InterfaceC469100IaS;
import X.InterfaceC469600IbG;
import X.InterfaceC472850IgV;
import X.InterfaceC480510Isr;
import X.InterfaceC480520Iss;
import X.InterfaceC482440Ivy;
import X.InterfaceC483310IxN;
import X.InterfaceC483370IxT;
import X.InterfaceC484900Izw;
import X.InterfaceC486670J6r;
import X.InterfaceC488740JEq;
import X.InterfaceC498680Jh4;
import X.InterfaceC662540Pym;
import X.InterfaceC773130UUl;
import X.InterfaceC782930UnT;
import Y.ARunnableS2S1000000_4;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.live.broadcast.model.SubmitSurveyAnswerRequest;
import com.bytedance.android.live.shorttouch.service.ShortTouchServiceDummy;
import com.bytedance.android.live.wallet.model.IapProductBuyParam;
import com.bytedance.android.live.wallet.model.IapProductGetParam;
import com.bytedance.android.livesdk.api.coin.incentive.ICoinIncentiveService;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.google.gson.n;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.json.JSONObject;
import webcast.api.room.LivePodcastResponse;
import webcast.api.room.NextLiveNoticeRegisterResponse;
import webcast.api.room.PreviewTimeReportResponse;
import webcast.api.sub.SubPriceChangeConfirmRequest;

/* JADX INFO: loaded from: classes34.dex */
public final class DummyILive implements InterfaceC20673515v3 {
    @Override // X.C1AKK
    public final void At(String str, String str2) {
    }

    @Override // X.C1AKK
    public final void Cw(SparkContext sparkContext) {
    }

    @Override // X.C1AKK
    public final boolean E5(String str, String str2, boolean z) {
        return false;
    }

    @Override // X.C1AKK
    public final boolean Eo() {
        return false;
    }

    @Override // X.C1AKK
    public final /* synthetic */ InterfaceC2175461ACa Hj() {
        return null;
    }

    @Override // X.C1AKK
    public final boolean Jv(String str) {
        return false;
    }

    @Override // X.C1AKK
    public final String LIZ() {
        return "null";
    }

    @Override // X.InterfaceC20673515v3
    public final void LIZIZ() {
    }

    @Override // X.C1AKK
    public final Object LIZJ(Object obj, String str) {
        return obj;
    }

    @Override // X.C1AKK
    public final boolean LIZLLL(Context context, String str) {
        return false;
    }

    @Override // X.InterfaceC20673515v3, X.C1AKK
    public final boolean LJ() {
        return false;
    }

    @Override // X.C1AKK
    public final InterfaceC420801kM LJI(String str, String str2, long j, InterfaceC472850IgV interfaceC472850IgV) {
        return null;
    }

    @Override // X.InterfaceC20673515v3
    public final int LJII() {
        return 0;
    }

    @Override // X.C1AKK
    public final void LJIIIZ(String str) {
    }

    @Override // X.C1AKK
    public final void LJIIJJI(FragmentManager fragmentManager, C1106210etP c1106210etP, boolean z) {
    }

    @Override // X.C1AKK
    public final void LJIIL() {
    }

    @Override // X.C1AKK
    public final ICoinIncentiveService LJIILIIL() {
        return null;
    }

    @Override // X.C1AKK
    public final void LJIILJJIL(int i, Context context) {
    }

    @Override // X.C1AKK
    public final void LJIILL(String str) {
    }

    @Override // X.C1AKK
    public final void LJIILLIIL(C1295960jpS c1295960jpS, Boolean bool) {
    }

    @Override // X.C1AKK
    public final void LJIIZILJ(boolean z) {
    }

    @Override // X.C1AKK
    public final int LJIJ() {
        return 0;
    }

    @Override // X.C1AKK
    public final String LJIJI() {
        return null;
    }

    @Override // X.C1AKK
    public final void LJIJJ(String str, Map<String, String> map) {
    }

    @Override // X.C1AKK
    public final boolean LJIJJLI(Uri uri) {
        return false;
    }

    @Override // X.C1AKK
    public final void LJIL(JSONObject jSONObject) {
    }

    @Override // X.InterfaceC20673515v3
    public final void LJJ(ArrayList<String> arrayList) {
    }

    @Override // X.C1AKK
    public final Spannable LJJI(Text text, String str) {
        return null;
    }

    @Override // X.C1AKK
    public final HashMap<String, String> LJJIFFI(EnterRoomConfig enterRoomConfig) {
        return null;
    }

    @Override // X.C1AKK
    public final IBillboardService LJJII() {
        return null;
    }

    @Override // X.C1AKK
    public final void LJJIIJ(List<String> list, C1322110kVd c1322110kVd, String str, String str2) {
    }

    @Override // X.C1AKK
    public final void LJJIIZI(Context context, n nVar, n nVar2, String str, String str2, List list, ARunnableS2S1000000_4 aRunnableS2S1000000_4) {
    }

    @Override // X.C1AKK
    public final boolean LJJIJ(Context context, Uri uri) {
        return false;
    }

    @Override // X.C1AKK
    public final String LJJIJIIJI() {
        return "";
    }

    @Override // X.C1AKK
    public final Fragment LJJIJIIJIL(Context context, C0K8N c0k8n, SubPriceChangeConfirmRequest subPriceChangeConfirmRequest, String str) {
        return null;
    }

    @Override // X.C1AKK
    public final void LJJIJIL(EnumC464390IIz enumC464390IIz, AbstractC464380IIy abstractC464380IIy) {
    }

    @Override // X.C1AKK
    public final void LJJIJL(LifecycleOwner lifecycleOwner) {
    }

    @Override // X.C1AKK
    public final void LJJIJLIJ() {
    }

    @Override // X.C1AKK
    public final void LJJIL() {
    }

    @Override // X.C1AKK
    public final EnterRoomConfig LJJIZ(Room room) {
        return null;
    }

    @Override // X.C1AKK
    public final void LJJJ(Context context, C1106210etP c1106210etP) {
    }

    @Override // X.C1AKK
    public final void LJJJI(long j, long j2) {
    }

    @Override // X.C1AKK
    public final void LJJJIL(List list) {
    }

    @Override // X.C1AKK
    public final void LJJJJI(String str) {
    }

    @Override // X.C1AKK
    public final int LJJJJIZL() {
        return 0;
    }

    @Override // X.C1AKK
    public final String LJJJJJ() {
        return null;
    }

    @Override // X.C1AKK
    public final void LJJJJL(InterfaceC469100IaS interfaceC469100IaS) {
    }

    @Override // X.C1AKK
    public final void LJJJJLI(C1349210lDL c1349210lDL) {
    }

    @Override // X.C1AKK
    public final InterfaceC488740JEq LJJJJLL(String str) {
        return null;
    }

    @Override // X.C1AKK
    public final /* synthetic */ String LJJJJZ(String str) {
        return "";
    }

    @Override // X.InterfaceC20673515v3
    public final long LJJJJZI() {
        return 0L;
    }

    @Override // X.C1AKK
    public final C1AKI LJJJLIIL() {
        return null;
    }

    @Override // X.C1AKK
    public final void LJJJLL() {
    }

    @Override // X.C1AKK
    public final void LJJJLZIJ(LifecycleOwner lifecycleOwner) {
    }

    @Override // X.C1AKK
    public final Context LJJJZ() {
        return null;
    }

    @Override // X.C1AKK
    public final InterfaceC1253830ijV LJJL() {
        return null;
    }

    @Override // X.C1AKK
    public final String LJJLI(String str) {
        return "";
    }

    @Override // X.C1AKK
    public final void LJJLIIIIJ(Context context, n nVar) {
    }

    @Override // X.C1AKK
    public final void LJJLIIIJ(Context context, long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Map map) {
    }

    @Override // X.C1AKK
    public final IMessageManager LJJLIIIJILLIZJL(long j, boolean z, Context context, boolean z2, boolean z3, EnumC19379710rr enumC19379710rr) {
        return null;
    }

    @Override // X.InterfaceC20673515v3
    public final LivePodcastResponse.ResponseData LJJLIIIJJI(boolean z) {
        return null;
    }

    @Override // X.C1AKK
    public final void LJJLIIIJJIZ(InterfaceC480510Isr interfaceC480510Isr, String str) {
    }

    @Override // X.C1AKK
    public final int LJJLIIIJL(Context context, DialogFragment dialogFragment, Bundle bundle, InterfaceC1149850g1n interfaceC1149850g1n) {
        return 0;
    }

    @Override // X.C1AKK
    public final void LJJLIIIJLJLI(Activity activity, C1106210etP c1106210etP) {
    }

    @Override // X.C1AKK
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.C1AKK
    public final void LJJLJ(Context context, String str) {
    }

    @Override // X.C1AKK
    public final void LJJLJLI() {
    }

    @Override // X.InterfaceC20673515v3
    public final boolean LJJLL(String str) {
        return false;
    }

    @Override // X.C1AKK
    public final void LJJZZIII() {
    }

    @Override // X.C1AKK
    public final String LJLI() {
        return null;
    }

    @Override // X.C1AKK
    public final IPcsService LJLIIIL() {
        return null;
    }

    @Override // X.C1AKK
    public final String LJLIIL() {
        return null;
    }

    @Override // X.C1AKK
    public final InterfaceC468050IXb LJLIL() {
        return null;
    }

    @Override // X.C1AKK
    public final void LJLILLLLZI(Context context, Room room, C1106210etP c1106210etP, C760150Trp c760150Trp, C481110Itp c481110Itp) {
    }

    @Override // X.C1AKK
    public final String LJLJI() {
        return "";
    }

    @Override // X.C1AKK
    public final CharSequence LJLJJI(User user) {
        return null;
    }

    @Override // X.C1AKK
    public final void LJLJJL() {
    }

    @Override // X.C1AKK
    public final InterfaceC420801kM LJLJJLL(Map map, C19661011w8 c19661011w8) {
        return null;
    }

    @Override // X.C1AKK
    public final /* synthetic */ InterfaceC2175511ACf LJLJL(C1AF7 c1af7) {
        return null;
    }

    @Override // X.C1AKK
    public final C1AKO LJLJLJ(C1AKN c1akn, Bundle bundle) {
        return null;
    }

    @Override // X.C1AKK
    public final Drawable LJLJLLL(String str) {
        return null;
    }

    @Override // X.C1AKK
    public final void LJLL() {
    }

    @Override // X.InterfaceC20673515v3
    public final boolean LJLLI() {
        return false;
    }

    @Override // X.C1AKK
    public final long LJLLILLLL(boolean z) {
        return 0L;
    }

    @Override // X.C1AKK
    public final void LJLLJ(C19EG c19eg, AwS560S0100000_16 awS560S0100000_16) {
    }

    @Override // X.C1AKK
    public final void LJLLL(C1913190zsz c1913190zsz) {
    }

    @Override // X.C1AKK
    public final /* synthetic */ void LJLLLL(Room room, String str, String str2, String str3, String str4, String str5, Map map) {
    }

    @Override // X.C1AKK
    public final void LJLLLLLL(long j, C1AA6 c1aa6) {
    }

    @Override // X.C1AKK
    public final C1AKO LJLZ(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle) {
        return null;
    }

    @Override // X.C1AKK
    public final void LJZ(int i, int i2, JSONObject jSONObject) {
    }

    @Override // X.C1AKK
    public final void LJZI(Context context, String str, String str2, Bundle bundle, DialogInterface.OnDismissListener onDismissListener) {
    }

    @Override // X.C1AKK
    public final String LJZL() {
        return "";
    }

    @Override // X.C1AKK
    public final String LL() {
        return null;
    }

    @Override // X.C1AKK
    public final void LLD() {
    }

    @Override // X.C1AKK
    public final String LLF(int i) {
        return "";
    }

    @Override // X.C1AKK
    public final InterfaceC420801kM LLFF(int i, long j, String str, C08MM c08mm) {
        return null;
    }

    @Override // X.C1AKK
    public final void LLFFF(EnumC1805570x5P enumC1805570x5P) {
    }

    @Override // X.C1AKK
    public final void LLFII(String str, C1AKM c1akm) {
    }

    @Override // X.C1AKK
    public final InterfaceC1791930wjP LLFZ() {
        return null;
    }

    @Override // X.C1AKK
    public final InterfaceC1728700v5Q LLI() {
        return null;
    }

    @Override // X.C1AKK
    public final Map<String, String> LLIFFJFJJ(Context context) {
        return null;
    }

    @Override // X.C1AKK
    public final InterfaceC420801kM LLII(int i, long j, int i2, C08MM c08mm) {
        return null;
    }

    @Override // X.C1AKK
    public final void LLIIIILZ(n nVar, String str, String str2) {
    }

    @Override // X.InterfaceC20673515v3
    public final String LLIIIJ() {
        return null;
    }

    @Override // X.C1AKK
    public final InterfaceC468140IXk LLIIIZ() {
        return null;
    }

    @Override // X.C1AKK
    public final void LLIIJI(Context context, C759930TrT c759930TrT) {
    }

    @Override // X.C1AKK
    public final void LLIIJLIL() {
    }

    @Override // X.C1AKK
    public final int LLIIL() {
        return 0;
    }

    @Override // X.C1AKK
    public final void LLIILII(String str) {
    }

    @Override // X.C1AKK
    public final InterfaceC1766280w42 LLIILZL() {
        return null;
    }

    @Override // X.C1AKK
    public final C180W LLIIZ() {
        return null;
    }

    @Override // X.C1AKK
    public final InterfaceC420801kM LLIL(SubmitSurveyAnswerRequest submitSurveyAnswerRequest, C19660711w5 c19660711w5) {
        return null;
    }

    @Override // X.C1AKK
    public final void LLILII(C815960Vze c815960Vze) {
    }

    @Override // X.C1AKK
    public final void LLILLIZIL(String str) {
    }

    @Override // X.C1AKK
    public final String LLILLJJLI() {
        return null;
    }

    @Override // X.C1AKK
    public final String LLILLL(Context context, EnterRoomConfig enterRoomConfig, long j) {
        return "";
    }

    @Override // X.C1AKK
    public final int LLILZIL(String str) {
        return 0;
    }

    @Override // X.C1AKK
    public final /* synthetic */ InterfaceC480520Iss LLILZLL() {
        return null;
    }

    @Override // X.C1AKK
    public final void LLIZ(List list, Map map) {
    }

    @Override // X.C1AKK
    public final void LLIZLLLIL(C1589100rSG c1589100rSG) {
    }

    @Override // X.InterfaceC20673515v3
    public final /* synthetic */ boolean LLJ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        return false;
    }

    @Override // X.C1AKK
    public final boolean LLJI() {
        return false;
    }

    @Override // X.InterfaceC20673515v3
    public final String[] LLJIJIL() {
        return new String[0];
    }

    @Override // X.C1AKK
    public final boolean LLJILJIL() {
        return false;
    }

    @Override // X.C1AKK
    public final void LLJILJILJ(String str) {
    }

    @Override // X.C1AKK
    public final boolean LLJILLL() {
        return false;
    }

    @Override // X.C1AKK
    public final /* synthetic */ InterfaceC480520Iss LLJJ(String str, boolean z) {
        return null;
    }

    @Override // X.C1AKK
    public final Bitmap LLJJI(float f, float f2, float f3, float f4) {
        return null;
    }

    @Override // X.C1AKK
    public final void LLJJIII(Activity activity, Boolean bool) {
    }

    @Override // X.C1AKK
    public final void LLJJIJI(Activity activity, String str, Map<String, String> map, Boolean bool) {
    }

    @Override // X.C1AKK
    public final boolean LLJJIJIIJIL() {
        return false;
    }

    @Override // X.InterfaceC20673515v3
    public final void LLJJIJIL(C1AD1 c1ad1) {
    }

    @Override // X.C1AKK
    public final InterfaceC483310IxN Lb() {
        return null;
    }

    @Override // X.C1AKK
    public final boolean Mn(String str) {
        return false;
    }

    @Override // X.InterfaceC20673515v3
    public final void N6(float f, float f2, float f3, float f4) {
    }

    @Override // X.C1AKK
    public final void Oa(C1106210etP c1106210etP) {
    }

    @Override // X.C1AKK
    public final void P4() {
    }

    @Override // X.C1AKK
    public final void T8(Map map) {
    }

    @Override // X.InterfaceC20673515v3
    public final void U5() {
    }

    @Override // X.C1AKK
    public final void W7(Context context) {
    }

    @Override // X.C1AKK
    public final InterfaceC1210380hbQ Xo() {
        return null;
    }

    @Override // X.C1AKK
    public final void Xp() {
    }

    @Override // X.C1AKK
    public final InterfaceC1210360hbO Ya() {
        return null;
    }

    @Override // X.C1AKK
    public final void Yg() {
    }

    @Override // X.C1AKK
    public final void Zg() {
    }

    @Override // X.C1AKK
    public final void Zq(String str) {
    }

    @Override // X.C1AKK
    public final void addLiveDuration(long j) {
    }

    @Override // X.C1AKK
    public final void advancePushStream() {
    }

    @Override // X.C1AKK
    public final void againHandlerBundle(JSONObject jSONObject) {
    }

    @Override // X.C1AKK
    public final boolean canRedirectRechargeV3() {
        return false;
    }

    @Override // X.InterfaceC20673515v3
    public final boolean canShowInternalWindow(Long l) {
        return false;
    }

    @Override // X.C1AKK
    public final void cleanEffectCache() {
    }

    @Override // X.C1AKK
    public final long cleanLiveUnimportantGecko(boolean z) {
        return 0L;
    }

    @Override // X.InterfaceC20673515v3
    public final void clearSafeZone() {
    }

    @Override // X.C1AKK
    public final InterfaceC337570DLf createLiveBroadcastEndSafetyToolsFragment(Bundle bundle) {
        return null;
    }

    @Override // X.C1AKK
    public final C1AKS createLiveBroadcastFragment(Context context, InterfaceC773130UUl interfaceC773130UUl, Bundle bundle) {
        return null;
    }

    @Override // X.C1AKK
    public final C0UU9 createLiveCoverCameraFragment() {
        return null;
    }

    @Override // X.C1AKK
    public final C1AKO createObsBroadcastFragment(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle) {
        return null;
    }

    @Override // X.C1AKK
    public final C1AKO createVoiceChatBroadcastFragment(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle) {
        return null;
    }

    @Override // X.C1AKK
    public final void cv() {
    }

    @Override // X.C1AKK
    public final void dn(Observer<User> observer) {
    }

    @Override // X.InterfaceC20673515v3
    public final void e0(Boolean bool) {
    }

    @Override // X.C1AKK
    public final boolean fi(String str) {
        return false;
    }

    @Override // X.C1AKK
    public final int getChargeSourceFromChargeFromHash(String str, int i) {
        return 0;
    }

    @Override // X.C1AKK
    public final InterfaceC2262081DgM getCurrentUser() {
        return null;
    }

    @Override // X.InterfaceC20673515v3
    public final int getInternalWindowState() {
        return -1;
    }

    @Override // X.C1AKK
    public final String getLiveCoreVersion() {
        return "";
    }

    @Override // X.C1AKK
    public final InterfaceC1051760dTa getLiveWalletJSBByName(String str, WeakReference<Context> weakReference, IESJsBridge iESJsBridge) {
        return null;
    }

    @Override // X.C1AKK
    public final C0UU6 getRequestControl() {
        return null;
    }

    @Override // X.C1AKK
    public final String getRtcDeviceID() {
        return null;
    }

    @Override // X.C1AKK
    public final String getRtcVersion() {
        return "null";
    }

    @Override // X.InterfaceC20673515v3
    public final int getScreenOrientation() {
        return 0;
    }

    @Override // X.C1AKK
    public final boolean handleSchema(Context context, String str, Bundle bundle) {
        return false;
    }

    @Override // X.C1AKK
    public final boolean handleWithoutHost(Context context, Uri uri, Map<String, String> map) {
        return false;
    }

    @Override // X.C1AKK
    public final void hasLopBubbleForLog(int i) {
    }

    @Override // X.C1AKK
    public final void hasLopEnterBubbleForLog(int i) {
    }

    @Override // X.InterfaceC20673515v3
    public final void hideInternalWindow() {
    }

    @Override // X.C1AKK
    public final String i0() {
        return "";
    }

    @Override // X.C1AKK
    public final boolean isFirstRecharge() {
        return false;
    }

    @Override // X.InterfaceC20673515v3
    public final boolean isInternalWindowMute() {
        return false;
    }

    @Override // X.InterfaceC20673515v3
    public final boolean isInternalWindowUserManualMute() {
        return false;
    }

    @Override // X.C1AKK
    public final boolean isRechargeV3CacheAvailable(int i) {
        return false;
    }

    @Override // X.C1AKK
    public final void k7(LifecycleOwner lifecycleOwner) {
    }

    @Override // X.InterfaceC20673515v3
    public final void kc(MotionEvent motionEvent, String str) {
    }

    @Override // X.C1AKK
    public final InterfaceC483370IxT ku() {
        return null;
    }

    @Override // X.C1AKK
    public final void notifyCloseAllLynxDialog() {
    }

    @Override // X.C1AKK
    public final void notifyCustomSei() {
    }

    @Override // X.C1AKK
    public final void notifyHostAppBoot() {
    }

    @Override // X.InterfaceC20673515v3
    public final boolean o1() {
        return false;
    }

    @Override // X.C1AKK
    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
    }

    @Override // X.C1AKK
    public final void onLocaleChanged(Locale locale) {
    }

    @Override // X.C1AKK
    public final InterfaceC486670J6r ot() {
        return null;
    }

    @Override // X.C1AKK
    public final void pd(EnterRoomConfig enterRoomConfig) {
    }

    @Override // X.C1AKK
    public final C1AKO pk(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle) {
        return null;
    }

    @Override // X.C1AKK
    public final void preloadLiveStream(Context context, boolean z, boolean z2) {
    }

    @Override // X.C1AKK
    public final void preloadVoiceChatLiveStream(Context context) {
    }

    @Override // X.C1AKK
    public final void pv(Activity activity, String str, Map map, C1050980dSK c1050980dSK) {
    }

    @Override // X.C1AKK
    public final C11NZ<NextLiveNoticeRegisterResponse> registerNextLiveNotice(boolean z, long j, boolean z2) {
        return null;
    }

    @Override // X.C1AKK
    public final void releaseVoiceChatLiveStream() {
    }

    @Override // X.C1AKK
    public final void reportAbnormalLive(Context context) {
    }

    @Override // X.C1AKK
    public final C11NZ<C470590Icr<PreviewTimeReportResponse.ResponseData>> reportSubscribePreviewTime(long j, long j2) {
        return null;
    }

    @Override // X.InterfaceC20673515v3
    public final void resetInternalWindow() {
    }

    @Override // X.InterfaceC20673515v3
    public final void resetUserManualMuteClickState() {
    }

    @Override // X.C1AKK
    public final void sa() {
    }

    @Override // X.C1AKK
    public final void setBroadcastActivity(Context context) {
    }

    @Override // X.InterfaceC20673515v3
    public final void setLiveFunnelSession(boolean z) {
    }

    @Override // X.InterfaceC20673515v3
    public final void setResumeAfterMediaConflict(boolean z) {
    }

    @Override // X.C1AKK
    public final boolean showFinishEncourage() {
        return false;
    }

    @Override // X.InterfaceC20673515v3
    public final void showInternalWindow(Activity activity, DialogFragment dialogFragment, Boolean bool, Map<String, String> map, Integer num, Integer num2, Integer num3, Integer num4) {
    }

    @Override // X.C1AKK
    public final void stopVideoBroadcastService() {
    }

    @Override // X.C1AKK
    public final C0IKH tf(C19EG c19eg, C472280Ifa c472280Ifa, int i, EnumC469210Iad enumC469210Iad) {
        return null;
    }

    @Override // X.C1AKK
    public final void tt(FragmentManager fragmentManager) {
    }

    @Override // X.C1AKK
    public final void u8(C1106210etP c1106210etP) {
    }

    @Override // X.InterfaceC20673515v3
    public final boolean up(String str) {
        return false;
    }

    @Override // X.C1AKK
    public final void updateReferrerHostFromKeva(Context context) {
    }

    @Override // X.C1AKK
    public final void updateRoomInfo(IMessageManager iMessageManager, long j, Context context) {
    }

    @Override // X.InterfaceC20673515v3
    public final void updateSafeZone(int i, int i2, int i3, int i4) {
    }

    @Override // X.C1AKK
    public final InterfaceC482440Ivy ut() {
        return null;
    }

    @Override // X.C1AKK
    public final void v3() {
    }

    @Override // X.InterfaceC20673515v3
    public final boolean w9() {
        return false;
    }

    @Override // X.C1AKK
    public final InterfaceC484900Izw x5(Context context) {
        return null;
    }

    @Override // X.C1AKK
    public final /* synthetic */ void xi(int i, Room room, String str, String str2, String str3, Map map) {
    }

    @Override // X.C1AKK
    public final /* synthetic */ InterfaceC2175711ACz xo() {
        return null;
    }

    @Override // X.C1AKK
    public final void yp(String str, C0IFS c0ifs) {
    }

    @Override // X.C1AKK
    public final InterfaceC468710IZp zr() {
        return null;
    }

    @Override // X.C1AKK
    public final InterfaceC1087010eOR LJIIJ() {
        return new ShortTouchServiceDummy();
    }

    @Override // X.C1AKK
    public final InterfaceC662540Pym LJJIIJZLJL() {
        return new InterfaceC662540Pym() { // from class: X.1AKC
            @Override // X.InterfaceC662540Pym
            public final String LIZ(Context context) {
                return "";
            }
        };
    }

    @Override // X.InterfaceC20673515v3
    public final C473630Ihl LJJJJJL() {
        return new C473630Ihl(null);
    }

    @Override // X.C1AKK
    public final Fragment LLIIIL() {
        return new Fragment();
    }

    @Override // X.C1AKK
    public final InterfaceC469600IbG Mi() {
        return new InterfaceC469600IbG() { // from class: X.1AKB
            @Override // X.InterfaceC469600IbG
            public final void LIZ(Context context, EnterRoomConfig enterRoomConfig) {
            }
        };
    }

    @Override // X.C1AKK
    public final Map<String, String> getRoomInfo() {
        return new HashMap();
    }

    @Override // X.C1AKK
    public final InterfaceC20313114e1 startLiveManager() {
        return new InterfaceC20313114e1() { // from class: X.14e5
            @Override // X.C0USM
            public final void LIZ() {
            }

            @Override // X.InterfaceC20313114e1
            public final /* synthetic */ void LIZIZ(InterfaceC772590USj interfaceC772590USj) {
            }

            @Override // X.InterfaceC20313114e1
            public final /* synthetic */ void LIZJ(InterfaceC772590USj interfaceC772590USj) {
            }

            @Override // X.C0URV
            public final void LIZLLL(boolean z) {
            }

            @Override // X.InterfaceC20313114e1
            public final void LJ(C0URV c0urv) {
            }

            @Override // X.C0USM
            public final /* synthetic */ void LJFF() {
            }

            @Override // X.InterfaceC20313114e1
            public final void LJI(C0URV c0urv) {
            }

            @Override // X.InterfaceC20313114e1
            public final void LJII(InterfaceC772580USi interfaceC772580USi) {
            }

            @Override // X.InterfaceC20313114e1
            public final void LJIIIIZZ(InterfaceC772580USi interfaceC772580USi) {
            }

            @Override // X.C0USM
            public final void LJIIIZ(DataChannel dataChannel, int i) {
            }

            @Override // X.C0USM
            public final void LJIIJ() {
            }

            @Override // X.C0USM
            public final void LJIIJJI(DataChannel dataChannel, int i) {
            }

            @Override // X.C0USM
            public final void LJIIL(int i) {
            }
        };
    }

    @Override // X.C1AKK
    public final Boolean LJIIIIZZ() {
        return Boolean.FALSE;
    }

    @Override // X.C1AKK
    public final Boolean LJJLIL() {
        return Boolean.FALSE;
    }

    @Override // X.C1AKK
    public final Map<String, Object> L7(long j) {
        return new HashMap();
    }

    @Override // X.C1AKK
    public final Fragment LJJIII(Map<String, ? extends Object> map) {
        return new Fragment();
    }

    @Override // X.InterfaceC20673515v3
    public final /* bridge */ /* synthetic */ void LJJIIZ(Boolean bool) {
        bool.booleanValue();
    }

    @Override // X.C1AKK
    public final Pair<Boolean, Boolean> LJJJJ(Room room) {
        Boolean bool = Boolean.FALSE;
        return new Pair<>(bool, bool);
    }

    @Override // X.C1AKK
    public final Object LJJLIIJ(String str) {
        return new Object();
    }

    @Override // X.C1AKK
    public final InterfaceC1807610x8h LJJZZI(C1807570x8d c1807570x8d) {
        return new InterfaceC1807610x8h() { // from class: X.0x8j
            @Override // X.InterfaceC1807610x8h
            public final void GL1(Context context, IapProductGetParam iapProductGetParam) {
            }

            @Override // X.InterfaceC1807610x8h
            public final void Q72(Context context, IapProductBuyParam iapProductBuyParam) {
            }

            @Override // X.InterfaceC1807610x8h
            public final void onDestroy() {
            }
        };
    }

    @Override // X.C1AKK
    public final C11NZ LLILIL(int i) {
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.05qV
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Unit> c09aj) {
                C1C7U.LIZ("DummyILive@f642.queryDiamond$1");
                C1C7U.LIZIZ("DummyILive@f642.queryDiamond$1");
            }
        });
    }

    @Override // X.C1AKK
    public final void LLILL(String str) {
        EnumC1805570x5P.find(str);
    }

    @Override // X.C1AKK
    public final C1AKR createLiveBroadcastEndFragment(Bundle bundle) {
        return new C1AKR() { // from class: X.1AKA
            @Override // X.C1AKR
            public final boolean onBackPressed() {
                return false;
            }

            @Override // X.C1AKR
            public final Fragment getFragment() {
                return new Fragment();
            }
        };
    }

    @Override // X.C1AKK
    public final InterfaceC782930UnT createStartLiveFragment(InterfaceC498680Jh4 interfaceC498680Jh4) {
        return new InterfaceC782930UnT() { // from class: X.1AK6
            @Override // X.InterfaceC782930UnT
            public final void Ad(int i) {
            }

            @Override // X.InterfaceC782930UnT
            public final LiveMode G9() {
                return null;
            }

            @Override // X.InterfaceC782930UnT
            public final /* synthetic */ void LLLLJ(UUID uuid, C2185991Agv c2185991Agv) {
            }

            @Override // X.InterfaceC782930UnT
            public final void LLLLZLLLI() {
            }

            @Override // X.InterfaceC782930UnT
            public final void QO() {
            }

            @Override // X.InterfaceC782930UnT
            public final void Rs(C0UJY c0ujy) {
            }

            @Override // X.InterfaceC782930UnT
            public final void Uq(SurfaceView surfaceView) {
            }

            @Override // X.InterfaceC782930UnT
            public final void XB(C20328714gX c20328714gX) {
            }

            @Override // X.InterfaceC782930UnT
            public final void bR(C0UKH c0ukh) {
            }

            @Override // X.InterfaceC782930UnT
            public final int getCameraType() {
                return 0;
            }

            @Override // X.InterfaceC782930UnT
            public final DataChannel getDataChannel() {
                return null;
            }

            @Override // X.InterfaceC782930UnT
            public final void h8(Boolean bool) {
            }

            @Override // X.InterfaceC782930UnT
            public final void iq() {
            }

            @Override // X.InterfaceC782930UnT
            public final C0UJY ks() {
                return null;
            }

            @Override // X.InterfaceC782930UnT
            public final boolean onBackPressed() {
                return false;
            }

            @Override // X.InterfaceC782930UnT
            public final boolean rh() {
                return false;
            }

            @Override // X.InterfaceC782930UnT
            public final void setVideoSize(int i, int i2) {
            }

            @Override // X.InterfaceC782930UnT
            public final void t7(float f) {
            }

            @Override // X.InterfaceC782930UnT
            public final Fragment getFragment() {
                return new Fragment();
            }
        };
    }

    @Override // X.C1AKK
    public final C0IEG fk(EnterRoomConfig enterRoomConfig) {
        return new C0IES();
    }

    @Override // X.C1AKK
    public final LynxUI<?> getLynxAudioLiveView(s sVar) {
        return new LynxUI<View>(sVar) { // from class: com.ss.android.ugc.aweme.live.spi.dummy.DummyILive.getLynxAudioLiveView.1
        };
    }

    @Override // X.C1AKK
    public final Fragment wt(Map<String, Object> map) {
        return new Fragment();
    }

    @Override // X.InterfaceC20673515v3
    public final /* bridge */ /* synthetic */ void Be(Activity activity, Boolean bool) {
        bool.booleanValue();
    }

    @Override // X.InterfaceC20673515v3
    public final C11NZ<NewLiveRoomStruct> LJFF(long j, String str) {
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.164N
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<NewLiveRoomStruct> c09aj) {
                C1C7U.LIZ("DummyILive@f642.fetchRoomInfo$1");
                C1C7U.LIZIZ("DummyILive@f642.fetchRoomInfo$1");
            }
        });
    }

    @Override // X.InterfaceC20673515v3
    public final C11NZ LJJZ(long j, String str) {
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0884
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<NewLiveRoomStruct> c09aj) {
                C1C7U.LIZ("DummyILive@f642.fetchRoomInfo$2");
                C1C7U.LIZIZ("DummyILive@f642.fetchRoomInfo$2");
            }
        });
    }

    @Override // X.C1AKK
    public final /* bridge */ /* synthetic */ InterfaceC420801kM LJL(Long l, C19660911w7 c19660911w7) {
        l.longValue();
        return null;
    }

    @Override // X.C1AKK
    public final Fragment LLIIII(Context context, Bundle bundle) {
        return new Fragment();
    }

    @Override // X.C1AKK
    public final Fragment LLILZ(Context context, Bundle bundle) {
        return new Fragment();
    }

    @Override // X.C1AKK
    public final Observer<User> cb(LifecycleOwner lifecycleOwner, Function1<? super User, Unit> function1) {
        return new Observer() { // from class: X.14x1
            @Override // androidx.lifecycle.Observer
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            }
        };
    }

    @Override // X.C1AKK
    public final Map<String, InterfaceC1051760dTa> getLiveWalletJSB(WeakReference<Context> weakReference, IESJsBridge iESJsBridge) {
        return new HashMap();
    }

    @Override // X.C1AKK
    public final Boolean tb(Context context, Room room) {
        return Boolean.FALSE;
    }

    @Override // X.C1AKK
    public final DialogFragment createRechargeDialogFragment(Context context, InterfaceC1806230x6T interfaceC1806230x6T, Bundle bundle, C1803830x2b c1803830x2b) {
        return new DialogFragment();
    }
}
