// automatically generated by the FlatBuffers compiler, do not modify

package Neodroid.FBS;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class FQT extends Table {
  public static FQT getRootAsFQT(ByteBuffer _bb) {
    return getRootAsFQT(_bb, new FQT());
  }

  public static FQT getRootAsFQT(ByteBuffer _bb, FQT obj) {
    _bb.order(ByteOrder.LITTLE_ENDIAN);
    return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
  }

  public FQT __assign(int _i, ByteBuffer _bb) {
    __init(_i, _bb);
    return this;
  }

  public void __init(int _i, ByteBuffer _bb) {
    bb_pos = _i;
    bb = _bb;
  }

  public static void startFQT(FlatBufferBuilder builder) {
    builder.startObject(1);
  }

  public static void addTransform(FlatBufferBuilder builder, int transformOffset) {
    builder.addStruct(0, transformOffset, 0);
  }

  public static int endFQT(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 4);  // transform
    return o;
  }

  public FQuaternionTransform transform() {
    return transform(new FQuaternionTransform());
  }

  public FQuaternionTransform transform(FQuaternionTransform obj) {
    int o = __offset(4);
    return o != 0 ? obj.__assign(o + bb_pos, bb) : null;
  }
}

