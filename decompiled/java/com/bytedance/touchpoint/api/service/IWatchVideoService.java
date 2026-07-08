package com.bytedance.touchpoint.api.service;

import X.C1896810zSZ;
import X.C1898160zUk;
import X.InterfaceC1898130zUh;
import X.InterfaceC1898470zVF;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.touchpoint.api.model.TaskEvent;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public interface IWatchVideoService {
    public static final C1898160zUk LIZ = C1898160zUk.LIZ;

    String LIZ(String str);

    void LIZIZ(List<InterfaceC1898130zUh> list, List<TaskEvent> list2, Map<Integer, InterfaceC1898470zVF<TaskEvent>> map);

    boolean LIZJ();

    void LIZLLL(C1896810zSZ c1896810zSZ);

    void LJ(String str);

    void LJFF(ViewGroup viewGroup, Fragment fragment);

    void clear();

    void pausePlay();
}
