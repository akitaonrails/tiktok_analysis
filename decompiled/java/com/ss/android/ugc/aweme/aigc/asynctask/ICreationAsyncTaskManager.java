package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09JG;
import X.C0LCT;
import X.C0LQP;
import X.C0LSZ;
import X.C0LTN;
import X.C0LU1;
import X.C382090EyV;
import X.C382220Eyi;
import X.C382230Eyj;
import X.EnumC1987107qP;
import X.InterfaceC1294060jmO;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import X.InterfaceC539460LDs;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCPushResult;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS217S0300000_8;

/* JADX INFO: loaded from: classes9.dex */
public interface ICreationAsyncTaskManager {
    @InterfaceC1294060jmO
    Object LIZJ(String str, InterfaceC1364105Vn<? super C0LSZ> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    Object LJ(int i, List<String> list, InterfaceC1364105Vn<? super C382090EyV> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    Object LJFF(String str, InterfaceC1364105Vn<? super C0LSZ> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    void LJI(String str, Function0 function0, boolean z);

    @InterfaceC1294060jmO
    void LJII(String str);

    @InterfaceC1294060jmO
    void LJIIIIZZ(String str);

    @InterfaceC1294060jmO
    Object LJIIIZ(List list, C0LU1 c0lu1);

    @InterfaceC1294060jmO
    Object LJIIJ(List<String> list, InterfaceC1364105Vn<? super List<C0LSZ>> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    Object LJIIJJI(String str, InterfaceC1364105Vn interfaceC1364105Vn);

    @InterfaceC1294060jmO
    Object LJIIL(InterfaceC1364105Vn<? super List<C0LSZ>> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    C0LCT LJIILIIL();

    @InterfaceC1294060jmO
    Object LJIILJJIL(InterfaceC539460LDs interfaceC539460LDs, PublicTaskInput publicTaskInput, InterfaceC1364105Vn interfaceC1364105Vn);

    @InterfaceC1294060jmO
    Object LJIILL(C0LQP c0lqp, InterfaceC1364105Vn<? super List<C0LSZ>> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    void LJIILLIIL(String str, String str2);

    @InterfaceC1294060jmO
    Object LJIIZILJ(List<Long> list, String str, String str2, InterfaceC1364105Vn<? super QuotaResult> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    Object LJIJ(List<String> list, InterfaceC1364105Vn<? super List<Integer>> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    Object LJIJI(String str, List list, InterfaceC1364105Vn interfaceC1364105Vn);

    @InterfaceC1294060jmO
    Object LJIJJ(List<String> list, InterfaceC1364105Vn<? super List<C0LSZ>> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    Object LJIJJLI(String str, List list, InterfaceC1364105Vn interfaceC1364105Vn);

    @InterfaceC1294060jmO
    Object LJIL(String str, InterfaceC1364105Vn<? super InterfaceC539460LDs<? super C09JG, ? extends AbsTaskOutput>> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    void LJJ(List<String> list);

    @InterfaceC1294060jmO
    Object LJJI(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    C0LTN LJJIFFI(C0LQP c0lqp, String str, boolean z);

    @InterfaceC1294060jmO
    C0LSZ LJJII(String str);

    @InterfaceC1294060jmO
    void LJJIII(String str);

    @InterfaceC1294060jmO
    Object LJJIIJ(Integer num, String str, String str2, String str3, String str4, String str5, List list, C382230Eyj c382230Eyj);

    @InterfaceC1294060jmO
    Object LJJIIJZLJL(InterfaceC1364105Vn interfaceC1364105Vn);

    @InterfaceC1294060jmO
    Object LJJIIZ(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    InterfaceC346201Wa LJJIIZI(List list);

    @InterfaceC1294060jmO
    void LJJIJ(String str, String str2);

    @InterfaceC1294060jmO
    void LJJIJIIJI(String str, String str2);

    @InterfaceC1294060jmO
    C0LTN LJJIJIIJIL(C0LQP c0lqp);

    @InterfaceC1294060jmO
    void LJJIJIL(String str);

    @InterfaceC1294060jmO
    Object LJJIJL(EnumC1987107qP enumC1987107qP, List list, C382220Eyi c382220Eyi);

    @InterfaceC1294060jmO
    Object LJJIJLIJ(String str, InterfaceC1364105Vn<? super List<C0LSZ>> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    void LJJIL(String str);

    @InterfaceC1294060jmO
    void LJJIZ(String str, String str2, String str3, AwS217S0300000_8 awS217S0300000_8);

    @InterfaceC1294060jmO
    void LJJJ(InterfaceC539460LDs<? super C09JG, ? extends AbsTaskOutput> interfaceC539460LDs, C09JG c09jg);

    @InterfaceC1294060jmO
    Object LJJJI(String str, List<AIGCPushResult> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    void LJJJIL(String str);

    @InterfaceC1294060jmO
    Object LJJJJ(String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    Object LJJJJI(String str, String str2, String str3, InterfaceC1364105Vn<? super Pair<Integer, Integer>> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    Object LJJJJIZL(InterfaceC1364105Vn interfaceC1364105Vn);

    @InterfaceC1294060jmO
    Object LJJJJJ(String str, String str2, InterfaceC1364105Vn<? super List<C0LSZ>> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    void LJJJJJL(List<String> list);

    @InterfaceC1294060jmO
    InterfaceC346201Wa<C0LSZ> LJJJJL(String str);

    @InterfaceC1294060jmO
    InterfaceC346201Wa<List<C0LSZ>> LJJJJLI(String str);
}
