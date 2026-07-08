package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class TrimPointResponse extends BaseResponse {

    @C09CT("trim_points")
    public List<Integer> trimPoints;

    @C09CT("trim_type")
    public ArrayList<String> trimTypes;

    public List<Integer> getTrimPoints() {
        return this.trimPoints;
    }

    public ArrayList<String> getTrimTypes() {
        return this.trimTypes;
    }

    public void setTrimPoints(List<Integer> list) {
        this.trimPoints = list;
    }

    public void setTrimTypes(ArrayList<String> arrayList) {
        this.trimTypes = arrayList;
    }
}
