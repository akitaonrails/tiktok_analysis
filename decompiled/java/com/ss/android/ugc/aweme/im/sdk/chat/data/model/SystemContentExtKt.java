package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C15438062q;
import com.ss.android.ugc.aweme.im.common.model.IMActionTemplate;
import com.ss.android.ugc.aweme.im.common.model.IMFromMessageTips;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemContentExtKt {
    public static final SystemContent.Key toKey(IMActionTemplate iMActionTemplate) {
        int iIntValue;
        String string;
        SystemContent.Key key = new SystemContent.Key();
        Integer num = iMActionTemplate.action;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        key.setAction(iIntValue);
        Integer num2 = iMActionTemplate.key;
        if (num2 != null) {
            string = num2.toString();
        } else {
            string = null;
        }
        key.setKey(string);
        key.setName(iMActionTemplate.name);
        key.setLink(iMActionTemplate.link);
        return key;
    }

    public static final SystemContent toSystemContent(IMNoticeMsgStruct iMNoticeMsgStruct) {
        String str;
        List<IMActionTemplate> list;
        SystemContent systemContent = new SystemContent();
        IMFromMessageTips iMFromMessageTips = iMNoticeMsgStruct.msgContent;
        SystemContent.Key[] keyArr = null;
        if (iMFromMessageTips != null) {
            str = iMFromMessageTips.tips;
        } else {
            str = null;
        }
        systemContent.setTips(str);
        IMFromMessageTips iMFromMessageTips2 = iMNoticeMsgStruct.msgContent;
        if (iMFromMessageTips2 != null && (list = iMFromMessageTips2.template) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<IMActionTemplate> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(toKey(it2.next()));
            }
            keyArr = (SystemContent.Key[]) arrayList.toArray(new SystemContent.Key[0]);
        }
        systemContent.setTemplate(keyArr);
        return systemContent;
    }
}
