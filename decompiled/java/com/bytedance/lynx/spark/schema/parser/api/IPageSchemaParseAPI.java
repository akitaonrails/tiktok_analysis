package com.bytedance.lynx.spark.schema.parser.api;

import android.net.Uri;
import com.bytedance.lynx.hybrid.autoservice.IHybridInnerAutoService;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface IPageSchemaParseAPI extends IHybridInnerAutoService {
    void parse(Uri uri, Map<String, String> map, SparkPageSchemaParam sparkPageSchemaParam);
}
